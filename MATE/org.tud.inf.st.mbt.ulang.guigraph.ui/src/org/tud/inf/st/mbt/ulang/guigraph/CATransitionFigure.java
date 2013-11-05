package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.MultiLabeled;
import org.tud.inf.st.mbt.emf.graphicaleditor.beauty.BeautyBorder;

public class CATransitionFigure extends RoundedRectangle implements
		MultiLabeled {
	private static GuigraphPackage GGP = GuigraphPackage.eINSTANCE;
	public static final EAttribute AC = GGP
			.getConditionActionTransition_ApplicationConditionText();
	public static final EAttribute UE = GGP
			.getConditionActionTransition_ActionsText();
	public static final EAttribute NOTE = CorePackage.eINSTANCE
			.getAbstractModelElement_Note();

	private Label ac_label, ue_label, note_label, time_label;
	private Shape ac, ue, note, time;
	private LineBorder border;
	private String toolTip;

	private int severity = -1;

	public CATransitionFigure(String toolTip) {
		this.toolTip = toolTip;

		setLayoutManager(new XYLayout());

		setCornerDimensions(new Dimension(10, 10));

		setBackgroundColor(ColorConstants.white);

		setBorder(border = new LineBorder());

		setToolTip(new Label());

		ac_label = new Label();
		ue_label = new Label();
		note_label = new Label();
		time_label = new Label();

		ac_label.setForegroundColor(ColorConstants.black);
		ue_label.setForegroundColor(ColorConstants.black);
		note_label.setForegroundColor(ColorConstants.black);
		time_label.setForegroundColor(ColorConstants.white);

		add(ac = new RoundedRectangle());
		add(ue = new RectangleFigure());
		add(note = new RectangleFigure());
		add(time = new RectangleFigure());

		((RectangleFigure) ue).setLineWidth(0);
		ac.setBorder(new BeautyBorder());

		add(ac_label);
		add(ue_label);
		add(note_label);
		add(time_label);

		time.setBackgroundColor(ColorConstants.darkBlue);

		setProblem(-1, null, AC);
		setProblem(-1, null, UE);
		setProblem(-1, null, NOTE);
		setTerminates(false);
	}

	public void setTerminates(boolean term) {
		border.setWidth(term ? 3 : 1);
		border.setColor(term ? ColorConstants.red : ColorConstants.gray);
	}

	public void setTime(long min, long max) {
		StringBuffer txt = new StringBuffer();
		txt.append("[");
		if (min < 0)
			min = 0;
		txt.append("" + min);
		txt.append("..");
		if (max < min)
			max = Long.MAX_VALUE;
		txt.append("" + (max == Long.MAX_VALUE ? "*" : max) + "]");
		time_label.setText(txt.toString());
	}

	public void setActive(boolean active) {
		border.setWidth(active ? 5 : 1);
		border.setColor(active ? ColorConstants.blue : ColorConstants.gray);
	}

	public void setProblem(int severity, String text, EStructuralFeature f) {
		if (severity == IMarker.SEVERITY_WARNING) {
			if (this.severity != IMarker.SEVERITY_ERROR)
				this.severity = severity;
		} else
			this.severity = severity;

		Figure fig = null;
		if (f.equals(AC))
			fig = ac;
		if (f.equals(UE))
			fig = ue;
		if (f.equals(NOTE))
			fig = note;

		switch (this.severity) {
		case IMarker.SEVERITY_WARNING: {
			fig.setBackgroundColor(ColorConstants.yellow);
			break;
		}
		case IMarker.SEVERITY_ERROR: {
			fig.setBackgroundColor(ColorConstants.red);
			break;
		}
		default: {
			if (f.equals(AC))
				fig.setBackgroundColor(GGColors.c1);
			if (f.equals(UE))
				fig.setBackgroundColor(ColorConstants.white);
			if (f.equals(NOTE))
				fig.setBackgroundColor(GGColors.c0);
		}
		}

		Label tt = (Label) getToolTip();

		if (text == null)
			tt.setText(toolTip);
		else {
			tt.setText(toolTip + "\n" + text);
		}
	}

	public void paintFigure(Graphics graphics) {
		Dimension size = getBounds().getSize();

		Dimension outer = new Dimension(size.width, 17);
		Dimension inner = new Dimension(size.width, size.height - 2
				* outer.height);

		Point topLeft = new Point(0, 0);

		setConstraint(ac, new Rectangle(new Point(topLeft), new Dimension(
				(int) (outer.width * 0.7), outer.height)));
		setConstraint(ac_label, new Rectangle(new Point(topLeft),
				new Dimension((int) (outer.width * 0.7), outer.height)));

		setConstraint(time, new Rectangle(new Point(
				(int) (outer.width * 0.7) + 1, topLeft.y), new Dimension(
				(int) (outer.width * 0.3) - 1, outer.height)));
		setConstraint(time_label, new Rectangle(new Point(
				(int) (outer.width * 0.7) + 1, topLeft.y), new Dimension(
				(int) (outer.width * 0.3) - 1, outer.height)));

		setConstraint(ue,
				new Rectangle(
						new Point(topLeft).getTranslated(0, outer.height),
						inner));
		setConstraint(ue_label,
				new Rectangle(
						new Point(topLeft).getTranslated(0, outer.height),
						inner));
		setConstraint(
				note,
				new Rectangle(new Point(topLeft).getTranslated(0, inner.height
						+ outer.height), outer));
		setConstraint(
				note_label,
				new Rectangle(new Point(topLeft).getTranslated(0, inner.height
						+ outer.height-3), outer));

		ac_label.invalidate();
		ac.invalidate();
		ue_label.invalidate();
		ue.invalidate();
		note_label.invalidate();
		note.invalidate();
		time_label.invalidate();
		time.invalidate();
	}

	@Override
	public EStructuralFeature getFeatureOn(Point on) {
		Label[] labels = new Label[] { ac_label, ue_label, note_label };
		EStructuralFeature[] features = new EStructuralFeature[] { AC, UE, NOTE };
		for (int i = 0; i < labels.length; i++) {
			Point p = new Point(on);
			labels[i].translateToRelative(p);
			if (labels[i].containsPoint(p))
				return features[i];
		}

		return null;
	}

	@Override
	public Label getLabel(EStructuralFeature key) {
		if (key.equals(AC))
			return ac_label;
		if (key.equals(UE))
			return ue_label;
		if (key.equals(NOTE))
			return note_label;
		return null;
	}

}