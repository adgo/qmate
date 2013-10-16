package org.tud.inf.st.mbt.emf.graphicaleditor.multianchor;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;

public class RelativeEMFConnectionAnchor extends AbstractConnectionAnchor{
	
	private int x,y;
	private EObject model;
	
	public RelativeEMFConnectionAnchor(IFigure owner, int x, int y, EObject model) {
		super(owner);
		this.x = x;
		this.y = y;
		this.model = model;
	}

	@Override
	public Point getLocation(Point reference) {
		Rectangle r = getOwner().getBounds();
		
		Point p = new PrecisionPoint(r.x+this.x, r.y+this.y);
		getOwner().translateToAbsolute(p);
		return p;
	}
	
	public Point getReferencePoint() {
		return getLocation(null);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public EObject getModel() {
		return model;
	}
}
