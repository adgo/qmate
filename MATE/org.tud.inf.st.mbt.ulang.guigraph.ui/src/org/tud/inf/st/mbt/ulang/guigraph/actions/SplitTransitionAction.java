package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;
import org.tud.inf.st.mbt.ulang.guigraph.commands.SplitTransitionCommand;

public class SplitTransitionAction extends EMFSelectionAction  {
	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.splittrans";

	private EMFGraphics graphics;

	public SplitTransitionAction(IWorkbenchPart part,EMFGraphics graphics) {
		super(part);
		setId(ID);
		setText("Split transition");
		this.graphics = graphics;
	}

	@Override
	protected boolean calculateEnabled() {
		return getEMFSelection().size() == 1 && getEMFSelection().iterator().next() instanceof Transition;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();
		ged.executeCommand(new SplitTransitionCommand((GuiGraph)ged.getGraph(), (Transition) getEMFSelection().iterator().next(),graphics));
	}
}
