package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.ui.dialogs.LoadModelResourceDialog;

public class LoadModelResourceAction extends EMFSelectionAction {

	public LoadModelResourceAction(IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Load model resource...");
	}

	public static final String ID = "org.tud.inf.st.mbt.ocm.loadmodelresource";

	@Override
	protected boolean calculateEnabled() {
		return getEMFSelection().size() >0;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();

		ResourceSet rs = ged.getEditedResourceSet();

		LoadModelResourceDialog dialog = new LoadModelResourceDialog(
				getWorkbenchPart().getSite().getShell(), rs);
		dialog.open();
	}
}
