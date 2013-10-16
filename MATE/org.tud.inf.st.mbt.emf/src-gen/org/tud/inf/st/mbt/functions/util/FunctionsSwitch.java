/**
 */
package org.tud.inf.st.mbt.functions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.functions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage
 * @generated
 */
public class FunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FunctionsPackage.IFUNCTION: {
				IFunction iFunction = (IFunction)theEObject;
				T result = caseIFunction(iFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FUNCTION_VARIABLE: {
				FunctionVariable functionVariable = (FunctionVariable)theEObject;
				T result = caseFunctionVariable(functionVariable);
				if (result == null) result = caseIFunction(functionVariable);
				if (result == null) result = caseIContextVariable(functionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.REFERENCE_FUNCTION: {
				ReferenceFunction referenceFunction = (ReferenceFunction)theEObject;
				T result = caseReferenceFunction(referenceFunction);
				if (result == null) result = caseIFunction(referenceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.STAND_ALONE_FUNCTION: {
				StandAloneFunction standAloneFunction = (StandAloneFunction)theEObject;
				T result = caseStandAloneFunction(standAloneFunction);
				if (result == null) result = caseAbstractModelElement(standAloneFunction);
				if (result == null) result = caseITopLevelElement(standAloneFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_STAND_ALONE_FUNCTION: {
				ArithmetricStandAloneFunction arithmetricStandAloneFunction = (ArithmetricStandAloneFunction)theEObject;
				T result = caseArithmetricStandAloneFunction(arithmetricStandAloneFunction);
				if (result == null) result = caseStandAloneFunction(arithmetricStandAloneFunction);
				if (result == null) result = caseAbstractModelElement(arithmetricStandAloneFunction);
				if (result == null) result = caseITopLevelElement(arithmetricStandAloneFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_REFERENCE_FUNCTION: {
				ArithmetricReferenceFunction arithmetricReferenceFunction = (ArithmetricReferenceFunction)theEObject;
				T result = caseArithmetricReferenceFunction(arithmetricReferenceFunction);
				if (result == null) result = caseIArithmetricFunction(arithmetricReferenceFunction);
				if (result == null) result = caseReferenceFunction(arithmetricReferenceFunction);
				if (result == null) result = caseIValueFunction(arithmetricReferenceFunction);
				if (result == null) result = caseIFunction(arithmetricReferenceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_FUNCTION_VARIABLE: {
				ArithmetricFunctionVariable arithmetricFunctionVariable = (ArithmetricFunctionVariable)theEObject;
				T result = caseArithmetricFunctionVariable(arithmetricFunctionVariable);
				if (result == null) result = caseFunctionVariable(arithmetricFunctionVariable);
				if (result == null) result = caseIArithmetricFunction(arithmetricFunctionVariable);
				if (result == null) result = caseIContextVariable(arithmetricFunctionVariable);
				if (result == null) result = caseIValueFunction(arithmetricFunctionVariable);
				if (result == null) result = caseIFunction(arithmetricFunctionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_STAND_ALONE_FUNCTION: {
				DataNodeStandAloneFunction dataNodeStandAloneFunction = (DataNodeStandAloneFunction)theEObject;
				T result = caseDataNodeStandAloneFunction(dataNodeStandAloneFunction);
				if (result == null) result = caseStandAloneFunction(dataNodeStandAloneFunction);
				if (result == null) result = caseAbstractModelElement(dataNodeStandAloneFunction);
				if (result == null) result = caseITopLevelElement(dataNodeStandAloneFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_REFERENCE_FUNCTION: {
				DataNodeReferenceFunction dataNodeReferenceFunction = (DataNodeReferenceFunction)theEObject;
				T result = caseDataNodeReferenceFunction(dataNodeReferenceFunction);
				if (result == null) result = caseReferenceFunction(dataNodeReferenceFunction);
				if (result == null) result = caseIDataNodeFunction(dataNodeReferenceFunction);
				if (result == null) result = caseIFunction(dataNodeReferenceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_FUNCTION_VARIABLE: {
				DataNodeFunctionVariable dataNodeFunctionVariable = (DataNodeFunctionVariable)theEObject;
				T result = caseDataNodeFunctionVariable(dataNodeFunctionVariable);
				if (result == null) result = caseFunctionVariable(dataNodeFunctionVariable);
				if (result == null) result = caseIDataNodeFunction(dataNodeFunctionVariable);
				if (result == null) result = caseIFunction(dataNodeFunctionVariable);
				if (result == null) result = caseIContextVariable(dataNodeFunctionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.VALUE_STAND_ALONE_FUNCTION: {
				ValueStandAloneFunction valueStandAloneFunction = (ValueStandAloneFunction)theEObject;
				T result = caseValueStandAloneFunction(valueStandAloneFunction);
				if (result == null) result = caseStandAloneFunction(valueStandAloneFunction);
				if (result == null) result = caseAbstractModelElement(valueStandAloneFunction);
				if (result == null) result = caseITopLevelElement(valueStandAloneFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION: {
				ValueReferenceFunction valueReferenceFunction = (ValueReferenceFunction)theEObject;
				T result = caseValueReferenceFunction(valueReferenceFunction);
				if (result == null) result = caseIValueFunction(valueReferenceFunction);
				if (result == null) result = caseReferenceFunction(valueReferenceFunction);
				if (result == null) result = caseIFunction(valueReferenceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.VALUE_FUNCTION_VARIABLE: {
				ValueFunctionVariable valueFunctionVariable = (ValueFunctionVariable)theEObject;
				T result = caseValueFunctionVariable(valueFunctionVariable);
				if (result == null) result = caseFunctionVariable(valueFunctionVariable);
				if (result == null) result = caseIValueFunction(valueFunctionVariable);
				if (result == null) result = caseIFunction(valueFunctionVariable);
				if (result == null) result = caseIContextVariable(valueFunctionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LOGIC_STAND_ALONE_FUNCTION: {
				LogicStandAloneFunction logicStandAloneFunction = (LogicStandAloneFunction)theEObject;
				T result = caseLogicStandAloneFunction(logicStandAloneFunction);
				if (result == null) result = caseStandAloneFunction(logicStandAloneFunction);
				if (result == null) result = caseAbstractModelElement(logicStandAloneFunction);
				if (result == null) result = caseITopLevelElement(logicStandAloneFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LOGIC_REFERENCE_FUNCTION: {
				LogicReferenceFunction logicReferenceFunction = (LogicReferenceFunction)theEObject;
				T result = caseLogicReferenceFunction(logicReferenceFunction);
				if (result == null) result = caseReferenceFunction(logicReferenceFunction);
				if (result == null) result = caseILogicFunction(logicReferenceFunction);
				if (result == null) result = caseIValueFunction(logicReferenceFunction);
				if (result == null) result = caseIFunction(logicReferenceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LOGIC_FUNCTION_VARIABLE: {
				LogicFunctionVariable logicFunctionVariable = (LogicFunctionVariable)theEObject;
				T result = caseLogicFunctionVariable(logicFunctionVariable);
				if (result == null) result = caseFunctionVariable(logicFunctionVariable);
				if (result == null) result = caseILogicFunction(logicFunctionVariable);
				if (result == null) result = caseIContextVariable(logicFunctionVariable);
				if (result == null) result = caseIValueFunction(logicFunctionVariable);
				if (result == null) result = caseIFunction(logicFunctionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.IVALUE_FUNCTION: {
				IValueFunction iValueFunction = (IValueFunction)theEObject;
				T result = caseIValueFunction(iValueFunction);
				if (result == null) result = caseIFunction(iValueFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ILOGIC_FUNCTION: {
				ILogicFunction iLogicFunction = (ILogicFunction)theEObject;
				T result = caseILogicFunction(iLogicFunction);
				if (result == null) result = caseIValueFunction(iLogicFunction);
				if (result == null) result = caseIFunction(iLogicFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION: {
				ArithmetricLogicBinaryFunction arithmetricLogicBinaryFunction = (ArithmetricLogicBinaryFunction)theEObject;
				T result = caseArithmetricLogicBinaryFunction(arithmetricLogicBinaryFunction);
				if (result == null) result = caseILogicFunction(arithmetricLogicBinaryFunction);
				if (result == null) result = caseIValueFunction(arithmetricLogicBinaryFunction);
				if (result == null) result = caseIFunction(arithmetricLogicBinaryFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SUB_CLASS_FUNCTION: {
				SubClassFunction subClassFunction = (SubClassFunction)theEObject;
				T result = caseSubClassFunction(subClassFunction);
				if (result == null) result = caseILogicFunction(subClassFunction);
				if (result == null) result = caseIValueFunction(subClassFunction);
				if (result == null) result = caseIFunction(subClassFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.PREDICATE_FUNCTION: {
				PredicateFunction predicateFunction = (PredicateFunction)theEObject;
				T result = casePredicateFunction(predicateFunction);
				if (result == null) result = caseILogicFunction(predicateFunction);
				if (result == null) result = caseIValueFunction(predicateFunction);
				if (result == null) result = caseIFunction(predicateFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION: {
				FeatureTreeValidFunction featureTreeValidFunction = (FeatureTreeValidFunction)theEObject;
				T result = caseFeatureTreeValidFunction(featureTreeValidFunction);
				if (result == null) result = caseILogicFunction(featureTreeValidFunction);
				if (result == null) result = caseIValueFunction(featureTreeValidFunction);
				if (result == null) result = caseIFunction(featureTreeValidFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.EQUAL_FUNCTION: {
				EqualFunction equalFunction = (EqualFunction)theEObject;
				T result = caseEqualFunction(equalFunction);
				if (result == null) result = caseArithmetricLogicBinaryFunction(equalFunction);
				if (result == null) result = caseILogicFunction(equalFunction);
				if (result == null) result = caseIValueFunction(equalFunction);
				if (result == null) result = caseIFunction(equalFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LARGER_THAN_FUNCTION: {
				LargerThanFunction largerThanFunction = (LargerThanFunction)theEObject;
				T result = caseLargerThanFunction(largerThanFunction);
				if (result == null) result = caseArithmetricLogicBinaryFunction(largerThanFunction);
				if (result == null) result = caseILogicFunction(largerThanFunction);
				if (result == null) result = caseIValueFunction(largerThanFunction);
				if (result == null) result = caseIFunction(largerThanFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LOWER_THAN_FUNCTION: {
				LowerThanFunction lowerThanFunction = (LowerThanFunction)theEObject;
				T result = caseLowerThanFunction(lowerThanFunction);
				if (result == null) result = caseArithmetricLogicBinaryFunction(lowerThanFunction);
				if (result == null) result = caseILogicFunction(lowerThanFunction);
				if (result == null) result = caseIValueFunction(lowerThanFunction);
				if (result == null) result = caseIFunction(lowerThanFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.IARITHMETRIC_FUNCTION: {
				IArithmetricFunction iArithmetricFunction = (IArithmetricFunction)theEObject;
				T result = caseIArithmetricFunction(iArithmetricFunction);
				if (result == null) result = caseIValueFunction(iArithmetricFunction);
				if (result == null) result = caseIFunction(iArithmetricFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.UNARY_FUNCTION: {
				UnaryFunction unaryFunction = (UnaryFunction)theEObject;
				T result = caseUnaryFunction(unaryFunction);
				if (result == null) result = caseIArithmetricFunction(unaryFunction);
				if (result == null) result = caseIValueFunction(unaryFunction);
				if (result == null) result = caseIFunction(unaryFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BINARY_FUNCTION: {
				BinaryFunction binaryFunction = (BinaryFunction)theEObject;
				T result = caseBinaryFunction(binaryFunction);
				if (result == null) result = caseIArithmetricFunction(binaryFunction);
				if (result == null) result = caseIValueFunction(binaryFunction);
				if (result == null) result = caseIFunction(binaryFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.PLUS_FUNCTION: {
				PlusFunction plusFunction = (PlusFunction)theEObject;
				T result = casePlusFunction(plusFunction);
				if (result == null) result = caseBinaryFunction(plusFunction);
				if (result == null) result = caseIArithmetricFunction(plusFunction);
				if (result == null) result = caseIValueFunction(plusFunction);
				if (result == null) result = caseIFunction(plusFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SUB_FUNCTION: {
				SubFunction subFunction = (SubFunction)theEObject;
				T result = caseSubFunction(subFunction);
				if (result == null) result = caseUnaryFunction(subFunction);
				if (result == null) result = caseIArithmetricFunction(subFunction);
				if (result == null) result = caseIValueFunction(subFunction);
				if (result == null) result = caseIFunction(subFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.MINUS_FUNCTION: {
				MinusFunction minusFunction = (MinusFunction)theEObject;
				T result = caseMinusFunction(minusFunction);
				if (result == null) result = caseBinaryFunction(minusFunction);
				if (result == null) result = caseIArithmetricFunction(minusFunction);
				if (result == null) result = caseIValueFunction(minusFunction);
				if (result == null) result = caseIFunction(minusFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.MULTIPLY_FUNCTION: {
				MultiplyFunction multiplyFunction = (MultiplyFunction)theEObject;
				T result = caseMultiplyFunction(multiplyFunction);
				if (result == null) result = caseBinaryFunction(multiplyFunction);
				if (result == null) result = caseIArithmetricFunction(multiplyFunction);
				if (result == null) result = caseIValueFunction(multiplyFunction);
				if (result == null) result = caseIFunction(multiplyFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DIVISION_FUNCTION: {
				DivisionFunction divisionFunction = (DivisionFunction)theEObject;
				T result = caseDivisionFunction(divisionFunction);
				if (result == null) result = caseBinaryFunction(divisionFunction);
				if (result == null) result = caseIArithmetricFunction(divisionFunction);
				if (result == null) result = caseIValueFunction(divisionFunction);
				if (result == null) result = caseIFunction(divisionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.FLOAT_FUNCTION: {
				FloatFunction floatFunction = (FloatFunction)theEObject;
				T result = caseFloatFunction(floatFunction);
				if (result == null) result = caseIArithmetricFunction(floatFunction);
				if (result == null) result = caseIValueFunction(floatFunction);
				if (result == null) result = caseIFunction(floatFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.INT_FUNCTION: {
				IntFunction intFunction = (IntFunction)theEObject;
				T result = caseIntFunction(intFunction);
				if (result == null) result = caseIArithmetricFunction(intFunction);
				if (result == null) result = caseIValueFunction(intFunction);
				if (result == null) result = caseIFunction(intFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.LONG_FUNCTION: {
				LongFunction longFunction = (LongFunction)theEObject;
				T result = caseLongFunction(longFunction);
				if (result == null) result = caseIArithmetricFunction(longFunction);
				if (result == null) result = caseIValueFunction(longFunction);
				if (result == null) result = caseIFunction(longFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_COUNT_FUNCTION: {
				BagCountFunction bagCountFunction = (BagCountFunction)theEObject;
				T result = caseBagCountFunction(bagCountFunction);
				if (result == null) result = caseIArithmetricFunction(bagCountFunction);
				if (result == null) result = caseIValueFunction(bagCountFunction);
				if (result == null) result = caseIFunction(bagCountFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_IDX_FUNCTION: {
				BagIdxFunction bagIdxFunction = (BagIdxFunction)theEObject;
				T result = caseBagIdxFunction(bagIdxFunction);
				if (result == null) result = caseIArithmetricFunction(bagIdxFunction);
				if (result == null) result = caseIValueFunction(bagIdxFunction);
				if (result == null) result = caseIFunction(bagIdxFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_SIZE_FUNCTION: {
				BagSizeFunction bagSizeFunction = (BagSizeFunction)theEObject;
				T result = caseBagSizeFunction(bagSizeFunction);
				if (result == null) result = caseIArithmetricFunction(bagSizeFunction);
				if (result == null) result = caseIValueFunction(bagSizeFunction);
				if (result == null) result = caseIFunction(bagSizeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_NEXT_FUNCTION: {
				BagNextFunction bagNextFunction = (BagNextFunction)theEObject;
				T result = caseBagNextFunction(bagNextFunction);
				if (result == null) result = caseIArithmetricFunction(bagNextFunction);
				if (result == null) result = caseIValueFunction(bagNextFunction);
				if (result == null) result = caseIFunction(bagNextFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_FIRST_FREE_FUNCTION: {
				BagFirstFreeFunction bagFirstFreeFunction = (BagFirstFreeFunction)theEObject;
				T result = caseBagFirstFreeFunction(bagFirstFreeFunction);
				if (result == null) result = caseIArithmetricFunction(bagFirstFreeFunction);
				if (result == null) result = caseIValueFunction(bagFirstFreeFunction);
				if (result == null) result = caseIFunction(bagFirstFreeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TIME_FUNCTION: {
				TimeFunction timeFunction = (TimeFunction)theEObject;
				T result = caseTimeFunction(timeFunction);
				if (result == null) result = caseIArithmetricFunction(timeFunction);
				if (result == null) result = caseIValueFunction(timeFunction);
				if (result == null) result = caseIFunction(timeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.TOKEN_FUNCTION: {
				TokenFunction tokenFunction = (TokenFunction)theEObject;
				T result = caseTokenFunction(tokenFunction);
				if (result == null) result = caseIArithmetricFunction(tokenFunction);
				if (result == null) result = caseIValueFunction(tokenFunction);
				if (result == null) result = caseIFunction(tokenFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.IDATA_NODE_FUNCTION: {
				IDataNodeFunction iDataNodeFunction = (IDataNodeFunction)theEObject;
				T result = caseIDataNodeFunction(iDataNodeFunction);
				if (result == null) result = caseIFunction(iDataNodeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_FUNCTION: {
				DataNodeFunction dataNodeFunction = (DataNodeFunction)theEObject;
				T result = caseDataNodeFunction(dataNodeFunction);
				if (result == null) result = caseIDataNodeFunction(dataNodeFunction);
				if (result == null) result = caseIFunction(dataNodeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.BAG_ELEMENT_FUNCTION: {
				BagElementFunction bagElementFunction = (BagElementFunction)theEObject;
				T result = caseBagElementFunction(bagElementFunction);
				if (result == null) result = caseIDataNodeFunction(bagElementFunction);
				if (result == null) result = caseIFunction(bagElementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_VALUE_FUNCTION: {
				DataNodeValueFunction dataNodeValueFunction = (DataNodeValueFunction)theEObject;
				T result = caseDataNodeValueFunction(dataNodeValueFunction);
				if (result == null) result = caseIArithmetricFunction(dataNodeValueFunction);
				if (result == null) result = caseILogicFunction(dataNodeValueFunction);
				if (result == null) result = caseIValueFunction(dataNodeValueFunction);
				if (result == null) result = caseIFunction(dataNodeValueFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_VALUE_FUNCTION: {
				DataValueFunction dataValueFunction = (DataValueFunction)theEObject;
				T result = caseDataValueFunction(dataValueFunction);
				if (result == null) result = caseIArithmetricFunction(dataValueFunction);
				if (result == null) result = caseILogicFunction(dataValueFunction);
				if (result == null) result = caseIValueFunction(dataValueFunction);
				if (result == null) result = caseIFunction(dataValueFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_CASE_FUNCTION: {
				ArithmetricCaseFunction arithmetricCaseFunction = (ArithmetricCaseFunction)theEObject;
				T result = caseArithmetricCaseFunction(arithmetricCaseFunction);
				if (result == null) result = caseIArithmetricFunction(arithmetricCaseFunction);
				if (result == null) result = caseIValueFunction(arithmetricCaseFunction);
				if (result == null) result = caseIFunction(arithmetricCaseFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.ARITHMETRIC_CASE: {
				ArithmetricCase arithmetricCase = (ArithmetricCase)theEObject;
				T result = caseArithmetricCase(arithmetricCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.VALUE_CASE_FUNCTION: {
				ValueCaseFunction valueCaseFunction = (ValueCaseFunction)theEObject;
				T result = caseValueCaseFunction(valueCaseFunction);
				if (result == null) result = caseIValueFunction(valueCaseFunction);
				if (result == null) result = caseIFunction(valueCaseFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.VALUE_CASE: {
				ValueCase valueCase = (ValueCase)theEObject;
				T result = caseValueCase(valueCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_CASE_FUNCTION: {
				DataNodeCaseFunction dataNodeCaseFunction = (DataNodeCaseFunction)theEObject;
				T result = caseDataNodeCaseFunction(dataNodeCaseFunction);
				if (result == null) result = caseIDataNodeFunction(dataNodeCaseFunction);
				if (result == null) result = caseIFunction(dataNodeCaseFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.DATA_NODE_CASE: {
				DataNodeCase dataNodeCase = (DataNodeCase)theEObject;
				T result = caseDataNodeCase(dataNodeCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFunction(IFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionVariable(FunctionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceFunction(ReferenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Function Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricFunctionVariable(ArithmetricFunctionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Function Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeFunctionVariable(DataNodeFunctionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Function Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueFunctionVariable(ValueFunctionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Stand Alone Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicStandAloneFunction(LogicStandAloneFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Reference Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicReferenceFunction(LogicReferenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Function Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicFunctionVariable(LogicFunctionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILogic Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILogic Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILogicFunction(ILogicFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Logic Binary Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Logic Binary Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricLogicBinaryFunction(ArithmetricLogicBinaryFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateFunction(PredicateFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Tree Valid Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Tree Valid Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTreeValidFunction(FeatureTreeValidFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualFunction(EqualFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Larger Than Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Larger Than Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargerThanFunction(LargerThanFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Than Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Than Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerThanFunction(LowerThanFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArithmetric Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArithmetric Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArithmetricFunction(IArithmetricFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryFunction(UnaryFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFunction(BinaryFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusFunction(PlusFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFunction(SubFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusFunction(MinusFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplyFunction(MultiplyFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionFunction(DivisionFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatFunction(FloatFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntFunction(IntFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongFunction(LongFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Count Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Count Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagCountFunction(BagCountFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Idx Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Idx Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagIdxFunction(BagIdxFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Size Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Size Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagSizeFunction(BagSizeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Next Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Next Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagNextFunction(BagNextFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag First Free Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag First Free Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagFirstFreeFunction(BagFirstFreeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeFunction(TimeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenFunction(TokenFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Case Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricCaseFunction(ArithmetricCaseFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricCase(ArithmetricCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Case Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueCaseFunction(ValueCaseFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueCase(ValueCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Case Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeCaseFunction(DataNodeCaseFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeCase(DataNodeCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IData Node Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IData Node Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDataNodeFunction(IDataNodeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeFunction(DataNodeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Element Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Element Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagElementFunction(BagElementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Value Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Value Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeValueFunction(DataNodeValueFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValueFunction(DataValueFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContext Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContext Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIContextVariable(IContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Class Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Class Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubClassFunction(SubClassFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stand Alone Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandAloneFunction(StandAloneFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IValue Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IValue Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIValueFunction(IValueFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Stand Alone Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricStandAloneFunction(ArithmetricStandAloneFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetric Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetric Reference Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetricReferenceFunction(ArithmetricReferenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Stand Alone Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeStandAloneFunction(DataNodeStandAloneFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node Reference Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNodeReferenceFunction(DataNodeReferenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Stand Alone Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueStandAloneFunction(ValueStandAloneFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Reference Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueReferenceFunction(ValueReferenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelElement(AbstractModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITopLevelElement(ITopLevelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FunctionsSwitch
