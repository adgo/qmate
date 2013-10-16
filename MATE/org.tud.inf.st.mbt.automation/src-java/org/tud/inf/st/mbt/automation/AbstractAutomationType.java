package org.tud.inf.st.mbt.automation;


public abstract class AbstractAutomationType {
	private String name;
	
	public AbstractAutomationType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract AutomationProperty<?>[] getAutomationProperties();
	
	public abstract boolean propertiesValid();	
	
	@Override
	public String toString() {
		return getName();
	}
}
