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

	/* (non-Javadoc)
	 * @see org.tud.inf.st.mbt.emf.postprocess.IPostProcessorManager#addPostProcessor(org.tud.inf.st.mbt.emf.postprocess.IPostProcessor)
	 */
	public void addPostProcessor(IPostProcessor c) {
		processors.add(c);
	}

	/* (non-Javadoc)
	 * @see org.tud.inf.st.mbt.emf.postprocess.IPostProcessorManager#removePostProcessor(org.tud.inf.st.mbt.emf.postprocess.IPostProcessor)
	 */
	public void removePostProcessor(IPostProcessor c) {
		processors.remove(c);
	}

	/* (non-Javadoc)
	 * @see org.tud.inf.st.mbt.emf.postprocess.IPostProcessorManager#processAll(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void processAll(ResourceSet rs) {
		for (IPostProcessor c : processors)
			try {
				c.process(rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
