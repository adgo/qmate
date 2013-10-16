package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.swt.widgets.Display;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;

public abstract class BasicEdgeEditPart extends AbstractConnectionEditPart
		implements Observer {

	private Adapter changeAdapter = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			Display.getDefault().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					refreshVisuals();				
				}
			});
		};
	};
	private EMFGraphics graphics;

	public BasicEdgeEditPart(Object model, EMFGraphics graphics) {
		setModel(model);
		this.graphics = graphics;
		graphics.addGraphEdgeChangeAdapter((EObject) model, changeAdapter);
	}

	protected IFigure createFigure() {
		PolylineConnection f = new PolylineConnection();
		f.setConnectionRouter(new BendpointConnectionRouter());
		f.setTargetDecoration(new PolylineDecoration());
		f.setAntialias(4);
		return f;
	}

	protected EMFGraphics getGraphics() {
		return graphics;
	}

	protected void refreshVisuals() {
		Connection conn = getConnectionFigure();
		
		if(conn.getSourceAnchor() == null || conn.getSourceAnchor().getOwner() == null)return;
		
		List<AbsoluteBendpoint> routingConstraint = new ArrayList<AbsoluteBendpoint>();
		for (Point bp : graphics
				.getOrderedBendpoints((EObject) this.getModel())) {
			bp = bp.getTranslated(conn.getSourceAnchor().getOwner().getBounds().getCenter());
			routingConstraint.add(new AbsoluteBendpoint(bp));
		}
		conn.setRoutingConstraint(routingConstraint);
	}

	public void activate() {
		if (!isActive())
			((EObject) getModel()).eAdapters().add(changeAdapter);
		super.activate();
	}

	public void deactivate() {
		if (isActive())
			((EObject) getModel()).eAdapters().remove(changeAdapter);
		super.deactivate();
	}

	public void update(Observable arg0, Object arg1) {
		refreshVisuals();
	}
}