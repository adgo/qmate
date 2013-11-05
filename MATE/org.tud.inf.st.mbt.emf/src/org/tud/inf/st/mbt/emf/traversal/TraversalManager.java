package org.tud.inf.st.mbt.emf.traversal;

import java.util.ArrayList;
import java.util.List;

public final class TraversalManager {
	private static TraversalManager instance;
	
	private TraversalManager() {
	}
	
	public static TraversalManager getInstance() {
		if(instance == null){
			instance = new TraversalManager();
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
}
