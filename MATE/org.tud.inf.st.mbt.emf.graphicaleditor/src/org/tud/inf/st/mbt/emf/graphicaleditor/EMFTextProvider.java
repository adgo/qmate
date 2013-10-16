package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFTextProvider {
	public String getText(EObject eObject,EStructuralFeature f){
		return eObject.eGet(f) == null ? "" : eObject.eGet(f)+""; 
	}
	public void setText(EObject eObject,EStructuralFeature f,String text){
		eObject.eSet(f, text);
	}
}
