package org.tud.inf.st.mbt.emf.validation;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IValidationConstraint {
	void validate(ValidationManager mgr, ResourceSet rs);
}
