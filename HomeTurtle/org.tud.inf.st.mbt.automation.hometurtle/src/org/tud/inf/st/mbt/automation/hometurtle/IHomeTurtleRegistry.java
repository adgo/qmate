package org.tud.inf.st.mbt.automation.hometurtle;

public interface IHomeTurtleRegistry {
	public static final String SERVICE_NAME = "HomeTurtleRegistry";
	
	void registerHomeTurtle(String url);
}
