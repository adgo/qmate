package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.SelectionRequest;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.Markable;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.MultiLabeled;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFDirectEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.interpreter.Util;

public class CATransitionEditPart extends BasicNodeEditPart implements Markable {

	private static ConcreteSyntax[] acSyntax, ueSyntax;

	static {
		Util.registerPCCSExtensions();
		{
			PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
			rs.createResource(URI
					.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/rules.pccs"));
			rs.resolveImports();
			rs.computeReferenceErrors();
			acSyntax = Util.filterConcreteSyntax(rs);
		}
		{
			PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
			rs.createResource(URI
					.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/actions.pccs"));
			rs.resolveImports();
			rs.computeReferenceErrors();
			ueSyntax = Util.filterConcreteSyntax(rs);
		}
	}

	private boolean focus = true, simulationActive = false;;

	public CATransitionEditPart(ConditionActionTransition model,
			EMFGraphics graphics) {
		super(model, graphics, null);
	}

	@Override
	protected IFigure createFigure() {
		AbstractModelElement ame = getModel();
		String name = ame.getName() == null ? ame.getId() : ame.getName();
		return new CATransitionFigure(name);
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new GUIGraphCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return source instanceof GuiGraphNode
								&& !connType.equals(GuigraphPackage.eINSTANCE
										.getInhibitorArc());
					}

					public boolean canConnect(EObject source, EObject target,
							EClass connType) {
						if(!(source instanceof Transition && !(target instanceof Transition))
								|| (target instanceof Transition && !(source instanceof Transition)))return false;
						
						for(Arc a:ModelUtil.getAllEObjectsOfSuperType(getModel().eContainer(), Arc.class)){
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
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new EMFDirectEditPolicy(
				getGraphics().getTextProvider(),
				(PCCSResourceSetImpl) getModel().eResource().getResourceSet()));
	}

	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_OPEN
				&& req instanceof SelectionRequest) {
			MultiLabeled fig = (MultiLabeled) getFigure();
			EStructuralFeature key = fig.getFeatureOn(((SelectionRequest) req)
					.getLocation());
			Label label = ((MultiLabeled) getFigure()).getLabel(key);
			EMFDirectEditPolicy policy = (EMFDirectEditPolicy) getEditPolicy(EditPolicy.DIRECT_EDIT_ROLE);
			ConcreteSyntax[] cs = key.equals(CATransitionFigure.UE) ? ueSyntax
					: key.equals(CATransitionFigure.AC) ? acSyntax : null;
			policy.activateEditing(this, label, key, cs);
		}
		super.performRequest(req);
	}

	@Override
	public ConditionActionTransition getModel() {
		return (ConditionActionTransition) super.getModel();
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
		CATransitionFigure fig = (CATransitionFigure) getFigure();

		String note = getModel().getName() == null ? "" : "["
				+ getModel().getName() + "]";
		note += getModel().getNote() == null ? "" : " " + getModel().getNote();

		fig.getLabel(CATransitionFigure.AC).setText(
				getModel().getApplicationConditionText());
		fig.getLabel(CATransitionFigure.UE)
				.setText(getModel().getActionsText());
		fig.getLabel(CATransitionFigure.NOTE).setText(note);

		fig.setTime(getModel().getTimeMin(), getModel().getTimeMax());

		if (simulationActive)
			fig.setActive(simulationActive);
		else
			fig.setTerminates(getModel().isTerminates());

		setConstraint(new Rectangle(getGraphics().getObjectConstraint(
				getModel())));

		refreshChildren();
	}

	public void setSimulationActive(boolean simulationActive) {
		this.simulationActive = simulationActive;
		refreshVisuals();
	}

	@Override
	public ChopboxAnchor createAnchor() {
		return new ChopboxAnchor(getFigure());
	}

	public String getLabel(Object o) {
		return "A/C Transition";
	}

	@Override
	public CATransitionFigure getFigure() {
		return (CATransitionFigure) super.getFigure();
	}

	@Override
	public void clearMarkers() {
		if (!focus)
			return;
		getFigure().setProblem(-1, null, CATransitionFigure.AC);
		getFigure().setProblem(-1, null, CATransitionFigure.UE);
		getFigure().setProblem(-1, null, CATransitionFigure.NOTE);
	}

	@Override
	public void addMarker(IMarker marker) {
		if (!focus)
			return;
		try {
			getFigure().setProblem((int) marker.getAttribute(IMarker.SEVERITY),
					(String) marker.getAttribute(IMarker.MESSAGE),
					CATransitionFigure.AC);
			getFigure().setProblem((int) marker.getAttribute(IMarker.SEVERITY),
					(String) marker.getAttribute(IMarker.MESSAGE),
					CATransitionFigure.UE);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void focus(Collection<Object> on) {
		focus = on.contains("All") || on.contains("Transitions");
		refreshVisuals();
	}
}
