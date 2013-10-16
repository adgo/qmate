package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

public abstract class EMFModelIndex {
	private EObject topContainer;	
	
	public EMFModelIndex(EObject topContainer) {
		this.topContainer = topContainer;
	}
	
	public abstract String getIdByObject(EObject obj);
	
	public EObject getObectById(String id){
		Iterator<EObject> i =topContainer.eAllContents();
		while(i.hasNext()){
			EObject obj = i.next();
			String objId = getIdByObject(obj);
			if(objId!= null && objId.equals(id))return obj;
		}
		return null;
	}
}
