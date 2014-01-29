package org.tud.inf.st.mbt.emf.ui.views;

import java.util.Collection;

import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.help.IHelp;
import org.eclipse.help.IHelpResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.emf.util.ReportUtil;
import org.tud.inf.st.mbt.help.MBTContextProvider;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStepRun;

public class StatisticsView extends ViewPart {

	private static final String STEPS_STEP_RUNS = "Steps/StepRuns";
	private static final String CASES_RUNS = "Cases/Runs";
	private static final String SUITES_REPORTS = "Suites/Reports";
	public static final String ID = "org.tud.inf.st.mbt.ui.views.statistics";

	private static class FailPassBar extends Canvas {
		private float success = 1f;
		private int passed = 0;
		private int sum = 0;

		public FailPassBar(Composite parent) {
			super(parent, SWT.NONE);
			this.addPaintListener(new PaintListener() {

				@Override
				public void paintControl(PaintEvent e) {
					e.gc.setBackground(Display.getDefault().getSystemColor(
							SWT.COLOR_RED));
					e.gc.fillRectangle(getClientArea());

					e.gc.setBackground(Display.getDefault().getSystemColor(
							SWT.COLOR_DARK_GREEN));
					e.gc.fillRectangle(0, 0,
							(int) (success * (float) getClientArea().width),
							getClientArea().height);

					e.gc.setForeground(Display.getDefault().getSystemColor(
							SWT.COLOR_WHITE));
					e.gc.drawText(((int) (success * 1000)) / 10f
							+ "% success (" + passed + "/" + sum + ")", 10,
							getClientArea().height / 2 - 7);
				}
			});
		}

		public void setSuccess(float passed, int sum) {
			this.passed = (int) passed;
			this.sum = sum;
			this.success = sum > 0 ? passed / (float) sum : 1f;
			super.redraw();
		}

	}

	private FailPassBar fpbSuites, fpbRuns, fpbSteps;
	private Label lblSuites, lblRuns, lblSteps;
	private Composite parent;

	@Override
	public void createPartControl(Composite outer) {
		parent = new Composite(outer, SWT.None);

		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);

		lblSuites = new Label(parent, SWT.NONE);
		lblSuites.setText(SUITES_REPORTS);
		fpbSuites = new FailPassBar(parent);
		fpbSuites.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		lblRuns = new Label(parent, SWT.NONE);
		lblRuns.setText(CASES_RUNS);
		fpbRuns = new FailPassBar(parent);
		fpbRuns.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		lblSteps = new Label(parent, SWT.NONE);
		lblSteps.setText(STEPS_STEP_RUNS);
		fpbSteps = new FailPassBar(parent);
		fpbSteps.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	}

	@Override
	public void setFocus() {
	}

	public void measure(Object o) {
		float passed = 0;

		Collection<TestReport> reports = ModelUtil.getAllEObjectsOfSuperType(o,
				TestReport.class, true);
		for (TestReport r : reports)
			if (ReportUtil.passed(r))
				passed++;
		fpbSuites.setSuccess(passed, reports.size());

		passed = 0;
		Collection<TestRun> runs = ModelUtil.getAllEObjectsOfSuperType(o,
				TestRun.class, true);
		for (TestRun r : runs)
			if (ReportUtil.passed(r))
				passed++;
		fpbRuns.setSuccess(passed, runs.size());

		passed = 0;
		Collection<TestStepRun> steps = ModelUtil.getAllEObjectsOfSuperType(o,
				TestStepRun.class, true);
		for (TestStepRun r : steps)
			if (ReportUtil.passed(r))
				passed++;
		fpbSteps.setSuccess(passed, steps.size());
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		if(adapter.equals(IContextProvider.class)){
			return new MBTContextProvider("org.tud.inf.st.mbt.help.StatisticsView");
		}
		return super.getAdapter(adapter);
	}
}
