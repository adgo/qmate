package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

public abstract class EMFSelectionAction extends SelectionAction {

	private GraphicalEMFEditor editor;

	public EMFSelectionAction(IWorkbenchPart part) {
		super(part);
		if (getWorkbenchPart() instanceof GraphicalEditor) {
			editor = (GraphicalEMFEditor) getWorkbenchPart();
		}
	}
	
	public GraphicalEMFEditor getEditor() {
		return editor;
	}

	protected Set<EObject> getEMFSelection() {
		Set<EObject> result = new HashSet<EObject>();
		if (editor != null) {
			Object selection = editor.getSite().getSelectionProvider()
					.getSelection();
			if (selection instanceof StructuredSelection) {
				Iterator<?> i = ((StructuredSelection) selection).iterator();
				while (i.hasNext()) {
					Object e = i.next();
					if (e instanceof EditPart) {
						result.add((EObject) ((EditPart) e).getModel());
					}
				}
			}
		}
		return result;
	}
}
