/**
 */
package org.tud.inf.st.mbt.rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch =
		new RulesSwitch<Adapter>() {
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseSubPredicate(SubPredicate object) {
				return createSubPredicateAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseReasonableAtom(ReasonableAtom object) {
				return createReasonableAtomAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object) {
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseTrue(True object) {
				return createTrueAdapter();
			}
			@Override
			public Adapter caseFeatureAtom(FeatureAtom object) {
				return createFeatureAtomAdapter();
			}
			@Override
			public Adapter caseDataAtom(DataAtom object) {
				return createDataAtomAdapter();
			}
			@Override
			public Adapter caseLogicFunctionAtom(LogicFunctionAtom object) {
				return createLogicFunctionAtomAdapter();
			}
			@Override
			public Adapter caseTokenAtom(TokenAtom object) {
				return createTokenAtomAdapter();
			}
			@Override
			public Adapter caseInstructionPointerAtom(InstructionPointerAtom object) {
				return createInstructionPointerAtomAdapter();
			}
			@Override
			public Adapter caseConfigurationAtom(ConfigurationAtom object) {
				return createConfigurationAtomAdapter();
			}
			@Override
			public Adapter caseBagElementAssignedAtom(BagElementAssignedAtom object) {
				return createBagElementAssignedAtomAdapter();
			}
			@Override
			public Adapter caseITimeConsumer(ITimeConsumer object) {
				return createITimeConsumerAdapter();
			}
			@Override
			public Adapter caseTimeAtom(TimeAtom object) {
				return createTimeAtomAdapter();
			}
			@Override
			public Adapter caseIRealTimeConsumer(IRealTimeConsumer object) {
				return createIRealTimeConsumerAdapter();
			}
			@Override
			public Adapter caseRealTimeAtom(RealTimeAtom object) {
				return createRealTimeAtomAdapter();
			}
			@Override
			public Adapter caseContextEntry(ContextEntry object) {
				return createContextEntryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.SubPredicate <em>Sub Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.SubPredicate
	 * @generated
	 */
	public Adapter createSubPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.FeatureAtom <em>Feature Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.FeatureAtom
	 * @generated
	 */
	public Adapter createFeatureAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.True
	 * @generated
	 */
	public Adapter createTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.DataAtom <em>Data Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.DataAtom
	 * @generated
	 */
	public Adapter createDataAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.LogicFunctionAtom <em>Logic Function Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.LogicFunctionAtom
	 * @generated
	 */
	public Adapter createLogicFunctionAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom <em>Bag Element Assigned Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.BagElementAssignedAtom
	 * @generated
	 */
	public Adapter createBagElementAssignedAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.ContextEntry <em>Context Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.ContextEntry
	 * @generated
	 */
	public Adapter createContextEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.ReasonableAtom <em>Reasonable Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.ReasonableAtom
	 * @generated
	 */
	public Adapter createReasonableAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.TokenAtom <em>Token Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.TokenAtom
	 * @generated
	 */
	public Adapter createTokenAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom <em>Instruction Pointer Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom
	 * @generated
	 */
	public Adapter createInstructionPointerAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.TimeAtom <em>Time Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.TimeAtom
	 * @generated
	 */
	public Adapter createTimeAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.IRealTimeConsumer <em>IReal Time Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.IRealTimeConsumer
	 * @generated
	 */
	public Adapter createIRealTimeConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.RealTimeAtom <em>Real Time Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.RealTimeAtom
	 * @generated
	 */
	public Adapter createRealTimeAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.ITimeConsumer <em>ITime Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.ITimeConsumer
	 * @generated
	 */
	public Adapter createITimeConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.ConfigurationAtom <em>Configuration Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.ConfigurationAtom
	 * @generated
	 */
	public Adapter createConfigurationAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
