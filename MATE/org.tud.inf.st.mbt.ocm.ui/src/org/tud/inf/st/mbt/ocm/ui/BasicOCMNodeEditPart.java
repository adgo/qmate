package org.tud.inf.st.mbt.ocm.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.ocm.CompositionEdge;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.OperationalEdge;

public abstract class BasicOCMNodeEditPart extends BasicNodeEditPart implements IActivatableNode{
	
	private boolean active = false;

	public BasicOCMNodeEditPart(EObject model, EMFGraphics graphics,
			IResource loadedResource) {
		super(model, graphics, loadedResource);
	}
	
	@Override
	public void simulationActivate(boolean active) {
		this.active = active;
		refreshVisuals();		
	}
	
	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new OCMCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return true;
					}

					public boolean canConnect(EObject source, EObject target,
							EClass connType) {
						if (connType.equals(OcmPackage.eINSTANCE
								.getCompositionEdge())
								&& !OcmPackage.eINSTANCE
										.getComposedConfigurationNode()
										.isSuperTypeOf(target.eClass()))
							return false;
						else
							return true;
					}

					public EObject getSource(EObject connection) {
						if (connection instanceof CompositionEdge) {
							return ((CompositionEdge) connection).getSource();
						} else if (connection instanceof OperationalEdge) {
							return ((OperationalEdge) connection).getSource();
						}

						return null;
					}

					public EObject getTarget(EObject connection) {
						if (connection instanceof CompositionEdge) {
							return ((CompositionEdge) connection).getTarget();
						} else if (connection instanceof OperationalEdge) {
							return ((OperationalEdge) connection).getTarget();
						}

						return null;
					}
				});
		installEditPolicy(
				EditPolicy.COMPONENT_ROLE,
				new EMFComponentEditPolicy(new OCMCommandFactory(getGraphics())));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new EMFXYLayoutEditPolicy(
				getGraphics(), new OCMCommandFactory(getGraphics()), true));
	}

	@Override
	protected AbstractConnectionAnchor createAnchor() {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public void refreshVisuals() {
		OperationalConfigurationModel ocm = (OperationalConfigurationModel) getModel()
				.eContainer();
		
		boolean isStart = getModel().equals(ocm.getStart());
	
		if(active){
			((LineBorder) getFigure().getBorder()).setWidth(4);
			((LineBorder) getFigure().getBorder()).setColor(ColorConstants.blue);
		} else {
			if(isStart){
				((LineBorder) getFigure().getBorder()).setWidth(3);
				((LineBorder) getFigure().getBorder()).setColor(ColorConstants.green);
		} else{
				((LineBorder) getFigure().getBorder()).setWidth(1);
				((LineBorder) getFigure().getBorder()).setColor(ColorConstants.black);
			}
		}

		setConstraint(new Rectangle(
				getGraphics().getObjectConstraint(getModel())));
		getFigure().repaint();
		refreshChildren();
	}

	@Override
	protected List<Edge> getModelSourceConnections() {
		List<Edge> result = new ArrayList<>();
		if (getModel().eContainer() != null)
			for (Edge e : ((OperationalConfigurationModel) getModel()
					.eContainer()).getEdges()) {
				if (((EMFGraphicalNodeEditPolicy) getEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE))
						.getSource(e).equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected List<Edge> getModelTargetConnections() {
		List<Edge> result = new ArrayList<>();
		if (getModel().eContainer() != null)
			for (Edge e : ((OperationalConfigurationModel) getModel()
					.eContainer()).getEdges()) {
				if (((EMFGraphicalNodeEditPolicy) getEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE))
						.getTarget(e).equals(getModel()))
					result.add(e);
			}
		return result;
	}

}
