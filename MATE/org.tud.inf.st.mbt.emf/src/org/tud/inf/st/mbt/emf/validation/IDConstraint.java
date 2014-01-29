package org.tud.inf.st.mbt.emf.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.core.AbstractModelElement;

public class IDConstraint implements IValidationConstraint {

	@Override
	public void validate(ValidationManager mgr, ResourceSet rs) {
		Map<String, Set<AbstractModelElement>> id2Objects = new HashMap<>();
		
		for (EObject target : mgr.getAllElements(rs)){
			if (target instanceof AbstractModelElement) {
				AbstractModelElement ame = (AbstractModelElement) target;
				if (ame.getId() != null && ame.getName() == null && !id2Objects.containsKey(ame.getId()))
					ame.setName(ame.getId());
				if (ame.getId() == null || ame.getId().length() == 0){
					mgr.setProblem("\"" + ame + "\" has no ID.",
							IMarker.SEVERITY_ERROR, target.eResource().getURI()
									+ "#" + ame + "", ame.hashCode() + "");
				} else {
					Set<AbstractModelElement> objects = id2Objects.get(ame.getId());
					if(objects == null)objects = new HashSet<>();
					id2Objects.put(ame.getId(), objects);
					objects.add(ame);
				}
			}
		}
		
		for(Set<AbstractModelElement> v:id2Objects.values()){
			if(v.size()>1){
				AbstractModelElement any = v.iterator().next();
				mgr.setProblem("Non-unique ID: "+v,
						IMarker.SEVERITY_ERROR, any.eResource().getURI()
								+ "#" + any + "", any.hashCode() + "");
			}
		}
	}

}
