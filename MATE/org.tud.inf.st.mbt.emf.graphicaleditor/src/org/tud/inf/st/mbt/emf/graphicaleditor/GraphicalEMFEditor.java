package org.tud.inf.st.mbt.emf.graphicaleditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.CopyTemplateAction;
import org.eclipse.gef.ui.actions.PasteTemplateAction;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.commands.ActionHandler;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.FocusNode;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.FocusTreeViewer;
import org.tud.inf.st.mbt.emf.graphicaleditor.focus.IFocusableListener;
import org.tud.inf.st.mbt.emf.ui.editors.EMFEditorInput;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalFactory;

@SuppressWarnings("deprecation")
public abstract class GraphicalEMFEditor extends
		GraphicalEditorWithFlyoutPalette {

	private GraphicalDescription graphicalDescription;
	private URI loadedURI;
	private PropertySheetPage properties;
	private EMFOutlinePage outline;
	private EMFEditPartFactory factory;
	private IResource editedResource;
	private FocusNode focusRoot = new FocusNode("All", null);
	private FocusTreeViewer focusViewer;
	private Collection<IFocusableListener> focusListeners = new ArrayList<>();

	public GraphicalDescription getGraphicalDescription() {
		return graphicalDescription;
	}

	public Collection<? extends EObject> getModel() {
		return ((EMFEditorInput) getEditorInput()).getModelInput()
				.getContents();
	}

	protected IResource editedResource() {
		return editedResource;
	}

	public ResourceSet getEditedResourceSet() {
		return ((EMFEditorInput) getEditorInput()).getModelInput()
				.getResourceSet();
	}

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setEditDomain(new DefaultEditDomain(this));
		if (input instanceof FileEditorInput) {
			FileEditorInput fi = (FileEditorInput) input;
			loadedURI = fi.getURI();
			final File f = new File(fi.getURI());
			setPartName(f.getName());

			editedResource = fi.getFile();
			ResourceSet rs = createResourceSet();

			XMIResourceImpl graphXMI = new XMIResourceImpl(
					org.eclipse.emf.common.util.URI.createURI(fi.getURI()
							.toString()));
			rs.getResources().add(graphXMI);
			try {
				graphXMI.load(new FileInputStream(f), new HashMap<>());
			} catch (Exception e) {
				// do nothing
			}
			if (graphXMI.getContents().isEmpty()) {
				graphXMI.getContents()
						.add(GraphicalFactory.eINSTANCE
								.createGraphicalDescription());
			}

			graphicalDescription = (GraphicalDescription) graphXMI
					.getContents().get(0);

			XMIResourceImpl modelXMI = new XMIResourceImpl(
					org.eclipse.emf.common.util.URI.createURI(loadedURI
							.toString() + ".ecore")) {

				@Override
				public String toString() {
					return f.getName();
				}
			};

			rs.getResources().add(modelXMI);

			try {
				modelXMI.load(
						new FileInputStream(new File(new URI(loadedURI
								.toString() + ".ecore"))), new HashMap<>());
			} catch (IOException | URISyntaxException ex) {
				// do nothing
			}

			if (modelXMI.getContents().isEmpty()) {
				modelXMI.getContents().addAll(createEmptyModel());
			}
			input = new EMFEditorInput(modelXMI);

			EcoreUtil.resolveAll(rs);
		}

		super.init(site, input);

		factory = createEditPartFactory();
		factory.getGraphics().cleanup();
	}

	protected abstract ResourceSet createResourceSet();

	public abstract String getId();

	protected abstract EMFEditPartFactory createEditPartFactory();

	protected boolean enableFocusViewer() {
		return true;
	}

	public void setFocusRoot(FocusNode focusRoot) {
		this.focusRoot = focusRoot;
		if (focusViewer != null)
			focusViewer.setInput(focusRoot);
	}

	public EObject getGraph() {
		return getModel().iterator().next();
	}

	public EMFEditPartFactory getEditPartFactory() {
		return factory;
	}

	protected Collection<String> getPropertyDisplayNameEditingBlacklist(
			EClass clazz) {
		return new HashSet<>();
	}

	/**
	 * hook method to implement unique property descriptors and cell managers
	 */
	public IPropertyDescriptor substitutePropertyDescriptor(
			IPropertyDescriptor d, EClass clazz) {
		return d;
	}

	protected ContextMenuProvider getContextMenuProvider() {
		return new EMFContextMenuProvider(getGraphicalViewer());
	}

	protected abstract Collection<? extends EObject> createEmptyModel();

	protected abstract AdapterFactory getAdapterFactory(EClass type);

	public abstract EMFModelIndex createModelndex();

	@Override
	public void doSave(IProgressMonitor monitor) {

		validate();

		String f = loadedURI.getPath();
		String ext = f.substring(f.lastIndexOf(".") + 1);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,
				new XMIResourceFactoryImpl());

		Resource r = getGraph().eResource();
		try {
			r.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			e.printStackTrace();
		}
		r = getGraphicalDescription().eResource();
		try {
			r.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			editedResource.getParent().refreshLocal(1, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		getCommandStack().markSaveLocation();
	}

	@Override
	public void createPartControl(Composite parent) {
		if (enableFocusViewer()) {
			SashForm sash = new SashForm(parent, SWT.HORIZONTAL);
			Composite focus = new Composite(sash, SWT.HORIZONTAL);
			focus.setLayout(new GridLayout(1, false));
			Label l = new Label(focus, SWT.None);
			l.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			l.setText("Focus");
			focusViewer = new FocusTreeViewer(focus, focusListeners, factory);
			focusViewer.getControl().setLayoutData(
					new GridData(SWT.FILL, SWT.FILL, true, true));
			focusViewer.setInput(this.focusRoot);
			super.createPartControl(sash);
			sash.setWeights(new int[] { 10, 90 });
		} else
			super.createPartControl(parent);

		createAdditionalActions();
	}

	protected void addFocusListener(IFocusableListener l) {
		focusListeners.add(l);
	}

	protected void removeFocusListener(IFocusableListener l) {
		focusListeners.remove(l);
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();

		viewer.getControl().setBackground(
				Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setEditPartFactory(getEditPartFactory());

		viewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, true);
		viewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, true);
		ContextMenuProvider context = getContextMenuProvider();
		if (context != null) {
			viewer.setContextMenu(context);
			getSite().registerContextMenu(context.getId(), context, viewer);
		}

		getGraphicalViewer().setContents(getGraph());

		validate();
		getEditPartFactory().checkMarkers();

	}

	protected void createAdditionalActions() {
		ZoomManager zoomManager = (ZoomManager) getAdapter(ZoomManager.class);

		List<String> zoomLevels = new ArrayList<>(3);
		zoomLevels.add(ZoomManager.FIT_ALL);
		zoomLevels.add(ZoomManager.FIT_WIDTH);
		zoomLevels.add(ZoomManager.FIT_HEIGHT);
		zoomManager.setZoomLevelContributions(zoomLevels);

		IAction zoomIn = new ZoomInAction(zoomManager);
		IAction zoomOut = new ZoomOutAction(zoomManager);
		getActionRegistry().registerAction(zoomIn);
		getActionRegistry().registerAction(zoomOut);

		IAction toggleGrid = new ToggleGridAction(getGraphicalViewer());
		IAction toggleSnap = new ToggleSnapToGeometryAction(
				getGraphicalViewer());
		getActionRegistry().registerAction(toggleGrid);
		getActionRegistry().registerAction(toggleSnap);

		IAction copy = new CopyTemplateAction(this);
		IAction paste = new PasteTemplateAction(this);

		getActionRegistry().registerAction(copy);
		getActionRegistry().registerAction(paste);

		IHandlerService service = (IHandlerService) getEditorSite().getService(
				IHandlerService.class);
		service.activateHandler(zoomIn.getActionDefinitionId(),
				new ActionHandler(zoomIn));
		service.activateHandler(zoomOut.getActionDefinitionId(),
				new ActionHandler(zoomOut));
		service.activateHandler(toggleSnap.getActionDefinitionId(),
				new ActionHandler(toggleSnap));
		service.activateHandler(ActionFactory.COPY.getId(), new ActionHandler(
				copy));
		service.activateHandler(ActionFactory.PASTE.getId(), new ActionHandler(
				paste));
		
	}

	@Override
	public ActionRegistry getActionRegistry() {
		return super.getActionRegistry();
	}

	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
		validate();
		getEditPartFactory().checkMarkers();
	}

	public IResource getEditedResource() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.findFilesForLocationURI(loadedURI)[0];
	}

	public void validate() {
	};

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {

		if (type.equals(IPropertySheetPage.class)) {
			if (properties == null) {
				properties = (PropertySheetPage) super.getAdapter(type);
				IPropertySourceProvider provider = new IPropertySourceProvider() {

					@Override
					public IPropertySource getPropertySource(Object object) {
						if (object == null)
							return null;

						if (object instanceof EditPart)
							object = ((EditPart) object).getModel();
						if (object instanceof PropertyValueWrapper)
							object = ((PropertyValueWrapper) object)
									.getEditableValue(null);

						if (!(object instanceof EObject))
							return null;

						EObject eObject = (EObject) object;

						AdapterFactory f = getAdapterFactory(eObject.eClass());

						if (f != null) {

							IPropertySourceProvider p = new AdapterFactoryContentProvider(
									f);

							IPropertySource source = p
									.getPropertySource(eObject);

							if (source != null)
								return new UnwrappingPropertySource(source,
										eObject.eClass());
						}
						return null;
					}
				};
				UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(
						getCommandStack());
				root.setPropertySourceProvider(provider);
				properties.setRootEntry(root);
			}
			return properties;
		} else if (type.equals(IContentOutlinePage.class)) {
			if (outline == null) {
				outline = new EMFOutlinePage(getAdapterFactory(getGraph()
						.eClass()), getGraph());

				getGraph().eAdapters().add(new AdapterImpl() {
					@Override
					public void notifyChanged(Notification msg) {
						outline.setInput(getGraph());
					}
				});
			}
			return outline;
		} else if (type.equals(ZoomManager.class)) {
			return ((ScalableFreeformRootEditPart) getGraphicalViewer()
					.getRootEditPart()).getZoomManager();
		}
		return super.getAdapter(type);
	}

	private class UnwrappingPropertySource implements IPropertySource {
		private IPropertySource source;
		private EClass clazz;

		public UnwrappingPropertySource(final IPropertySource source,
				EClass clazz) {
			this.source = source;
			this.clazz = clazz;
		}

		@Override
		public Object getEditableValue() {
			Object value = source.getEditableValue();
			if (value instanceof PropertyValueWrapper) {
				PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			} else {
				return source.getEditableValue();
			}
		}

		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() {
			List<IPropertyDescriptor> descriptors = new ArrayList<>();
			for (IPropertyDescriptor d : source.getPropertyDescriptors()) {
				if (GraphicalEMFEditor.this
						.getPropertyDisplayNameEditingBlacklist(clazz)
						.contains(d.getDisplayName())) {
					d = new PropertyDescriptor(d.getId(), d.getDisplayName());
				}
				descriptors.add(substitutePropertyDescriptor(d, clazz));
			}
			return descriptors.toArray(new IPropertyDescriptor[0]);
		}

		@Override
		public Object getPropertyValue(Object id) {
			Object value = source.getPropertyValue(id);
			if (value instanceof PropertyValueWrapper) {
				PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			} else {
				return source.getPropertyValue(id);
			}
		}

		@Override
		public boolean isPropertySet(Object id) {
			return source.isPropertySet(id);
		}

		@Override
		public void resetPropertyValue(Object id) {
			source.resetPropertyValue(id);
		}

		@Override
		public void setPropertyValue(Object id, Object value) {
			source.setPropertyValue(id, value);
		}
	}

	public void executeCommand(final Command cmd) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				getCommandStack().execute(cmd);
			}
		});
	}
}
