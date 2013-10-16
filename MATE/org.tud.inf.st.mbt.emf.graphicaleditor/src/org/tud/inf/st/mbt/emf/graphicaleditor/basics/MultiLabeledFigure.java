package org.tud.inf.st.mbt.emf.graphicaleditor.basics;

import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.swt.graphics.Color;

public abstract class MultiLabeledFigure extends Figure implements MultiLabeled,Markable{
	private Figure bgShape;
	private Color bgColor;
	
	public MultiLabeledFigure(Color bgColor) {
		this.bgColor = bgColor;
		setBorder(new LineBorder());
		
		setToolTip(new Label());
	}
	
	public void setBgShape(Figure bgShape) {
		this.bgShape = bgShape;
	}
	
	public Figure getBgShape() {
		return bgShape;
	}
	
	@Override
	public void clearMarkers() {
		bgShape.setBackgroundColor(bgColor);	
	}
	
	@Override
	public void addMarker(IMarker marker) {
		bgShape.setBackgroundColor(ColorConstants.red);		
	}
}
