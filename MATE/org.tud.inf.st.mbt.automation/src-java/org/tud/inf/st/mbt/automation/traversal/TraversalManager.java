package org.tud.inf.st.mbt.automation.traversal;

import java.util.ArrayList;
import java.util.List;

import org.tud.inf.st.mbt.automation.basic.RandomTraversalType;

public class TraversalManager {
	private static TraversalManager instance;
	
	private TraversalManager() {
	}
	
	public static TraversalManager getInstance() {
		if(instance == null){
			instance = new TraversalManager();
			instance.init();
		}
		return instance;
	}
	
	private static List<AbstractTraversalType> traversalTypes = new ArrayList<AbstractTraversalType>();
	
	public void registerType(AbstractTraversalType type){
		traversalTypes.add(type);
	}
	
	public AbstractTraversalType[] getTraversalTypes() {
		return traversalTypes.toArray(new AbstractTraversalType[0]);
	}
	
	private void init(){
		registerType(new RandomTraversalType());
	}
}
