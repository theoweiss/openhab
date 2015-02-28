package org.openhab.rule.javascript.internal.engine;

import java.util.Collection;

import org.openhab.core.items.Item;
import org.openhab.core.items.ItemRegistryChangeListener;
import org.openhab.core.items.StateChangeListener;
import org.openhab.core.types.State;
import org.openhab.model.core.EventType;
import org.openhab.model.core.ModelRepositoryChangeListener;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class RuleEngine
	implements
	  EventHandler,
	  ItemRegistryChangeListener,
	  StateChangeListener,
	  ModelRepositoryChangeListener {

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

}
