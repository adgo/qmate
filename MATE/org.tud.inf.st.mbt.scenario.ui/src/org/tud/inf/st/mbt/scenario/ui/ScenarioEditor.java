package org.tud.inf.st.mbt.scenario.ui;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.tud.inf.st.mbt.actions.provider.ActionsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.core.provider.CoreItemProviderAdapterFactory;
import org.tud.inf.st.mbt.data.provider.DataItemProviderAdapterFactory;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.generator.State.IStateActivationListener;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFEditPartFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFGraphics;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFModelIndex;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFTextProvider;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.emf.transformations.ScenarioModelAnalyzer;
import org.tud.inf.st.mbt.emf.validation.ValidationManager;
import org.tud.inf.st.mbt.features.provider.FeaturesItemProviderAdapterFactory;
import org.tud.inf.st.mbt.featuretree.provider.FeaturetreeItemProviderAdapterFactory;
import org.tud.inf.st.mbt.functions.provider.FunctionsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.ocm.provider.OcmItemProviderAdapterFactory;
import org.tud.inf.st.mbt.rules.provider.RulesItemProviderAdapterFactory;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;
import org.tud.inf.st.mbt.scenario.ScenarioFactory;
import org.tud.inf.st.mbt.scenario.ScenarioModel;
import org.tud.inf.st.mbt.scenario.SpatialBase;
import org.tud.inf.st.mbt.scenario.provider.ScenarioItemProviderAdapterFactory;
import org.tud.inf.st.mbt.terms.provider.TermsItemProviderAdapterFactory;
import org.tud.inf.st.mbt.test.provider.TestItemProviderAdapterFactory;
import org.tud.inf.st.mbt.ulang.guigraph.provider.GuigraphItemProviderAdapterFactory;

public class ScenarioEditor extends GraphicalEMFEditor implements IStateActivationListener{

	public static final String ID = "org.tud.inf.st.mbt.scenario.ui.editor";
	private Scenario scenario;
	private ComposedAdapterFactory adapterFactory;
	
	public ScenarioEditor() {
		super();
		State.registerStateActivationListener(this);
	}
	
	@Override
	public void dispose() {
		State.unregisterStateActivationListener(this);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		showScenarioDialog((ScenarioModel) getModel().iterator().next());
	}

	private void showScenarioDialog(ScenarioModel sm) {
		LabelProvider lp = new LabelProvider() {
			public String getText(Object element) {
				if (element instanceof SpatialBase) {
					return "Spatial Base " + element;
				} else if (element instanceof Scenario) {
					return "Scenario " + element;
				} else
					return element + "";
			};
		};
		ITreeContentProvider cp = new ITreeContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}

			@Override
			public Object getParent(Object element) {
				return null;
			}

			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof ScenarioModel) {
					return ((ScenarioModel) inputElement).getBases().toArray();
				}
				return null;
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof SpatialBase) {
					return ((SpatialBase) parentElement).getScenarios()
							.toArray();
				} else
					return new Object[0];
			}
		};
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(this
				.getSite().getShell(), lp, cp);
		dialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				boolean ok = selection != null && selection.length == 1
						&& selection[0] instanceof Scenario;
				return ok ? new Status(IStatus.OK, Activator.PLUGIN_ID, "")
						: new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"No scenario selected!");
			}
		});
		dialog.setInput(sm);
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			this.scenario = (Scenario) result[0];
		} else {
			ScenarioModelIndex idx = new ScenarioModelIndex(null);

			SpatialBase base = null;
			if (sm.getBases().isEmpty()) {
				base = ScenarioFactory.eINSTANCE.createSpatialBase();
				idx.getIdByObject(base);
				sm.getBases().add(base);
			} else {
				base = sm.getBases().get(0);
				if (base.getScenarios().isEmpty()) {
					this.scenario = ScenarioFactory.eINSTANCE.createScenario();
					idx.getIdByObject(scenario);
					base.getScenarios().add(scenario);
				} else {
					this.scenario = base.getScenarios().get(0);
				}
			}
		}
	}

	@Override
	public EObject getGraph() {
		return scenario;
	}

	@Override
	protected ResourceSet createResourceSet() {
		return new ResourceSetImpl();
	}

	@Override
	public String getId() {
		return ID;
	}

	@Override
	protected boolean enableFocusViewer() {
		return false;
	}

	@Override
	protected EMFEditPartFactory createEditPartFactory() {
		ScenarioEditPartFactory sep = new ScenarioEditPartFactory(this,
				new EMFGraphics(getGraphicalDescription(),
						new EMFTextProvider()) {

					@Override
					public Dimension getStandardDimension(EClass type) {
						return new Dimension(50, 50);
					}

					@Override
					protected EMFModelIndex createIndex() {
						return new ScenarioModelIndex(getGraph().eContainer()
								.eContainer());
					}

					@Override
					public void setObjectConstraint(EObject eObject,
							Rectangle constraint) {
						Dimension gridDim = (Dimension) getGraphicalViewer()
								.getProperty(SnapToGrid.PROPERTY_GRID_SPACING);
						if (gridDim == null)
							gridDim = new Dimension(10, 10);
						constraint = new Rectangle(constraint.x
								- (constraint.x % gridDim.width), constraint.y
								- (constraint.y % gridDim.height),
								constraint.width
										- (constraint.width % gridDim.width),
								constraint.height
										- (constraint.height % gridDim.height));
						super.setObjectConstraint(eObject, constraint);
					}
				});

		return sep;
	}

	@Override
	protected Collection<? extends EObject> createEmptyModel() {
		ScenarioModelIndex idx = new ScenarioModelIndex(null);

		ScenarioModel model = ScenarioFactory.eINSTANCE.createScenarioModel();
		idx.getIdByObject(model);

		SpatialBase base = ScenarioFactory.eINSTANCE.createSpatialBase();
		idx.getIdByObject(base);
		model.getBases().add(base);

		Scenario scenario = ScenarioFactory.eINSTANCE.createScenario();
		idx.getIdByObject(scenario);
		base.getScenarios().add(scenario);

		return Arrays.asList(new ScenarioModel[] { model });
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
		return new ScenarioModelIndex(getGraph());
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new ScenarioPaletteRoot();
	}

	@Override
	public void validate() {
		for (Placement p : ((Scenario) getGraph()).getPlacements()) {
			Rectangle r = getEditPartFactory().getGraphics()
					.getObjectConstraint(p);
			p.setX(r.x);
			p.setY(r.y);
			p.setWidth(r.width);
			p.setHeight(r.height);
		}
		
		ScenarioModel sm = (ScenarioModel) scenario.eContainer().eContainer();
		for(SpatialBase sb:sm.getBases())
			ScenarioModelAnalyzer.getInstance(sm).generateData(sm, sb);
		
		ValidationManager.getInstance(getEditedResource()).validateAll(
				getGraph().eResource().getResourceSet());
	}

	@Override
	public void stateActivated(State s) {
		
	}
}
