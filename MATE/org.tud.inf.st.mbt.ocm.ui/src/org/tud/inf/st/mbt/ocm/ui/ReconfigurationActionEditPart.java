package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.LabeledRectangle;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.Markable;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFDirectEditPolicy;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.interpreter.Util;

public class ReconfigurationActionEditPart extends BasicOCMNodeEditPart
		implements Markable {

	private static ConcreteSyntax[] reconfSyntax;

	static {
		Util.registerPCCSExtensions();
		PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
		rs.createResource(URI
				.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/reconf.pccs"));
		rs.resolveImports();
		rs.computeReferenceErrors();
		reconfSyntax = Util.filterConcreteSyntax(rs);
	}

	public ReconfigurationActionEditPart(EObject model, EMFGraphics graphics,
			IResource loadedResource) {
		super(model, graphics, loadedResource);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new EMFDirectEditPolicy(
				getGraphics().getTextProvider(),
				(PCCSResourceSetImpl) getModel().eResource().getResourceSet()));
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_OPEN) {
			EStructuralFeature key = OcmPackage.eINSTANCE
					.getReconfigurationActionNode_ActionsText();
			Label l = getFigure().getLabel(key);
			EMFDirectEditPolicy policy = (EMFDirectEditPolicy) getEditPolicy(EditPolicy.DIRECT_EDIT_ROLE);
			policy.activateEditing(this, l, key, reconfSyntax);
		}
		super.performRequest(req);
	}

	@Override
	protected IFigure createFigure() {
		return new ReconfigurationActionNodeFigure();
	}

	@Override
	public void refreshVisuals() {
		LabeledRectangle fig = (LabeledRectangle) getFigure();
		String txt = "";

		if (!getModel().getActions().isEmpty()) {
			String[] arr = getModel().getActionsText().split(";");
			for (String l : arr)
				txt += l + ";\n";
		}
		if (getModel().getPostConfEventID() != null
				&& getModel().getPostConfEventID().length() > 0)
			txt += "/" + getModel().getPostConfEventID();
		fig.getLabel(null).setText(txt);
		super.refreshVisuals();
	}

	@Override
	public String getLabel(Object o) {
		return "action-based configuration";
	}

	@Override
	public ReconfigurationActionNode getModel() {
		return (ReconfigurationActionNode) super.getModel();
	}

	@Override
	public ReconfigurationActionNodeFigure getFigure() {
		return (ReconfigurationActionNodeFigure) super.getFigure();
	}

	@Override
	protected AbstractConnectionAnchor createAnchor() {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public void clearMarkers() {
		getFigure().setProblem(-1, null);
	}

	@Override
	public void addMarker(IMarker marker) {
		try {
			getFigure().setProblem((int) marker.getAttribute(IMarker.SEVERITY),
					(String) marker.getAttribute(IMarker.MESSAGE));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
