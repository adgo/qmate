package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFComponentEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFGraphicalNodeEditPolicy;
import org.tud.inf.st.mbt.emf.graphicaleditor.policies.EMFXYLayoutEditPolicy;
import org.tud.inf.st.mbt.emf.util.ModelUtil;

public class WidgetEditPart extends PlaceEditPart {

	private boolean focus = true;

	public WidgetEditPart(Widget model, EMFGraphics graphics,
			IResource loadedResource) {
		super(model, graphics, loadedResource);
	}

	@Override
	protected IFigure createFigure() {
		return new WidgetFigure();
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new EMFGraphicalNodeEditPolicy(new GUIGraphCommandFactory(
						getGraphics())) {
					public boolean canSource(EObject source, EClass connType) {
						return source instanceof GuiGraphNode;
					}

					public boolean canConnect(EObject source, EObject target,
							EClass connType) {
						if(!(source instanceof Transition && !(target instanceof Transition))
								&& !(target instanceof Transition && !(source instanceof Transition)))return false;
						
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
	public Widget getModel() {
		return (Widget) super.getModel();
	}

	@Override
	protected List<Widget> getModelChildren() {
		return getModel().getChildren();
	}

	@Override
	protected List<Arc> getModelSourceConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof Form && getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getSource().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	protected List<Arc> getModelTargetConnections() {
		List<Arc> result = new ArrayList<>();
		if (getModel() instanceof Form && getModel().eContainer() != null)
			for (Arc e : ((GuiGraph) getModel().eContainer()).getArcs()) {
				if (e.getTarget().equals(getModel()))
					result.add(e);
			}
		return result;
	}

	@Override
	public void refreshVisuals() {
		WidgetFigure fig = (WidgetFigure) getFigure();

		fig.setFocus(focus);

		Widget state = getModel();
		fig.getLabel().setText(
				(getSimulationTokens() > 0 ? "<" + getSimulationTokens() + ">" : "")
						+ getGraphics().getTextProvider().getText(
								state,
								CorePackage.eINSTANCE
										.getAbstractModelElement_Name()));
		fig.setActive(getSimulationTokens() > 0);

		setConstraint(new Rectangle(getGraphics().getObjectConstraint(
				getModel())));

		fig.setImagePath(ResourcesPlugin.getWorkspace().getRoot().getLocation()+"/"+state.getImage());

		refreshChildren();
	}

	@Override
	public ChopboxAnchor createAnchor() {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public IFigure getContentPane() {
		return ((WidgetFigure) getFigure()).getContentPane();
	}

	public String getLabel(Object o) {
		return "Widget";
	}

	@Override
	public void focus(Collection<Object> on) {
		focus = on.contains("All") || on.contains("Widgets/Forms");
		refreshVisuals();
	}
}
