package org.tud.inf.st.mbt.emf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.Verdict;

public class ReportUtil {
	private static final TestFactory F = TestFactory.eINSTANCE;

	public static TestRun reportRun(State s, String id) {
		List<State> path = flattenPath(s);
		TestRun run = F.createTestRun();
		run.setId(id);
		run.setName(run.getId());
		run.set_case(trace(s, TestCase.class));
		if (run.get_case() != null)
			run.getTraceableTo().add(run.get_case());

		int num = 1;
		for (int i = 0; i < path.size(); i++)
			if (path.get(i).getActions() != null
					&& path.get(i).getActions().getActions().size() > 0)
				run.getStepRuns().add(reportStep(path.get(i), id + "_" + (num++)));

		return run;
	}

	public static TestStepRun reportStep(State s, String id) {
		TestStepRun tsr = F.createTestStepRun();
		tsr.setId(id);
		tsr.setName(tsr.getId());
		tsr.setStep(trace(s, TestStep.class));
		for (Predicate p : s.getPropositions())
			if (p instanceof Atom)
				tsr.getState().add(EcoreUtil.copy((Atom) p));

		if (tsr.getStep() != null)
			tsr.getTraceableTo().add(tsr.getStep());

		Verdict v = F.createVerdict();
		if (s.isFailed())
			v.setName("FAIL");
		else
			v.setName("PASS");
		tsr.setVerdict(v);
		tsr.setAction(EcoreUtil.copy(s.getActions()));

		return tsr;
	}

	@SuppressWarnings("unchecked")
	private static <T> T trace(Object o, Class<T> type) {
		if (o instanceof Collection<?>)
			o = ((Collection<?>) o).toArray();
		if (o instanceof State)
			return trace(((State) o).getTraceableTo(), type);
		if (type.isInstance(o))
			return (T) o;
		if (o instanceof Object[]) {
			for (Object e : (Object[]) o) {
				T element = trace(e, type);
				if (element != null)
					return element;
			}
		}
		if (type.isInstance(o))
			return (T) o;
		if (o instanceof AbstractModelElement) {
			T deeper = trace(
					new ArrayList<Object>(
							((AbstractModelElement) o).getTraceableTo()), type);
			if (deeper != null)
				return deeper;
		}
		if (o instanceof EObject) {
			T upper = trace(((EObject) o).eContainer(), type);
			if (upper != null)
				return upper;
		}

		return null;
	}

	private static List<State> flattenPath(State s) {
		List<State> path = new LinkedList<>();
		path.add(s);
		while (s.getParent() != null) {
			s = s.getParent();
			path.add(0, s);
		}
		return path;
	}

	public static boolean passed(TestStepRun tsr) {
		return tsr.getVerdict() != null
				&& tsr.getVerdict().getName().equals("PASS");
	}

	public static boolean passed(TestRun run) {
		for (TestStepRun tsr : run.getStepRuns())
			if (!passed(tsr))
				return false;
		return true;
	}

	public static boolean passed(TestReport report) {
		for (TestRun run : report.getRuns())
			if (!passed(run))
				return false;
		return true;
	}
}
