package org.tud.inf.st.mbt.scenario.ui;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.BasicNodeEditPart;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.LabeledRectangle;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.scenario.Placement;

public class PlacementEditPart extends BasicNodeEditPart {

	private List<DataLeaf> simuationAssignedLeafs;

	public PlacementEditPart(EObject model, EMFGraphics graphics,
			IResource loadedResource) {
		super(model, graphics, loadedResource);
	}

	public void setSimuationAssignedLeafs(List<DataLeaf> simuationAssignedLeafs) {
		this.simuationAssignedLeafs = simuationAssignedLeafs;
		refreshVisuals();
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new EMFComponentEditPolicy(new ScenarioCommandFactory(
						getGraphics())));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new EMFXYLayoutEditPolicy(
				getGraphics(), new ScenarioCommandFactory(getGraphics()), true));
	}

	@Override
	public void refreshVisuals() {
		AbstractGraphicalEditPart parent = (AbstractGraphicalEditPart) getParent();
		parent.setLayoutConstraint(this, getFigure(), new Rectangle(
				getGraphics().getObjectConstraint(getModel())));
		
		String name = getGraphics().getTextProvider().getText(getModel(),
				CorePackage.eINSTANCE.getAbstractModelElement_Name());
		name = name == null || name.equals("null") ? "" : name;
		if (simuationAssignedLeafs == null || simuationAssignedLeafs.isEmpty()) {
			getFigure().getLabel(null).setText(name);
			getFigure().setBackgroundColor(ColorConstants.orange);
			getFigure().setForegroundColor(ColorConstants.black);
		} else {
			getFigure().setBackgroundColor(ColorConstants.blue);
			getFigure().setForegroundColor(ColorConstants.white);
			StringBuffer txt = new StringBuffer();
			txt.append(name+"\n");
			for(DataLeaf l:simuationAssignedLeafs){
				String lname = l.getName() !=null ? l.getName() : (l.getId()!=null ? l.getId() : "<?>");
				txt.append(lname+"\n");
			}
			getFigure().getLabel(null).setText(txt.toString());
		}
		
		if (getViewer() != null && getViewer().getControl() != null)
			getViewer().getControl().redraw();
	}

	@Override
	public LabeledRectangle getFigure() {
		return (LabeledRectangle) super.getFigure();
	}

	@Override
	public Placement getModel() {
		return (Placement) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		return new LabeledRectangle(ColorConstants.black,
				ColorConstants.orange, null);
	}

}
