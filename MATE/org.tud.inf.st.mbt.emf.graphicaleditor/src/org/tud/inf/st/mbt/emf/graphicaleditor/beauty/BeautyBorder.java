package org.tud.inf.st.mbt.emf.graphicaleditor.beauty;

import java.util.HashMap;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;

public class BeautyBorder extends AbstractBorder {

	private static final int steps = 5;
	private static final double stepFactor = 1.3;
	
	private static HashMap<RGB,Color> colors = new HashMap<>();
	
	private static Color getColor(Device d,RGB rgb){
		Color c = colors.get(rgb);
		if(c == null){
			c = new Color(ColorConstants.black.getDevice(), rgb);
			colors.put(rgb, c);
		}
		return c;
	}

	private static Color[] getColors(Color baseColor){
		Color[] colors = new Color[steps];

		for (int i = 0; i < steps; i++) {
			RGB rgb = baseColor.getRGB();
			rgb.blue = (int) Math.min(255,rgb.blue*Math.pow(stepFactor, i));
			rgb.red =  (int) Math.min(255,rgb.red*Math.pow(stepFactor, i));
			rgb.green = (int) Math.min(255,rgb.green*Math.pow(stepFactor, i));

			colors[steps-i-1] = getColor(baseColor.getDevice(), rgb);
		}
				
		return colors;
	}

	@Override
	public Insets getInsets(IFigure figure) {
		return new Insets(steps);
	}

	@Override
	public Dimension getPreferredSize(IFigure figure) {
		return null;
	}

	@Override
	public boolean isOpaque() {
		return true;
	}

	@Override
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		graphics.setLineWidth(1);
		graphics.setLineStyle(SWT.LINE_SOLID);

		Color[] colors = getColors(figure.getBackgroundColor());
		
		for (int i = 0; i < steps; i++) {
			graphics.setAlpha(Math.max(0,255-255*(i/steps)));
			graphics.setAntialias(SWT.ON);
			
			tempRect.setBounds(getPaintRectangle(figure, new Insets(i)));

			graphics.setForegroundColor(colors[i]);
			graphics.drawRoundRectangle(tempRect,5,5);
		}
	}

}
