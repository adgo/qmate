package org.tud.inf.st.mbt.emf.postprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IPostProcessor {
	void process(ResourceSet rs);
}
