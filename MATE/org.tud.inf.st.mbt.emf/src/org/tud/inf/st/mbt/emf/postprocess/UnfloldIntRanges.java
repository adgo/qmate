package org.tud.inf.st.mbt.emf.postprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.IntDataValue;
import org.tud.inf.st.mbt.data.SubstitutableIntRange;
import org.tud.inf.st.mbt.data.TypedDataClass;
import org.tud.inf.st.mbt.emf.util.ModelUtil;

public class UnfloldIntRanges implements IPostProcessor {

	@Override
	public void process(ResourceSet rs) {
		for (SubstitutableIntRange sir : ModelUtil.getAllEObjectsOfSuperType(
				rs, SubstitutableIntRange.class)) {
			TypedDataClass c = (TypedDataClass) sir.eContainer();
			c.getChildren().remove(sir);
			for(int i=sir.getFrom();i<=sir.getTo();i++){
				IntDataValue v = DataFactory.eINSTANCE.createIntDataValue();
				v.setValue(i);
				v.setId("_"+i);
				v.setName(""+i);
				c.getChildren().add(v);
			}
		}
	}

}
