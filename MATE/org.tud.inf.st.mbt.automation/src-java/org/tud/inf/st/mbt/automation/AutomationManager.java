package org.tud.inf.st.mbt.automation;

import java.util.LinkedList;
import java.util.List;

import org.tud.inf.st.mbt.automation.basic.ManualAutomationType;
import org.tud.inf.st.mbt.automation.basic.RandomAutomationType;

public final class AutomationManager {
	private static AutomationManager instance;
	
	private AutomationManager() {
	}
	
	public static AutomationManager getInstance() {
		if(instance == null){
			instance = new AutomationManager();
			instance.init();
		}
		return instance;
	}
	
	private static List<TestSuiteAutomationType> tstypes = new LinkedList<>();
	private static List<ActionAutomationType> atypes = new LinkedList<>();
	
	public void registerType(AbstractAutomationType type){
		if(type instanceof TestSuiteAutomationType)tstypes.add((TestSuiteAutomationType) type);
		if(type instanceof ActionAutomationType)atypes.add((ActionAutomationType) type);
	}
	
	public TestSuiteAutomationType[] getTestSuiteAutomationTypes() {
		return tstypes.toArray(new TestSuiteAutomationType[0]);
	}	
	
	public ActionAutomationType[] getActionAutomationTypes() {
		return atypes.toArray(new ActionAutomationType[0]);
	}
	
	private void init(){
		registerType(ManualAutomationType.getInstance());
		registerType(RandomAutomationType.getInstance());
	}
}
