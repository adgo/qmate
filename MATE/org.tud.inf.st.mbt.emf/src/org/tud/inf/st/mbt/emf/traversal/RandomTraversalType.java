package org.tud.inf.st.mbt.emf.traversal;

import java.util.List;
import java.util.Random;

import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.features.Configuration;

public class RandomTraversalType extends AbstractTraversalType {
	
	private static final Random rand = new Random();

	public RandomTraversalType() {
		super("Random Traversal");
	}

	@Override
	public State determineNext(List<State> choices) {
		if(choices.isEmpty())return null;
		return choices.get(rand.nextInt(choices.size()));
	}

	@Override
	public Configuration determineConfiguration(List<Configuration> choices) {
		if(choices.isEmpty())return null;
		return choices.get(rand.nextInt(choices.size()));
	}

}
