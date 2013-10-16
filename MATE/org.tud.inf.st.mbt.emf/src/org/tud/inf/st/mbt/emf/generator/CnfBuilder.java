package org.tud.inf.st.mbt.emf.generator;

import static org.eclipse.emf.ecore.util.EcoreUtil.copy;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;

import java.util.Iterator;

import org.tud.inf.st.mbt.rules.And;
import org.tud.inf.st.mbt.rules.BinaryOperator;
import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Or;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.UnaryOperator;

public class CnfBuilder {
	public static class CnfIterator implements Iterator<Conjunction> {
		private Conjunction out;
		private Conjunction temp;
		private int clausesChecked = 0;

		public CnfIterator(Predicate predicate) {
			out = conjunct(clause(predicate));
			out.reduce();
			next();
		}

		public boolean hasNext() {
			return clausesChecked < temp.size();
		}

		public Conjunction getCurrent() {
			return out;
		}

		public Conjunction next() {
			temp = cnf(out);
			temp.reduce();
			if (temp.equals(out))
				clausesChecked++;
			else
				clausesChecked = 0;

			out = temp;

			return out;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Conjunction complete() {
			Conjunction result = out;
			while (hasNext()) {
				result = next();
			}
			return result;
		}
	}

	public static CnfIterator buildCnf(final Predicate predicate) {
		return new CnfIterator(predicate);
	}

	private static Conjunction cnf(Conjunction conjunction) {
		conjunction = new Conjunction(conjunction);

		if (conjunction.isEmpty())
			return conjunction;

		conjunction.addAll(cnf(conjunction.poll()));
		return conjunction;
	}

	private static Clause combine(Predicate p, Clause c) {
		c = new Clause(c);
		c.add(p);
		return c;
	}

	@SafeVarargs
	private static Conjunction conjunct(Clause... clauses) {
		Conjunction out = new Conjunction();
		for (Clause ps : clauses)
			out.add(ps);
		return out;
	}

	private static Clause clause(Predicate... preds) {
		Clause out = new Clause();
		for (Predicate p : preds)
			out.add(p);
		return out;
	}

	private static Conjunction cnf(Clause clause) {
		for (Predicate pred : clause) {
			if (pred instanceof Not && ((Not) pred).getOperand() instanceof Not) {
				return conjunct(combine(copy(((Not) ((Not) pred).getOperand()))
						.getOperand(), clause.without(pred)));
			} else if (pred instanceof Not
					&& ((Not) pred).getOperand() instanceof And) {
				return conjunct(combine(
						not(copy(((BinaryOperator) ((UnaryOperator) pred)
								.getOperand()).getOperand1())),
						combine(not(copy(((BinaryOperator) ((UnaryOperator) pred)
								.getOperand()).getOperand2())), clause
								.without(pred))));
			} else if (pred instanceof Not
					&& ((Not) pred).getOperand() instanceof Or) {
				return conjunct(
						combine(not(copy(((BinaryOperator) ((UnaryOperator) pred)
								.getOperand()).getOperand1())), clause
								.without(pred)),
						combine(not(copy(((BinaryOperator) ((UnaryOperator) pred)
								.getOperand()).getOperand2())), clause
								.without(pred)));
			} else if (pred instanceof And) {
				return conjunct(
						combine(copy(((And) pred).getOperand1()),
								clause.without(pred)),
						combine(copy(((And) pred).getOperand2()),
								clause.without(pred)));
			} else if (pred instanceof Or) {
				return conjunct(combine(
						copy(((Or) pred).getOperand1()),
						combine(copy(((Or) pred).getOperand2()),
								clause.without(pred))));
			}
		}
		return conjunct(clause);
	}

}
