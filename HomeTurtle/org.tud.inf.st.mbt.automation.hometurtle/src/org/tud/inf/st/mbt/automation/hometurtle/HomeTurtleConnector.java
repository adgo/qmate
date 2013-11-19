package org.tud.inf.st.mbt.automation.hometurtle;

import org.tud.inf.st.mbt.actions.*;
import org.tud.inf.st.mbt.terms.*;
import org.tud.inf.st.mbt.automation.basic.ManualAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.automation.hometurtle.server.IHomeTurtleTestDriver;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestSuite;

public class HomeTurtleConnector extends ManualAutomation implements
		ISimulationAutomation {

	private IHomeTurtleTestDriver remote;

	public HomeTurtleConnector(IHomeTurtleTestDriver remote) {
		this.remote = remote;
	}

	@Override
	public void terminate() {
	}

	@Override
	public void reset() {
	}

	@Override
	public boolean automate(PostGenerationAction action,
			ISimulationResponder responder) {
		try {
			if (action instanceof TermAction) {
				Term term = ((TermAction) action).getTerm();
				if (term instanceof FunctorTerm) {
					FunctorTerm fterm = (FunctorTerm) term;
					if (fterm.getFunctor().equals("spinRight")) {
						remote.spinRight(getIntValue(fterm.getArguments()
								.get(0)),
								getIntValue(fterm.getArguments().get(1)));
						elapseRealTime(responder);
						return true;
					} else if (fterm.getFunctor().equals("spinLeft")) {
						remote.spinLeft(
								getIntValue(fterm.getArguments().get(0)),
								getIntValue(fterm.getArguments().get(1)));
						elapseRealTime(responder);
						return true;
					} else if (fterm.getFunctor().equals("driveForeward")) {
						remote.driveForeward(
								getIntValue(fterm.getArguments().get(0)),
								getIntValue(fterm.getArguments().get(1)));	
						elapseRealTime(responder);
						return true;				
					} 
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			elapseRealTime(responder);
			return false;
		}
		return super.automate(action, responder);
	}

	private static int getIntValue(Term t) {
		if (t instanceof IntegerTerm)
			return ((IntegerTerm) t).getValue();
		else if (t instanceof FloatTerm)
			return (int) ((FloatTerm) t).getValue();
		else if (t instanceof LongTerm)
			return (int) ((LongTerm) t).getValue();
		else
			return -1;
	}

	@Override
	public void startTestSuite(TestSuite suite) {
	}

	@Override
	public void startTestCase(TestCase _case) {
	}

}
