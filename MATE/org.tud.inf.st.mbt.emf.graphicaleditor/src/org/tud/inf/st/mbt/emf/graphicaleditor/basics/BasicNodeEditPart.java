package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.IFocusableListener;

public abstract class BasicNodeEditPart extends AbstractGraphicalEditPart
		implements NodeEditPart, IWorkbenchAdapter, IAdaptable,
		IFocusableListener {

	private EMFGraphics graphics;
	private Adapter changeAdapter = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			Display.getDefault().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					refreshVisuals();
					refreshSourceConnections();
					for (Object cep : getSourceConnections()) {
						((ConnectionEditPart) cep).refresh();
					}
					refreshTargetConnections();
					refreshChildren();					
				}
			});

		};
	};

	private AbstractConnectionAnchor anchor;
	private IResource loadedResource;

	public BasicNodeEditPart(EObject model, EMFGraphics graphics,
			IResource loadedResource) {
		setModel(model);
		this.graphics = graphics;
		this.loadedResource = loadedResource;
		graphics.addGraphNodeChangeAdapter(model, changeAdapter);
		model.eAdapters().add(changeAdapter);
		model.eContainer().eAdapters().add(changeAdapter);
	}

	protected void setConstraint(Rectangle constraint) {
		getFigure().setBounds(constraint);
		AbstractGraphicalEditPart parent = (AbstractGraphicalEditPart) getParent();
		if(parent!=null)parent.setLayoutConstraint(this, getFigure(), constraint);
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy("Snap2Grid", new SnapFeedbackPolicy());		
	}

	@Override
	public void focus(Collection<Object> on) {
	}

	public void refreshSourceConnections() {
		super.refreshSourceConnections();
	}

	@Override
	public EObject getModel() {
		return (EObject) super.getModel();
	}

	public void activate() {
		if (!isActive())
			getModel().eAdapters().add(changeAdapter);
		super.activate();
	}

	public void deactivate() {
		if (isActive())
			getModel().eAdapters().remove(changeAdapter);
		super.deactivate();
	}

	protected AbstractConnectionAnchor createAnchor() {
		return new ChopboxAnchor(getFigure());
	}

	public AbstractConnectionAnchor getAnchor() {
		if (anchor == null)
			anchor = createAnchor();
		return anchor;
	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return getAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return getAnchor();
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return getAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return getAnchor();
	}

	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	public String getLabel(Object o) {
		return "Basic";
	}

	public Object getParent(Object o) {
		return null;
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
	    if (key == SnapToHelper.class) {
	        List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
	            helpers.add(new SnapToGeometry(this));
	        }
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
	            helpers.add(new SnapToGrid(this));
	        }
	        if(helpers.size()==0) {
	            return null;
	        } else {
	            return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
	        }
	    }
		if (key == IWorkbenchAdapter.class)
			return this;
		return super.getAdapter(key);
	}

	protected IResource getLoadedResource() {
		return loadedResource;
	}

	protected EMFGraphics getGraphics() {
		return graphics;
	}

	@Override
	public Object[] getChildren(Object o) {
		return null;
	}
}