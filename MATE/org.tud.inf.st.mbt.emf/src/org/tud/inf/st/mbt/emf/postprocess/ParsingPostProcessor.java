package org.tud.inf.st.mbt.emf.postprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.emf.validation.ParsingConstraint;

public class ParsingPostProcessor implements IPostProcessor {

	private ParsingConstraint pc = new ParsingConstraint();
	
	@Override
	public void process(ResourceSet rs) {
		pc.validate(null, rs);
	}

}
