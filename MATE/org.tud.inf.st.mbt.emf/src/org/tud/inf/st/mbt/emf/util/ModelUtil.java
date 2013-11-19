package org.tud.inf.st.mbt.emf.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.data.BoolDataValue;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.data.FloatDataValue;
import org.tud.inf.st.mbt.data.IntDataValue;
import org.tud.inf.st.mbt.data.LongDataValue;
import org.tud.inf.st.mbt.data.TypedDataElement;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor.Data;
import org.tud.inf.st.mbt.features.Feature;
import org.tud.inf.st.mbt.features.FeatureReference;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.FeaturesFactory;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.featuretree.FeaturetreeFactory;
import org.tud.inf.st.mbt.featuretree.TreeFeature;
import org.tud.inf.st.mbt.functions.ArithmetricCase;
import org.tud.inf.st.mbt.functions.ArithmetricCaseFunction;
import org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction;
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
import org.tud.inf.st.mbt.functions.DataNodeValueFunction;
import org.tud.inf.st.mbt.functions.DataValueFunction;
import org.tud.inf.st.mbt.functions.FloatFunction;
import org.tud.inf.st.mbt.functions.FunctionVariable;
import org.tud.inf.st.mbt.functions.IFunction;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.functions.IntFunction;
import org.tud.inf.st.mbt.functions.LongFunction;
import org.tud.inf.st.mbt.functions.ReferenceFunction;
import org.tud.inf.st.mbt.functions.SubClassFunction;
import org.tud.inf.st.mbt.functions.TimeFunction;
import org.tud.inf.st.mbt.functions.TokenFunction;
import org.tud.inf.st.mbt.functions.UnaryFunction;
import org.tud.inf.st.mbt.functions.ValueCase;
import org.tud.inf.st.mbt.functions.ValueCaseFunction;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.rules.And;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.BagElementAssignedAtom;
import org.tud.inf.st.mbt.rules.BinaryOperator;
import org.tud.inf.st.mbt.rules.ConfigurationAtom;
import org.tud.inf.st.mbt.rules.ContextEntry;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.FeatureAtom;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.ITimeConsumer;
import org.tud.inf.st.mbt.rules.Implication;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Or;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RealTimeAtom;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.TimeAtom;
import org.tud.inf.st.mbt.rules.TokenAtom;
import org.tud.inf.st.mbt.rules.UnaryOperator;
import org.tud.inf.st.mbt.rules.Xor;
import org.tud.inf.st.mbt.terms.BoolTerm;
import org.tud.inf.st.mbt.terms.FloatTerm;
import org.tud.inf.st.mbt.terms.FunctionTerm;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.IntegerTerm;
import org.tud.inf.st.mbt.terms.ListTerm;
import org.tud.inf.st.mbt.terms.LongTerm;
import org.tud.inf.st.mbt.terms.ReferenceTerm;
import org.tud.inf.st.mbt.terms.StringTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.terms.TermVariable;
import org.tud.inf.st.mbt.terms.TermsFactory;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Place;

public class ModelUtil {
	public static final ActionsFactory aFactory = ActionsFactory.eINSTANCE;
	public static final TermsFactory termsFactory = TermsFactory.eINSTANCE;
	public static final FeaturesFactory fFactory = FeaturesFactory.eINSTANCE;
	public static final RulesFactory rFactory = RulesFactory.eINSTANCE;
	public static final FeaturetreeFactory tFactory = FeaturetreeFactory.eINSTANCE;
	public static final TestFactory testFactory = TestFactory.eINSTANCE;
	public static final DataFactory dFactory = DataFactory.eINSTANCE;

	public static IFeature feature(String id) {
		Feature f = fFactory.createFeature();
		f.setId(id);
		return f;
	}

	public static Collection<IFeature> features(String... fids) {
		Set<IFeature> result = new HashSet<>();
		for (String fid : fids) {
			Feature f = fFactory.createFeature();
			f.setId(fid);
			result.add(f);
		}
		return result;
	}

	@SafeVarargs
	public static Collection<IFeature> union(Collection<IFeature>... sets) {
		Set<IFeature> result = new HashSet<>();
		for (Collection<IFeature> fs : sets)
			result.addAll(fs);
		return result;
	}

	public static TreeFeature tFeature(String id, TreeFeature... children) {
		TreeFeature f = tFactory.createTreeFeature();
		f.setId(id);
		f.getChildren().addAll(Arrays.asList(children));
		return f;
	}

	public static BoolDataValue value(boolean e) {
		BoolDataValue v = dFactory.createBoolDataValue();
		v.setValue(e);
		return v;
	}

	public static IntDataValue value(int e) {
		IntDataValue v = dFactory.createIntDataValue();
		v.setValue(e);
		return v;
	}

	public static LongDataValue value(long e) {
		LongDataValue v = dFactory.createLongDataValue();
		v.setValue(e);
		return v;
	}

	public static FloatDataValue value(float e) {
		FloatDataValue v = dFactory.createFloatDataValue();
		v.setValue(e);
		return v;
	}

	public static Term value2Term(TypedDataElement e) {
		if (e instanceof IntDataValue) {
			IntegerTerm t = termsFactory.createIntegerTerm();
			t.setValue(((IntDataValue) e).getValue());
			return t;
		}
		if (e instanceof FloatDataValue) {
			FloatTerm t = termsFactory.createFloatTerm();
			t.setValue(((FloatDataValue) e).getValue());
			return t;
		}
		if (e instanceof LongDataValue) {
			LongTerm t = termsFactory.createLongTerm();
			t.setValue(((LongDataValue) e).getValue());
			return t;
		}
		if (e instanceof BoolDataValue) {
			BoolTerm t = termsFactory.createBoolTerm();
			t.setValue(((BoolDataValue) e).isValue());
			return t;
		}

		return null;
	}

	public static Object getValue(Data d) {
		DataElement e = d.getBindings().get(0).getValue();
		if (e instanceof IntDataValue)
			return (Integer) ((IntDataValue) e).getValue();
		if (e instanceof LongDataValue)
			return (Long) ((LongDataValue) e).getValue();
		if (e instanceof FloatDataValue)
			return (Float) ((FloatDataValue) e).getValue();
		if (e instanceof BoolDataValue)
			return (Boolean) ((BoolDataValue) e).isValue();

		return null;
	}

	public static Set<Atom> atoms(IFeature f) {
		Set<Atom> ps = new HashSet<>();

		if (f instanceof FeatureReference) {
			if (((FeatureReference) f).getVersion() == null) {
				f = ((FeatureReference) f).getFeature();
			} else {
				FeatureAtom a = rFactory.createFeatureAtom();
				a.setFeature(((FeatureReference) f).getFeature());
				a.setVersion(((FeatureReference) f).getVersion());
				ps.add(a);
				return ps;
			}
		}

		if (f instanceof Feature && !((Feature) f).getVersions().isEmpty()) {
			for (FeatureVersion v : ((Feature) f).getVersions()) {
				FeatureAtom a = rFactory.createFeatureAtom();
				a.setFeature(f);
				a.setVersion(v);
				ps.add(a);
			}
		}
		if (f instanceof Feature) {
			FeatureAtom a = rFactory.createFeatureAtom();
			a.setFeature(f);
			ps.add(a);
		}
		return ps;
	}

	public static FeatureAtom atom(IFeature f, FeatureVersion v) {
		FeatureAtom a = rFactory.createFeatureAtom();
		a.setFeature(f);
		a.setVersion(v);
		return a;
	}

	public static LogicFunctionAtom atom(ILogicFunction lf) {
		LogicFunctionAtom a = rFactory.createLogicFunctionAtom();
		a.setFunction(lf);
		return a;
	}

	public static RealTimeAtom atom(IRealTimeConsumer c, long time) {
		RealTimeAtom a = rFactory.createRealTimeAtom();
		a.setConsumer(c);
		a.setTime(time);
		return a;
	}

	public static TimeAtom atom(ITimeConsumer consumer, int t) {
		TimeAtom a = rFactory.createTimeAtom();
		a.setConsumer(consumer);
		a.setTime(t);
		return a;
	}

	public static ConfigurationAtom atom(ConfigurationNode pc) {
		ConfigurationAtom a = rFactory.createConfigurationAtom();
		a.setConfiguration(pc);
		return a;
	}

	public static InstructionPointerAtom atom(PreGenerationSequence s, int i) {
		InstructionPointerAtom a = rFactory.createInstructionPointerAtom();
		a.setInstruction(i);
		a.setSequence(s);
		return a;
	}

	public static DataAtom atom(DataLeaf leaf, DataElement e) {
		DataAtom a = rFactory.createDataAtom();
		a.setLeaf(leaf);
		a.setValue(e);
		return a;
	}

	public static TokenAtom atom(Place p, int count) {
		TokenAtom a = rFactory.createTokenAtom();
		a.setCount(count);
		a.setPlace(p);
		return a;
	}

	public static TokenAtom atom(Place p, int count,Collection<PageTransition> instance) {
		TokenAtom a = rFactory.createTokenAtom();
		a.setCount(count);
		a.setPlace(p);
		if(instance!=null){
			a.getInstancePath().clear();
			a.getInstancePath().addAll(instance);
		}
		return a;
	}
	
	public static BagElementAssignedAtom atom(DataBag b, int idx) {
		BagElementAssignedAtom a = rFactory.createBagElementAssignedAtom();
		a.setBag(b);
		a.setIdx(idx);
		return a;
	}

	public static Predicate and(Predicate a, Predicate b) {
		And and = rFactory.createAnd();
		and.setOperand1(a);
		and.setOperand2(b);
		return and;
	}

	public static Predicate or(Predicate a, Predicate b) {
		Or or = rFactory.createOr();
		or.setOperand1(a);
		or.setOperand2(b);
		return or;
	}

	public static Predicate xor(Predicate a, Predicate b) {
		Xor xor = rFactory.createXor();
		xor.setOperand1(a);
		xor.setOperand2(b);
		return xor;
	}

	public static Predicate impl(Predicate a, Predicate b) {
		Implication impl = rFactory.createImplication();
		impl.setOperand1(a);
		impl.setOperand2(b);
		return impl;
	}

	public static Predicate not(Predicate a) {
		Not not = rFactory.createNot();
		not.setOperand(a);
		return not;
	}

	public static TestStep step(Term t, String note) {
		TestStep s = testFactory.createTestStep();
		TermAction a = aFactory.createTermAction();
		a.setTerm(t);
		s.setAction(a);
		s.setNote(note);
		return s;
	}

	public static Set<DataElement> getAllLowerElements(DataElement root) {
		Set<DataElement> des = new HashSet<>();
		des.add(root);
		if (root instanceof DataClass) {
			for (DataElement e : ((DataClass) root).getChildren())
				des.addAll(getAllLowerElements(e));
		}
		return des;
	}

	public static Set<DataElement> getAllLeafElements(DataElement root) {
		Set<DataElement> des = new HashSet<>();

		if (root instanceof DataClass) {
			if (((DataClass) root).getChildren().isEmpty())
				des.add(root);
			else {
				for (DataElement e : ((DataClass) root).getChildren())
					des.addAll(getAllLeafElements(e));
			}
		} else
			des.add(root);

		return des;
	}

	public static Set<DataElement> getAllUpperElements(DataElement e) {
		Set<DataElement> des = new HashSet<>();
		des.add(e);
		while (e.eContainer() != null && e.eContainer() instanceof DataElement) {
			e = (DataElement) e.eContainer();
			des.add(e);
		}
		return des;
	}

	public static Set<DataLeaf> getAllLeafs(DataStructureNode node) {
		Set<DataLeaf> leafs = new HashSet<DataLeaf>();
		if (node instanceof DataLeaf)
			leafs.add((DataLeaf) node);
		else if (node instanceof DataStructure) {
			for (DataStructureNode c : ((DataStructure) node).getChildren())
				leafs.addAll(getAllLeafs(c));
		} else if (node instanceof DataBag) {
			((DataBag) node).organize();
			for (DataStructureNode e : ((DataBag) node).getGeneratedElements())
				leafs.addAll(getAllLeafs(e));
		}
		return leafs;
	}

	public static int hashCode(Predicate p) {
		try {
			int hc = p.getClass().hashCode();
			if (p instanceof UnaryOperator) {
				hc += hashCode(((UnaryOperator) p).getOperand());
			} else if (p instanceof BinaryOperator) {
				hc += hashCode(((BinaryOperator) p).getOperand1());
				hc += 1 + hashCode(((BinaryOperator) p).getOperand2());
			} else if (p instanceof FeatureAtom) {
				hc += ((FeatureAtom) p).getFeature().hashCode();
				if (((FeatureAtom) p).getVersion() != null)
					hc += ((FeatureAtom) p).getVersion().hashCode();
			} else if (p instanceof DataAtom) {
				hc += ((DataAtom) p).getLeaf().hashCode();
				hc += ((DataAtom) p).getValue().hashCode();
			} else if (p instanceof LogicFunctionAtom) {
				hc += hashCode(((LogicFunctionAtom) p).getFunction());
			} else if (p instanceof TokenAtom) {
				hc += ((TokenAtom) p).getPlace().hashCode();
				hc *= ((TokenAtom) p).getCount()+1;
				for(PageTransition pt:((TokenAtom) p).getInstancePath())hc+=pt.hashCode();
			} else if (p instanceof ConfigurationAtom) {
				hc += ((ConfigurationAtom) p).getConfiguration().hashCode();
			} else if (p instanceof InstructionPointerAtom) {
				hc += Math
						.pow(((InstructionPointerAtom) p).getInstruction(), 2);
				hc += ((InstructionPointerAtom) p).getSequence().hashCode();
				for (ContextEntry ce : ((InstructionPointerAtom) p)
						.getContext()) {
					hc += ce.getId().hashCode() * ce.getValue().hashCode();
				}
				for(PageTransition pt:((InstructionPointerAtom) p).getInstancePath())hc+=pt.hashCode();
			} else if (p instanceof TimeAtom) {
				hc += Math.pow(((TimeAtom) p).getTime(), 2);
				hc += ((TimeAtom) p).getConsumer().hashCode();
			} else if (p instanceof RealTimeAtom) {
				hc += Long.valueOf(((RealTimeAtom) p).getTime()).hashCode();
				hc += ((RealTimeAtom) p).getConsumer().hashCode();
				for(PageTransition pt:((RealTimeAtom) p).getInstancePath())hc+=pt.hashCode();
			} else if (p instanceof BagElementAssignedAtom) {
				hc += ((BagElementAssignedAtom) p).getIdx();
				hc += ((BagElementAssignedAtom) p).getBag().hashCode();
			}
			return hc;

		} catch (NullPointerException npe) {
			throw new RuntimeException("" + p, npe);
		}
	}

	public static int hashCode(IFunction f) {
		if (f instanceof IContextVariable || f instanceof ReferenceFunction)
			throw new UnsupportedOperationException(
					"Non-finalized function cannot be hashed: " + f);
		int hc = f.getClass().hashCode();
		if (f instanceof ArithmetricLogicBinaryFunction) {
			hc += hashCode(((ArithmetricLogicBinaryFunction) f).getLeft());
			hc += 1 + hashCode(((ArithmetricLogicBinaryFunction) f).getRight());
		} else if (f instanceof SubClassFunction) {
			hc += hashCode(((SubClassFunction) f).getSub());
			hc += 1 + hashCode(((SubClassFunction) f).getIn());
		} else if (f instanceof IntFunction)
			hc += ((IntFunction) f).getValue();
		else if (f instanceof LongFunction)
			hc += ((LongFunction) f).getValue();
		else if (f instanceof FloatFunction)
			hc += ((FloatFunction) f).getValue();
		else if (f instanceof BinaryFunction) {
			hc += hashCode(((BinaryFunction) f).getLeft());
			hc += 1 + hashCode((((BinaryFunction) f).getRight()));
		} else if (f instanceof UnaryFunction) {
			hc += hashCode(((UnaryFunction) f).getOperand());
		} else if (f instanceof TokenFunction) {
			hc += ((TokenFunction) f).getPlace().hashCode();
		} else if (f instanceof TimeFunction) {
			hc += ((TimeFunction) f).getConsumer().hashCode();
		} else if (f instanceof BagSizeFunction) {
			hc += ((BagSizeFunction) f).getBag().hashCode();
		} else if (f instanceof BagCountFunction) {
			hc += ((BagCountFunction) f).getBag().hashCode();
			hc += hashCode(((BagCountFunction) f).getNeedle());
		} else if (f instanceof BagIdxFunction) {
			hc += ((BagIdxFunction) f).getBag().hashCode();
			hc += hashCode(((BagIdxFunction) f).getNeedle());
		} else if (f instanceof BagFirstFreeFunction) {
			hc += ((BagFirstFreeFunction) f).getBag().hashCode();
		} else if (f instanceof BagNextFunction) {
			hc += ((BagNextFunction) f).getBag().hashCode();
		} else if (f instanceof DataNodeFunction) {
			hc += ((DataNodeFunction) f).getData().hashCode();
		} else if (f instanceof DataNodeValueFunction) {
			hc += hashCode(((DataNodeValueFunction) f).getNode());
		} else if (f instanceof DataValueFunction) {
			hc += ((DataValueFunction) f).getValue().hashCode();
		} else if (f instanceof BagElementFunction) {
			hc += ((BagElementFunction) f).getData().hashCode();
			hc += hashCode(((BagElementFunction) f).getIdx());
		} else if (f instanceof ArithmetricCaseFunction) {
			int i = 0;
			for (ArithmetricCase c : ((ArithmetricCaseFunction) f).getCases()) {
				hc += i + hashCode(c.getCondition()) * hashCode(c.getThen());
				i++;
			}
		} else if (f instanceof ValueCaseFunction) {
			int i = 0;
			for (ValueCase c : ((ValueCaseFunction) f).getCases()) {
				hc += i + hashCode(c.getCondition()) * hashCode(c.getThen());
				i++;
			}
		} else if (f instanceof DataNodeCaseFunction) {
			int i = 0;
			for (DataNodeCase c : ((DataNodeCaseFunction) f).getCases()) {
				hc += i + hashCode(c.getCondition()) * hashCode(c.getThen());
				i++;
			}
		}

		return hc;
	}

	public static int hashCode(Term t) {
		if (t instanceof TermVariable)
			throw new UnsupportedOperationException(
					"Cannot hash non-finalized term: " + t);

		int hc = t.getClass().hashCode();

		if (t instanceof FloatTerm)
			hc += ((FloatTerm) t).getValue();
		else if (t instanceof IntegerTerm)
			hc += ((IntegerTerm) t).getValue();
		else if (t instanceof LongTerm)
			hc += ((LongTerm) t).getValue();
		else if (t instanceof FunctionTerm)
			hc += hashCode(((FunctionTerm) t).getFunction());
		else if (t instanceof ReferenceTerm)
			hc += ((ReferenceTerm) t).getReference().hashCode();
		else if (t instanceof StringTerm)
			hc += ((StringTerm) t).getValue().hashCode();
		else if (t instanceof FunctorTerm) {
			hc += ((FunctorTerm) t).getFunctor().hashCode();
			int i = 0;
			for (Term arg : ((FunctorTerm) t).getArguments())
				hc += (i++) + hashCode(arg);
		} else if (t instanceof ListTerm) {
			int i = 0;
			for (Term e : ((ListTerm) t).getElements())
				hc += (i++) + hashCode(e);
		}

		return hc;
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(Object o, Class<T> type,
			boolean withCrossRefs) {
		if (o instanceof ResourceSet)
			return getAllEObjectsOfSuperType((ResourceSet) o, type,
					withCrossRefs);
		if (o instanceof Resource)
			return getAllEObjectsOfSuperType((Resource) o, type, withCrossRefs);
		if (o instanceof EObject)
			return getAllEObjectsOfSuperType((EObject) o, type, withCrossRefs);

		return null;
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(ResourceSet rs,
			Class<T> type) {
		return getAllEObjectsOfSuperType(rs, type, true);
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(ResourceSet rs,
			Class<T> type, boolean withCrossRefs) {
		Set<T> out = new HashSet<>();

		for (Resource r : rs.getResources()) {
			out.addAll(getAllEObjectsOfSuperType(r, type, withCrossRefs));
		}
		return out;
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(Resource r, Class<T> type) {
		return getAllEObjectsOfSuperType(r, type, true);
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(Resource r,
			Class<T> type, boolean withCrossRefs) {
		Set<T> out = new HashSet<>();

		for (EObject eo : r.getContents())
			out.addAll(getAllEObjectsOfSuperType(eo, type, withCrossRefs));

		return out;
	}

	public static <T> Set<T> getAllEObjectsOfSuperType(EObject root,
			Class<T> type) {
		return getAllEObjectsOfSuperType(root, type, true);
	}

	@SuppressWarnings("unchecked")
	public static <T> Set<T> getAllEObjectsOfSuperType(EObject root,
			Class<T> type, boolean withCrossRefs) {
		Set<T> out = new HashSet<>();

		if (root != null) {
			Queue<EObject> queue = new LinkedList<EObject>();
			queue.add(root);

			while (!queue.isEmpty()) {
				EObject head = queue.poll();
				if (type.isAssignableFrom(head.getClass())) {
					out.add((T) head);
				}
				queue.addAll(head.eContents());
				if (withCrossRefs)
					queue.addAll(head.eCrossReferences());
			}
		}

		return out;
	}

	public static String getVariableID(IContextVariable v) {
		if (v instanceof TermVariable)
			return ((TermVariable) v).getId();
		else if (v instanceof FunctionVariable)
			return ((FunctionVariable) v).getId();
		else
			throw new UnsupportedOperationException("ModelUtil.getVariableID("
					+ v.eClass() + ")");
	}

	public static void setContext(InstructionPointerAtom ipa,
			Map<String, Object> context) {
		ipa.getContext().clear();
		for (Entry<String, Object> e : context.entrySet()) {
			EObject eo = (EObject) e.getValue();
			ContextEntry ce = rFactory.createContextEntry();
			ce.setId(e.getKey());
			ce.setValue(eo);
			ipa.getContext().add(ce);
		}
	}

	public static Map<String, Object> getContext(InstructionPointerAtom ipa) {
		Map<String, Object> context = new HashMap<String, Object>();
		for (ContextEntry ce : ipa.getContext())
			context.put(ce.getId(), ce.getValue());
		return context;
	}

	public static TermAction functorAction(String functor,
			Object... args) {
		TermAction a = ActionsFactory.eINSTANCE.createTermAction();
		FunctorTerm ft = TermsFactory.eINSTANCE.createFunctorTerm();
		ft.setFunctor(functor);
		for (Object arg : args) {
			if (arg instanceof String) {
				StringTerm st = TermsFactory.eINSTANCE.createStringTerm();
				st.setValue((String) arg);
				ft.getArguments().add(st);
			} else if (arg instanceof Integer) {
				IntegerTerm it = TermsFactory.eINSTANCE.createIntegerTerm();
				it.setValue((int) arg);
				ft.getArguments().add(it);
			} else if (arg instanceof Float || arg instanceof Double) {
				FloatTerm flt = TermsFactory.eINSTANCE.createFloatTerm();
				flt.setValue(Float.parseFloat(arg + ""));
				ft.getArguments().add(flt);
			} else if (arg instanceof Long) {
				LongTerm lt = TermsFactory.eINSTANCE.createLongTerm();
				lt.setValue((long) arg);
				ft.getArguments().add(lt);
			}
		}
		a.setTerm(ft);
		return a;
	}

	public static int countSteps(List<TestExecutable> executables) {
		int steps = 0;
		for (TestExecutable e : executables)
			steps += countSteps(e);
		return steps;
	}

	public static int countSteps(TestExecutable executable) {
		if (executable instanceof TestStep || executable instanceof TestStepRun)return 1;
		if(executable instanceof TestCase)return ((TestCase) executable).getSteps().size();
		if(executable instanceof TestRun)return ((TestRun) executable).getStepRuns().size();
		if(executable instanceof TestSuite){
			int i =0;
			for(TestCase c:((TestSuite) executable).getCases())
				i+= countSteps(c);
			return i;
		}
		if(executable instanceof TestReport){
			int i =0;
			for(TestRun c:((TestReport) executable).getRuns())
				i+= countSteps(c);
			return i;
		}
		return 0;
	}
	
	public static boolean collectionEquals(Collection<?> a,Collection<?> b){
		if(a == null && b!=null)return false;
		if(a!=null && b==null)return false;
		if(a.size()!=b.size())return false;
		
		Object[] aArr = a.toArray();
		Object[] bArr = b.toArray();
		
		for(int i=0;i<a.size();i++)
			if(!aArr[i].equals(bArr[i]))return false;
		
		return true;					
	}

}
