package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;

public class EMFContextMenuProvider extends ContextMenuProvider {

	public EMFContextMenuProvider(EditPartViewer viewer) {
		super(viewer);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		menu.add(new Separator("UNDO"));
		menu.appendToGroup("UNDO", new UndoRetargetAction());
		menu.appendToGroup("UNDO", new RedoRetargetAction());
	}

}
