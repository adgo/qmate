package org.tud.inf.st.mbt.datascen.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class SingleVariableDiagram extends Canvas {
	private static final int VSTEP_H = 20;
	private static final int HSTEP_H = 18;
	private static final int LETTER_W = 12;
	private static final Point topLeft = new Point(0, 0);

	public static class ChangeEvent {
		private int step;
		private Object value;

		public ChangeEvent(int step, Object value) {
			this.step = step;
			this.value = value;
		}

		public int getStep() {
			return step;
		}

		public Object getValue() {
			return value;
		}
	}

	public static interface ChangeListener {
		void change(ChangeEvent ce);
	}

	private IFigure diagram,hAxis,grid;
	private LightweightSystem lws;
	private Map<Integer, Object> step2Value = new HashMap<>();
	private Map<Integer, RectangleFigure> step2Rect = new HashMap<>();
	private Object[] scala;
	private int hsteps;
	private Set<ChangeListener> listeners = new HashSet<>();

	public SingleVariableDiagram(int hsteps, Object[] scala,
			Map<Integer, Object> init, Composite parent) {
		super(parent,  SWT.NO_REDRAW_RESIZE);

		// init
		setScales(hsteps, scala, init);
		createPartControl(parent);
	}

	private void setScales(int hsteps, Object[] objs, Map<Integer, Object> init) {
		this.scala = objs;
		this.hsteps = hsteps;
		for (int i = 0; i < hsteps; i++) {
			step2Value.put(i, objs[0]);
		}
		if(init != null)
			step2Value.putAll(init);
	}
	
	public void setLength(int steps){
		this.hsteps = steps;
		createHorizontalElements();
		diagram.repaint();
	}
	
	private void createHorizontalElements(){
		int vAxisWidth = maxLetters() * LETTER_W;

		if(hAxis != null)diagram.remove(hAxis);
		diagram.add(hAxis = hAxis(new Point(topLeft).translate(vAxisWidth, scala.length
				* VSTEP_H)));
		
		if(grid != null)diagram.remove(grid);
		diagram.add(grid = grid(new Point(topLeft).translate(vAxisWidth, 0)));
	}
	
	private void createPartControl(Composite parent) {
		lws = new LightweightSystem(this);
		diagram = new Figure();

		diagram.add(vAxis(topLeft));
		createHorizontalElements();
		lws.setContents(diagram);
	}

	private IFigure vAxis(Point topLeft) {
		int vAxisWidth = maxLetters() * LETTER_W;

		IFigure wrap = new RectangleFigure();
		wrap.setBounds(new Rectangle(topLeft, new Dimension(vAxisWidth,
				scala.length * VSTEP_H)));

		for (int i = 0; i < scala.length; i++) {
			Point btmLeft = new Point(0, scala.length * VSTEP_H - VSTEP_H
					- VSTEP_H * i);

			Label l = new Label(scala[i] + "");
			l.setBorder(new LineBorder());

			l.setBounds(new Rectangle(btmLeft.translate(topLeft),
					new Dimension(vAxisWidth, VSTEP_H)));

			wrap.add(l);
		}

		return wrap;
	}

	private IFigure hAxis(Point topLeft) {
		int hStepWidth = (int) (Math.floor(Math.log10(hsteps)) + 1) * LETTER_W;
		int hAxisWidth = (int) hStepWidth * hsteps;

		IFigure wrap = new RectangleFigure();
		wrap.setBounds(new Rectangle(topLeft,
				new Dimension(hAxisWidth, HSTEP_H)));

		for (int i = 0; i < hsteps; i++) {
			Point stepTopLeft = new Point(i * hStepWidth, 0);

			Label l = new Label("" + i);
			l.setBorder(new LineBorder());
			l.setBounds(new Rectangle(stepTopLeft.translate(topLeft),
					new Dimension(hStepWidth, HSTEP_H)));

			wrap.add(l);
		}
		return wrap;
	}

	private IFigure grid(final Point topLeft) {
		int hStepWidth = (int) (Math.floor(Math.log10(hsteps)) + 1) * LETTER_W;
		int hAxisWidth = (int) hStepWidth * hsteps;
		int vsteps = scala.length;

		IFigure wrap = new RectangleFigure();
		wrap.setBounds(new Rectangle(topLeft, new Dimension(hAxisWidth, vsteps
				* VSTEP_H)));

		for (int h = 0; h < hsteps; h++) {
			Point start = new Point(h * hStepWidth, 0);
			Dimension size = new Dimension(hStepWidth, vsteps * VSTEP_H);
			RectangleFigure rect = new RectangleFigure();
			rect.setBounds(new Rectangle(start.translate(topLeft), size));
			rect.setLineStyle(SWT.LINE_DOT);
			rect.setLineWidth(1);
			wrap.add(rect);

			final int t = h;
			rect.addMouseMotionListener(new MouseMotionListener() {
				public void mouseMoved(org.eclipse.draw2d.MouseEvent me) {
				}

				public void mouseHover(org.eclipse.draw2d.MouseEvent me) {
				}

				public void mouseExited(org.eclipse.draw2d.MouseEvent me) {
				}

				public void mouseEntered(org.eclipse.draw2d.MouseEvent me) {
				}

				public void mouseDragged(org.eclipse.draw2d.MouseEvent me) {
					mouseAt(t, me.y, topLeft);
				}
			});
			rect.addMouseListener(new MouseListener() {
				public void mousePressed(org.eclipse.draw2d.MouseEvent me) {
				}

				public void mouseReleased(org.eclipse.draw2d.MouseEvent me) {
					mouseAt(t, me.y, topLeft);
				}

				public void mouseDoubleClicked(org.eclipse.draw2d.MouseEvent me) {
				}

			});
		}

		for (int v = 0; v < vsteps; v++) {
			Point start = new Point(0, v * VSTEP_H);
			Point end = new Point(start).translate(hAxisWidth, 0);
			wrap.add(line(start.translate(topLeft), end.translate(topLeft)));
		}

		for (int h = 0; h < hsteps; h++) {
			RectangleFigure rect = new RectangleFigure();
			rect.setBackgroundColor(isEnabled() ? ColorConstants.orange : ColorConstants.gray);
			step2Rect.put(h, rect);
			wrap.add(rect);
			updateValue(h, topLeft);
		}

		return wrap;
	}
	
	public void setSimualtionActive(int step){
		setEnabled(getEnabled());//reset all rects		
		RectangleFigure rect = step2Rect.get(step);
		if(rect != null){
			rect.setBackgroundColor(ColorConstants.blue);
		}
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		for(RectangleFigure rect:step2Rect.values()){
			rect.setBackgroundColor(enabled ? ColorConstants.orange : ColorConstants.gray);
		}
		super.setEnabled(enabled);
	}

	private void mouseAt(int t, int y, Point topLeft) {
		y = y - topLeft.y();
		int vAxisHeight = scala.length * VSTEP_H;
		y = vAxisHeight - y;
		y = (int) Math.floor(y / VSTEP_H);

		step2Value.put(t, scala[y]);
		updateValue(t, topLeft);
		fireChange(t, scala[y]);
	}

	private void updateValue(int t, Point topLeft) {
		int hStepWidth = (int) (Math.floor(Math.log10(hsteps)) + 1) * LETTER_W;

		int rectNumBtm = idx(step2Value.get(t));
		int rectNumTop = scala.length - rectNumBtm - 1;
		Point start = new Point(t * hStepWidth, VSTEP_H * rectNumTop);
		Dimension size = new Dimension(hStepWidth, VSTEP_H);
		RectangleFigure rect = step2Rect.get(t);
		rect.setBounds(new Rectangle(start.translate(topLeft), size));
	}

	private int idx(Object o) {
		int idx = 0;
		for (Object i : scala) {
			if (i.equals(o))
				return idx;
			idx++;
		}
		return -1;
	}

	private int maxLetters() {
		int max = 0;
		for (Object o : scala) {
			String str = "" + o;
			int l = str == null ? 0 : str.length();
			if (l > max)
				max = l;
		}
		return max;
	}

	private PolylineConnection line(Point start, Point end) {
		PolylineConnection connection = new PolylineConnection();
		connection.setSourceAnchor(new XYAnchor(start));
		connection.setTargetAnchor(new XYAnchor(end));
		connection.setLineStyle(SWT.LINE_DOT);
		return connection;
	}

	@Override
	public org.eclipse.swt.graphics.Point computeSize(int wHint, int hHint,
			boolean changed) {
		int hStepWidth = (int) (Math.floor(Math.log10(hsteps)) + 1) * LETTER_W;

		int width = hStepWidth * hsteps + maxLetters() * LETTER_W, height = scala.length
				* VSTEP_H + HSTEP_H;

		if (wHint != SWT.DEFAULT)
			width = wHint;
		if (hHint != SWT.DEFAULT)
			height = hHint;
		return new org.eclipse.swt.graphics.Point(width, height);
	}
	
	private void fireChange(int step, Object value) {
		ChangeEvent ce = new ChangeEvent(step, value);
		for (ChangeListener l : listeners) {
			l.change(ce);
		}
	}

	public void registerChangeListener(ChangeListener l) {
		listeners.add(l);
	}

	public void unregisterChangeListener(ChangeListener l) {
		listeners.remove(l);
	}
}
