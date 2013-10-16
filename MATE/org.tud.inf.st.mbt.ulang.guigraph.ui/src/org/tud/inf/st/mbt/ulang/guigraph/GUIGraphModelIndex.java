package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFModelIndex;

public class GUIGraphModelIndex extends EMFModelIndex {

	public GUIGraphModelIndex(EObject topContainer) {
		super(topContainer);
	}

	public String getIdByObject(EObject obj) {
		if (obj instanceof AbstractModelElement) {
			String id = ((AbstractModelElement) obj).getId();
			if (id == null) {
				id = "gui" + new Random().nextLong();
				((AbstractModelElement) obj).setId(id);
			}
			return id;
		}
		return null;
	}

}
