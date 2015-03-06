package org.openhab.rule.javascript.internal.engine;

import java.sql.BatchUpdateException;
import java.util.Collection;

import org.openhab.core.items.Item;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.items.ItemRegistryChangeListener;
import org.openhab.core.items.StateChangeListener;
import org.openhab.core.scriptengine.ScriptEngine;
import org.openhab.core.types.State;
import org.openhab.model.core.EventType;
import org.openhab.model.core.ModelRepository;
import org.openhab.model.core.ModelRepositoryChangeListener;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RuleEngine
	implements
	  EventHandler,
	  ItemRegistryChangeListener,
	  StateChangeListener,
	  ModelRepositoryChangeListener {

  static private final Logger logger = LoggerFactory.getLogger(RuleEngine.class);

  private ItemRegistry itemRegistry;
  private ModelRepository modelRepository;
  private ScriptEngine scriptEngine;

  public void activate() {
    logger.debug("Started javascript rule engine");
    Main.
    // // read all rule files
    // Iterable<String> ruleModelNames = modelRepository.getAllModelNamesOfType("rules");
    // ArrayList<String> clonedList = Lists.newArrayList(ruleModelNames);
    // for(String ruleModelName : clonedList) {
    // EObject model = modelRepository.getModel(ruleModelName);
    // if(model instanceof RuleModel) {
    // RuleModel ruleModel = (RuleModel) model;
    // triggerManager.addRuleModel(ruleModel);
    // }
    // }
    //
    // // register us on all items which are already available in the registry
    // for(Item item : itemRegistry.getItems()) {
    // internalItemAdded(item);
    // }
    // runStartupRules();
  }

  public void deactivate() {
    // execute all scripts that were registered for system shutdown
  }

  @Override
  public void modelChanged(String modelName, EventType type) {
	// TODO Auto-generated method stub
	System.out.println("theo modelchanged");
  }

  @Override
  public void stateChanged(Item item, State oldState, State newState) {
	// TODO Auto-generated method stub
	System.out.println("theo state changed");

  }

  @Override
  public void stateUpdated(Item item, State state) {
	// TODO Auto-generated method stub
	System.out.println("theo state updated");

  }

  @Override
  public void allItemsChanged(Collection<String> oldItemNames) {
	// TODO Auto-generated method stub
	System.out.println("theo all items updated");
  }

  @Override
  public void itemAdded(Item item) {
	// TODO Auto-generated method stub
	System.out.println("theo item updated");

  }

  @Override
  public void itemRemoved(Item item) {
	// TODO Auto-generated method stub
	System.out.println("theo item removed");

  }

  @Override
  public void handleEvent(Event event) {
	// TODO Auto-generated method stub
	System.out.println("theo handle event");

  }

  public void setItemRegistry(ItemRegistry itemRegistry) {
    this.itemRegistry = itemRegistry;
    itemRegistry.addItemRegistryChangeListener(this);
  }

  public void unsetItemRegistry(ItemRegistry itemRegistry) {
    itemRegistry.removeItemRegistryChangeListener(this);
    this.itemRegistry = null;
  }

  public void setModelRepository(ModelRepository modelRepository) {
    this.modelRepository = modelRepository;
    modelRepository.addModelRepositoryChangeListener(this);
  }

  public void unsetModelRepository(ModelRepository modelRepository) {
    modelRepository.removeModelRepositoryChangeListener(this);
    this.modelRepository = null;
  }

  public void setScriptEngine(ScriptEngine scriptEngine) {
    this.scriptEngine = scriptEngine;
  }

  public void unsetScriptEngine(ScriptEngine scriptEngine) {
    this.scriptEngine = null;
  }

}
