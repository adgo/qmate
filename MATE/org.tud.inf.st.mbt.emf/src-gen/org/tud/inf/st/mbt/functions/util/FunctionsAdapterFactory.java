/**
 */
package org.tud.inf.st.mbt.functions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.functions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage
 * @generated
 */
public class FunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FunctionsPackage.eINSTANCE;
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
	protected FunctionsSwitch<Adapter> modelSwitch =
		new FunctionsSwitch<Adapter>() {
			@Override
			public Adapter caseIFunction(IFunction object) {
				return createIFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionVariable(FunctionVariable object) {
				return createFunctionVariableAdapter();
			}
			@Override
			public Adapter caseReferenceFunction(ReferenceFunction object) {
				return createReferenceFunctionAdapter();
			}
			@Override
			public Adapter caseStandAloneFunction(StandAloneFunction object) {
				return createStandAloneFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricStandAloneFunction(ArithmetricStandAloneFunction object) {
				return createArithmetricStandAloneFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricReferenceFunction(ArithmetricReferenceFunction object) {
				return createArithmetricReferenceFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricFunctionVariable(ArithmetricFunctionVariable object) {
				return createArithmetricFunctionVariableAdapter();
			}
			@Override
			public Adapter caseDataNodeStandAloneFunction(DataNodeStandAloneFunction object) {
				return createDataNodeStandAloneFunctionAdapter();
			}
			@Override
			public Adapter caseDataNodeReferenceFunction(DataNodeReferenceFunction object) {
				return createDataNodeReferenceFunctionAdapter();
			}
			@Override
			public Adapter caseDataNodeFunctionVariable(DataNodeFunctionVariable object) {
				return createDataNodeFunctionVariableAdapter();
			}
			@Override
			public Adapter caseValueStandAloneFunction(ValueStandAloneFunction object) {
				return createValueStandAloneFunctionAdapter();
			}
			@Override
			public Adapter caseValueReferenceFunction(ValueReferenceFunction object) {
				return createValueReferenceFunctionAdapter();
			}
			@Override
			public Adapter caseValueFunctionVariable(ValueFunctionVariable object) {
				return createValueFunctionVariableAdapter();
			}
			@Override
			public Adapter caseLogicStandAloneFunction(LogicStandAloneFunction object) {
				return createLogicStandAloneFunctionAdapter();
			}
			@Override
			public Adapter caseLogicReferenceFunction(LogicReferenceFunction object) {
				return createLogicReferenceFunctionAdapter();
			}
			@Override
			public Adapter caseLogicFunctionVariable(LogicFunctionVariable object) {
				return createLogicFunctionVariableAdapter();
			}
			@Override
			public Adapter caseIValueFunction(IValueFunction object) {
				return createIValueFunctionAdapter();
			}
			@Override
			public Adapter caseILogicFunction(ILogicFunction object) {
				return createILogicFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricLogicBinaryFunction(ArithmetricLogicBinaryFunction object) {
				return createArithmetricLogicBinaryFunctionAdapter();
			}
			@Override
			public Adapter caseSubClassFunction(SubClassFunction object) {
				return createSubClassFunctionAdapter();
			}
			@Override
			public Adapter casePredicateFunction(PredicateFunction object) {
				return createPredicateFunctionAdapter();
			}
			@Override
			public Adapter caseFeatureTreeValidFunction(FeatureTreeValidFunction object) {
				return createFeatureTreeValidFunctionAdapter();
			}
			@Override
			public Adapter caseEqualFunction(EqualFunction object) {
				return createEqualFunctionAdapter();
			}
			@Override
			public Adapter caseLargerThanFunction(LargerThanFunction object) {
				return createLargerThanFunctionAdapter();
			}
			@Override
			public Adapter caseLowerThanFunction(LowerThanFunction object) {
				return createLowerThanFunctionAdapter();
			}
			@Override
			public Adapter caseIArithmetricFunction(IArithmetricFunction object) {
				return createIArithmetricFunctionAdapter();
			}
			@Override
			public Adapter caseUnaryFunction(UnaryFunction object) {
				return createUnaryFunctionAdapter();
			}
			@Override
			public Adapter caseBinaryFunction(BinaryFunction object) {
				return createBinaryFunctionAdapter();
			}
			@Override
			public Adapter casePlusFunction(PlusFunction object) {
				return createPlusFunctionAdapter();
			}
			@Override
			public Adapter caseSubFunction(SubFunction object) {
				return createSubFunctionAdapter();
			}
			@Override
			public Adapter caseMinusFunction(MinusFunction object) {
				return createMinusFunctionAdapter();
			}
			@Override
			public Adapter caseMultiplyFunction(MultiplyFunction object) {
				return createMultiplyFunctionAdapter();
			}
			@Override
			public Adapter caseDivisionFunction(DivisionFunction object) {
				return createDivisionFunctionAdapter();
			}
			@Override
			public Adapter caseFloatFunction(FloatFunction object) {
				return createFloatFunctionAdapter();
			}
			@Override
			public Adapter caseIntFunction(IntFunction object) {
				return createIntFunctionAdapter();
			}
			@Override
			public Adapter caseLongFunction(LongFunction object) {
				return createLongFunctionAdapter();
			}
			@Override
			public Adapter caseBagCountFunction(BagCountFunction object) {
				return createBagCountFunctionAdapter();
			}
			@Override
			public Adapter caseBagIdxFunction(BagIdxFunction object) {
				return createBagIdxFunctionAdapter();
			}
			@Override
			public Adapter caseBagSizeFunction(BagSizeFunction object) {
				return createBagSizeFunctionAdapter();
			}
			@Override
			public Adapter caseBagNextFunction(BagNextFunction object) {
				return createBagNextFunctionAdapter();
			}
			@Override
			public Adapter caseBagFirstFreeFunction(BagFirstFreeFunction object) {
				return createBagFirstFreeFunctionAdapter();
			}
			@Override
			public Adapter caseTimeFunction(TimeFunction object) {
				return createTimeFunctionAdapter();
			}
			@Override
			public Adapter caseTokenFunction(TokenFunction object) {
				return createTokenFunctionAdapter();
			}
			@Override
			public Adapter caseIDataNodeFunction(IDataNodeFunction object) {
				return createIDataNodeFunctionAdapter();
			}
			@Override
			public Adapter caseDataNodeFunction(DataNodeFunction object) {
				return createDataNodeFunctionAdapter();
			}
			@Override
			public Adapter caseBagElementFunction(BagElementFunction object) {
				return createBagElementFunctionAdapter();
			}
			@Override
			public Adapter caseDataNodeValueFunction(DataNodeValueFunction object) {
				return createDataNodeValueFunctionAdapter();
			}
			@Override
			public Adapter caseDataValueFunction(DataValueFunction object) {
				return createDataValueFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricCaseFunction(ArithmetricCaseFunction object) {
				return createArithmetricCaseFunctionAdapter();
			}
			@Override
			public Adapter caseArithmetricCase(ArithmetricCase object) {
				return createArithmetricCaseAdapter();
			}
			@Override
			public Adapter caseValueCaseFunction(ValueCaseFunction object) {
				return createValueCaseFunctionAdapter();
			}
			@Override
			public Adapter caseValueCase(ValueCase object) {
				return createValueCaseAdapter();
			}
			@Override
			public Adapter caseDataNodeCaseFunction(DataNodeCaseFunction object) {
				return createDataNodeCaseFunctionAdapter();
			}
			@Override
			public Adapter caseDataNodeCase(DataNodeCase object) {
				return createDataNodeCaseAdapter();
			}
			@Override
			public Adapter caseIContextVariable(IContextVariable object) {
				return createIContextVariableAdapter();
			}
			@Override
			public Adapter caseAbstractModelElement(AbstractModelElement object) {
				return createAbstractModelElementAdapter();
			}
			@Override
			public Adapter caseITopLevelElement(ITopLevelElement object) {
				return createITopLevelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.IFunction <em>IFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.IFunction
	 * @generated
	 */
	public Adapter createIFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.FunctionVariable <em>Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.FunctionVariable
	 * @generated
	 */
	public Adapter createFunctionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ReferenceFunction <em>Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ReferenceFunction
	 * @generated
	 */
	public Adapter createReferenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricFunctionVariable <em>Arithmetric Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricFunctionVariable
	 * @generated
	 */
	public Adapter createArithmetricFunctionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeFunctionVariable <em>Data Node Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeFunctionVariable
	 * @generated
	 */
	public Adapter createDataNodeFunctionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ValueFunctionVariable <em>Value Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ValueFunctionVariable
	 * @generated
	 */
	public Adapter createValueFunctionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LogicStandAloneFunction <em>Logic Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LogicStandAloneFunction
	 * @generated
	 */
	public Adapter createLogicStandAloneFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LogicReferenceFunction <em>Logic Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LogicReferenceFunction
	 * @generated
	 */
	public Adapter createLogicReferenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LogicFunctionVariable <em>Logic Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LogicFunctionVariable
	 * @generated
	 */
	public Adapter createLogicFunctionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ILogicFunction <em>ILogic Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ILogicFunction
	 * @generated
	 */
	public Adapter createILogicFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction <em>Arithmetric Logic Binary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction
	 * @generated
	 */
	public Adapter createArithmetricLogicBinaryFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.PredicateFunction <em>Predicate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.PredicateFunction
	 * @generated
	 */
	public Adapter createPredicateFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.FeatureTreeValidFunction <em>Feature Tree Valid Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.FeatureTreeValidFunction
	 * @generated
	 */
	public Adapter createFeatureTreeValidFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.EqualFunction <em>Equal Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.EqualFunction
	 * @generated
	 */
	public Adapter createEqualFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LargerThanFunction <em>Larger Than Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LargerThanFunction
	 * @generated
	 */
	public Adapter createLargerThanFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LowerThanFunction <em>Lower Than Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LowerThanFunction
	 * @generated
	 */
	public Adapter createLowerThanFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.IArithmetricFunction <em>IArithmetric Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.IArithmetricFunction
	 * @generated
	 */
	public Adapter createIArithmetricFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.UnaryFunction <em>Unary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.UnaryFunction
	 * @generated
	 */
	public Adapter createUnaryFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BinaryFunction <em>Binary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BinaryFunction
	 * @generated
	 */
	public Adapter createBinaryFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.PlusFunction <em>Plus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.PlusFunction
	 * @generated
	 */
	public Adapter createPlusFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.SubFunction <em>Sub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.SubFunction
	 * @generated
	 */
	public Adapter createSubFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.MinusFunction <em>Minus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.MinusFunction
	 * @generated
	 */
	public Adapter createMinusFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.MultiplyFunction <em>Multiply Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.MultiplyFunction
	 * @generated
	 */
	public Adapter createMultiplyFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DivisionFunction <em>Division Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DivisionFunction
	 * @generated
	 */
	public Adapter createDivisionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.FloatFunction <em>Float Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.FloatFunction
	 * @generated
	 */
	public Adapter createFloatFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.IntFunction <em>Int Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.IntFunction
	 * @generated
	 */
	public Adapter createIntFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.LongFunction <em>Long Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.LongFunction
	 * @generated
	 */
	public Adapter createLongFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagCountFunction <em>Bag Count Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagCountFunction
	 * @generated
	 */
	public Adapter createBagCountFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagIdxFunction <em>Bag Idx Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagIdxFunction
	 * @generated
	 */
	public Adapter createBagIdxFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagSizeFunction <em>Bag Size Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagSizeFunction
	 * @generated
	 */
	public Adapter createBagSizeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagNextFunction <em>Bag Next Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagNextFunction
	 * @generated
	 */
	public Adapter createBagNextFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagFirstFreeFunction <em>Bag First Free Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagFirstFreeFunction
	 * @generated
	 */
	public Adapter createBagFirstFreeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.TimeFunction <em>Time Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.TimeFunction
	 * @generated
	 */
	public Adapter createTimeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.TokenFunction <em>Token Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.TokenFunction
	 * @generated
	 */
	public Adapter createTokenFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricCaseFunction <em>Arithmetric Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCaseFunction
	 * @generated
	 */
	public Adapter createArithmetricCaseFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricCase <em>Arithmetric Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCase
	 * @generated
	 */
	public Adapter createArithmetricCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ValueCaseFunction <em>Value Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ValueCaseFunction
	 * @generated
	 */
	public Adapter createValueCaseFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ValueCase <em>Value Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ValueCase
	 * @generated
	 */
	public Adapter createValueCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeCaseFunction <em>Data Node Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCaseFunction
	 * @generated
	 */
	public Adapter createDataNodeCaseFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeCase <em>Data Node Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCase
	 * @generated
	 */
	public Adapter createDataNodeCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.IDataNodeFunction <em>IData Node Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.IDataNodeFunction
	 * @generated
	 */
	public Adapter createIDataNodeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeFunction <em>Data Node Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeFunction
	 * @generated
	 */
	public Adapter createDataNodeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.BagElementFunction <em>Bag Element Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.BagElementFunction
	 * @generated
	 */
	public Adapter createBagElementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeValueFunction <em>Data Node Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeValueFunction
	 * @generated
	 */
	public Adapter createDataNodeValueFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataValueFunction <em>Data Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataValueFunction
	 * @generated
	 */
	public Adapter createDataValueFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.IContextVariable <em>IContext Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.IContextVariable
	 * @generated
	 */
	public Adapter createIContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.SubClassFunction <em>Sub Class Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.SubClassFunction
	 * @generated
	 */
	public Adapter createSubClassFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.StandAloneFunction <em>Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.StandAloneFunction
	 * @generated
	 */
	public Adapter createStandAloneFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.IValueFunction <em>IValue Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.IValueFunction
	 * @generated
	 */
	public Adapter createIValueFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction <em>Arithmetric Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction
	 * @generated
	 */
	public Adapter createArithmetricStandAloneFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction <em>Arithmetric Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction
	 * @generated
	 */
	public Adapter createArithmetricReferenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction <em>Data Node Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction
	 * @generated
	 */
	public Adapter createDataNodeStandAloneFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.DataNodeReferenceFunction <em>Data Node Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.DataNodeReferenceFunction
	 * @generated
	 */
	public Adapter createDataNodeReferenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ValueStandAloneFunction <em>Value Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ValueStandAloneFunction
	 * @generated
	 */
	public Adapter createValueStandAloneFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.functions.ValueReferenceFunction <em>Value Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.functions.ValueReferenceFunction
	 * @generated
	 */
	public Adapter createValueReferenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.AbstractModelElement <em>Abstract Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement
	 * @generated
	 */
	public Adapter createAbstractModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.ITopLevelElement <em>ITop Level Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.ITopLevelElement
	 * @generated
	 */
	public Adapter createITopLevelElementAdapter() {
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

} //FunctionsAdapterFactory
