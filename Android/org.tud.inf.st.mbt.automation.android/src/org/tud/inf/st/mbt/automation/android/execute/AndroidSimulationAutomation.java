package org.tud.inf.st.mbt.automation.android.execute;

import java.awt.Point;

import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.android.record.CustomizedAndroidBridge;
import org.tud.inf.st.mbt.automation.basic.ManualAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.terms.FloatTerm;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.IntegerTerm;
import org.tud.inf.st.mbt.terms.LongTerm;
import org.tud.inf.st.mbt.terms.StringTerm;
import org.tud.inf.st.mbt.terms.Term;

public final class AndroidSimulationAutomation extends ManualAutomation {
	
	private String connection;

	public AndroidSimulationAutomation(String connection) {
		reset();
		this.connection = connection;
	}

	public String getConnection() {
		return connection;
	}

	@Override
	public boolean automate(PostGenerationAction action,
			ISimulationResponder simulationAccessor) {

		if (action instanceof TermAction) {
			Term term = ((TermAction) action).getTerm();
			if (term instanceof FunctorTerm) {
				FunctorTerm fterm = (FunctorTerm) term;
				String functor = fterm.getFunctor();
				if (functor.equals(IAutomationConstants.FUNCTOR_TAP)) {
					int x = getIntValue(fterm.getArguments().get(1));
					int y = getIntValue(fterm.getArguments().get(2));
					CustomizedAndroidBridge.tap(connection, new Point(x, y));
					return true;
				} else if (functor.equals(IAutomationConstants.FUNCTOR_SWIPE)) {
					int x0 = getIntValue(fterm.getArguments().get(0));
					int y0 = getIntValue(fterm.getArguments().get(1));
					int x1 = getIntValue(fterm.getArguments().get(2));
					int y1 = getIntValue(fterm.getArguments().get(3));
					CustomizedAndroidBridge.swipe(connection, new Point(x0,y0), new Point(x1,y1));
					return true;
				} else if (functor.equals(IAutomationConstants.FUNCTOR_TYPE)) {
					String txt = ((StringTerm)fterm.getArguments().get(0)).getValue();
					CustomizedAndroidBridge.text(connection,txt);
					return true;
				}
			}
		}

		return super.automate(action, simulationAccessor);
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
	public void reset() {
		super.reset();
	}

}
