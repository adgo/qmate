package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.GraphicalEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.Markable;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.IFocusableListener;

public abstract class EMFEditPartFactory implements EditPartFactory {
	private Set<Markable> markables = new HashSet<>();
	private GraphicalEMFEditor editor;
	private EMFGraphics graphics;
	private Set<EditPart> editParts = new HashSet<EditPart>();

	public EMFEditPartFactory(GraphicalEMFEditor editor,EMFGraphics graphics) {
		this.editor = editor;
		this.graphics = graphics;
	}
	
	public IResource getEditedResource() {
		return editor.getEditedResource();
	}

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart ep = createEMFEditPart(context, model);
		editParts.add(ep);
		
		if (ep instanceof Markable)
			markables.add((Markable) ep);
		if(ep instanceof IFocusableListener)
			editor.addFocusListener((IFocusableListener) ep);
		checkMarkers();
		
		return ep;
	}
	
	public Set<EditPart> getEditParts() {
		return editParts;
	}

	public void checkMarkers() {
		try {
			for (Markable mep : markables) {
					mep.clearMarkers();					
			}
			for (IMarker marker : editor.getEditedResource().findMarkers(null, true,
					IResource.DEPTH_INFINITE)) {
				Integer source = Integer.parseInt(marker.getAttribute(IMarker.SOURCE_ID)+"");
				if (source != null) {
					for (Markable mep : markables) {
						if (((GraphicalEditPart)mep).getModel().hashCode() == source)
							mep.addMarker(marker);
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public EMFGraphics getGraphics() {
		return graphics;
	}

	public abstract EditPart createEMFEditPart(EditPart context, Object model);
}
