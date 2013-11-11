package org.tud.inf.st.mbt.emf.ui.actions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.execute.ISimulationAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.emf.ui.dialogs.ExportReportDialog;
import org.tud.inf.st.mbt.emf.ui.dialogs.SelectConnectorDialog;
import org.tud.inf.st.mbt.emf.ui.views.StatisticsView;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.mbt.test.Verdict;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class RunTestAction extends ActionDelegate {
	private static final TestFactory F = TestFactory.eINSTANCE;
	private static final ISimulationResponder responder = new ISimulationResponder() {

		@Override
		public void setProperty(DataLeaf leaf, DataElement value) {
			throw new UnsupportedOperationException(
					"Test model cannot be accessed from generated tests.");
		}

		@Override
		public void setFeatureActivated(IFeature f, FeatureVersion v,
				boolean activated) {
			throw new UnsupportedOperationException(
					"Test model cannot be accessed from generated tests.");
		}

		@Override
		public void elapseRealTime(long realTime) {
			throw new UnsupportedOperationException(
					"Test model cannot be accessed from generated tests.");
		}
	};

	private List<IFile> selected = new ArrayList<IFile>();

	@Override
	public void run(IAction action) {

		if (selected.isEmpty())
			return;

		SelectConnectorDialog conDialog = new SelectConnectorDialog(Display
				.getDefault().getActiveShell(),
				IAutomationConstants.KIND_SIMULATION_AUTOMATION);

		if (conDialog.open() != Window.OK)
			return;

		final ISimulationAutomation connector = (ISimulationAutomation) conDialog
				.getConnectorType().getConnector(conDialog.getConnection());

		final String suffix = "_run_"
				+ new SimpleDateFormat("dd_MM_YYYY__HH_mm_ss_SS").format(new Date());

		new Job("Running test") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {

				final ResourceImpl results = new ResourceImpl();

				for (IFile f : selected) {
					final ResourceSet rs = new PCCSResourceSetImpl();

					final Resource r = rs.createResource(URI
							.createURI("platform:/resource"
									+ f.getFullPath().toString()));

					try {
						r.load(Collections.EMPTY_MAP);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					rs.getResources().add(r);

					EcoreUtil.resolveAll(rs);

					int stepCount = ModelUtil.getAllEObjectsOfSuperType(rs,
							TestStep.class, false).size();
					final int stepSum = stepCount
							+ ModelUtil.getAllEObjectsOfSuperType(rs,
									TestStepRun.class, false).size();

					monitor.beginTask("Executing test steps in "+f.getName()+".", stepSum);
					Set<TestExecutable> finished = new HashSet<>();

					if (!executeForType(r, monitor, finished, results,
							TestSuite.class))
						return Status.CANCEL_STATUS;
					if (!executeForType(r, monitor, finished, results,
							TestReport.class))
						return Status.CANCEL_STATUS;
					if (!executeForType(r, monitor, finished, results,
							TestCase.class))
						return Status.CANCEL_STATUS;
					if (!executeForType(r, monitor, finished, results,
							TestRun.class))
						return Status.CANCEL_STATUS;
					if (!executeForType(r, monitor, finished, results,
							TestStep.class))
						return Status.CANCEL_STATUS;
					if (!executeForType(r, monitor, finished, results,
							TestStepRun.class))
						return Status.CANCEL_STATUS;
					monitor.done();

				}

				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						ExportReportDialog exportDialog = new ExportReportDialog(
								Display.getDefault().getActiveShell());
						if (exportDialog.open() == Window.OK) {
							PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
							Resource r = null;
							try {
								r = rs.getResource(URI.createURI(exportDialog
										.getTargetFile()), true);
							} catch (Exception e) {
								// ok
							}
							try {
								r.getContents().addAll(results.getContents());
								r.save(new HashMap<>());
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				});

				return Status.OK_STATUS;
			}

			public boolean executeForType(Object container,
					IProgressMonitor monitor, Set<TestExecutable> finished,
					final Resource results, Class<? extends TestExecutable> type) {
				for (TestExecutable e : ModelUtil.getAllEObjectsOfSuperType(container,
						type, false)) {
					if (monitor.isCanceled())
						return false;
					if (e.getId() == null)
						e.setId("id_" + Math.abs(new Random().nextInt()));
					if (!finished.contains(e)) {
						results.getContents()
								.add(execute(e, monitor, finished));
						finished.addAll(ModelUtil.getAllEObjectsOfSuperType(e,
								TestExecutable.class, false));
					}
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							try {
								StatisticsView view = (StatisticsView) PlatformUI
										.getWorkbench()
										.getActiveWorkbenchWindow()
										.getActivePage()
										.showView(StatisticsView.ID);
								view.measure(results);
							} catch (PartInitException e) {
								e.printStackTrace();
							}
						};
					});
				}
				return true;
			}

			private EObject execute(TestExecutable e, IProgressMonitor m,
					Set<TestExecutable> finished) {
				if (e instanceof TestStep || e instanceof TestStepRun) {
					Verdict v = F.createVerdict();
					v.setName("FAIL");
					TestStep step = null;
					PostGenerationAction action = null;
					m.worked(1);

					if (e instanceof TestStep) {
						step = (TestStep) e;
						action = ((TestStep) e).getAction();
					}
					if (e instanceof TestStepRun) {
						if (((TestStepRun) e).getStep() != null) {
							step = ((TestStepRun) e).getStep();
							action = step.getAction();
						} else
							action = ((TestStepRun) e).getAction();
					}

					try {
						if (action == null
								|| connector.automate(action, responder))
							v.setName("PASS");
					} catch (Exception ex) {
						v.setName("ERROR");
						throw ex;
					}

					TestStepRun tsr = F.createTestStepRun();
					tsr.getTraceableTo().add(e);
					tsr.setStep(step);
					tsr.setId(step.getId() + suffix);
					tsr.setName(tsr.getId());
					tsr.setVerdict(v);
					tsr.setAction(EcoreUtil.copy(action));
					return tsr;
				}

				if (e instanceof TestCase) {
					TestRun r = F.createTestRun();
					r.set_case((TestCase) e);
					r.setId(r.get_case().getId() + suffix);
					r.getTraceableTo().add(e);

					for (TestStep s : ((TestCase) e).getSteps()) {
						TestStepRun tsr = (TestStepRun) execute(s, m, finished);
						r.getStepRuns().add(tsr);
						if (!tsr.getVerdict().getName().equals("PASS"))
							break;
					}

					return r;
				}
				if (e instanceof TestRun) {
					TestRun r = F.createTestRun();
					r.set_case(((TestRun) e).get_case());
					r.setId(e.getId() + suffix);
					r.getTraceableTo().add(e);

					for (TestStepRun s : ((TestRun) e).getStepRuns()) {
						TestStepRun tsr = (TestStepRun) execute(s, m, finished);
						r.getStepRuns().add(tsr);
						if (!tsr.getVerdict().getName().equals("PASS"))
							break;
					}

					return r;
				}
				if (e instanceof TestSuite) {
					TestReport report = F.createTestReport();
					report.setSuite((TestSuite) e);
					report.setId(e.getId() + suffix);
					report.setName(report.getId());
					report.getTraceableTo().add(e);

					for (TestCase c : ((TestSuite) e).getCases()) {
						TestRun tr = (TestRun) execute(c, m, finished);
						report.getRuns().add(tr);
					}

					return report;
				}
				if (e instanceof TestReport) {
					TestReport report = F.createTestReport();
					report.setSuite(((TestReport) e).getSuite());
					report.setId(e.getId() + suffix);
					report.setName(report.getId());
					report.getTraceableTo().add(e);

					for (TestRun r : ((TestReport) e).getRuns()) {
						TestRun tr = (TestRun) execute(r, m, finished);
						report.getRuns().add(tr);
					}

					return report;
				}

				return null;
			}
		}.schedule();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		Iterator<?> i = ((StructuredSelection) selection).iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof IFile) {
				selected.add((IFile) o);
			}
		}
	}
}