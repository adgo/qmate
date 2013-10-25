package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestSuite;

/**
 * Generates offline test cases. Does not work with downlink variables and
 * realtime.
 * 
 * @author gpue
 */
public class Generator implements Iterator<GeneratorState> {
	private LinkedList<State> queue = new LinkedList<>();
	private List<AbstractOperator> operators = new ArrayList<>(3);
	private State initial = new State(null, null, false, new PredicateList());
	private int step = 0;
	private TestSuite suite;
	private ActionProcessor actionProcessor;
	private State current;
	private SATFoundation satFoundation;

	public Generator(Configuration config, ResourceSet rs, int maxTokens,
			int maxTime) {
		this.actionProcessor = new ActionProcessor(
				satFoundation = new SATFoundation(rs, maxTokens, maxTime));

		configureOperators();

		suite = TestFactory.eINSTANCE.createTestSuite();
		suite.setId(config.getId() + "_suite");
		suite.setName(config.getName() + "_suite");
		suite.setConfiguration(config);

		// init
		for (AbstractOperator o : operators) {
			o.contributeToInitialState(initial);
		}
		for (IFeature f : config.getFeatures()) {
			for (Atom p : ModelUtil.atoms(f)) {
				initial.configureProposition(p);
			}
		}
		for (DataBinding db : config.getBindings()) {
			DataAtom da = ModelUtil.atom(db.getLeaf(), db.getValue());
			initial.configureProposition(da);
		}

		queue.add(initial);
	}

	private void configureOperators() {
		operators.add(new CAOperator(satFoundation));
		operators.add(new TimerOperator(satFoundation));
		operators.add(new TimedConditionActionOperator(satFoundation));
		
		for(AbstractOperator op:operators)
			if(op instanceof TransitionOperator)
				((TransitionOperator) op).setIgnoreRealtime(true);
	}

	@Override
	public final boolean hasNext() {
		return !operators.isEmpty() && !queue.isEmpty()
				&& !(current != null && current.isFailed());
	}

	@Override
	public GeneratorState next() {
		if (!hasNext()) {
			return null;
		}

		current = queue.poll();

		if (current.isTopInstructionSequenceRunning()) {
			queue.addAll(Arrays.asList(actionProcessor
					.operateTopInstructionSequence(current)));
		} else {
			for (AbstractOperator o : operators) {
				queue.addAll(Arrays.asList(o.operate(current)));
			}
		}

		TestCase newCase = null;
		if (current.isTerminating()) {
			newCase = buildCase(current);
		}
		if (newCase != null) {
			suite.getCases().add(newCase);
		}

		return new GeneratorState(step++, queue.size(), newCase);
	}

	private TestCase buildCase(State s) {
		if (s.getParent() == null) {
			TestCase c = TestFactory.eINSTANCE.createTestCase();
			c.setId(suite.getId() + "-case-" + suite.getCases().size() + 1);
			c.setName(c.getId());
			return c;
		} else {
			TestCase c = buildCase(s.getParent());
			TestStep ts = TestFactory.eINSTANCE.createTestStep();
			ts.setId(c.getId() + "-step-" + c.getSteps().size() + 1);
			ts.setName(ts.getId());
			if (s.getTraceableTo() != null && s.getTraceableTo().length > 0)
				ts.setNote(s.getTraceableTo()[0].getNote());

			if (s.getActions().getActions().size() > 0) {
				if (s.getActions().getActions().size() == 1) {
					ts.setAction(EcoreUtil.copy(s.getActions().getActions()
							.get(0)));
				} else {
					ts.setAction(EcoreUtil.copy(s.getActions()));
				}
				c.getSteps().add(ts);
			}

			return c;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	private void renameElements() {
		int cn = 1;
		for (TestCase tc : suite.getCases()) {
			tc.setId(suite.getId() + "_case_" + cn++);
			tc.setName(tc.getId());
			int sn = 1;
			for (TestStep ts : tc.getSteps()) {
				ts.setId(tc.getId() + "_step_" + sn++);
				ts.setName(ts.getId());
			}
		}
	}

	public TestSuite getTestSuite() {
		renameElements();
		return suite;
	}
}
