package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.commands.LayoutCommand;

public class LayoutAction extends EMFSelectionAction {

	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.layout";

	public LayoutAction(IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Layout");
	}

	@Override
	protected boolean calculateEnabled() {
		return getEMFSelection().size() == 1
				&& getEMFSelection().iterator().next() instanceof GuiGraph;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();
		ged.executeCommand(new LayoutCommand(ged));
	}
}
