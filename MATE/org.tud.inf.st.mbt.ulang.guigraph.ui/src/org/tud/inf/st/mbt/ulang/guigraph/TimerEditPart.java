package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.IFocusableListener;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.ulang.guigraph.commands.GUIGraphCommandFactory;

public class TimerEditPart extends BasicNodeEditPart implements NodeEditPart,
		IWorkbenchAdapter, IAdaptable, IFocusableListener {

	public TimerEditPart(TimerTransition model, EMFGraphics graphics) {
		super(model, graphics, null);
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new GUIGraphCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return source instanceof GuiGraphNode
								&& connType.equals(GuigraphPackage.eINSTANCE
										.getStandardArc());
					}

					public boolean canConnect(EObject source, EObject target,
							EClass connType) {
						if(!(source instanceof Transition && !(target instanceof Transition))
								&& !(target instanceof Transition && !(source instanceof Transition)))return false;
						
						for(Arc a:ModelUtil.getAllEObjectsOfSuperType(new HashMap<Integer, Set<?>>(),getModel().eContainer(), Arc.class)){
							if(a.getSource().equals(source) && a.getTarget().equals(target)){
								if(connType.equals(GuigraphPackage.eINSTANCE.getStandardArc()) && a instanceof StandardArc)return false;
								if(connType.equals(GuigraphPackage.eINSTANCE.getInhibitorArc()) && a instanceof InhibitorArc)return false;								
							}
						}
						
						return true;
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
	protected List<Arc> getModelSourceConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof Transition && getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getSource().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected List<Arc> getModelTargetConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof Transition && getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getTarget().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	public void refreshVisuals() {
		TimerFigure fig = (TimerFigure) getFigure();

		String consumer = getModel().getConsumer() == null ? "*" : getModel()
				.getConsumer().toString();

		long min = getModel().getTimeMin();
		long max = getModel().getTimeMax();
		StringBuffer interval = new StringBuffer();
		interval.append("[");
		if (min < 0)
			min = 0;
		interval.append("" + min);
		interval.append("..");
		if (max < min)
			max = Long.MAX_VALUE;
		interval.append("" + (max == Long.MAX_VALUE ? "*" : max) + "]");

		fig.setText(interval + "\n" + consumer + " + "
				+ getModel().getDuration());
		fig.setTerminates(getModel().isTerminates());

		AbstractGraphicalEditPart parent = (AbstractGraphicalEditPart) getParent();
		if (parent != null)
			parent.setLayoutConstraint(this, fig, new Rectangle(getGraphics()
					.getObjectConstraint(getModel()).getLocation(),
					getGraphics().getStandardDimension(getModel().eClass())));

		refreshChildren();
	}

	public EllipseAnchor createAnchor() {
		return new EllipseAnchor(getFigure());
	}

	public String getLabel(Object o) {
		return "Timer Transition";
	}

	@Override
	public TimerFigure getFigure() {
		return (TimerFigure) super.getFigure();
	}

	@Override
	public TimerTransition getModel() {
		return (TimerTransition) super.getModel();
	}

	@Override
	public void focus(Collection<Object> on) {
	}

	@Override
	protected IFigure createFigure() {
		return new TimerFigure();
	}
}
