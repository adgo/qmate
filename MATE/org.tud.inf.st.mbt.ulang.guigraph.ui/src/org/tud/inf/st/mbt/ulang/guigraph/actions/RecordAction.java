package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.record.AbstractRecorder;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.ui.dialogs.SelectConnectorDialog;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
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

		SelectConnectorDialog dialog = new SelectConnectorDialog(Display
				.getDefault().getActiveShell(),
				IAutomationConstants.KIND_RECORDER);

		if (dialog.open() == Window.OK) {
			final AbstractRecorder recorder = (AbstractRecorder) dialog.getConnectorType()
					.getConnector(dialog.getConnection());
			final IPath imageContainer = ged.getEditedResource().getParent().getFullPath();

			new Job("Recording") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("working", IProgressMonitor.UNKNOWN);

					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							new RecordingDialog(getWorkbenchPart().getSite()
									.getShell(), recorder, ged, imageContainer)
									.open();
						}
					});

					monitor.done();
					return Status.OK_STATUS;
				}
			}.schedule();

		}

		ged.validate();
	}
}
