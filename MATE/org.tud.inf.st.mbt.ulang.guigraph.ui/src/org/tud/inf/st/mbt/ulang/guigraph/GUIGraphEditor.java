package org.tud.inf.st.mbt.ulang.guigraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.tud.inf.st.mbt.actions.provider.ActionsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.core.provider.CoreItemProviderAdapterFactory;
import org.tud.inf.st.mbt.data.provider.DataItemProviderAdapterFactory;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.generator.State.IStateActivationListener;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFContextMenuProvider;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFModelIndex;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFTextProvider;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.FocusNode;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.FeaturesFactory;
import org.tud.inf.st.mbt.features.provider.FeaturesItemProviderAdapterFactory;
import org.tud.inf.st.mbt.featuretree.provider.FeaturetreeItemProviderAdapterFactory;
import org.tud.inf.st.mbt.functions.provider.FunctionsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.ocm.provider.OcmItemProviderAdapterFactory;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TokenAtom;
import org.tud.inf.st.mbt.rules.provider.RulesItemProviderAdapterFactory;
import org.tud.inf.st.mbt.scenario.provider.ScenarioItemProviderAdapterFactory;
import org.tud.inf.st.mbt.terms.provider.TermsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.test.provider.TestItemProviderAdapterFactory;
import org.tud.inf.st.mbt.ulang.guigraph.actions.DuplicateNodeAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.EditImportsAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.LayoutAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.MergePlacesAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.RecordAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.SplitTransitionAction;
import org.tud.inf.st.mbt.ulang.guigraph.actions.UnfoldInterfaceAction;
import org.tud.inf.st.mbt.ulang.guigraph.provider.GuigraphItemProviderAdapterFactory;

public class GUIGraphEditor extends GraphicalEMFEditor implements
		IStateActivationListener {

	public static final String ID = "org.tud.inf.st.mbt.ulang.guigrapheditor";
	public static final int NOSIM = -1;
	private ComposedAdapterFactory adapterFactory;

	public GUIGraphEditor() {
		super();
		State.registerStateActivationListener(this);
	}

	@Override
	public void dispose() {
		State.unregisterStateActivationListener(this);
	}

	public String getId() {
		return ID;
	}

	@Override
	protected ContextMenuProvider getContextMenuProvider() {
		return new EMFContextMenuProvider(getGraphicalViewer()) {
			@Override
			public void buildContextMenu(IMenuManager menu) {
				menu.add(new Separator("MODEL"));
				menu.appendToGroup("MODEL", new EditImportsAction(
						GUIGraphEditor.this));
				menu.appendToGroup("MODEL", new LayoutAction(
						GUIGraphEditor.this));
				menu.appendToGroup("MODEL", new RecordAction(
						GUIGraphEditor.this));
				menu.appendToGroup("MODEL", new MergePlacesAction(
						GUIGraphEditor.this));
				menu.appendToGroup("MODEL", new SplitTransitionAction(
						GUIGraphEditor.this,getEditPartFactory().getGraphics()));
				menu.appendToGroup("MODEL", new DuplicateNodeAction(
						GUIGraphEditor.this,getEditPartFactory().getGraphics()));
				menu.appendToGroup("MODEL", new UnfoldInterfaceAction(
						GUIGraphEditor.this,getEditPartFactory().getGraphics()));
			}
		};
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		EcoreUtil.resolveAll(getGraph());
		buildFocusModel();
	}

	private void buildFocusModel() {
		FocusNode root = new FocusNode(null, null);
		new FocusNode("All", root);
		new FocusNode("Transitions", root);
		new FocusNode("Widgets/Forms", root);
		setFocusRoot(root);
	}

	@Override
	protected Collection<? extends EObject> createEmptyModel() {
		GuiGraph model = GuigraphFactory.eINSTANCE
				.createGuiGraph();
		new GUIGraphModelIndex(null).getIdByObject(model);
		Configuration empty = FeaturesFactory.eINSTANCE.createConfiguration();
		empty.setId(model.getId()+"_empty");
		empty.setName(empty.getId());;
		return Arrays.asList(new EObject[] { model, empty });
	}

	@Override
	protected AdapterFactory getAdapterFactory(EClass type) {
		if(adapterFactory != null)return adapterFactory;
		
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ActionsItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new FeaturetreeItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new GuigraphItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new CoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TestItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new RulesItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new FeaturesItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DataItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new FunctionsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new OcmItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ScenarioItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TermsItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		return adapterFactory;
	}

	@Override
	public EMFModelIndex createModelndex() {
		return new GUIGraphModelIndex(getGraph());
	}

	@Override
	protected EMFEditPartFactory createEditPartFactory() {
		return new GUIGraphEditPartFactory(this, new EMFGraphics(
				getGraphicalDescription(), new EMFTextProvider()) {

			@Override
			public Dimension getStandardDimension(EClass type) {
				if (type.equals(GuigraphPackage.eINSTANCE.getForm())) {
					return new Dimension(100, 100);
				} else if (type.equals(GuigraphPackage.eINSTANCE.getWidget())) {
					return new Dimension(45, 20);
				} else if (type.equals(GuigraphPackage.eINSTANCE
						.getConditionActionTransition())) {
					return new Dimension(100, 60);
				} else if (type.equals(GuigraphPackage.eINSTANCE
						.getTimerTransition())) {
					return new Dimension(100, 100);
				} else if (type.equals(GuigraphPackage.eINSTANCE
						.getNoWidgetNode())) {
					return new Dimension(100, 40);
				} else if (type.equals(GuigraphPackage.eINSTANCE
						.getPageTransition())) {
					return new Dimension(100, 40);
				}

				return new Dimension(50, 50);
			}

			@Override
			protected EMFModelIndex createIndex() {
				return new GUIGraphModelIndex(getGraph());
			}
		});
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new GUIGraphPaletteRoot();
	}

	@Override
	protected boolean enableFocusViewer() {
		return false;
	}

	@Override
	public void validate() {
		ValidationManager.getInstance(getEditedResource()).validateAll(getEditedResourceSet());
	}

	@Override
	public GuiGraph getGraph() {
		for (EObject eo : getModel()) {
			if (eo instanceof GuiGraph)
				return (GuiGraph) eo;
		}
		return null;
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// If not the active editor, ignore selection changed.
		if (this.equals(getSite().getPage().getActiveEditor()))
			updateActions(super.getSelectionActions());
	}

	@Override
	protected ResourceSet createResourceSet() {
		return new GuiGraphResourceSet();
	}

	@Override
	public void stateActivated(State s) {
		Map<String, Integer> assignments = new HashMap<String, Integer>();
		List<String> activeTransitions = new ArrayList<String>(1);
		if (s != null) {
			// find all tokens in places
			for (Predicate p : s.findAllPredicates(RulesPackage.eINSTANCE
					.getTokenAtom())) {
				TokenAtom a = (TokenAtom) p;
				GuiGraph parent = (GuiGraph) a.getPlace().eContainer();
				if (parent.getId().equals(getGraph().getId())) {
					assignments.put(a.getPlace().getId(), a.getCount());
				}
			}

			// find active transitions
			for (Predicate p : s.findAllPredicates(RulesPackage.eINSTANCE
					.getInstructionPointerAtom())) {
				InstructionPointerAtom ipa = (InstructionPointerAtom) p;
				if (ipa.getSequence().eContainer() instanceof ConditionActionTransition)
					activeTransitions.add(((ConditionActionTransition) ipa
							.getSequence().eContainer()).getId());
			}
		}
		// refresh edit parts
		for (Object o : getGraphicalViewer().getEditPartRegistry().values()) {
			EditPart ep = (EditPart) o;
			Object model = ep.getModel();
			if (model instanceof Place) {
				PlaceEditPart pep = (PlaceEditPart) ep;
				if (s == null) {
					pep.setSimulationTokens(NOSIM);
				} else if (assignments.containsKey(((Place) model).getId())) {
					pep.setSimulationTokens(assignments.get(((Place) model)
							.getId()));
				} else {
					pep.setSimulationTokens(0);
				}
			} else if (model instanceof ConditionActionTransition) {
				CATransitionEditPart caep = (CATransitionEditPart) ep;
				caep.setSimulationActive(activeTransitions
						.contains(((ConditionActionTransition) model).getId()));
			}
		}

	}
}
