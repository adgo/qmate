package org.tud.inf.st.mbt.emf.util;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.getValue;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.emf.generator.Clause;
import org.tud.inf.st.mbt.emf.generator.PredicateList;
import org.tud.inf.st.mbt.emf.generator.SAT;
import org.tud.inf.st.mbt.emf.generator.SATFoundation;
import org.tud.inf.st.mbt.emf.generator.State;
import org.tud.inf.st.mbt.emf.transformations.Model2Logic;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.functions.ArithmetricCase;
import org.tud.inf.st.mbt.functions.ArithmetricCaseFunction;
import org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction;
import org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction;
import org.tud.inf.st.mbt.functions.BagCountFunction;
import org.tud.inf.st.mbt.functions.BagElementFunction;
import org.tud.inf.st.mbt.functions.BagFirstFreeFunction;
import org.tud.inf.st.mbt.functions.BagIdxFunction;
import org.tud.inf.st.mbt.functions.BagNextFunction;
import org.tud.inf.st.mbt.functions.BagSizeFunction;
import org.tud.inf.st.mbt.functions.BinaryFunction;
import org.tud.inf.st.mbt.functions.DataNodeCase;
import org.tud.inf.st.mbt.functions.DataNodeCaseFunction;
import org.tud.inf.st.mbt.functions.DataNodeFunction;
import org.tud.inf.st.mbt.functions.DataNodeReferenceFunction;
import org.tud.inf.st.mbt.functions.DataNodeValueFunction;
import org.tud.inf.st.mbt.functions.DataValueFunction;
import org.tud.inf.st.mbt.functions.DivisionFunction;
import org.tud.inf.st.mbt.functions.EqualFunction;
import org.tud.inf.st.mbt.functions.FeatureTreeValidFunction;
import org.tud.inf.st.mbt.functions.FloatFunction;
import org.tud.inf.st.mbt.functions.FunctionVariable;
import org.tud.inf.st.mbt.functions.IArithmetricFunction;
import org.tud.inf.st.mbt.functions.IDataNodeFunction;
import org.tud.inf.st.mbt.functions.IFunction;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.functions.IValueFunction;
import org.tud.inf.st.mbt.functions.IntFunction;
import org.tud.inf.st.mbt.functions.LargerThanFunction;
import org.tud.inf.st.mbt.functions.LogicReferenceFunction;
import org.tud.inf.st.mbt.functions.LongFunction;
import org.tud.inf.st.mbt.functions.LowerThanFunction;
import org.tud.inf.st.mbt.functions.MinusFunction;
import org.tud.inf.st.mbt.functions.MultiplyFunction;
import org.tud.inf.st.mbt.functions.PlusFunction;
import org.tud.inf.st.mbt.functions.PredicateFunction;
import org.tud.inf.st.mbt.functions.ReferenceFunction;
import org.tud.inf.st.mbt.functions.SubClassFunction;
import org.tud.inf.st.mbt.functions.SubFunction;
import org.tud.inf.st.mbt.functions.TimeFunction;
import org.tud.inf.st.mbt.functions.TokenFunction;
import org.tud.inf.st.mbt.functions.UnaryFunction;
import org.tud.inf.st.mbt.functions.ValueCase;
import org.tud.inf.st.mbt.functions.ValueCaseFunction;
import org.tud.inf.st.mbt.functions.ValueReferenceFunction;
import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.TimeAtom;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.ReferenceTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.terms.TermsFactory;

public class FunctionProcessor {
	private static final TermsFactory T = TermsFactory.eINSTANCE;
	private static final DataFactory D = DataFactory.eINSTANCE;

	public static class Data {
		private DataStructureNode node;
		private ArrayList<DataBinding> bindings = new ArrayList<DataBinding>();
		private static final String LEAF = "value";
		private static final String STRUCT = "struct";
		private static final String BAG = "bag";

		public Data(DataStructureNode node, List<DataBinding> bindings) {
			this.node = node;
			this.bindings.addAll(bindings);
		}

		public Data(Term fromTerm) {
			this.node = buildFromTerm(fromTerm);
		}

		private DataStructureNode buildFromTerm(Term t) {
			if (!(t instanceof FunctorTerm))
				buildingFailed();

			FunctorTerm ft = (FunctorTerm) t;
			String functor = ft.getFunctor();
			Iterator<Term> i = ft.getArguments().iterator();

			String id = ((FunctorTerm) i.next()).getFunctor();

			if (functor.equals(LEAF)) {
				DataElement domain = (DataElement) ((ReferenceTerm) i.next())
						.getReference();

				DataLeaf l = D.createDataLeaf();
				l.setId(id);
				l.setDomain((DataClass) domain);

				Term value = i.next();
				if (value instanceof ReferenceTerm) {
					DataBinding b = D.createDataBinding();
					b.setLeaf(l);
					b.setValue((DataElement) ((ReferenceTerm) value)
							.getReference());
					bindings.add(b);
				}

				return l;
			} else if (functor.equals(STRUCT)) {
				DataStructure s = D.createDataStructure();
				s.setId(id);
				while (i.hasNext())
					s.getChildren().add(buildFromTerm(i.next()));

				return s;
			} else if (functor.equals(BAG)) {
				DataBag b = D.createDataBag();
				b.setId(id);
				b.setMaxSize(ft.getArguments().size() - 1);

				boolean first = true;
				while (i.hasNext()) {
					DataStructureNode n = buildFromTerm(i.next());
					if (first) {
						b.setSingleElementPrototype(n);
						first = false;
					}
					b.getGeneratedElements().add(n);
				}

				return b;
			} else
				return buildingFailed();
		}

		private DataStructureNode buildingFailed() {
			throw new RuntimeException(Data.class + ": Wrong term format.");
		}

		public List<DataBinding> getBindings() {
			return bindings;
		}

		public DataStructureNode getNode() {
			return node;
		}

		public Term toTerm() {
			FunctorTerm t = T.createFunctorTerm();
			FunctorTerm id = T.createFunctorTerm();
			id.setFunctor(node.getId());
			t.getArguments().add(id);

			if (node instanceof DataLeaf) {
				DataLeaf l = (DataLeaf) node;

				t.setFunctor(LEAF);

				ReferenceTerm dt = T.createReferenceTerm();
				dt.setReference(l.getDomain());
				t.getArguments().add(dt);

				DataElement v = null;
				for (DataBinding b : bindings) {
					if (b.getLeaf().equals(l)) {
						v = b.getValue();
						break;
					}
				}
				if (v != null) {
					ReferenceTerm vt = T.createReferenceTerm();
					vt.setReference(v);
					t.getArguments().add(vt);
				} else {
					FunctorTerm nt = T.createFunctorTerm();
					nt.setFunctor("_null");
					t.getArguments().add(nt);
				}
			} else if (node instanceof DataStructure) {
				t.setFunctor(STRUCT);

				for (DataStructureNode c : ((DataStructure) node).getChildren()) {
					t.getArguments().add(new Data(c, bindings).toTerm());
				}
			} else if (node instanceof DataBag) {
				t.setFunctor(BAG);

				for (DataStructureNode c : ((DataBag) node)
						.getGeneratedElements()) {
					t.getArguments().add(new Data(c, bindings).toTerm());
				}
			} else
				return null;

			return t;
		}

		public boolean isSubClassOf(Data upper) {
			if (node instanceof DataLeaf && upper.getNode() instanceof DataLeaf) {
				DataElement subValue = getBinding((DataLeaf) node);
				DataElement upperValue = upper.getBinding((DataLeaf) upper
						.getNode());
				return (subValue == null && upperValue == null)
						|| ModelUtil.getAllLowerElements(upperValue).contains(
								subValue);
			} else if (node instanceof DataStructure
					&& upper.getNode() instanceof DataStructure) {
				DataStructure subStruct = (DataStructure) node;
				DataStructure upperStruct = (DataStructure) upper.getNode();

				if (subStruct.getChildren().size() != upperStruct.getChildren()
						.size())
					return false;

				for (int i = 0; i < subStruct.getChildren().size(); i++) {
					if (!subStruct.getChildren().get(i).getId()
							.equals(upperStruct.getChildren().get(i).getId()))
						return false;

					if (!new Data(subStruct.getChildren().get(i), bindings)
							.isSubClassOf(new Data(upperStruct.getChildren()
									.get(i), upper.getBindings())))
						return false;
				}
				return true;
			} else if (node instanceof DataBag
					&& upper.getNode() instanceof DataBag) {
				DataBag subBag = (DataBag) node;
				DataBag upperBag = (DataBag) upper.getNode();

				if (subBag.getMaxSize() != upperBag.getMaxSize())
					return false;

				for (int i = 0; i < subBag.getMaxSize(); i++) {
					if (!new Data(subBag.getGeneratedElements().get(i),
							bindings).isSubClassOf(new Data(upperBag
							.getGeneratedElements().get(i), bindings)))
						return false;
				}
				return true;
			}

			return false;
		}

		public DataElement getBinding(DataLeaf l) {
			for (DataBinding b : bindings)
				if (b.getLeaf().equals(l))
					return b.getValue();

			return null;
		}
	}

	private State s;
	private SATFoundation sf;
	private SAT sat;

	public FunctionProcessor(SATFoundation sf, State s) {
		this.s = s;
		this.sf = sf;
		this.sat = sf.buildSAT();
	}

	private boolean conditionHolds(State s, Predicate p,
			Map<String, Object> context) {

		p = Model2Logic.normalize(p, sf.getFeatures(), context);

		PredicateList unfold = s.getUnfoldPropositions();
		for (Predicate a : unfold) {
			if (sf.getBase().contains(a)) {
				Clause unit = new Clause();
				unit.add(a);
			}
		}
		for (Predicate a : sf.getBase()) {
			if (!unfold.contains(a)) {
				Clause unit = new Clause();
				unit.add(not(EcoreUtil.copy(a)));
			}
		}
		return sat.isSatisfiable(p);
	}

	private List<DataBinding> getBindings(Collection<DataLeaf> leafs) {
		List<DataBinding> bindings = new ArrayList<DataBinding>();
		for (DataLeaf l : leafs) {
			DataElement v = s.getCurrentValue(l);
			DataBinding b = D.createDataBinding();
			b.setLeaf(l);
			b.setValue(v);
			bindings.add(b);
		}
		return bindings;
	}

	private static Data createTempData(DataElement value) {
		DataLeaf l = D.createDataLeaf();
		l.setId("temp");
		DataBinding b = D.createDataBinding();
		b.setLeaf(l);
		b.setValue(value);
		return new Data(l, Arrays.asList(new DataBinding[] { b }));
	}

	public Object evaluate(IFunction f, Map<String, Object> context) {
		if (f instanceof FunctionVariable) {
			return context.get(((FunctionVariable) f).getId());
		}
		if (f instanceof IDataNodeFunction)
			return evaluate((IDataNodeFunction) f, context);
		else if (f instanceof IValueFunction)
			return evaluate((IValueFunction) f, context);
		else
			throw new UnsupportedOperationException(f + "");
	}

	public static IFunction normalize(IFunction f,
			Collection<IFeature> features, Map<String, Object> context) {
		f = EcoreUtil.copy(f);

		if (f instanceof ReferenceFunction) {
			Map<String, Object> nextContext = new HashMap<String, Object>();
			for (int i = 0; i < ((ReferenceFunction) f).getParameters().size(); i++) {
				Object value = ((ReferenceFunction) f).getParameters().get(i);
				String id = getTargetFunctionVariableID((ReferenceFunction) f,
						i);
				nextContext.put(id, value);
			}
			f = normalize(getTargetFunction((ReferenceFunction) f), features,
					nextContext);
		} else if (f instanceof ArithmetricLogicBinaryFunction) {
			((ArithmetricLogicBinaryFunction) f)
					.setLeft((IArithmetricFunction) normalize(
							((ArithmetricLogicBinaryFunction) f).getLeft(),
							features, context));
			((ArithmetricLogicBinaryFunction) f)
					.setRight((IArithmetricFunction) normalize(
							((ArithmetricLogicBinaryFunction) f).getRight(),
							features, context));
		} else if (f instanceof SubClassFunction) {
			((SubClassFunction) f).setSub((IValueFunction) normalize(
					((SubClassFunction) f).getSub(), features, context));
			((SubClassFunction) f).setIn((IValueFunction) normalize(
					((SubClassFunction) f).getIn(), features, context));
		} else if (f instanceof PredicateFunction) {
			((PredicateFunction) f).setPredicate(Model2Logic.normalize(
					((PredicateFunction) f).getPredicate(), features, context));
		} else if (f instanceof UnaryFunction) {
			((UnaryFunction) f).setOperand((IArithmetricFunction) normalize(
					((UnaryFunction) f).getOperand(), features, context));
		} else if (f instanceof BinaryFunction) {
			((BinaryFunction) f).setLeft((IArithmetricFunction) normalize(
					((BinaryFunction) f).getLeft(), features, context));
			((BinaryFunction) f).setRight((IArithmetricFunction) normalize(
					((BinaryFunction) f).getRight(), features, context));
		} else if (f instanceof BagCountFunction) {
			((BagCountFunction) f).setNeedle((IValueFunction) normalize(
					((BagCountFunction) f).getNeedle(), features, context));
		} else if (f instanceof BagIdxFunction) {
			((BagIdxFunction) f).setNeedle((IValueFunction) normalize(
					((BagIdxFunction) f).getNeedle(), features, context));
		} else if (f instanceof BagElementFunction) {
			((BagElementFunction) f).setIdx((IArithmetricFunction) normalize(
					((BagElementFunction) f).getIdx(), features, context));
		} else if (f instanceof DataNodeValueFunction) {
			((DataNodeValueFunction) f).setNode((DataNodeFunction) normalize(
					((DataNodeValueFunction) f).getNode(), features, context));
		} else if (f instanceof ArithmetricCaseFunction) {
			for (ArithmetricCase c : ((ArithmetricCaseFunction) f).getCases()) {
				c.setCondition(Model2Logic.normalize(c.getCondition(),
						features, context));
				c.setThen((IArithmetricFunction) normalize(c.getThen(),
						features, context));
			}
		} else if (f instanceof ValueCaseFunction) {
			for (ValueCase c : ((ValueCaseFunction) f).getCases()) {
				c.setCondition(Model2Logic.normalize(c.getCondition(),
						features, context));
				c.setThen((IValueFunction) normalize(c.getThen(), features,
						context));
			}
		} else if (f instanceof DataNodeCaseFunction) {
			for (DataNodeCase c : ((DataNodeCaseFunction) f).getCases()) {
				c.setCondition(Model2Logic.normalize(c.getCondition(),
						features, context));
				c.setThen((IDataNodeFunction) normalize(c.getThen(), features,
						context));
			}
		} else if (f instanceof FunctionVariable) {
			f = (IFunction) context.get(((FunctionVariable) f).getId());
		}

		return f;
	}

	private static IFunction getTargetFunction(ReferenceFunction f) {
		if (f instanceof ArithmetricReferenceFunction) {
			return ((ArithmetricReferenceFunction) f).getFunction()
					.getFunction();
		} else if (f instanceof ValueReferenceFunction) {
			return ((ValueReferenceFunction) f).getFunction().getFunction();
		} else if (f instanceof DataNodeReferenceFunction) {
			return ((DataNodeReferenceFunction) f).getFunction().getFunction();
		} else if (f instanceof LogicReferenceFunction) {
			return ((LogicReferenceFunction) f).getFunction().getFunction();
		} else
			throw new UnsupportedOperationException(f + "");
	}

	private static String getTargetFunctionVariableID(ReferenceFunction f,
			int param) {
		IContextVariable v = null;
		if (f instanceof ArithmetricReferenceFunction) {
			v = ((ArithmetricReferenceFunction) f).getFunction()
					.getParameters().get(param);
		} else if (f instanceof ValueReferenceFunction) {
			v = ((ValueReferenceFunction) f).getFunction().getParameters()
					.get(param);
		} else if (f instanceof DataNodeReferenceFunction) {
			v = ((DataNodeReferenceFunction) f).getFunction().getParameters()
					.get(param);
		} else if (f instanceof LogicReferenceFunction) {
			v = ((LogicReferenceFunction) f).getFunction().getParameters()
					.get(param);
		} else
			throw new UnsupportedOperationException(f + "");
		return ModelUtil.getVariableID(v);
	}

	public Data evaluate(ILogicFunction f, Map<String, Object> context) {
		if (f instanceof ArithmetricLogicBinaryFunction) {
			double left = (double) getValue(evaluate(
					((ArithmetricLogicBinaryFunction) f).getLeft(), context));
			double right = (double) getValue(evaluate(
					((ArithmetricLogicBinaryFunction) f).getRight(), context));

			if (f instanceof EqualFunction) {
				return createTempData(value(left == right));
			} else if (f instanceof LargerThanFunction) {
				return createTempData(value(left > right));
			} else if (f instanceof LowerThanFunction) {
				return createTempData(value(left < right));
			}
		} else if (f instanceof SubClassFunction) {
			Data sub = evaluate(
					(IValueFunction) ((SubClassFunction) f).getSub(), context);
			Data in = evaluate((IValueFunction) ((SubClassFunction) f).getIn(),
					context);
			return createTempData(value(sub.isSubClassOf(in)));
		} else if (f instanceof PredicateFunction) {
			return createTempData(value(conditionHolds(s,
					((PredicateFunction) f).getPredicate(), context)));
		} else if (f instanceof FeatureTreeValidFunction) {
			Predicate p = Model2Logic.normalize(
					((FeatureTreeValidFunction) f).getTree(), sf.getFeatures());
			return createTempData(value(conditionHolds(s, p, context)));
		}

		throw new UnsupportedOperationException("(logic) " + f);
	}

	public Data evaluate(IArithmetricFunction f, Map<String, Object> context) {
		if (f instanceof IntFunction)
			return createTempData(value(((IntFunction) f).getValue()));
		else if (f instanceof LongFunction)
			return createTempData(value(((LongFunction) f).getValue()));
		else if (f instanceof FloatFunction)
			return createTempData(value(((FloatFunction) f).getValue()));
		else if (f instanceof BinaryFunction) {
			float left = (float) getValue(evaluate(
					((BinaryFunction) f).getLeft(), context));
			float right = (float) getValue(evaluate(
					((BinaryFunction) f).getRight(), context));
			if (f instanceof PlusFunction)
				return createTempData(value(left + right));
			else if (f instanceof MinusFunction)
				return createTempData(value(left + right));
			else if (f instanceof MultiplyFunction)
				return createTempData(value(left * right));
			else if (f instanceof DivisionFunction)
				return createTempData(value(left / right));
		} else if (f instanceof UnaryFunction) {
			Data operand = evaluate(((UnaryFunction) f).getOperand(), context);
			if (f instanceof SubFunction)
				return operand;
		} else if (f instanceof TokenFunction) {
			return createTempData(value(s.getTokenCount(((TokenFunction) f)
					.getPlace())));
		} else if (f instanceof TimeFunction) {
			PredicateList times = s.findAllPredicates(RulesPackage.eINSTANCE
					.getTimeAtom());
			for (Predicate a : times) {
				if (((TimeAtom) a).getConsumer().equals(
						((TimeFunction) f).getConsumer())) {
					return createTempData(value(((TimeAtom) a).getTime()));
				}
			}
			return createTempData(value(0));
		} else if (f instanceof BagSizeFunction) {
			int countAsg = 0;
			DataBag b = ((BagSizeFunction) f).getBag();
			for (int i = 0; i < b.getMaxSize(); i++) {
				if (s.isAssigned(b, i))
					countAsg++;
			}
			return createTempData(value(((BagSizeFunction) f).getBag()
					.getMaxSize() - countAsg));
		} else if (f instanceof BagCountFunction) {
			DataBag bag = ((BagCountFunction) f).getBag();
			Data needle = evaluate(((BagCountFunction) f).getNeedle(), context);
			int count = 0;
			for (int i = 0; i < bag.getMaxSize(); i++) {
				if (!s.isAssigned(bag, i))
					continue;

				List<DataBinding> bindings = getBindings(ModelUtil
						.getAllLeafs(bag.getGeneratedElements().get(i)));

				if (needle.isSubClassOf(new Data(bag.getGeneratedElements()
						.get(i), bindings)))
					count++;
			}
			return createTempData(value(count));
		} else if (f instanceof BagIdxFunction) {
			DataBag bag = ((BagIdxFunction) f).getBag();
			Data needle = evaluate(((BagIdxFunction) f).getNeedle(), context);
			for (int i = 0; i < bag.getMaxSize(); i++) {
				if (!s.isAssigned(bag, i))
					continue;

				if (needle.isSubClassOf(new Data(bag.getGeneratedElements()
						.get(i), getBindings(ModelUtil.getAllLeafs(bag
						.getGeneratedElements().get(i))))))
					return createTempData(value(i));
			}
			return createTempData(value(-1));
		} else if (f instanceof BagFirstFreeFunction) {
			DataBag bag = ((BagFirstFreeFunction) f).getBag();
			for (int i = 0; i < bag.getMaxSize(); i++) {
				if (!s.isAssigned(bag, i))
					return createTempData(value(i));
			}
			return createTempData(value(-1));
		} else if (f instanceof BagNextFunction) {
			DataBag bag = ((BagNextFunction) f).getBag();
			int next = -1;
			for (int i = bag.getMaxSize() - 1; i >= 0; i--) {
				if (!s.isAssigned(bag, i))
					next = i;
				else
					break;
			}
			return createTempData(value(next));
		} else if (f instanceof ArithmetricCaseFunction) {
			for (ArithmetricCase c : ((ArithmetricCaseFunction) f).getCases()) {
				if (conditionHolds(s, c.getCondition(), context)) {
					return evaluate(c.getThen(), context);
				}
			}
		}

		throw new UnsupportedOperationException("(arithmetric) " + f);
	}

	public Data evaluate(IValueFunction f, Map<String, Object> context) {
		if (f instanceof DataNodeValueFunction) {
			return evaluate((DataNodeValueFunction) f, context);
		} else if (f instanceof DataValueFunction) {
			return createTempData(((DataValueFunction) f).getValue());
		} else if (f instanceof ILogicFunction) {
			return evaluate((ILogicFunction) f, context);
		} else if (f instanceof IArithmetricFunction) {
			return evaluate((IArithmetricFunction) f, context);
		} else if (f instanceof ValueCaseFunction) {
			for (ValueCase c : ((ValueCaseFunction) f).getCases()) {
				if (conditionHolds(s, c.getCondition(), context)) {
					return evaluate(c.getThen(), context);
				}
			}
		}

		// warning: dnvf and dvf apply automatic casting

		throw new UnsupportedOperationException("" + f);
	}

	public Data evaluate(DataNodeValueFunction f, Map<String, Object> context) {
		DataStructureNode n = evaluate(((DataNodeValueFunction) f).getNode(),
				context);
		Collection<DataLeaf> lc = ModelUtil.getAllLeafs(n);
		return new Data(n, getBindings(lc));
	}

	public DataStructureNode evaluate(IDataNodeFunction f,
			Map<String, Object> context) {
		if (f instanceof DataNodeFunction)
			return ((DataNodeFunction) f).getData();
		else if (f instanceof BagElementFunction) {
			((BagElementFunction) f).getData().organize();
			int idx = (int) getValue(evaluate(
					((BagElementFunction) f).getIdx(), context));
			return ((BagElementFunction) f).getData().getGeneratedElements()
					.get(idx);
		} else if (f instanceof DataNodeCaseFunction) {
			for (DataNodeCase c : ((DataNodeCaseFunction) f).getCases()) {
				if (conditionHolds(s, c.getCondition(), context)) {
					return evaluate(c.getThen(), context);
				}
			}
		}
		throw new UnsupportedOperationException("" + f);
	}

	public void recomputeFunctionResults() {
		for (LogicFunctionAtom a : sf.getLogicFunctionAtoms()) {
			try {
				if ((Boolean) getValue(evaluate(a.getFunction(),
						new HashMap<String, Object>())))
					s.configureProposition(a);
				else
					s.deconfigureProposition(a);
			} catch (UnsupportedOperationException e) {
				// due to casting
			}
		}
	}
}
