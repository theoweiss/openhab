package org.openhab.rule.javascript.internal;

import org.openhab.core.scriptengine.ScriptEngine;
import org.openhab.model.core.ModelRepository;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleJavascriptActivator implements BundleActivator {
  private final static Logger logger = LoggerFactory.getLogger(RuleJavascriptActivator.class);
  public static ServiceTracker<ModelRepository, ModelRepository> modelRepositoryTracker;
  public static ServiceTracker<ScriptEngine, ScriptEngine> scriptEngineTracker;

  @Override
  public void start(BundleContext context) throws Exception {
	// TODO Auto-generated method stub
	modelRepositoryTracker =
		new ServiceTracker<ModelRepository, ModelRepository>(context, ModelRepository.class, null);
	modelRepositoryTracker.open();

	scriptEngineTracker =
		new ServiceTracker<ScriptEngine, ScriptEngine>(context, ScriptEngine.class, null);
	scriptEngineTracker.open();

	logger.debug("Registered javascript 'rules'");

  }

  @Override
  public void stop(BundleContext context) throws Exception {
	// TODO Auto-generated method stub

  }

}
