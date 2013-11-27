package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;
import org.tud.inf.st.mbt.ulang.guigraph.commands.DuplicateNodeCommand;

public class DuplicateNodeAction extends EMFSelectionAction  {
	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.duplicate";

	private EMFGraphics graphics;

	public DuplicateNodeAction(IWorkbenchPart part,EMFGraphics graphics) {
		super(part);
		setId(ID);
		setText("Duplicate");
		this.graphics = graphics;
	}

	@Override
	protected boolean calculateEnabled() {
		return getEMFSelection().size() == 1 && getEMFSelection().iterator().next() instanceof GuiGraphNode;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();
		ged.executeCommand(new DuplicateNodeCommand((GuiGraph)ged.getGraph(), (GuiGraphNode) getEMFSelection().iterator().next(),graphics));
	}
}
