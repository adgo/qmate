package org.tud.inf.st.mbt.emf.transformations;

import static org.eclipse.emf.ecore.util.EcoreUtil.copy;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.atoms;
import static org.tud.inf.st.mbt.emf.util.ModelUtil.not;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.emf.util.FunctionProcessor;
import org.tud.inf.st.mbt.features.ExplicitSet;
import org.tud.inf.st.mbt.features.FeatureReference;
import org.tud.inf.st.mbt.features.FeatureSet;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.features.IFeatureDomain;
import org.tud.inf.st.mbt.features.Intersection;
import org.tud.inf.st.mbt.features.SetReference;
import org.tud.inf.st.mbt.features.StandaloneFeatureSet;
import org.tud.inf.st.mbt.features.SubSet;
import org.tud.inf.st.mbt.features.Union;
import org.tud.inf.st.mbt.features.Without;
import org.tud.inf.st.mbt.featuretree.FeatureTree;
import org.tud.inf.st.mbt.featuretree.TreeFeature;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.rules.And;
import org.tud.inf.st.mbt.rules.BinaryOperator;
import org.tud.inf.st.mbt.rules.FeatureAtom;
import org.tud.inf.st.mbt.rules.Implication;
import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Or;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.SubPredicate;
import org.tud.inf.st.mbt.rules.Xor;

public class Model2Logic {
	private static final RulesFactory rFactory = RulesFactory.eINSTANCE;

	/**
	 * transform a feature tree to a predicate
	 */
	private static Predicate transform(FeatureTree tree) {
		if (tree.getRoot() == null)
			return not(rFactory.createTrue());
		else {
			Predicate pred = null;
			Predicate root = xorWisePredicates(atoms(tree.getRoot()));
			if (tree.getRoot().getChildren().isEmpty())
				pred = root;
			else
				pred = transform(root, tree.getRoot().getChildren());

			if (!tree.getRoot().isMandatory()) {
				Or or = rFactory.createOr();
				or.setOperand1(pred);
				or.setOperand2(rFactory.createTrue());
				pred = or;
			}

			return pred;
		}
	}

	private static Set<IFeature> getFeatures(FeatureTree tree) {
		Set<IFeature> features = new HashSet<>();
		Iterator<EObject> i = tree.eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			if (next instanceof IFeature) {
				features.add((IFeature) next);
			}
		}
		return features;
	}

	private static Predicate transform(Predicate condition,
			Collection<TreeFeature> features) {
		Set<Predicate> mandatory = new HashSet<>();
		for (TreeFeature tf : features) {
			if (tf.isMandatory())
				mandatory.add(xorWisePredicates(atoms(tf)));
		}
		Predicate mandatoryPred = andWisePredicates(mandatory);

		Set<Predicate> preds = new HashSet<>();

		Implication topDown = rFactory.createImplication();
		topDown.setOperand1(copy(condition));
		topDown.setOperand2(mandatoryPred);

		preds.add(topDown);

		for (TreeFeature f : features) {
			FeatureAtom fa = rFactory.createFeatureAtom();
			fa.setFeature(f);
			Implication impl = rFactory.createImplication();
			impl.setOperand1(fa);
			impl.setOperand2(xorWisePredicates(atoms((IFeature) f.eContainer())));
			preds.add(impl);
			if (!f.getChildren().isEmpty()) {
				fa = rFactory.createFeatureAtom();
				fa.setFeature(f);
				preds.add(transform(fa, f.getChildren()));
			}
		}

		return andWisePredicates(preds);
	}

	@SuppressWarnings("unused")
	private static Predicate xorWiseSet(Set<Set<Object>> subSets,
			Collection<Object> base) {
		if (subSets.isEmpty()) {
			Not not = rFactory.createNot();
			not.setOperand(rFactory.createTrue());
			return not;
		}

		Set<Object> conjunct = subSets.iterator().next();

		Set<Set<Object>> left = new HashSet<>(subSets);
		left.remove(conjunct);

		Set<Object> exclude = new HashSet<>(base);
		exclude.removeAll(conjunct);

		And and = rFactory.createAnd();
		and.setOperand1(andWiseSet(conjunct, base));
		and.setOperand2(andNotWiseSet(exclude));

		Xor or = rFactory.createXor();
		or.setOperand1(and);
		or.setOperand2(xorWiseSet(left, base));

		return or;
	}

	private static Predicate andWisePredicates(Set<Predicate> preds) {
		if (preds.isEmpty())
			return rFactory.createTrue();
		And and = rFactory.createAnd();
		and.setOperand1(preds.iterator().next());

		Set<Predicate> left = new HashSet<>(preds);
		left.remove(and.getOperand1());

		and.setOperand2(andWisePredicates(left));
		return and;
	}

	private static Predicate xorWisePredicates(Set<? extends Predicate> preds) {
		if (preds.isEmpty()) {
			Not not = rFactory.createNot();
			not.setOperand(rFactory.createTrue());
			return not;
		}
		Xor xor = rFactory.createXor();
		xor.setOperand1(preds.iterator().next());

		Set<Predicate> left = new HashSet<>(preds);
		left.remove(xor.getOperand1());

		xor.setOperand2(xorWisePredicates(left));
		return xor;
	}

	private static Predicate andNotWiseSet(Collection<Object> base) {
		if (base.isEmpty())
			return rFactory.createTrue();

		IFeature f = (IFeature) base.iterator().next();
		FeatureAtom fa = rFactory.createFeatureAtom();
		fa.setFeature(f);
		Not not = rFactory.createNot();
		not.setOperand(fa);

		Set<Object> left = new HashSet<>(base);
		left.remove(f);

		And and = rFactory.createAnd();
		and.setOperand1(not);
		and.setOperand2(andNotWiseSet(left));

		return and;
	}

	private static Predicate andWiseSet(Set<Object> atomFeatures,
			Collection<Object> base) {
		if (atomFeatures.isEmpty())
			return rFactory.createTrue();

		IFeature f = (IFeature) atomFeatures.iterator().next();
		FeatureAtom fa = rFactory.createFeatureAtom();
		fa.setFeature(f);

		And and = rFactory.createAnd();
		and.setOperand1(fa);

		Set<Object> left = new HashSet<>(atomFeatures);
		left.remove(f);
		and.setOperand2(andWiseSet(left, base));

		return and;
	}

	/**
	 * resolves a feature domain to a real set of features
	 */
	private static Set<IFeature> normalize(IFeatureDomain domain) {
		if (domain instanceof FeatureTree) {
			return getFeatures((FeatureTree) domain);
		} else if (domain instanceof StandaloneFeatureSet) {
			return normalize(((StandaloneFeatureSet) domain).getFeatures());
		}

		else
			return Collections.emptySet();
	}

	/**
	 * resolves set predicates to a real set of features
	 */
	private static Set<IFeature> normalize(FeatureSet featureSet) {
		Set<IFeature> tempResult = new HashSet<>();
		if (featureSet instanceof ExplicitSet) {
			tempResult.addAll(copy(((ExplicitSet) featureSet)).getFeatures());
		} else if (featureSet instanceof SetReference) {
			tempResult.addAll(normalize(((SetReference) featureSet)
					.getFeatures()));
		} else if (featureSet instanceof Intersection) {
			Set<IFeature> fsa = normalize(((Intersection) featureSet)
					.getOperand1());
			Set<IFeature> fsb = normalize(((Intersection) featureSet)
					.getOperand2());
			for (IFeature f : fsa)
				if (fsb.contains(f))
					tempResult.add(f);
		} else if (featureSet instanceof Union) {
			Set<IFeature> fsa = normalize(((Union) featureSet).getOperand1());
			Set<IFeature> fsb = normalize(((Union) featureSet).getOperand2());
			tempResult.addAll(fsa);
			tempResult.addAll(fsb);
		} else if (featureSet instanceof SetReference) {
			tempResult.addAll(normalize(((SetReference) featureSet)
					.getFeatures()));
		} else if (featureSet instanceof SubSet) {
			tempResult.addAll(normalize(((SubSet) featureSet).getOperand()));
		} else if (featureSet instanceof Without) {
			Set<IFeature> fsa = normalize(((Without) featureSet).getOperand1());
			Set<IFeature> fsb = normalize(((Without) featureSet).getOperand2());
			fsa.removeAll(fsb);
			tempResult.addAll(fsa);
		}
		Set<IFeature> features = new HashSet<>();
		for (IFeature f : tempResult) {
			if (f instanceof FeatureReference) {
				features.add(((FeatureReference) f).getFeature());
			} else {
				features.add(f);
			}
		}
		return features;
	}

	public static Predicate normalize(FeatureTree tree,
			Collection<IFeature> base) {
		return normalize(transform(tree), base, new HashMap<String, Object>());
	}

	/**
	 * breaks down all predicates to a and-or-not logic
	 */
	public static Predicate normalize(Predicate pred,
			Collection<IFeature> base, Map<String, Object> context) {
		if (pred instanceof Implication) {
			Or or = rFactory.createOr();
			And and = rFactory.createAnd();
			and.setOperand1(normalize(((BinaryOperator) pred).getOperand1(),
					base, context));
			and.setOperand2(normalize(((BinaryOperator) pred).getOperand2(),
					base, context));
			or.setOperand1(and);
			or.setOperand2(not(normalize(((BinaryOperator) pred).getOperand1(),
					base, context)));
			return or;
		}
		if (pred instanceof SubPredicate) {
			return normalize(((SubPredicate) pred).getOperand(), base, context);
		}
		if (pred instanceof Xor) {
			And and1 = rFactory.createAnd();
			and1.setOperand1(normalize(((BinaryOperator) pred).getOperand1(),
					base, context));
			Not not1 = rFactory.createNot();
			not1.setOperand(normalize(((BinaryOperator) pred).getOperand2(),
					base, context));
			and1.setOperand2(not1);

			And and2 = rFactory.createAnd();
			and2.setOperand1(normalize(((BinaryOperator) pred).getOperand2(),
					base, context));
			Not not2 = rFactory.createNot();
			not2.setOperand(normalize(((BinaryOperator) pred).getOperand1(),
					base, context));
			and2.setOperand2(not2);

			Or or = rFactory.createOr();
			or.setOperand1(and1);
			or.setOperand2(and2);
			return or;
		}
		if (pred instanceof Not) {
			Not not = rFactory.createNot();
			not.setOperand(normalize(((Not) pred).getOperand(), base, context));
			return not;
		}
		if (pred instanceof BinaryOperator) {
			BinaryOperator bin = (BinaryOperator) copy(pred);
			bin.setOperand1(normalize(bin.getOperand1(), base, context));
			bin.setOperand2(normalize(bin.getOperand2(), base, context));
			return bin;
		}
		if (pred instanceof LogicFunctionAtom) {
			LogicFunctionAtom f = rFactory.createLogicFunctionAtom();
			f.setFunction((ILogicFunction) FunctionProcessor.normalize(
					((LogicFunctionAtom) pred).getFunction(), base, context));
			return f;
		}

		return copy(pred);
	}
}
