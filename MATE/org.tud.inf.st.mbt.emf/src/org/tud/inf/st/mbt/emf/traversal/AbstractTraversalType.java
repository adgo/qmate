package org.tud.inf.st.mbt.emf.traversal;

import java.util.List;

import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.features.Configuration;


public abstract class AbstractTraversalType {
	private String name;
	
	public AbstractTraversalType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	};
	
	@Override
	public String toString() {
		return getName();
	}
	
	public abstract State determineNext(List<State> choices);
	public abstract Configuration determineConfiguration(List<Configuration> choices);
}
