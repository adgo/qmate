/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsFactory eINSTANCE = org.tud.inf.st.mbt.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Variable</em>'.
	 * @generated
	 */
	FunctionVariable createFunctionVariable();

	/**
	 * Returns a new object of class '<em>Arithmetric Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetric Function Variable</em>'.
	 * @generated
	 */
	ArithmetricFunctionVariable createArithmetricFunctionVariable();

	/**
	 * Returns a new object of class '<em>Data Node Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Function Variable</em>'.
	 * @generated
	 */
	DataNodeFunctionVariable createDataNodeFunctionVariable();

	/**
	 * Returns a new object of class '<em>Value Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Function Variable</em>'.
	 * @generated
	 */
	ValueFunctionVariable createValueFunctionVariable();

	/**
	 * Returns a new object of class '<em>Logic Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Stand Alone Function</em>'.
	 * @generated
	 */
	LogicStandAloneFunction createLogicStandAloneFunction();

	/**
	 * Returns a new object of class '<em>Logic Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Reference Function</em>'.
	 * @generated
	 */
	LogicReferenceFunction createLogicReferenceFunction();

	/**
	 * Returns a new object of class '<em>Logic Function Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Function Variable</em>'.
	 * @generated
	 */
	LogicFunctionVariable createLogicFunctionVariable();

	/**
	 * Returns a new object of class '<em>Equal Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Function</em>'.
	 * @generated
	 */
	EqualFunction createEqualFunction();

	/**
	 * Returns a new object of class '<em>Larger Than Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Larger Than Function</em>'.
	 * @generated
	 */
	LargerThanFunction createLargerThanFunction();

	/**
	 * Returns a new object of class '<em>Lower Than Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Than Function</em>'.
	 * @generated
	 */
	LowerThanFunction createLowerThanFunction();

	/**
	 * Returns a new object of class '<em>Plus Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Function</em>'.
	 * @generated
	 */
	PlusFunction createPlusFunction();

	/**
	 * Returns a new object of class '<em>Sub Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Function</em>'.
	 * @generated
	 */
	SubFunction createSubFunction();

	/**
	 * Returns a new object of class '<em>Minus Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Function</em>'.
	 * @generated
	 */
	MinusFunction createMinusFunction();

	/**
	 * Returns a new object of class '<em>Multiply Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply Function</em>'.
	 * @generated
	 */
	MultiplyFunction createMultiplyFunction();

	/**
	 * Returns a new object of class '<em>Division Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division Function</em>'.
	 * @generated
	 */
	DivisionFunction createDivisionFunction();

	/**
	 * Returns a new object of class '<em>Float Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Function</em>'.
	 * @generated
	 */
	FloatFunction createFloatFunction();

	/**
	 * Returns a new object of class '<em>Int Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Function</em>'.
	 * @generated
	 */
	IntFunction createIntFunction();

	/**
	 * Returns a new object of class '<em>Long Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Function</em>'.
	 * @generated
	 */
	LongFunction createLongFunction();

	/**
	 * Returns a new object of class '<em>Bag Count Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Count Function</em>'.
	 * @generated
	 */
	BagCountFunction createBagCountFunction();

	/**
	 * Returns a new object of class '<em>Bag Idx Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Idx Function</em>'.
	 * @generated
	 */
	BagIdxFunction createBagIdxFunction();

	/**
	 * Returns a new object of class '<em>Bag Size Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Size Function</em>'.
	 * @generated
	 */
	BagSizeFunction createBagSizeFunction();

	/**
	 * Returns a new object of class '<em>Bag Next Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Next Function</em>'.
	 * @generated
	 */
	BagNextFunction createBagNextFunction();

	/**
	 * Returns a new object of class '<em>Bag First Free Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag First Free Function</em>'.
	 * @generated
	 */
	BagFirstFreeFunction createBagFirstFreeFunction();

	/**
	 * Returns a new object of class '<em>Time Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Function</em>'.
	 * @generated
	 */
	TimeFunction createTimeFunction();

	/**
	 * Returns a new object of class '<em>Token Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Function</em>'.
	 * @generated
	 */
	TokenFunction createTokenFunction();

	/**
	 * Returns a new object of class '<em>Arithmetric Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetric Case Function</em>'.
	 * @generated
	 */
	ArithmetricCaseFunction createArithmetricCaseFunction();

	/**
	 * Returns a new object of class '<em>Arithmetric Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetric Case</em>'.
	 * @generated
	 */
	ArithmetricCase createArithmetricCase();

	/**
	 * Returns a new object of class '<em>Value Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Case Function</em>'.
	 * @generated
	 */
	ValueCaseFunction createValueCaseFunction();

	/**
	 * Returns a new object of class '<em>Value Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Case</em>'.
	 * @generated
	 */
	ValueCase createValueCase();

	/**
	 * Returns a new object of class '<em>Data Node Case Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Case Function</em>'.
	 * @generated
	 */
	DataNodeCaseFunction createDataNodeCaseFunction();

	/**
	 * Returns a new object of class '<em>Data Node Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Case</em>'.
	 * @generated
	 */
	DataNodeCase createDataNodeCase();

	/**
	 * Returns a new object of class '<em>Data Node Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Function</em>'.
	 * @generated
	 */
	DataNodeFunction createDataNodeFunction();

	/**
	 * Returns a new object of class '<em>Bag Element Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Element Function</em>'.
	 * @generated
	 */
	BagElementFunction createBagElementFunction();

	/**
	 * Returns a new object of class '<em>Data Node Value Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Value Function</em>'.
	 * @generated
	 */
	DataNodeValueFunction createDataNodeValueFunction();

	/**
	 * Returns a new object of class '<em>Data Value Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value Function</em>'.
	 * @generated
	 */
	DataValueFunction createDataValueFunction();

	/**
	 * Returns a new object of class '<em>Sub Class Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Class Function</em>'.
	 * @generated
	 */
	SubClassFunction createSubClassFunction();

	/**
	 * Returns a new object of class '<em>Predicate Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Function</em>'.
	 * @generated
	 */
	PredicateFunction createPredicateFunction();

	/**
	 * Returns a new object of class '<em>Feature Tree Valid Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Tree Valid Function</em>'.
	 * @generated
	 */
	FeatureTreeValidFunction createFeatureTreeValidFunction();

	/**
	 * Returns a new object of class '<em>Arithmetric Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetric Stand Alone Function</em>'.
	 * @generated
	 */
	ArithmetricStandAloneFunction createArithmetricStandAloneFunction();

	/**
	 * Returns a new object of class '<em>Arithmetric Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetric Reference Function</em>'.
	 * @generated
	 */
	ArithmetricReferenceFunction createArithmetricReferenceFunction();

	/**
	 * Returns a new object of class '<em>Data Node Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Stand Alone Function</em>'.
	 * @generated
	 */
	DataNodeStandAloneFunction createDataNodeStandAloneFunction();

	/**
	 * Returns a new object of class '<em>Data Node Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node Reference Function</em>'.
	 * @generated
	 */
	DataNodeReferenceFunction createDataNodeReferenceFunction();

	/**
	 * Returns a new object of class '<em>Value Stand Alone Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Stand Alone Function</em>'.
	 * @generated
	 */
	ValueStandAloneFunction createValueStandAloneFunction();

	/**
	 * Returns a new object of class '<em>Value Reference Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Reference Function</em>'.
	 * @generated
	 */
	ValueReferenceFunction createValueReferenceFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
