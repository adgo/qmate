package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;

public class ArcFigure extends PolylineConnection {
	private Label weightLabel;

	public ArcFigure() {
		setTargetDecoration(new PolygonDecoration());
		setAntialias(SWT.ON);
		
		add(weightLabel = new Label(), new MidpointLocator(this, 0));
		weightLabel.setForegroundColor(ColorConstants.black);
	}
	
	public void setInhibitor(boolean isInhibitor) {
		setTargetDecoration(isInhibitor ? new EllipseDecoration()
				: new PolygonDecoration());
	}
	
	public void setWeight(int w){
		weightLabel.setText(""+w);
	}
}