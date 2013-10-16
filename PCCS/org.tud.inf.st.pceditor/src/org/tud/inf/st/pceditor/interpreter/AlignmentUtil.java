package org.tud.inf.st.pceditor.interpreter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class AlignmentUtil {
	public static boolean align(Object before, Object after) {
		if (before == null || after == null || !(before instanceof EObject)
				|| !(after instanceof EObject))
			return false;
		
		EObject eoBefore = (EObject)before;
		EObject eoAfter = (EObject)after;
		
		if(!eoBefore.eClass().equals(eoAfter.eClass()))return false;
		
		for(EStructuralFeature esf:eoBefore.eClass().getEAllStructuralFeatures()){
			eoBefore.eSet(esf,eoAfter.eGet(esf));
		}
		
		for(EAttribute ea:eoBefore.eClass().getEAllAttributes()){
			eoBefore.eSet(ea,eoAfter.eGet(ea));
		}
		
		return true;
	}
}
