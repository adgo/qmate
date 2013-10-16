/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.functions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsFactoryImpl extends EFactoryImpl implements FunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionsFactory init() {
		try {
			FunctionsFactory theFunctionsFactory = (FunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionsPackage.eNS_URI);
			if (theFunctionsFactory != null) {
				return theFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FunctionsPackage.FUNCTION_VARIABLE: return createFunctionVariable();
			case FunctionsPackage.ARITHMETRIC_STAND_ALONE_FUNCTION: return createArithmetricStandAloneFunction();
			case FunctionsPackage.ARITHMETRIC_REFERENCE_FUNCTION: return createArithmetricReferenceFunction();
			case FunctionsPackage.ARITHMETRIC_FUNCTION_VARIABLE: return createArithmetricFunctionVariable();
			case FunctionsPackage.DATA_NODE_STAND_ALONE_FUNCTION: return createDataNodeStandAloneFunction();
			case FunctionsPackage.DATA_NODE_REFERENCE_FUNCTION: return createDataNodeReferenceFunction();
			case FunctionsPackage.DATA_NODE_FUNCTION_VARIABLE: return createDataNodeFunctionVariable();
			case FunctionsPackage.VALUE_STAND_ALONE_FUNCTION: return createValueStandAloneFunction();
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION: return createValueReferenceFunction();
			case FunctionsPackage.VALUE_FUNCTION_VARIABLE: return createValueFunctionVariable();
			case FunctionsPackage.LOGIC_STAND_ALONE_FUNCTION: return createLogicStandAloneFunction();
			case FunctionsPackage.LOGIC_REFERENCE_FUNCTION: return createLogicReferenceFunction();
			case FunctionsPackage.LOGIC_FUNCTION_VARIABLE: return createLogicFunctionVariable();
			case FunctionsPackage.SUB_CLASS_FUNCTION: return createSubClassFunction();
			case FunctionsPackage.PREDICATE_FUNCTION: return createPredicateFunction();
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION: return createFeatureTreeValidFunction();
			case FunctionsPackage.EQUAL_FUNCTION: return createEqualFunction();
			case FunctionsPackage.LARGER_THAN_FUNCTION: return createLargerThanFunction();
			case FunctionsPackage.LOWER_THAN_FUNCTION: return createLowerThanFunction();
			case FunctionsPackage.PLUS_FUNCTION: return createPlusFunction();
			case FunctionsPackage.SUB_FUNCTION: return createSubFunction();
			case FunctionsPackage.MINUS_FUNCTION: return createMinusFunction();
			case FunctionsPackage.MULTIPLY_FUNCTION: return createMultiplyFunction();
			case FunctionsPackage.DIVISION_FUNCTION: return createDivisionFunction();
			case FunctionsPackage.FLOAT_FUNCTION: return createFloatFunction();
			case FunctionsPackage.INT_FUNCTION: return createIntFunction();
			case FunctionsPackage.LONG_FUNCTION: return createLongFunction();
			case FunctionsPackage.BAG_COUNT_FUNCTION: return createBagCountFunction();
			case FunctionsPackage.BAG_IDX_FUNCTION: return createBagIdxFunction();
			case FunctionsPackage.BAG_SIZE_FUNCTION: return createBagSizeFunction();
			case FunctionsPackage.BAG_NEXT_FUNCTION: return createBagNextFunction();
			case FunctionsPackage.BAG_FIRST_FREE_FUNCTION: return createBagFirstFreeFunction();
			case FunctionsPackage.TIME_FUNCTION: return createTimeFunction();
			case FunctionsPackage.TOKEN_FUNCTION: return createTokenFunction();
			case FunctionsPackage.DATA_NODE_FUNCTION: return createDataNodeFunction();
			case FunctionsPackage.BAG_ELEMENT_FUNCTION: return createBagElementFunction();
			case FunctionsPackage.DATA_NODE_VALUE_FUNCTION: return createDataNodeValueFunction();
			case FunctionsPackage.DATA_VALUE_FUNCTION: return createDataValueFunction();
			case FunctionsPackage.ARITHMETRIC_CASE_FUNCTION: return createArithmetricCaseFunction();
			case FunctionsPackage.ARITHMETRIC_CASE: return createArithmetricCase();
			case FunctionsPackage.VALUE_CASE_FUNCTION: return createValueCaseFunction();
			case FunctionsPackage.VALUE_CASE: return createValueCase();
			case FunctionsPackage.DATA_NODE_CASE_FUNCTION: return createDataNodeCaseFunction();
			case FunctionsPackage.DATA_NODE_CASE: return createDataNodeCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionVariable createFunctionVariable() {
		FunctionVariableImpl functionVariable = new FunctionVariableImpl();
		return functionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricFunctionVariable createArithmetricFunctionVariable() {
		ArithmetricFunctionVariableImpl arithmetricFunctionVariable = new ArithmetricFunctionVariableImpl();
		return arithmetricFunctionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeFunctionVariable createDataNodeFunctionVariable() {
		DataNodeFunctionVariableImpl dataNodeFunctionVariable = new DataNodeFunctionVariableImpl();
		return dataNodeFunctionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFunctionVariable createValueFunctionVariable() {
		ValueFunctionVariableImpl valueFunctionVariable = new ValueFunctionVariableImpl();
		return valueFunctionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicStandAloneFunction createLogicStandAloneFunction() {
		LogicStandAloneFunctionImpl logicStandAloneFunction = new LogicStandAloneFunctionImpl();
		return logicStandAloneFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicReferenceFunction createLogicReferenceFunction() {
		LogicReferenceFunctionImpl logicReferenceFunction = new LogicReferenceFunctionImpl();
		return logicReferenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFunctionVariable createLogicFunctionVariable() {
		LogicFunctionVariableImpl logicFunctionVariable = new LogicFunctionVariableImpl();
		return logicFunctionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualFunction createEqualFunction() {
		EqualFunctionImpl equalFunction = new EqualFunctionImpl();
		return equalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargerThanFunction createLargerThanFunction() {
		LargerThanFunctionImpl largerThanFunction = new LargerThanFunctionImpl();
		return largerThanFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerThanFunction createLowerThanFunction() {
		LowerThanFunctionImpl lowerThanFunction = new LowerThanFunctionImpl();
		return lowerThanFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusFunction createPlusFunction() {
		PlusFunctionImpl plusFunction = new PlusFunctionImpl();
		return plusFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubFunction createSubFunction() {
		SubFunctionImpl subFunction = new SubFunctionImpl();
		return subFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinusFunction createMinusFunction() {
		MinusFunctionImpl minusFunction = new MinusFunctionImpl();
		return minusFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplyFunction createMultiplyFunction() {
		MultiplyFunctionImpl multiplyFunction = new MultiplyFunctionImpl();
		return multiplyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionFunction createDivisionFunction() {
		DivisionFunctionImpl divisionFunction = new DivisionFunctionImpl();
		return divisionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatFunction createFloatFunction() {
		FloatFunctionImpl floatFunction = new FloatFunctionImpl();
		return floatFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntFunction createIntFunction() {
		IntFunctionImpl intFunction = new IntFunctionImpl();
		return intFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongFunction createLongFunction() {
		LongFunctionImpl longFunction = new LongFunctionImpl();
		return longFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagCountFunction createBagCountFunction() {
		BagCountFunctionImpl bagCountFunction = new BagCountFunctionImpl();
		return bagCountFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagIdxFunction createBagIdxFunction() {
		BagIdxFunctionImpl bagIdxFunction = new BagIdxFunctionImpl();
		return bagIdxFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagSizeFunction createBagSizeFunction() {
		BagSizeFunctionImpl bagSizeFunction = new BagSizeFunctionImpl();
		return bagSizeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagNextFunction createBagNextFunction() {
		BagNextFunctionImpl bagNextFunction = new BagNextFunctionImpl();
		return bagNextFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagFirstFreeFunction createBagFirstFreeFunction() {
		BagFirstFreeFunctionImpl bagFirstFreeFunction = new BagFirstFreeFunctionImpl();
		return bagFirstFreeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFunction createTimeFunction() {
		TimeFunctionImpl timeFunction = new TimeFunctionImpl();
		return timeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenFunction createTokenFunction() {
		TokenFunctionImpl tokenFunction = new TokenFunctionImpl();
		return tokenFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricCaseFunction createArithmetricCaseFunction() {
		ArithmetricCaseFunctionImpl arithmetricCaseFunction = new ArithmetricCaseFunctionImpl();
		return arithmetricCaseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricCase createArithmetricCase() {
		ArithmetricCaseImpl arithmetricCase = new ArithmetricCaseImpl();
		return arithmetricCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueCaseFunction createValueCaseFunction() {
		ValueCaseFunctionImpl valueCaseFunction = new ValueCaseFunctionImpl();
		return valueCaseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueCase createValueCase() {
		ValueCaseImpl valueCase = new ValueCaseImpl();
		return valueCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeCaseFunction createDataNodeCaseFunction() {
		DataNodeCaseFunctionImpl dataNodeCaseFunction = new DataNodeCaseFunctionImpl();
		return dataNodeCaseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeCase createDataNodeCase() {
		DataNodeCaseImpl dataNodeCase = new DataNodeCaseImpl();
		return dataNodeCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeFunction createDataNodeFunction() {
		DataNodeFunctionImpl dataNodeFunction = new DataNodeFunctionImpl();
		return dataNodeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagElementFunction createBagElementFunction() {
		BagElementFunctionImpl bagElementFunction = new BagElementFunctionImpl();
		return bagElementFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeValueFunction createDataNodeValueFunction() {
		DataNodeValueFunctionImpl dataNodeValueFunction = new DataNodeValueFunctionImpl();
		return dataNodeValueFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValueFunction createDataValueFunction() {
		DataValueFunctionImpl dataValueFunction = new DataValueFunctionImpl();
		return dataValueFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassFunction createSubClassFunction() {
		SubClassFunctionImpl subClassFunction = new SubClassFunctionImpl();
		return subClassFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateFunction createPredicateFunction() {
		PredicateFunctionImpl predicateFunction = new PredicateFunctionImpl();
		return predicateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTreeValidFunction createFeatureTreeValidFunction() {
		FeatureTreeValidFunctionImpl featureTreeValidFunction = new FeatureTreeValidFunctionImpl();
		return featureTreeValidFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricStandAloneFunction createArithmetricStandAloneFunction() {
		ArithmetricStandAloneFunctionImpl arithmetricStandAloneFunction = new ArithmetricStandAloneFunctionImpl();
		return arithmetricStandAloneFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricReferenceFunction createArithmetricReferenceFunction() {
		ArithmetricReferenceFunctionImpl arithmetricReferenceFunction = new ArithmetricReferenceFunctionImpl();
		return arithmetricReferenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeStandAloneFunction createDataNodeStandAloneFunction() {
		DataNodeStandAloneFunctionImpl dataNodeStandAloneFunction = new DataNodeStandAloneFunctionImpl();
		return dataNodeStandAloneFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeReferenceFunction createDataNodeReferenceFunction() {
		DataNodeReferenceFunctionImpl dataNodeReferenceFunction = new DataNodeReferenceFunctionImpl();
		return dataNodeReferenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueStandAloneFunction createValueStandAloneFunction() {
		ValueStandAloneFunctionImpl valueStandAloneFunction = new ValueStandAloneFunctionImpl();
		return valueStandAloneFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueReferenceFunction createValueReferenceFunction() {
		ValueReferenceFunctionImpl valueReferenceFunction = new ValueReferenceFunctionImpl();
		return valueReferenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsPackage getFunctionsPackage() {
		return (FunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionsPackage getPackage() {
		return FunctionsPackage.eINSTANCE;
	}

} //FunctionsFactoryImpl
