package org.tud.inf.st.mbt.emf.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.emf.traversal.AbstractTraversalType;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;

/**
 * Generates offline test cases. Does not work with downlink variables and
 * realtime.
 * 
 * @author gpue
 */
public class Generator implements Iterator<GeneratorState> {
	private LinkedList<State> queue = new LinkedList<>();
	private AbstractOperator operator;
	private State initial = new State(null, null, false, new PredicateList());
	private int step = 0;
	private TestSuite suite;
	private State current;
	private SATFoundation satFoundation;
	private AbstractTraversalType traversalType;

	public Generator(Configuration config, ResourceSet rs, int maxTokens,
			int maxTime, AbstractTraversalType traversalType) {
		satFoundation = new SATFoundation(rs, maxTokens, maxTime);
		this.traversalType = traversalType;

		configureOperators();

		suite = TestFactory.eINSTANCE.createTestSuite();
		suite.setId(config.getId() + "_suite");
		suite.setName(config.getName() + "_suite");
		suite.setConfiguration(config);

		operator.contributeToInitialState(initial);

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

	@Override
	public final boolean hasNext() {
		return !queue.isEmpty() && !(current != null && current.isFailed());
	}

	@Override
	public GeneratorState next() {
		if (!hasNext()) {
			return null;
		}

		current = traversalType.determineNext(queue);
		queue.remove(current);

		queue.addAll(Arrays.asList(operator.operate(current)));

		TestCase newCase = null;
		if (current.isTerminating()) {
			newCase = buildCase(current);
		}
		if (newCase != null) {
			suite.getCases().add(newCase);
		}

		return new GeneratorState(step++, queue.size(), newCase);
	}

	public TestSuite getTestSuite() {
		renameElements();
		suite.setRiskReduction(0);
		for (TestCase c : suite.getCases())
			suite.setRiskReduction(suite.getRiskReduction()
					+ c.getRiskReduction());
		return suite;
	}

	private TestCase buildCase(State s) {
		if (s.getParent() == null) {
			TestCase c = TestFactory.eINSTANCE.createTestCase();
			c.setRiskReduction(0);
			return c;
		} else {
			//TODO empty steps?
			TestCase c = buildCase(s.getParent());
			TestStep ts = TestFactory.eINSTANCE.createTestStep();
			c.setRiskReduction(c.getRiskReduction() + s.getPriority());
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
			tc.setId(suite.getId() + "_case_" + cn);
			tc.setName(suite.getName()!=null ? suite.getName() + "-case-" + cn : tc.getId());
			int sn = 1;
			for (TestStep ts : tc.getSteps()) {
				ts.setId(tc.getId() + "_step_" + sn);
				ts.setName(tc.getName()+ "_step_" + sn);
				sn++;
			}
			cn++;
		}
	}

	private void configureOperators() {
		operator = new InstructionsOperator(satFoundation, true)
				.ifEmpty(AbstractOperator.combine(new CAOperator(satFoundation,
						true, TimingType.DELAY_UNTIL_START), new CAOperator(
						satFoundation, true, TimingType.INTERVAL),
						new TimedConditionActionOperator(satFoundation),
						new TimerOperator(satFoundation, true),
						new RealTimeOperator(satFoundation, true)));
	}
}
