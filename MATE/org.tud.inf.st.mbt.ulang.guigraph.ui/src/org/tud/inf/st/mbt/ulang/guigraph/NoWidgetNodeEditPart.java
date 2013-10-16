package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.jface.resource.ImageDescriptor;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.emf.util.ModelUtil;

public class NoWidgetNodeEditPart extends PlaceEditPart{
		
	public NoWidgetNodeEditPart(NoWidgetNode model, EMFGraphics graphics) {
		super(model, graphics, null);
	}	

	@Override
	protected IFigure createFigure() {
		return new NoWidgetNodeFigure();
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new GUIGraphCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return true;
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
	}

	@Override
	public NoWidgetNode getModel() {
		return (NoWidgetNode) super.getModel();
	}

	@Override
	protected List<Arc> getModelSourceConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof NoWidgetNode
				&& getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getSource().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected List<Arc> getModelTargetConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof NoWidgetNode
				&& getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getTarget().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	public void refreshVisuals() {
		NoWidgetNodeFigure fig = (NoWidgetNodeFigure) getFigure();

		if(getSimulationTokens()>=0){
			fig.setTokens(getSimulationTokens(),true);
		} else {
			fig.setTokens(getModel().getInitialTokens(),false);
		}		
		
		fig.setText(getModel().getName() == null ? ""
				: getModel().getName());

		setConstraint(new Rectangle(getGraphics().getObjectConstraint(
				getModel()).getLocation(), getGraphics().getStandardDimension(
				GuigraphPackage.eINSTANCE.getNoWidgetNode())));

		refreshChildren();
	}

	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	public String getLabel(Object o) {
		return "Non-Widget Node";
	}
	
	@Override
	protected AbstractConnectionAnchor createAnchor() {
		return new EllipseAnchor(getFigure());
	}
}
