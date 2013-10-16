package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class EllipseDecoration extends Ellipse implements RotatableDecoration{
	
	public EllipseDecoration() {
		setSize(14, 14);
		setFill(true);
	}
	
	@Override
	public void setBounds(Rectangle rect) {
		super.setBounds(new Rectangle(rect.x-7,rect.y-7, rect.width,rect.height));
	}
	
	public void setReferencePoint(Point p) {
		
	}
}
