package org.tud.inf.st.mbt.automation;

public class AutomationProperty<T> {
	public String name;
	public Class<T> type;
	public T value,initialValue;
	
	public AutomationProperty(String name, Class<T> type, T value) {
		this.name = name;
		this.type = type;
		this.value = value;
		this.initialValue = value;
	}
}
