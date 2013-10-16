package org.tud.inf.st.mbt.emf.postprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.util.ModelUtil;

public class SetNames implements IPostProcessor {

	@Override
	public void process(ResourceSet rs) {
		for (AbstractModelElement ame : ModelUtil.getAllEObjectsOfSuperType(rs,
				AbstractModelElement.class)) {
			if (ame.getName() == null)
				ame.setName(ame.getId());
		}
	}

}
