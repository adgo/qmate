package org.tud.inf.st.mbt.emf.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class NoProxies implements IValidationConstraint {

	@Override
	public void validate(ValidationManager mgr, ResourceSet rs) {
		for (EObject o : mgr.getAllElements(rs)) {
			if (o.eIsProxy()) {
				mgr.setProblem(o + " was not resolved.",
						IMarker.SEVERITY_ERROR, o.eResource().getURI() + "#"
								+ o, o.hashCode() + "");
			}
		}
	}

}
