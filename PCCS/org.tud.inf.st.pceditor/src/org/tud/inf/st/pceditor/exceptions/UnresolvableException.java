package org.tud.inf.st.pceditor.exceptions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tud.inf.st.pceditor.interpreter.Location;

public class UnresolvableException extends LocatableException {
	private EObject container;
	private EStructuralFeature reference;
	private String qname;
	private EObject relativeTo;

	public UnresolvableException(EObject container,
			EStructuralFeature reference, String qname, 
			Location location) {
		super("Cannot resolve " + container + "#" + reference.getName() + "->"
				+ qname + ".", location);
		this.container = container;
		this.reference = reference;
		this.qname = qname;
		this.relativeTo = relativeTo;
	}

	public EObject getContainer() {
		return container;
	}

	public EStructuralFeature getReference() {
		return reference;
	}

	public String getQname() {
		return qname;
	}

	public EObject getRelativeTo() {
		return relativeTo;
	}

}
