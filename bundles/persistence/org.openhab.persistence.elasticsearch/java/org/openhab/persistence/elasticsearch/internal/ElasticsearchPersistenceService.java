/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.persistence.elasticsearch.internal;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.indices.mapping.PutMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.List;

import org.openhab.core.items.Item;
import org.openhab.core.items.ItemNotFoundException;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.library.items.ContactItem;
import org.openhab.core.library.items.DimmerItem;
import org.openhab.core.library.items.SwitchItem;
import org.openhab.core.library.types.DateTimeType;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.OpenClosedType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.persistence.FilterCriteria;
import org.openhab.core.persistence.HistoricItem;
import org.openhab.core.persistence.PersistenceService;
import org.openhab.core.persistence.PersistentStateRestorer;
import org.openhab.core.persistence.QueryablePersistenceService;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This is the implementation of the elasticsearch {@link PersistenceService}. It persists item
 * values using the <a href="http://elasticsearch.org">elasticsearch</a> time series database. The
 * states ( {@link State}) of an {@link Item} are persisted in a time series with names equal to the
 * name of the item. All values are stored using integers or doubles, {@link OnOffType} and
 * {@link OpenClosedType} are stored using 0 or 1.
 * 
 * The defaults for the database name, the database user and the database url are "openhab",
 * "openhab" and "http://127.0.0.1:8086".
 * 
 * @author Theo Weiss - Initial Contribution
 * @since 1.7.0
 */
public class ElasticsearchPersistenceService implements QueryablePersistenceService, ManagedService {

  private ItemRegistry itemRegistry;
  private static final Logger logger = LoggerFactory.getLogger(ElasticsearchPersistenceService.class);
  private static final String DEFAULT_URL = "http://localhost:9200";
  private PersistentStateRestorer persistentStateRestorer;
  private JestClient client;
  private boolean connected;
  private String url;
  private boolean isProperlyConfigured;
  private static final String DIGITAL_VALUE_OFF = "0";
  private static final String DIGITAL_VALUE_ON = "1";

  public void setPersistentStateRestorer(PersistentStateRestorer persistentStateRestorer) {
	this.persistentStateRestorer = persistentStateRestorer;
  }

  public void unsetPersistentStateRestorer(PersistentStateRestorer persistentStateRestorer) {
	this.persistentStateRestorer = null;
  }

  public void setItemRegistry(ItemRegistry itemRegistry) {
	this.itemRegistry = itemRegistry;
  }

  public void unsetItemRegistry(ItemRegistry itemRegistry) {
	this.itemRegistry = null;
  }

  public void activate() {
	logger.debug("elasticsearch persistence service activated");
  }

  public void deactivate() {
	logger.debug("elasticsearch persistence service deactivated");
  }

  @Override
  public String getName() {
	return "elasticsearch";
  }

  private void connect() {
    if (client == null) {
      JestClientFactory factory = new JestClientFactory();
      factory.setHttpClientConfig(new HttpClientConfig.Builder(url).build());
      client = factory.getObject();
    }
    connected = true;
  }

  private void disconnect() {
    connected = false;
    client = null;
  }

  @Override
  public void store(Item item) {
    store(item, null);
  }

  private String getIndexName(Item item) {
    return getIndexName(item.getName());
  }

  private String getIndexName(String itemName) {
    return itemName.toLowerCase();
  }

  private void putMapping() {
    PutMapping putMapping =
        new PutMapping.Builder(
            "my_index",
            "my_type",
            "{ \"document\" : { \"properties\" : { \"message\" : {\"type\" : \"string\", \"store\" : \"yes\"} } } }")
            .build();
    try {
      client.execute(putMapping);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
  /**
   * {@inheritDoc}
   */
  @Override
  public void store(Item item, String alias) {
    if (item.getState() instanceof UnDefType) {
      return;
    }

    if (!isProperlyConfigured) {
      logger.warn("Configuration for elasticsearch not yet loaded.");
      return;
    }

    if (!connected) {
      logger.warn("elasticsearch is not yet connected");
      return;
    }

    String realName = item.getName();
    String name = (alias != null) ? alias : realName;
    Object value = stateToObject(item.getState());
    logger.trace("storing {} in elasticsearch {}", name, value);
    // TODO set timestamped true once at startup
    // String source = "\"_timestamp\" : { \"enabled\" : true }";
    Index index =
        new Index.Builder("{\"value\": " + value + "}").index(getIndexName(item)).type("itemvalue")
            .build();
    try {
      client.execute(index);
    } catch (Exception e) {
      logger.error("elasticsearch insert error: {}", e.getMessage());
    }

  }

  @Override
  public void updated(Dictionary<String, ?> config) throws ConfigurationException {
    disconnect();
    if (config == null) {
      throw new ConfigurationException("elasticsearch",
          "The configuration for elasticsearch is missing fix openhab.cfg");
    }

    url = (String) config.get("url");
    if (url.equals("")) {
      url = DEFAULT_URL;
      logger.debug("using default url {}", DEFAULT_URL);
    }

    isProperlyConfigured = true;

    connect();

    persistentStateRestorer.initializeItems(getName());
  }

  @Override
  public Iterable<HistoricItem> query(FilterCriteria filter) {
    logger.debug("got a query");

    if (!isProperlyConfigured) {
      logger.warn("Configuration for elasticsearch not yet loaded or broken.");
      return Collections.emptyList();
    }

    if (!connected) {
      logger.warn("elasticsearch is not yet connected");
      return Collections.emptyList();
    }

    if (filter.getItemName() == null) {
      logger.error("elasticsearch search filter must have an item name");
      return Collections.emptyList();
    }

    List<HistoricItem> historicItems = new ArrayList<HistoricItem>();


    Search search = new Search.Builder("").addIndex(getIndexName(filter.getItemName())).build();
    return historicItems;
  }

  /**
   * Converts {@link State} to objects fitting into elasticsearch values.
   * 
   * @param state to be converted
   * @return integer or double value for DecimalType and PercentType, an integer for DateTimeType
   *         and 0 or 1 for OnOffType and OpenClosedType.
   */
  private Object stateToObject(State state) {
    Object value;
    if (state instanceof PercentType) {
      value = convertBigDecimalToNum(((PercentType) state).toBigDecimal());
    } else if (state instanceof DecimalType) {
      value = convertBigDecimalToNum(((DecimalType) state).toBigDecimal());
    } else if (state instanceof DateTimeType) {
      value = ((DateTimeType) state).getCalendar().getTime().getTime();
    } else if (state instanceof OnOffType) {
      value = (OnOffType) state == OnOffType.ON ? 1 : 0;
    } else if (state instanceof OpenClosedType) {
      value = (OpenClosedType) state == OpenClosedType.OPEN ? 1 : 0;
    } else {
      value = state.toString();
    }
    return value;
  }

  /**
   * This method returns an integer if possible if not a double is returned. This is an optimization
   * for elasticsearch because integers have less overhead.
   * 
   * @param value the BigDecimal to be converted
   * @return A double if possible else a double is returned.
   */
  private Object convertBigDecimalToNum(BigDecimal value) {
    Object convertedValue;
    if (value.scale() == 0) {
      logger.trace("found no fractional part");
      convertedValue = value.toBigInteger();
    } else {
      logger.trace("found fractional part");
      convertedValue = value.doubleValue();
    }
    return convertedValue;
  }

  /**
   * Converts {@link State} to a String suitable for elasticsearch queries.
   * 
   * @param state to be converted
   * @return {@link String} equivalent of the {@link State}
   */
  private String stateToString(State state) {
    String value;
    if (state instanceof PercentType) {
      value = ((PercentType) state).toBigDecimal().toString();
    } else if (state instanceof DateTimeType) {
      value = String.valueOf(((DateTimeType) state).getCalendar().getTime().getTime());
    } else if (state instanceof DecimalType) {
      value = ((DecimalType) state).toBigDecimal().toString();
    } else if (state instanceof OnOffType) {
      value = ((OnOffType) state) == OnOffType.ON ? DIGITAL_VALUE_ON : DIGITAL_VALUE_OFF;
    } else {
      value = state.toString();
    }
    return value;
  }

  /**
   * Converts a value to a {@link State} which is suitable for the given {@link Item}. This is
   * needed for querying a {@link HistoricState}.
   * 
   * @param value to be converted to a {@link State}
   * @param itemName name of the {@link Item} to get the {@link State} for
   * @return
   */
  private State objectToState(Object value, String itemName) {
    String valueStr = String.valueOf(value);
    if (itemRegistry != null) {
      try {
        Item item = itemRegistry.getItem(itemName);
        if (item instanceof SwitchItem && !(item instanceof DimmerItem)) {
          return valueStr.equals(DIGITAL_VALUE_OFF) ? OnOffType.OFF : OnOffType.ON;
        } else if (item instanceof ContactItem) {
          return valueStr.equals(DIGITAL_VALUE_OFF) ? OpenClosedType.CLOSED : OpenClosedType.OPEN;
        }
      } catch (ItemNotFoundException e) {
        logger.warn("Could not find item '{}' in registry", itemName);
      }
    }
    // just return a DecimalType as a fallback
    return new DecimalType(valueStr);
  }


}
