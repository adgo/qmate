package org.tud.inf.st.mbt.ocm.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.generator.State.IStateActivationListener;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFContextMenuProvider;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFModelIndex;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFTextProvider;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.OcmFactory;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.provider.OcmItemProviderAdapterFactory;
import org.tud.inf.st.mbt.rules.ConfigurationAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class OCMEditor extends GraphicalEMFEditor implements
		IStateActivationListener {

	public static final String ID = "org.tud.inf.st.mbt.ocm.ui.editor";

	public OCMEditor() {
		super();
		State.registerStateActivationListener(this);
	}

	@Override
	public void dispose() {
		State.unregisterStateActivationListener(this);
	}

	@Override
	protected ResourceSet createResourceSet() {
		return new PCCSResourceSetImpl();
	}

	@Override
	public String getId() {
		return ID;
	}

	@Override
	protected ContextMenuProvider getContextMenuProvider() {
		return new EMFContextMenuProvider(getGraphicalViewer()) {
			@Override
			public void buildContextMenu(IMenuManager menu) {
				menu.add(new Separator("MODEL"));
				menu.appendToGroup("MODEL", new LoadModelResourceAction(
						OCMEditor.this));
			}
		};
	}

	@Override
	protected EMFEditPartFactory createEditPartFactory() {
		return new OCMEditPartFactory(this, new EMFGraphics(
				getGraphicalDescription(), new EMFTextProvider()) {

			@Override
			public Dimension getStandardDimension(EClass type) {
				if (OcmPackage.eINSTANCE.getStandardConfigurationNode().equals(
						type)) {
					return new Dimension(150, 50);
				}
				return new Dimension(50, 50);
			}

			@Override
			protected EMFModelIndex createIndex() {
				return new OCMModelIndex(getGraph());
			}
		});
	}

	@Override
	protected boolean enableFocusViewer() {
		return false;
	}

	@Override
	protected Collection<? extends EObject> createEmptyModel() {
		OperationalConfigurationModel model = OcmFactory.eINSTANCE
				.createOperationalConfigurationModel();
		new OCMModelIndex(null).getIdByObject(model);
		return Arrays.asList(new OperationalConfigurationModel[] { model });
	}

	@Override
	protected AdapterFactory getAdapterFactory(EClass type) {
		if (type.getEPackage().equals(OcmPackage.eINSTANCE)) {
			return new OcmItemProviderAdapterFactory();
		} else
			return null;
	}

	@Override
	public EMFModelIndex createModelndex() {
		return new OCMModelIndex(getGraph());
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new OCMPaletteRoot();
	}

	@Override
	public OperationalConfigurationModel getGraph() {
		return (OperationalConfigurationModel) super.getGraph();
	}

	@Override
	public void validate() {
		super.validate();
		ValidationManager.getInstance(getEditedResource()).validateAll(
				this.getEditedResourceSet());
	}

	@Override
	public void stateActivated(State s) {
		List<String> activatedConfs = new ArrayList<String>();
		if (s != null)
			for (Predicate p : s.findAllPredicates(RulesPackage.eINSTANCE
					.getConfigurationAtom())) {
				activatedConfs.add(((ConfigurationAtom) p).getConfiguration()
						.getId());
			}
		for (Object v : getGraphicalViewer().getEditPartRegistry().values()) {
			EditPart ep = (EditPart) v;
			if (ep instanceof IActivatableNode) {
				Object model = ep.getModel();
				if (model instanceof ConfigurationNode
						&& activatedConfs.contains(((ConfigurationNode) model)
								.getId())) {
					((IActivatableNode) ep).simulationActivate(true);
				} else {
					((IActivatableNode) ep).simulationActivate(false);
				}
			}
		}
	}
}
