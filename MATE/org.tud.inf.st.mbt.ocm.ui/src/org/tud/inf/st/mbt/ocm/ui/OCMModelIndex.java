package org.tud.inf.st.mbt.ocm.ui;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFModelIndex;

public class OCMModelIndex extends EMFModelIndex{

	public OCMModelIndex(EObject topContainer) {
		super(topContainer);
	}

	@Override
	public String getIdByObject(EObject obj) {
		if(obj instanceof AbstractModelElement){
			String id = ((AbstractModelElement) obj).getId();
			if(id == null){
				id = "ocm-"+ new Random().nextLong();
				((AbstractModelElement) obj).setId(id);
			}
			return id;
		}
		return null;
	}
}
