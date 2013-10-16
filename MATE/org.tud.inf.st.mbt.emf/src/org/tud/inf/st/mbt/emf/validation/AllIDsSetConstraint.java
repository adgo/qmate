package org.tud.inf.st.mbt.emf.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.core.AbstractModelElement;

public class AllIDsSetConstraint implements IValidationConstraint {

	@Override
	public void validate(ValidationManager mgr, ResourceSet rs) {
		for (EObject target : mgr.getAllElements(rs))
			if (target instanceof AbstractModelElement) {
				AbstractModelElement ame = (AbstractModelElement) target;
				if (ame.getId() != null && ame.getName() == null)
					ame.setName(ame.getId());
				if (ame.getId() == null || ame.getId().length() == 0)
					mgr.setProblem("\"" + ame + "\" has no ID.",
							IMarker.SEVERITY_ERROR, target.eResource().getURI()
									+ "/" + ame + "", ame.hashCode() + "");
			}

	}

}
