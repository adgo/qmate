package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.ui.dialogs.LoadModelResourceDialog;

public class EditImportsAction extends EMFSelectionAction {

	public EditImportsAction(IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Load resources...");
	}

	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.loadres";

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
		
		ged.validate();
	}

}
