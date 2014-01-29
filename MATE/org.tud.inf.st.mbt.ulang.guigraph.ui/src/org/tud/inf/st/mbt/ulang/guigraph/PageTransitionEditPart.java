package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.LabeledRectangle;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.ulang.guigraph.commands.GUIGraphCommandFactory;

public class PageTransitionEditPart extends BasicNodeEditPart {

	public PageTransitionEditPart(EObject model, EMFGraphics graphics) {
		super(model, graphics, null);
	}

	@Override
	public PageTransition getModel() {
		return (PageTransition) super.getModel();
	}

	@Override
	public LabeledRectangle getFigure() {
		return (LabeledRectangle) super.getFigure();
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new GUIGraphCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return source instanceof GuiGraphNode
								&& connType.equals(GuigraphPackage.eINSTANCE
										.getPageMappingArc());
					}

					public boolean canConnect(EObject source, EObject target,
							EClass connType) {
						return source instanceof Place
								&& connType.equals(GuigraphPackage.eINSTANCE.getPageMappingArc());
					}

					public EObject getSource(EObject connection) {
						return ((Arc) connection).getSource();
					}

					public EObject getTarget(EObject connection) {
						return ((Arc) connection).getTarget();
					}
				});
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new EMFComponentEditPolicy(new GUIGraphCommandFactory(
						getGraphics())));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new EMFXYLayoutEditPolicy(
				getGraphics(), new GUIGraphCommandFactory(getGraphics()), true));
	}

	@Override
	protected IFigure createFigure() {
		LabeledRectangle fig = new LabeledRectangle(ColorConstants.white,
				GGColors.c3, null);
		fig.setBorder(new LineBorder(ColorConstants.orange, 2,
				Graphics.LINE_DOT));
		return fig;
	}

	@Override
	protected List<Arc> getModelSourceConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getSource().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected List<Arc> getModelTargetConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getTarget().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		getFigure().getLabel(null).setText(
				getModel().getPage() == null ? "<?>" : ""
						+ getModel().getPage().getId());

		AbstractGraphicalEditPart parent = (AbstractGraphicalEditPart) getParent();
		if (parent != null)
			parent.setLayoutConstraint(
					this,
					getFigure(),
					new Rectangle(getGraphics().getObjectConstraint(getModel())
							.getLocation(), getGraphics().getStandardDimension(
							getModel().eClass())));

		refreshChildren();
	}

}
