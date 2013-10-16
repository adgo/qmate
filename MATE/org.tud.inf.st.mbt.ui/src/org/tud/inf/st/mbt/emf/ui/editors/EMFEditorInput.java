package org.tud.inf.st.mbt.emf.ui.editors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class EMFEditorInput implements IEditorInput {
	
	private Resource modelInput;
	
	public EMFEditorInput(Resource modelInput) {
		this.modelInput = modelInput;
	}
	
	public Resource getModelInput() {
		return modelInput;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return ""+modelInput.getURI().path();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return modelInput.toString();
	}

}
