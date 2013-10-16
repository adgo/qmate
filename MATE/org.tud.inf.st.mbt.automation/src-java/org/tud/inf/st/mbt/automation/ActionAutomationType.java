package org.tud.inf.st.mbt.automation;

import org.tud.inf.st.mbt.actions.PostGenerationAction;

public abstract class ActionAutomationType extends AbstractAutomationType{

	public ActionAutomationType(String name) {
		super(name);
	}
	
	public abstract boolean automate(PostGenerationAction action, ISimulationResponder propertyAccessor);
	
	public abstract void reset();
}
