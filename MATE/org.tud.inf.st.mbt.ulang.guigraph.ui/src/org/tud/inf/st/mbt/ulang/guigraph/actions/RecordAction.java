package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.automation.record.AbstractRecorder;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.wizards.RecordDialog;
import org.tud.inf.st.mbt.ulang.guigraph.wizards.RecordingDialog;

public class RecordAction extends EMFSelectionAction {

	public RecordAction(IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Record from application...");
	}

	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.record";

	@Override
	protected boolean calculateEnabled() {
		return getEMFSelection().size() == 1
				&& getEMFSelection().iterator().next() instanceof GuiGraph;
	}

	@Override
	public void run() {
		final GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();

		RecordDialog dialog = new RecordDialog(getWorkbenchPart().getSite()
				.getShell(), ged.getEditedResource().getFullPath()
				.removeLastSegments(1));
		if (dialog.open() == Window.OK) {
			AbstractRecorder recorder = dialog.getConnector().getRecorder(
					dialog.getConnection());

			new RecordingDialog(getWorkbenchPart().getSite().getShell(),
					recorder, ged, dialog.getImgContainer(),
					dialog.getImgContainerRelative()).open();
		}

		ged.validate();
	}
}
