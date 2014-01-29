package org.tud.inf.st.mbt.emf.traversal;

import java.util.List;

import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.features.Configuration;

public class PriorityTraversalType extends AbstractTraversalType {

	public PriorityTraversalType() {
		super("Priority Traversal (risk-based)");
	}

	@Override
	public State determineNext(List<State> choices) {
		if(choices == null)return null;
		
		double max = -Double.MAX_VALUE;
		State maxState = choices.get(0);
		for (State c : choices) {
			if (c.getPriority() > max) {
				max = c.getPriority();
				maxState = c;
			}
		}
		return maxState;
	}

	@Override
	public Configuration determineConfiguration(List<Configuration> choices) {
		return new RandomTraversalType().determineConfiguration(choices);
	}

}
