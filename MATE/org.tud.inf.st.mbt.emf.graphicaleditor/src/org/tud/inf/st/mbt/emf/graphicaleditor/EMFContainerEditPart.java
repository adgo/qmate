package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.swt.widgets.Display;
import org.tud.inf.st.mbt.emf.graphicaleditor.commands.EMFCommandFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;

public abstract class EMFContainerEditPart extends AbstractGraphicalEditPart {
	
	private Adapter changeAdapter = new AdapterImpl(){
		@Override
		public void notifyChanged(Notification msg) {
			Display.getDefault().asyncExec(new Runnable(){
				public void run() {
					refresh();
				};
			});
		}
	};
	
	private EMFGraphics graphics;
	private EMFCommandFactory cmdFactory;
	private boolean childrenResizable;
		
	public EMFContainerEditPart(EObject eObject,EMFGraphics graphics,EMFCommandFactory cmdFactory,boolean childrenResizable) {
		setModel(eObject);
		this.graphics = graphics;
		this.cmdFactory = cmdFactory;
		this.childrenResizable = childrenResizable;
	}
	
	protected abstract boolean isNodeType(EClass type);
	
	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelChildren() {
		List<EObject> result = new ArrayList<EObject>();
		for(EObject o:getModel().eContents())
			if(isNodeType(o.eClass()))result.add(o);
		return result;
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer fl = new FreeformLayer();
		fl.setLayoutManager(new FreeformLayout());
		return fl;
	}
	
	@Override
	protected void refreshVisuals() {
		refreshChildren();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new EMFXYLayoutEditPolicy(graphics,cmdFactory,childrenResizable));
		installEditPolicy("Snap2Grid", new SnapFeedbackPolicy());
	}
	
	@Override
	public EObject getModel() {
		return (EObject) super.getModel();
	}
	
	@Override
	public void activate() {
		if(!isActive())getModel().eAdapters().add(changeAdapter);
		super.activate();
	}
	
	@Override
	public void deactivate() {
		if(isActive())getModel().eAdapters().remove(changeAdapter);
		super.deactivate();
	}
	
	@Override
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
	    return super.getAdapter(key);
	} 

}
