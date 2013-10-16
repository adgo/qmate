package org.tud.inf.st.mbt.datascen.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.data.DataValue;
import org.tud.inf.st.mbt.data.StepDataBinding;
import org.tud.inf.st.mbt.datascen.ui.SingleVariableDiagram.ChangeEvent;
import org.tud.inf.st.mbt.datascen.ui.SingleVariableDiagram.ChangeListener;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.generator.State.IStateActivationListener;
import org.tud.inf.st.mbt.emf.ui.dialogs.LoadModelResourceDialog;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TimeAtom;

public class DataScenarioEditor extends EditorPart implements
		IStateActivationListener {

	private DataScenario scenario;
	private ScrolledComposite scroll;
	private XMIResourceImpl xmi;
	private ExpandBar bar;
	private final Map<DataLeaf, SingleVariableDiagram> leaf2Diagram = new HashMap<>();
	private boolean dirty = false;
	private int hsteps = 50;
	private Text txtID, txtName, txtLength;
	private Button btnCommitt;
	private Set<DataLeaf> remove = new HashSet<DataLeaf>();
	
	public DataScenarioEditor() {
		super();
		State.registerStateActivationListener(this);
	}
	
	@Override
	public void dispose() {
		State.unregisterStateActivationListener(this);
	}

	@Override
	public void createPartControl(Composite parent) {

		Composite all = new Composite(parent, SWT.NONE);
		all.setLayout(new GridLayout(2, false));

		Label l = new Label(all, SWT.None);
		l.setText("Scenario ID:");

		txtID = new Text(all, SWT.NONE);
		txtID.setText(scenario.getId() == null ? "" : scenario.getId());
		txtID.setLayoutData(new GridData(SWT.FILL, SWT.None, true, false));
		txtID.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setDirty();
			}
		});
		txtID.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		l = new Label(all, SWT.None);
		l.setText("Scenario name:");

		txtName = new Text(all, SWT.NONE);
		txtName.setText(scenario.getName() == null ? "" : scenario.getName());
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.None, true, false));
		txtName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setDirty();
			}
		});

		txtName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1,
				1));

		l = new Label(all, SWT.None);
		l.setText("Scenario length:");

		txtLength = new Text(all, SWT.NONE);
		txtLength.setText("" + hsteps);
		txtLength.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,
				1, 1));

		txtLength.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				btnCommitt.setEnabled(true);
			}
		});

		l = new Label(all, SWT.None);

		btnCommitt = new Button(all, SWT.NONE);
		btnCommitt.setText("Committ length");
		btnCommitt.setLayoutData(new GridData(300, 25));
		btnCommitt.setEnabled(false);
		btnCommitt.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				try {
					int newhsteps = Integer.parseInt(txtLength.getText());
					if (newhsteps >= 0) {
						hsteps = newhsteps;
						for (SingleVariableDiagram svd : leaf2Diagram.values()) {
							svd.setLength(hsteps);
							svd.setSize(svd.computeSize(SWT.DEFAULT,
									SWT.DEFAULT));
						}
						setDirty();
					}
				} catch (Exception e0) {
				}
				txtLength.setText(hsteps + "");

				btnCommitt.setEnabled(false);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		l = new Label(all, SWT.None);
		l.setText("Resources:");

		final Button btnLoad = new Button(all, SWT.NONE);
		btnLoad.setText("Load resources...");
		btnLoad.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				new LoadModelResourceDialog(btnLoad.getShell(), xmi
						.getResourceSet()).open();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		btnLoad.setLayoutData(new GridData(300, 25));

		l = new Label(all, SWT.None);
		l.setText("Data leaves:");
		final Button btnSelect = new Button(all, SWT.None);
		btnSelect.setText("Select data leaves...");
		btnSelect.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				ListSelectionDialog dialog = new ListSelectionDialog(btnSelect
						.getShell(), getRelevantLeaves(),
						new IStructuredContentProvider() {

							public void inputChanged(Viewer viewer,
									Object oldInput, Object newInput) {
							}

							public void dispose() {
							}

							@Override
							public Object[] getElements(Object inputElement) {
								if (inputElement instanceof Collection<?>) {
									return ((Collection<?>) inputElement)
											.toArray();
								} else
									return null;
							}
						}, new LabelProvider() {
							public String getText(Object element) {
								if (element instanceof DataLeaf) {
									return printData((DataStructureNode) element);
								} else
									return "" + element;
							};
						}, "Select data leaves...");

				ArrayList<DataLeaf> selected = new ArrayList<>();
				selected.addAll(leaf2Diagram.keySet());
				selected.removeAll(remove);
				dialog.setInitialElementSelections(selected);

				if (dialog.open() == Window.OK) {
					selected.clear();
					for (Object o : dialog.getResult()) {
						DataLeaf l = (DataLeaf) o;
						selected.add(l);
						if (!leaf2Diagram.containsKey(l))
							leaf2Diagram.put(l, null);
					}
					for (DataLeaf l : leaf2Diagram.keySet()) {
						if (!selected.contains(l))
							remove.add(l);
						else
							remove.remove(l);
					}
				}
				buildDiagrams();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		btnSelect.setLayoutData(new GridData(300, 25));

		scroll = new ScrolledComposite(all, SWT.H_SCROLL | SWT.V_SCROLL);
		scroll.setLayoutData(new GridData(GridData.FILL, SWT.FILL, true, true,
				2, 1));

		scroll.setExpandHorizontal(true);
		scroll.setExpandVertical(true);

		buildDiagrams();
	}

	private static String printData(DataStructureNode leaf) {
		if (leaf.eContainer() == null
				|| !(leaf.eContainer() instanceof DataStructureNode)) {
			return leaf.toString();
		} else {
			return printData((DataStructureNode) leaf.eContainer()) + "."
					+ leaf;
		}
	}

	private void buildDiagrams() {
		if (getRelevantLeaves().isEmpty())
			return;

		if (bar == null) {
			bar = new ExpandBar(scroll, SWT.NONE);

			scroll.setContent(bar);
		}

		for (final DataLeaf leaf : leaf2Diagram.keySet()) {
			if (leaf.getDomain() != null && leaf2Diagram.get(leaf) == null) {
				Composite comp = new Composite(bar, SWT.None);
				comp.setLayout(new RowLayout());
				ExpandItem item = new ExpandItem(bar, SWT.None, 0);
				item.setText(printData(leaf));
				item.setControl(comp);

				Object[] values = getAllPossibleElements(leaf.getDomain())
						.toArray();
				Map<Integer, Object> init = new HashMap<>();

				step: for (int h = 0; h < hsteps; h++) {
					for (StepDataBinding sdb : scenario.getStepDataBindings()) {
						if (sdb.getLeaf().equals(leaf) && sdb.getStep() == h) {
							init.put(h, sdb.getValue());
							continue step;
						}
					}
					StepDataBinding sdb = DataFactory.eINSTANCE
							.createStepDataBinding();
					sdb.setLeaf(leaf);
					sdb.setStep(h);
					sdb.setValue((DataElement) values[0]);
					scenario.getStepDataBindings().add(sdb);
					init.put(h, values[0]);
				}

				SingleVariableDiagram diag = new SingleVariableDiagram(hsteps,
						values, init, comp);
				item.setHeight(comp.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
				leaf2Diagram.put(leaf, diag);

				diag.registerChangeListener(new ChangeListener() {
					public void change(ChangeEvent ce) {
						for (StepDataBinding sdb : scenario
								.getStepDataBindings()) {
							if (sdb.getLeaf().equals(leaf)
									&& sdb.getStep() == ce.getStep()) {
								sdb.setValue((DataElement) ce.getValue());
								return;
							}
						}
						// if not found
						StepDataBinding sdb = DataFactory.eINSTANCE
								.createStepDataBinding();
						sdb.setValue((DataElement) ce.getValue());
						sdb.setLeaf(leaf);
						sdb.setStep(ce.getStep());
						scenario.getStepDataBindings().add(sdb);
					}
				});
			}
		}

		for (Entry<DataLeaf, SingleVariableDiagram> e : leaf2Diagram.entrySet()) {
			if (remove.contains(e.getKey())) {
				e.getValue().setEnabled(false);
			} else {
				e.getValue().setEnabled(true);
			}
			e.getValue().setLength(hsteps);
		}

		int minW = 0, minH = 0;

		for (ExpandItem i : bar.getItems()) {
			int w = i.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).x + 10;
			if (w > minW)
				minW = w;

			minH += i.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
			minH += i.getHeaderHeight() + 10;
		}
		scroll.setMinWidth(minW);
		scroll.setMinHeight(minH);
		scroll.setAlwaysShowScrollBars(true);

		setDirty();
	}

	private List<DataElement> getAllPossibleElements(DataClass dc) {
		List<DataElement> elements = new LinkedList<>();

		if (dc.getChildren().isEmpty())
			elements.add(dc);
		else {
			for (DataElement e : dc.getChildren()) {
				if (e instanceof DataValue)
					elements.add(e);
				else
					elements.addAll(getAllPossibleElements((DataClass) e));
			}
		}

		return elements;
	}

	private List<DataLeaf> getRelevantLeaves() {
		List<DataLeaf> leafs = new ArrayList<>();

		for (Resource r : xmi.getResourceSet().getResources()
				.toArray(new Resource[0])) {
			Iterator<EObject> i = r.getAllContents();
			while (i.hasNext()) {
				EObject eo = i.next();
				if (eo instanceof DataLeaf) {
					DataLeaf leaf = (DataLeaf) eo;
					if (leaf.getDomain() != null
							&& !getAllPossibleElements(leaf.getDomain())
									.isEmpty()) {
						leafs.add(leaf);
					}
				}
			}
		}

		return leafs;
	}

	@Override
	public void setFocus() {
		scroll.setFocus();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		scenario.setId(txtID.getText());
		scenario.setName(txtName.getText());
		scenario.setLength(hsteps);

		for (StepDataBinding sdb : scenario.getStepDataBindings().toArray(
				new StepDataBinding[0])) {
			if (sdb.getStep() >= hsteps || remove.contains(sdb.getLeaf()))
				scenario.getStepDataBindings().remove(sdb);
		}

		try {
			xmi.save(new HashMap<>());
		} catch (IOException e) {
			e.printStackTrace();
		}
		dirty = false;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		if (input instanceof FileEditorInput) {
			FileEditorInput fi = (FileEditorInput) input;
			File f = new File(fi.getURI());

			setPartName(f.getName());

			ResourceSet rs = new ResourceSetImpl();

			xmi = new XMIResourceImpl(
					org.eclipse.emf.common.util.URI.createURI(fi.getURI()
							.toString()));
			rs.getResources().add(xmi);
			try {
				xmi.load(new FileInputStream(f), new HashMap<>());
			} catch (Exception e) {
				// do nothing
			}
			if (xmi.getContents().isEmpty()) {
				xmi.getContents().add(
						DataFactory.eINSTANCE.createDataScenario());
			}
			for (EObject eo : xmi.getContents()) {
				if (eo instanceof DataScenario) {
					scenario = (DataScenario) eo;
					if (scenario.getId() == null)
						scenario.setId("scen-" + new Random().nextLong());
					hsteps = scenario.getLength();
					EcoreUtil.resolveAll(scenario);
					for (StepDataBinding sdb : scenario.getStepDataBindings()) {
						leaf2Diagram.put(sdb.getLeaf(), null);
					}
					scenario.eAdapters().add(new AdapterImpl() {
						@Override
						public void notifyChanged(Notification msg) {
							setDirty();
						}
					});
					break;
				}
			}
		}
	}

	private void setDirty() {
		this.dirty = true;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public void stateActivated(State s) {
		int activatedStep = -1;
		if(s!=null)for (Predicate p : s.findAllPredicates(RulesPackage.eINSTANCE
				.getTimeAtom())) {
			TimeAtom a = (TimeAtom) p;
			if (a.getConsumer() instanceof DataScenario
					&& ((DataScenario) a.getConsumer()).getId().equals(
							scenario.getId())) {
				activatedStep = a.getTime();
				break;
			}
		}
		for(SingleVariableDiagram svd:leaf2Diagram.values()){
			svd.setSimualtionActive(activatedStep-1);
		}
	}

}
