package org.tud.inf.st.mbt.ulang.guigraph.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.part.ViewPart;
import org.tud.inf.st.mbt.actions.Action;
import org.tud.inf.st.mbt.actions.DependentAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.automation.AbstractAutomationType;
import org.tud.inf.st.mbt.automation.ActionAutomationType;
import org.tud.inf.st.mbt.automation.AutomationManager;
import org.tud.inf.st.mbt.automation.ISimulationResponder;
import org.tud.inf.st.mbt.automation.traversal.AbstractTraversalType;
import org.tud.inf.st.mbt.automation.traversal.TraversalManager;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.generator.AbstractOperator;
import org.tud.inf.st.mbt.emf.generator.ActionProcessor;
import org.tud.inf.st.mbt.emf.generator.CAOperator;
import org.tud.inf.st.mbt.emf.generator.PredicateList;
import org.tud.inf.st.mbt.emf.generator.SATFoundation;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.generator.TimedCondtionActionOperator;
import org.tud.inf.st.mbt.emf.generator.TimerOperator;
import org.tud.inf.st.mbt.emf.ui.MATEImages;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;

public class SimulationView extends ViewPart {

	public static final String ID = "org.tud.inf.st.mbt.ulang.guigraph.views.simulation";

	private static class StepTreeViewer extends TreeViewer {
		public StepTreeViewer(Composite parent, int style) {
			super(parent, style);
		}

		public Widget find(Object element) {
			return super.doFindItem(element);
		}
	}

	private static class Action2State {
		private PostGenerationAction action;
		private State state;

		public Action2State(PostGenerationAction action, State state) {
			this.action = action;
			this.state = state;
		}

		public PostGenerationAction getAction() {
			return action;
		}

		public State getState() {
			return state;
		}
	}

	public static class DetailContentProvider implements ITreeContentProvider {

		private static class Entry {
			String name;
			Object[] children;

			public Entry(String name, Object[] children) {
				this.name = name;
				this.children = children;
			}

			@Override
			public String toString() {
				return name;
			}
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			List<Object> elements = new LinkedList<Object>();
			if (inputElement instanceof Configuration) {
				elements.add(new Entry("FEATURES",
						((Configuration) inputElement).getFeatures().toArray()));
				elements.add(new Entry("BINDINGS",
						((Configuration) inputElement).getBindings().toArray()));
			} else if (inputElement instanceof State) {
				State s = (State) inputElement;
				elements.add(new Entry("TRACELINKS", s.getTraceableTo()));
				elements.add(new Entry("ACTIONS", s.getActions().getActions()
						.toArray()));
				elements.add(new Entry("PROPOSITIONS", s.getPropositions()
						.toArray()));
			}

			return elements.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof Entry) {
				return ((Entry) parentElement).children;
			} else if (parentElement instanceof AbstractModelElement) {
				return ((AbstractModelElement) parentElement).getTraceableTo()
						.toArray();
			} else if(parentElement instanceof InstructionPointerAtom){
				return ((InstructionPointerAtom) parentElement).getContext().toArray();
			} else
				return new Object[0];
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return getChildren(element).length > 0;
		}

	}

	private static class DetailLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof AbstractModelElement) {
				AbstractModelElement ame = (AbstractModelElement) element;
				String name = ame.getName() == null ? ame.getId() : ame
						.getName();
				String note = ame.getNote() == null ? ""
						: ("[" + ame.getNote() + "]");
				return name + " " + note;
			} else
				return super.getText(element);
		}
	}

	private class StepContentProvider implements ITreeContentProvider {

		private Map<Object, Object[]> cache = new HashMap<Object, Object[]>();

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			cache.clear();
		}

		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof Collection<?>) {
				return ((Collection<?>) inputElement).toArray();
			} else
				return new Object[] { inputElement };
		}

		public Object[] getChildren(Object parentElement) {
			if (cache.containsKey(parentElement))
				return cache.get(parentElement);
			List<Object> children = new ArrayList<>();
			try {
				if (parentElement instanceof State
						&& isReady((State) parentElement)
						&& !((State) parentElement).isFailed()) {
					State current = (State) parentElement;
					if (current.isTopInstructionSequenceRunning()) {
						children.addAll(Arrays.asList(actionProcessor
								.operateTopInstructionSequence(current)));
					} else {
						for (AbstractOperator o : operators) {
							children.addAll(Arrays.asList(o.operate(current)));
						}
					}
				} else if (parentElement instanceof Configuration) {
					Configuration config = (Configuration) parentElement;
					State initial = new State(null, null, false,
							new PredicateList());
					operators = new AbstractOperator[] {
							new CAOperator(satFoundation),
							new TimerOperator(satFoundation),
							new TimedCondtionActionOperator(satFoundation)};
					for (AbstractOperator o : operators)
						o.contributeToInitialState(initial);
					for (IFeature f : config.getFeatures()) {
						initial.configureAll(ModelUtil.atoms(f));
					}
					for (DataBinding db : config.getBindings()) {
						DataAtom da = ModelUtil.atom(db.getLeaf(),
								db.getValue());
						initial.configureProposition(da);
					}
					children.add(initial);
					conf2initial.put(config, initial);
				}
			} catch (final Exception e) {
				e.printStackTrace();
				Display.getDefault().syncExec(new Runnable() {					
					@Override
					public void run() {
						MessageBox mb = new MessageBox(Display.getCurrent()
								.getActiveShell(), SWT.ICON_ERROR | SWT.OK);
						mb.setMessage("An exception was thrown: " + e);
						mb.open();
						e.printStackTrace();						
					}
				});
			}

			cache.put(parentElement, children.toArray());
			return cache.get(parentElement);
		}

		public Object getParent(Object element) {
			if (element instanceof State) {
				return ((State) element).getParent();
			}
			return null;
		}

		public boolean hasChildren(Object element) {
			return true;
		}

	}

	private class StateLabelProvider extends LabelProvider {

		@Override
		public Image getImage(Object element) {
			if (element instanceof Configuration)
				return MATEImages.getImage(MATEImages.CONF);
			else if (element instanceof State) {
				State s = (State) element;

				if (lastExecuted != null
						&& getAllUpperStates(lastExecuted).contains(s)) {
					return MATEImages.getImage(MATEImages.DONE);
				} else if (!isReady(s)) {
					return MATEImages.getImage(MATEImages.UNDEF);
				} else {
					if (s.isTerminating())
						return MATEImages.getImage(MATEImages.TERM);
					if (s.getActions().getActions().isEmpty())
						return MATEImages.getImage(MATEImages.STEP);
					else
						return MATEImages.getImage(MATEImages.STEPO);
				}
			}
			return null;
		}

	}

	private StepTreeViewer stepViewer;
	private AbstractOperator[] operators;
	private State lastExecuted;
	private Map<Configuration, State> conf2initial = new HashMap<>();
	private List<State> failed = new LinkedList<State>();
	private List<State> downloaded = new LinkedList<State>();
	private TreeViewer details;
	private ActionProcessor actionProcessor;
	private SATFoundation satFoundation;
	private boolean visualize = false;
	private Button traverseBtn;
	private ComboViewer traversalCombo;
	private ComboViewer automationCombo;
	private Object lock = new Object();
	private boolean jobCancelled = false;
	private Job traversationJob;

	@Override
	public void createPartControl(Composite outer) {

		Composite parent = new Composite(outer, SWT.None);

		GridLayout layout = new GridLayout(3, false);
		parent.setLayout(layout);

		Label l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		l.setText("Select automation driver:");

		automationCombo = new ComboViewer(parent);
		automationCombo.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		automationCombo.add("<no automation>");
		for (AbstractAutomationType at : AutomationManager.getInstance()
				.getActionAutomationTypes())
			automationCombo.add(at);
		automationCombo
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						checkTraversalEnabled();
					}
				});

		l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		l.setText("Select traversal strategy:");

		traversalCombo = new ComboViewer(parent);
		traversalCombo.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		traversalCombo.add("<no traversal>");
		for (AbstractTraversalType tt : TraversalManager.getInstance()
				.getTraversalTypes())
			traversalCombo.add(tt);
		traversalCombo
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						checkTraversalEnabled();
					}
				});

		traverseBtn = new Button(parent, SWT.TOGGLE);
		traverseBtn.setText("|> Run Traversation");
		traverseBtn.setEnabled(false);
		traverseBtn.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_GREEN));
		traverseBtn.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (traverseBtn.getSelection()) {
					startTraversal();
				} else {
					synchronized (lock) {
						jobCancelled = true;
					}
					cancelTraversal();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		l = new Label(parent, SWT.None);
		final Button btnVis = new Button(parent, SWT.CHECK);
		btnVis.setText("Visualize in editors");
		btnVis.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnVis.getSelection())
					SimulationView.this.visualize = true;
				else {
					SimulationView.this.visualize = false;
					State.deactivate();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		SashForm sash = new SashForm(parent, SWT.HORIZONTAL);
		sash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));

		stepViewer = new StepTreeViewer(sash, SWT.SINGLE);

		stepViewer.setContentProvider(new StepContentProvider());
		stepViewer.setLabelProvider(new StateLabelProvider());
		stepViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (details != null) {
					IStructuredSelection s = (IStructuredSelection) stepViewer
							.getSelection();
					details.setInput(s.getFirstElement());
					if (visualize) {
						if (s.getFirstElement() instanceof State)
							((State) s.getFirstElement()).activate();
					}
					details.expandAll();
				}

			}
		});

		stepViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object selected = ((IStructuredSelection) event.getSelection())
						.getFirstElement();

				if (!(traversationJob != null && traversationJob.getResult() != null)
						&& selected instanceof State)
					automate((State) selected);
			}

		});

		details = new TreeViewer(sash);
		details.setContentProvider(new DetailContentProvider());
		details.setLabelProvider(new DetailLabelProvider());
	}

	private List<State> getAllUpperStates(State s) {
		if (s == null)
			return Collections.emptyList();
		else {
			LinkedList<State> l = new LinkedList<State>();
			l.addAll(getAllUpperStates(s.getParent()));
			l.add(s);
			return l;
		}
	}

	private boolean isReady(State s) {
		boolean isDependent = false;
		for (Action a : s.getActions().getActions()) {
			if (a instanceof DependentAction) {
				isDependent = true;
				break;
			}
		}
		return !isDependent || downloaded.contains(s);
	}

	public void startSimulation(int maxTime, int maxTokens,
			Collection<Configuration> confs, ResourceSet rs) {
		lastExecuted = null;
		failed.clear();
		conf2initial.clear();
		stepViewer.setInput(confs);
		this.actionProcessor = new ActionProcessor(
				satFoundation = new SATFoundation(rs, maxTokens, maxTime));
		cancelTraversal();
		checkTraversalEnabled();
	}

	@Override
	public void setFocus() {
		stepViewer.getControl().setFocus();
	}

	private void checkTraversalEnabled() {
		Object tsel = ((IStructuredSelection) traversalCombo.getSelection())
				.getFirstElement();
		Object asel = ((IStructuredSelection) automationCombo.getSelection())
				.getFirstElement();

		traverseBtn.setEnabled(stepViewer.getInput() != null
				&& tsel instanceof AbstractTraversalType
				&& asel instanceof ActionAutomationType);
	}

	private void startTraversal() {
		synchronized (lock) {
			jobCancelled = false;
		}

		traverseBtn.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_RED));
		traversalCombo.getControl().setEnabled(false);
		automationCombo.getControl().setEnabled(false);

		final AbstractTraversalType tt = (AbstractTraversalType) ((IStructuredSelection) traversalCombo
				.getSelection()).getFirstElement();
		final StepContentProvider stepper = (StepContentProvider) stepViewer
				.getContentProvider();
		traversationJob = new Job("Traversing simulation space") {
			@SuppressWarnings("unchecked")
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("traversing discretely",
						IProgressMonitor.UNKNOWN);

				List<State> stateChoices = new ArrayList<State>();
				if (lastExecuted == null) {
					List<Configuration> configChoices = new ArrayList<Configuration>();
					Object input = stepViewer.getInput();
					if (input instanceof Collection) {
						for (Object o : (Collection<Configuration>) input) {
							if (o instanceof Configuration)
								configChoices.add((Configuration) o);
						}
					}
					final Configuration config = tt
							.determineConfiguration(configChoices);
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							stepViewer.expandToLevel(config, 1);
						}
					});
					for (Object o : stepper.getChildren(config))
						if (o instanceof State)
							stateChoices.add((State) o);
				} else {
					for (Object o : stepper.getChildren(lastExecuted))
						if (o instanceof State)
							stateChoices.add((State) o);
				}

				do {
					final State next = tt.determineNext(stateChoices);

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							details.setInput(next);
							details.expandAll();
							stepViewer.expandToLevel(next.getParent(), 1);
						}
					});

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							automate(next);
							if (visualize)
								next.activate();
						}
					});

					stateChoices.clear();
					for (Object o : stepper.getChildren(lastExecuted))
						if (o instanceof State)
							stateChoices.add((State) o);

					synchronized (lock) {
						if (jobCancelled || stateChoices.isEmpty()) {
							jobCancelled = false;
							Display.getDefault().syncExec(new Runnable() {
								@Override
								public void run() {
									cancelTraversal();
								}
							});
							return Status.OK_STATUS;
						}
					}
				} while (true);
			}
		};
		traversationJob.schedule();

	}

	private static List<TreeItem> getAllUpperItems(TreeItem i) {
		if (i == null)
			return new LinkedList<TreeItem>();
		else {
			List<TreeItem> l = new LinkedList<TreeItem>();
			l.add(i);
			l.addAll(getAllUpperItems(i.getParentItem()));
			return l;
		}
	}

	private List<Action2State> calculateActions(State to) {
		List<Action2State> result = new LinkedList<>();
		if (lastExecuted == to)
			return result;
		else if (to.getParent() == null) {
			result.add(new Action2State(to.getActions(), to));
		} else {
			result.addAll(calculateActions(to.getParent()));
			result.add(new Action2State(to.getActions(), to));
			return result;
		}
		return result;
	}

	private void setFailed(State state) {
		failed.add(state);
	}

	private void automate(State selected) {
		Object as = ((IStructuredSelection) automationCombo.getSelection())
				.getFirstElement();

		if (!(as instanceof ActionAutomationType))
			return;

		ActionAutomationType automation = (ActionAutomationType) as;

		if (automation instanceof ActionAutomationType) {
			if (lastExecuted != selected
					&& (lastExecuted == null || getAllUpperStates(
							(State) selected).contains((State) lastExecuted))) {
				List<Action2State> toBeExecuted = calculateActions((State) selected);
				for (final Action2State a2s : toBeExecuted) {
					if (!((ActionAutomationType) automation).automate(
							a2s.getAction(), new ISimulationResponder() {
								@Override
								public void setProperty(DataLeaf leaf, DataElement value) {
									a2s.getState().configureProposition(
											ModelUtil.atom(leaf, value), false);
								}

								@Override
								public void elapseRealTime(long realTime) {
									a2s.getState().elapseRealTime(realTime);
								}

								@Override
								public void setFeatureActivated(IFeature f,
										FeatureVersion v, boolean activated) {
									if(activated)a2s.getState().configureProposition(ModelUtil.atom(f, v));
									else a2s.getState().deconfigureProposition(ModelUtil.atom(f,v));									
								}							
							}))
						setFailed(a2s.getState());
				}
				lastExecuted = (State) selected;

				downloaded.add(lastExecuted);

				stepViewer
						.add(lastExecuted, ((ITreeContentProvider) stepViewer
								.getContentProvider()).getChildren(selected));
			}
		}

		TreeItem selectedItem = (TreeItem) stepViewer.find(selected);
		stepViewer.getTree().showItem(selectedItem);
		List<TreeItem> upperItems = getAllUpperItems(selectedItem);
		for (TreeItem ti : upperItems) {
			if (ti.getData() instanceof Configuration) {
				Configuration c = (Configuration) ti.getData();
				if (getAllUpperStates(lastExecuted).contains(
						conf2initial.get(c))) {
					ti.setBackground(Display.getDefault().getSystemColor(
							SWT.COLOR_BLUE));
					ti.setForeground(Display.getDefault().getSystemColor(
							SWT.COLOR_WHITE));
				}
			} else if (lastExecuted == ti.getData()
					|| getAllUpperStates(lastExecuted).contains(ti.getData())) {
				ti.setBackground(Display.getDefault().getSystemColor(
						SWT.COLOR_BLUE));
				ti.setForeground(Display.getDefault().getSystemColor(
						SWT.COLOR_WHITE));
			}
			if (ti.getData() instanceof State && failed.contains(ti.getData())) {
				ti.setBackground(Display.getDefault().getSystemColor(
						SWT.COLOR_RED));
			}
		}
	}

	private void cancelTraversal() {
		traverseBtn.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_GREEN));
		traversalCombo.getControl().setEnabled(true);
		automationCombo.getControl().setEnabled(true);
	}

}
