package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;

public class EMFCreationFactory implements CreationFactory{
	
	private EClass eClass;
	
	public EMFCreationFactory(EClass eClass) {
		this.eClass = eClass;
	}

	public Object getNewObject() {
		return eClass.getEPackage().getEFactoryInstance().create(eClass);
	}

	public Object getObjectType() {
		return eClass;
	}
}
