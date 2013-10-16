package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.swt.graphics.Color;

public class CompositionFigure extends Figure{
	private Ellipse shape;
	private Label label;
	
	public CompositionFigure(String operator) {
		shape = new Ellipse();
		shape.setBackgroundColor(ColorConstants.black);
		label = new Label(operator);
		label.setForegroundColor(ColorConstants.white);
		add(shape);
		add(label);
	}
	
	public void setColors(Color fg, Color bg){
		shape.setBackgroundColor(bg);
		label.setForegroundColor(fg);
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		shape.setBounds(getBounds());
		label.setBounds(getBounds());
		
		shape.invalidate();
		label.invalidate();
	}
}
