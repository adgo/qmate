package org.tud.inf.st.mbt.emf.postprocess;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;

public final class PostProcessorManager {
	private static PostProcessorManager instance;
	private List<IPostProcessor> processors = new ArrayList<IPostProcessor>();

	public static PostProcessorManager getInstance() {
		if (instance == null) {
			instance = new PostProcessorManager();
		}
		return instance;
	}

	private PostProcessorManager() {
		init();
	}

	private void init() {
		addPostProcessor(new SetNames());
		addPostProcessor(new UnfloldIntRanges());
		addPostProcessor(new ParsingPostProcessor());
	}

	public void addPostProcessor(IPostProcessor c) {
		processors.add(c);
	}

	public void removePostProcessor(IPostProcessor c) {
		processors.remove(c);
	}

	public void processAll(ResourceSet rs) {
		for (IPostProcessor c : processors)
			try {
				c.process(rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
