package org.tud.inf.st.mbt.ulang.guigraph.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFSelectionAction;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.commands.UnfoldInterfaceCommand;

public class UnfoldInterfaceAction extends EMFSelectionAction  {
	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.actions.unfoldinterface";

	private EMFGraphics graphics;

	public UnfoldInterfaceAction(IWorkbenchPart part,EMFGraphics graphics) {
		super(part);
		setId(ID);
		setText("Unfold interface");
		this.graphics = graphics;
	}

	@Override
	protected boolean calculateEnabled() {
		EObject next = getEMFSelection().iterator().next(); 
		return getEMFSelection().size() == 1 && next instanceof PageTransition && ((PageTransition)next).getPage()!=null;
	}

	@Override
	public void run() {
		GraphicalEMFEditor ged = (GraphicalEMFEditor) getWorkbenchPart();
		ged.executeCommand(new UnfoldInterfaceCommand((GuiGraph)ged.getGraph(), (PageTransition) getEMFSelection().iterator().next(),graphics));
	}
}
