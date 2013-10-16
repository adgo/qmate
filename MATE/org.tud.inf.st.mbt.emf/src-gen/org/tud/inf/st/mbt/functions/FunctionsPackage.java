/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.tud.inf.st.mbt.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.IFunction <em>IFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.IFunction
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIFunction()
	 * @generated
	 */
	int IFUNCTION = 0;

	/**
	 * The number of structural features of the '<em>IFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.FunctionVariableImpl <em>Function Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionVariableImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFunctionVariable()
	 * @generated
	 */
	int FUNCTION_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VARIABLE__ID = IFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VARIABLE_FEATURE_COUNT = IFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ReferenceFunctionImpl <em>Reference Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ReferenceFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getReferenceFunction()
	 * @generated
	 */
	int REFERENCE_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FUNCTION__PARAMETERS = IFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FUNCTION_FEATURE_COUNT = IFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricFunctionVariableImpl <em>Arithmetric Function Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricFunctionVariableImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricFunctionVariable()
	 * @generated
	 */
	int ARITHMETRIC_FUNCTION_VARIABLE = 6;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeFunctionVariableImpl <em>Data Node Function Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeFunctionVariableImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeFunctionVariable()
	 * @generated
	 */
	int DATA_NODE_FUNCTION_VARIABLE = 9;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ValueFunctionVariableImpl <em>Value Function Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ValueFunctionVariableImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueFunctionVariable()
	 * @generated
	 */
	int VALUE_FUNCTION_VARIABLE = 12;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.ILogicFunction <em>ILogic Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.ILogicFunction
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getILogicFunction()
	 * @generated
	 */
	int ILOGIC_FUNCTION = 17;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl <em>Arithmetric Logic Binary Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricLogicBinaryFunction()
	 * @generated
	 */
	int ARITHMETRIC_LOGIC_BINARY_FUNCTION = 18;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.EqualFunctionImpl <em>Equal Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.EqualFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getEqualFunction()
	 * @generated
	 */
	int EQUAL_FUNCTION = 22;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LargerThanFunctionImpl <em>Larger Than Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LargerThanFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLargerThanFunction()
	 * @generated
	 */
	int LARGER_THAN_FUNCTION = 23;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LowerThanFunctionImpl <em>Lower Than Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LowerThanFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLowerThanFunction()
	 * @generated
	 */
	int LOWER_THAN_FUNCTION = 24;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.IArithmetricFunction <em>IArithmetric Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.IArithmetricFunction
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIArithmetricFunction()
	 * @generated
	 */
	int IARITHMETRIC_FUNCTION = 25;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.UnaryFunctionImpl <em>Unary Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.UnaryFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getUnaryFunction()
	 * @generated
	 */
	int UNARY_FUNCTION = 26;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BinaryFunctionImpl <em>Binary Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BinaryFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBinaryFunction()
	 * @generated
	 */
	int BINARY_FUNCTION = 27;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.PlusFunctionImpl <em>Plus Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.PlusFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getPlusFunction()
	 * @generated
	 */
	int PLUS_FUNCTION = 28;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.SubFunctionImpl <em>Sub Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.SubFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getSubFunction()
	 * @generated
	 */
	int SUB_FUNCTION = 29;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.MinusFunctionImpl <em>Minus Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.MinusFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getMinusFunction()
	 * @generated
	 */
	int MINUS_FUNCTION = 30;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.MultiplyFunctionImpl <em>Multiply Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.MultiplyFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getMultiplyFunction()
	 * @generated
	 */
	int MULTIPLY_FUNCTION = 31;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DivisionFunctionImpl <em>Division Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DivisionFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDivisionFunction()
	 * @generated
	 */
	int DIVISION_FUNCTION = 32;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.FloatFunctionImpl <em>Float Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.FloatFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFloatFunction()
	 * @generated
	 */
	int FLOAT_FUNCTION = 33;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.IntFunctionImpl <em>Int Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.IntFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIntFunction()
	 * @generated
	 */
	int INT_FUNCTION = 34;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LongFunctionImpl <em>Long Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LongFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLongFunction()
	 * @generated
	 */
	int LONG_FUNCTION = 35;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagCountFunctionImpl <em>Bag Count Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagCountFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagCountFunction()
	 * @generated
	 */
	int BAG_COUNT_FUNCTION = 36;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl <em>Bag Idx Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagIdxFunction()
	 * @generated
	 */
	int BAG_IDX_FUNCTION = 37;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagSizeFunctionImpl <em>Bag Size Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagSizeFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagSizeFunction()
	 * @generated
	 */
	int BAG_SIZE_FUNCTION = 38;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagNextFunctionImpl <em>Bag Next Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagNextFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagNextFunction()
	 * @generated
	 */
	int BAG_NEXT_FUNCTION = 39;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagFirstFreeFunctionImpl <em>Bag First Free Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagFirstFreeFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagFirstFreeFunction()
	 * @generated
	 */
	int BAG_FIRST_FREE_FUNCTION = 40;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.TimeFunctionImpl <em>Time Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.TimeFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getTimeFunction()
	 * @generated
	 */
	int TIME_FUNCTION = 41;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.TokenFunctionImpl <em>Token Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.TokenFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getTokenFunction()
	 * @generated
	 */
	int TOKEN_FUNCTION = 42;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricCaseFunctionImpl <em>Arithmetric Case Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricCaseFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricCaseFunction()
	 * @generated
	 */
	int ARITHMETRIC_CASE_FUNCTION = 48;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricCaseImpl <em>Arithmetric Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricCaseImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricCase()
	 * @generated
	 */
	int ARITHMETRIC_CASE = 49;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.IDataNodeFunction <em>IData Node Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.IDataNodeFunction
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIDataNodeFunction()
	 * @generated
	 */
	int IDATA_NODE_FUNCTION = 43;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeFunctionImpl <em>Data Node Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeFunction()
	 * @generated
	 */
	int DATA_NODE_FUNCTION = 44;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl <em>Bag Element Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagElementFunction()
	 * @generated
	 */
	int BAG_ELEMENT_FUNCTION = 45;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeValueFunctionImpl <em>Data Node Value Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeValueFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeValueFunction()
	 * @generated
	 */
	int DATA_NODE_VALUE_FUNCTION = 46;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.SubClassFunctionImpl <em>Sub Class Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.SubClassFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getSubClassFunction()
	 * @generated
	 */
	int SUB_CLASS_FUNCTION = 19;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.StandAloneFunctionImpl <em>Stand Alone Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.StandAloneFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getStandAloneFunction()
	 * @generated
	 */
	int STAND_ALONE_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION__NOTE = CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION__ID = CorePackage.ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION__TRACEABLE_TO = CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION__NAME = CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION__PARAMETERS = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stand Alone Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAND_ALONE_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.IValueFunction <em>IValue Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.IValueFunction
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIValueFunction()
	 * @generated
	 */
	int IVALUE_FUNCTION = 16;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricStandAloneFunctionImpl <em>Arithmetric Stand Alone Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricStandAloneFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricStandAloneFunction()
	 * @generated
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__NOTE = STAND_ALONE_FUNCTION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__ID = STAND_ALONE_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__TRACEABLE_TO = STAND_ALONE_FUNCTION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__NAME = STAND_ALONE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__PARAMETERS = STAND_ALONE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION__FUNCTION = STAND_ALONE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetric Stand Alone Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_STAND_ALONE_FUNCTION_FEATURE_COUNT = STAND_ALONE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IValue Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_FUNCTION_FEATURE_COUNT = IFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IArithmetric Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARITHMETRIC_FUNCTION_FEATURE_COUNT = IVALUE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricReferenceFunctionImpl <em>Arithmetric Reference Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricReferenceFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricReferenceFunction()
	 * @generated
	 */
	int ARITHMETRIC_REFERENCE_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_REFERENCE_FUNCTION__PARAMETERS = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_REFERENCE_FUNCTION__FUNCTION = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arithmetric Reference Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_REFERENCE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_FUNCTION_VARIABLE__ID = FUNCTION_VARIABLE__ID;

	/**
	 * The number of structural features of the '<em>Arithmetric Function Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_FUNCTION_VARIABLE_FEATURE_COUNT = FUNCTION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeStandAloneFunctionImpl <em>Data Node Stand Alone Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeStandAloneFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeStandAloneFunction()
	 * @generated
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__NOTE = STAND_ALONE_FUNCTION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__ID = STAND_ALONE_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__TRACEABLE_TO = STAND_ALONE_FUNCTION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__NAME = STAND_ALONE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__PARAMETERS = STAND_ALONE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION__FUNCTION = STAND_ALONE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node Stand Alone Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_STAND_ALONE_FUNCTION_FEATURE_COUNT = STAND_ALONE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeReferenceFunctionImpl <em>Data Node Reference Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeReferenceFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeReferenceFunction()
	 * @generated
	 */
	int DATA_NODE_REFERENCE_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_REFERENCE_FUNCTION__PARAMETERS = REFERENCE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_REFERENCE_FUNCTION__FUNCTION = REFERENCE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node Reference Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_REFERENCE_FUNCTION_FEATURE_COUNT = REFERENCE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FUNCTION_VARIABLE__ID = FUNCTION_VARIABLE__ID;

	/**
	 * The number of structural features of the '<em>Data Node Function Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FUNCTION_VARIABLE_FEATURE_COUNT = FUNCTION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ValueStandAloneFunctionImpl <em>Value Stand Alone Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ValueStandAloneFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueStandAloneFunction()
	 * @generated
	 */
	int VALUE_STAND_ALONE_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__NOTE = STAND_ALONE_FUNCTION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__ID = STAND_ALONE_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__TRACEABLE_TO = STAND_ALONE_FUNCTION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__NAME = STAND_ALONE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__PARAMETERS = STAND_ALONE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION__FUNCTION = STAND_ALONE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Stand Alone Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STAND_ALONE_FUNCTION_FEATURE_COUNT = STAND_ALONE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl <em>Value Reference Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueReferenceFunction()
	 * @generated
	 */
	int VALUE_REFERENCE_FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_FUNCTION__PARAMETERS = IVALUE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_FUNCTION__FUNCTION = IVALUE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Reference Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_FUNCTION_FEATURE_COUNT = IVALUE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FUNCTION_VARIABLE__ID = FUNCTION_VARIABLE__ID;

	/**
	 * The number of structural features of the '<em>Value Function Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FUNCTION_VARIABLE_FEATURE_COUNT = FUNCTION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LogicStandAloneFunctionImpl <em>Logic Stand Alone Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LogicStandAloneFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicStandAloneFunction()
	 * @generated
	 */
	int LOGIC_STAND_ALONE_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__NOTE = STAND_ALONE_FUNCTION__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__ID = STAND_ALONE_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__TRACEABLE_TO = STAND_ALONE_FUNCTION__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__NAME = STAND_ALONE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__PARAMETERS = STAND_ALONE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION__FUNCTION = STAND_ALONE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Stand Alone Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_STAND_ALONE_FUNCTION_FEATURE_COUNT = STAND_ALONE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LogicReferenceFunctionImpl <em>Logic Reference Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LogicReferenceFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicReferenceFunction()
	 * @generated
	 */
	int LOGIC_REFERENCE_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_REFERENCE_FUNCTION__PARAMETERS = REFERENCE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_REFERENCE_FUNCTION__FUNCTION = REFERENCE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Reference Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_REFERENCE_FUNCTION_FEATURE_COUNT = REFERENCE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.LogicFunctionVariableImpl <em>Logic Function Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.LogicFunctionVariableImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicFunctionVariable()
	 * @generated
	 */
	int LOGIC_FUNCTION_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_VARIABLE__ID = FUNCTION_VARIABLE__ID;

	/**
	 * The number of structural features of the '<em>Logic Function Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_VARIABLE_FEATURE_COUNT = FUNCTION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ILogic Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILOGIC_FUNCTION_FEATURE_COUNT = IVALUE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT = ILOGIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT = ILOGIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arithmetric Logic Binary Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_LOGIC_BINARY_FUNCTION_FEATURE_COUNT = ILOGIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_FUNCTION__SUB = ILOGIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_FUNCTION__IN = ILOGIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Class Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_FUNCTION_FEATURE_COUNT = ILOGIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.PredicateFunctionImpl <em>Predicate Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.PredicateFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getPredicateFunction()
	 * @generated
	 */
	int PREDICATE_FUNCTION = 20;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FUNCTION__PREDICATE = ILOGIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FUNCTION_FEATURE_COUNT = ILOGIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.FeatureTreeValidFunctionImpl <em>Feature Tree Valid Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.FeatureTreeValidFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFeatureTreeValidFunction()
	 * @generated
	 */
	int FEATURE_TREE_VALID_FUNCTION = 21;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_VALID_FUNCTION__TREE = ILOGIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Tree Valid Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_VALID_FUNCTION_FEATURE_COUNT = ILOGIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FUNCTION__LEFT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FUNCTION__RIGHT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FUNCTION_FEATURE_COUNT = ARITHMETRIC_LOGIC_BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGER_THAN_FUNCTION__LEFT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGER_THAN_FUNCTION__RIGHT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Larger Than Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGER_THAN_FUNCTION_FEATURE_COUNT = ARITHMETRIC_LOGIC_BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_FUNCTION__LEFT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_FUNCTION__RIGHT = ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Lower Than Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_FUNCTION_FEATURE_COUNT = ARITHMETRIC_LOGIC_BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FUNCTION__OPERAND = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FUNCTION__LEFT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FUNCTION__RIGHT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FUNCTION__LEFT = BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FUNCTION__RIGHT = BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Plus Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FUNCTION_FEATURE_COUNT = BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION__OPERAND = UNARY_FUNCTION__OPERAND;

	/**
	 * The number of structural features of the '<em>Sub Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_FEATURE_COUNT = UNARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FUNCTION__LEFT = BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FUNCTION__RIGHT = BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Minus Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FUNCTION_FEATURE_COUNT = BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FUNCTION__LEFT = BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FUNCTION__RIGHT = BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Multiply Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FUNCTION_FEATURE_COUNT = BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FUNCTION__LEFT = BINARY_FUNCTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FUNCTION__RIGHT = BINARY_FUNCTION__RIGHT;

	/**
	 * The number of structural features of the '<em>Division Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FUNCTION_FEATURE_COUNT = BINARY_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FUNCTION__VALUE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FUNCTION__VALUE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FUNCTION__VALUE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_COUNT_FUNCTION__BAG = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_COUNT_FUNCTION__NEEDLE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bag Count Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_COUNT_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_IDX_FUNCTION__BAG = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_IDX_FUNCTION__NEEDLE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bag Idx Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_IDX_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_SIZE_FUNCTION__BAG = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag Size Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_SIZE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_NEXT_FUNCTION__BAG = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag Next Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_NEXT_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FIRST_FREE_FUNCTION__BAG = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag First Free Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FIRST_FREE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION__CONSUMER = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FUNCTION__PLACE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ValueCaseFunctionImpl <em>Value Case Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ValueCaseFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueCaseFunction()
	 * @generated
	 */
	int VALUE_CASE_FUNCTION = 50;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.ValueCaseImpl <em>Value Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.ValueCaseImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueCase()
	 * @generated
	 */
	int VALUE_CASE = 51;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeCaseFunctionImpl <em>Data Node Case Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeCaseFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeCaseFunction()
	 * @generated
	 */
	int DATA_NODE_CASE_FUNCTION = 52;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeCaseImpl <em>Data Node Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataNodeCaseImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeCase()
	 * @generated
	 */
	int DATA_NODE_CASE = 53;

	/**
	 * The number of structural features of the '<em>IData Node Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDATA_NODE_FUNCTION_FEATURE_COUNT = IFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FUNCTION__DATA = IDATA_NODE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FUNCTION_FEATURE_COUNT = IDATA_NODE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_FUNCTION__DATA = IDATA_NODE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Idx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_FUNCTION__IDX = IDATA_NODE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bag Element Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_FUNCTION_FEATURE_COUNT = IDATA_NODE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_VALUE_FUNCTION__NODE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node Value Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_VALUE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.functions.impl.DataValueFunctionImpl <em>Data Value Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.functions.impl.DataValueFunctionImpl
	 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataValueFunction()
	 * @generated
	 */
	int DATA_VALUE_FUNCTION = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FUNCTION__VALUE = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Value Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_CASE_FUNCTION__CASES = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetric Case Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_CASE_FUNCTION_FEATURE_COUNT = IARITHMETRIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_CASE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_CASE__THEN = 1;

	/**
	 * The number of structural features of the '<em>Arithmetric Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETRIC_CASE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CASE_FUNCTION__CASES = IVALUE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Case Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CASE_FUNCTION_FEATURE_COUNT = IVALUE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CASE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CASE__THEN = 1;

	/**
	 * The number of structural features of the '<em>Value Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CASE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_CASE_FUNCTION__CASES = IDATA_NODE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node Case Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_CASE_FUNCTION_FEATURE_COUNT = IDATA_NODE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_CASE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_CASE__THEN = 1;

	/**
	 * The number of structural features of the '<em>Data Node Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_CASE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.IFunction <em>IFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFunction</em>'.
	 * @see org.tud.inf.st.mbt.functions.IFunction
	 * @generated
	 */
	EClass getIFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.FunctionVariable <em>Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Variable</em>'.
	 * @see org.tud.inf.st.mbt.functions.FunctionVariable
	 * @generated
	 */
	EClass getFunctionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.functions.FunctionVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tud.inf.st.mbt.functions.FunctionVariable#getId()
	 * @see #getFunctionVariable()
	 * @generated
	 */
	EAttribute getFunctionVariable_Id();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ReferenceFunction <em>Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ReferenceFunction
	 * @generated
	 */
	EClass getReferenceFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.functions.ReferenceFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.tud.inf.st.mbt.functions.ReferenceFunction#getParameters()
	 * @see #getReferenceFunction()
	 * @generated
	 */
	EReference getReferenceFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricFunctionVariable <em>Arithmetric Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Function Variable</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricFunctionVariable
	 * @generated
	 */
	EClass getArithmetricFunctionVariable();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeFunctionVariable <em>Data Node Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Function Variable</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeFunctionVariable
	 * @generated
	 */
	EClass getDataNodeFunctionVariable();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ValueFunctionVariable <em>Value Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Function Variable</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueFunctionVariable
	 * @generated
	 */
	EClass getValueFunctionVariable();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LogicStandAloneFunction <em>Logic Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Stand Alone Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LogicStandAloneFunction
	 * @generated
	 */
	EClass getLogicStandAloneFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.LogicStandAloneFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LogicStandAloneFunction#getFunction()
	 * @see #getLogicStandAloneFunction()
	 * @generated
	 */
	EReference getLogicStandAloneFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LogicReferenceFunction <em>Logic Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Reference Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LogicReferenceFunction
	 * @generated
	 */
	EClass getLogicReferenceFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.LogicReferenceFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LogicReferenceFunction#getFunction()
	 * @see #getLogicReferenceFunction()
	 * @generated
	 */
	EReference getLogicReferenceFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LogicFunctionVariable <em>Logic Function Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Function Variable</em>'.
	 * @see org.tud.inf.st.mbt.functions.LogicFunctionVariable
	 * @generated
	 */
	EClass getLogicFunctionVariable();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ILogicFunction <em>ILogic Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILogic Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ILogicFunction
	 * @generated
	 */
	EClass getILogicFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction <em>Arithmetric Logic Binary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Logic Binary Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction
	 * @generated
	 */
	EClass getArithmetricLogicBinaryFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction#getLeft()
	 * @see #getArithmetricLogicBinaryFunction()
	 * @generated
	 */
	EReference getArithmetricLogicBinaryFunction_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction#getRight()
	 * @see #getArithmetricLogicBinaryFunction()
	 * @generated
	 */
	EReference getArithmetricLogicBinaryFunction_Right();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.PredicateFunction <em>Predicate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.PredicateFunction
	 * @generated
	 */
	EClass getPredicateFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.PredicateFunction#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.tud.inf.st.mbt.functions.PredicateFunction#getPredicate()
	 * @see #getPredicateFunction()
	 * @generated
	 */
	EReference getPredicateFunction_Predicate();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.FeatureTreeValidFunction <em>Feature Tree Valid Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Tree Valid Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.FeatureTreeValidFunction
	 * @generated
	 */
	EClass getFeatureTreeValidFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.FeatureTreeValidFunction#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree</em>'.
	 * @see org.tud.inf.st.mbt.functions.FeatureTreeValidFunction#getTree()
	 * @see #getFeatureTreeValidFunction()
	 * @generated
	 */
	EReference getFeatureTreeValidFunction_Tree();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.EqualFunction <em>Equal Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.EqualFunction
	 * @generated
	 */
	EClass getEqualFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LargerThanFunction <em>Larger Than Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Larger Than Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LargerThanFunction
	 * @generated
	 */
	EClass getLargerThanFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LowerThanFunction <em>Lower Than Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LowerThanFunction
	 * @generated
	 */
	EClass getLowerThanFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.IArithmetricFunction <em>IArithmetric Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IArithmetric Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.IArithmetricFunction
	 * @generated
	 */
	EClass getIArithmetricFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.UnaryFunction <em>Unary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.UnaryFunction
	 * @generated
	 */
	EClass getUnaryFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.UnaryFunction#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.tud.inf.st.mbt.functions.UnaryFunction#getOperand()
	 * @see #getUnaryFunction()
	 * @generated
	 */
	EReference getUnaryFunction_Operand();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BinaryFunction <em>Binary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BinaryFunction
	 * @generated
	 */
	EClass getBinaryFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.BinaryFunction#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.tud.inf.st.mbt.functions.BinaryFunction#getLeft()
	 * @see #getBinaryFunction()
	 * @generated
	 */
	EReference getBinaryFunction_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.BinaryFunction#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.tud.inf.st.mbt.functions.BinaryFunction#getRight()
	 * @see #getBinaryFunction()
	 * @generated
	 */
	EReference getBinaryFunction_Right();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.PlusFunction <em>Plus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.PlusFunction
	 * @generated
	 */
	EClass getPlusFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.SubFunction <em>Sub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.SubFunction
	 * @generated
	 */
	EClass getSubFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.MinusFunction <em>Minus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.MinusFunction
	 * @generated
	 */
	EClass getMinusFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.MultiplyFunction <em>Multiply Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.MultiplyFunction
	 * @generated
	 */
	EClass getMultiplyFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DivisionFunction <em>Division Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DivisionFunction
	 * @generated
	 */
	EClass getDivisionFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.FloatFunction <em>Float Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.FloatFunction
	 * @generated
	 */
	EClass getFloatFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.functions.FloatFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.functions.FloatFunction#getValue()
	 * @see #getFloatFunction()
	 * @generated
	 */
	EAttribute getFloatFunction_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.IntFunction <em>Int Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.IntFunction
	 * @generated
	 */
	EClass getIntFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.functions.IntFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.functions.IntFunction#getValue()
	 * @see #getIntFunction()
	 * @generated
	 */
	EAttribute getIntFunction_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.LongFunction <em>Long Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.LongFunction
	 * @generated
	 */
	EClass getLongFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.functions.LongFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.functions.LongFunction#getValue()
	 * @see #getLongFunction()
	 * @generated
	 */
	EAttribute getLongFunction_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagCountFunction <em>Bag Count Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Count Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagCountFunction
	 * @generated
	 */
	EClass getBagCountFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagCountFunction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagCountFunction#getBag()
	 * @see #getBagCountFunction()
	 * @generated
	 */
	EReference getBagCountFunction_Bag();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.BagCountFunction#getNeedle <em>Needle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Needle</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagCountFunction#getNeedle()
	 * @see #getBagCountFunction()
	 * @generated
	 */
	EReference getBagCountFunction_Needle();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagIdxFunction <em>Bag Idx Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Idx Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagIdxFunction
	 * @generated
	 */
	EClass getBagIdxFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagIdxFunction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagIdxFunction#getBag()
	 * @see #getBagIdxFunction()
	 * @generated
	 */
	EReference getBagIdxFunction_Bag();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.BagIdxFunction#getNeedle <em>Needle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Needle</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagIdxFunction#getNeedle()
	 * @see #getBagIdxFunction()
	 * @generated
	 */
	EReference getBagIdxFunction_Needle();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagSizeFunction <em>Bag Size Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Size Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagSizeFunction
	 * @generated
	 */
	EClass getBagSizeFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagSizeFunction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagSizeFunction#getBag()
	 * @see #getBagSizeFunction()
	 * @generated
	 */
	EReference getBagSizeFunction_Bag();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagNextFunction <em>Bag Next Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Next Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagNextFunction
	 * @generated
	 */
	EClass getBagNextFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagNextFunction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagNextFunction#getBag()
	 * @see #getBagNextFunction()
	 * @generated
	 */
	EReference getBagNextFunction_Bag();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagFirstFreeFunction <em>Bag First Free Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag First Free Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagFirstFreeFunction
	 * @generated
	 */
	EClass getBagFirstFreeFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagFirstFreeFunction#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagFirstFreeFunction#getBag()
	 * @see #getBagFirstFreeFunction()
	 * @generated
	 */
	EReference getBagFirstFreeFunction_Bag();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.TimeFunction <em>Time Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.TimeFunction
	 * @generated
	 */
	EClass getTimeFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.TimeFunction#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.tud.inf.st.mbt.functions.TimeFunction#getConsumer()
	 * @see #getTimeFunction()
	 * @generated
	 */
	EReference getTimeFunction_Consumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.TokenFunction <em>Token Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.TokenFunction
	 * @generated
	 */
	EClass getTokenFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.TokenFunction#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see org.tud.inf.st.mbt.functions.TokenFunction#getPlace()
	 * @see #getTokenFunction()
	 * @generated
	 */
	EReference getTokenFunction_Place();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricCaseFunction <em>Arithmetric Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Case Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCaseFunction
	 * @generated
	 */
	EClass getArithmetricCaseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.functions.ArithmetricCaseFunction#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCaseFunction#getCases()
	 * @see #getArithmetricCaseFunction()
	 * @generated
	 */
	EReference getArithmetricCaseFunction_Cases();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricCase <em>Arithmetric Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Case</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCase
	 * @generated
	 */
	EClass getArithmetricCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCase#getCondition()
	 * @see #getArithmetricCase()
	 * @generated
	 */
	EReference getArithmetricCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ArithmetricCase#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricCase#getThen()
	 * @see #getArithmetricCase()
	 * @generated
	 */
	EReference getArithmetricCase_Then();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ValueCaseFunction <em>Value Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Case Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueCaseFunction
	 * @generated
	 */
	EClass getValueCaseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.functions.ValueCaseFunction#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueCaseFunction#getCases()
	 * @see #getValueCaseFunction()
	 * @generated
	 */
	EReference getValueCaseFunction_Cases();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ValueCase <em>Value Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Case</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueCase
	 * @generated
	 */
	EClass getValueCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ValueCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueCase#getCondition()
	 * @see #getValueCase()
	 * @generated
	 */
	EReference getValueCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ValueCase#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueCase#getThen()
	 * @see #getValueCase()
	 * @generated
	 */
	EReference getValueCase_Then();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeCaseFunction <em>Data Node Case Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Case Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCaseFunction
	 * @generated
	 */
	EClass getDataNodeCaseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.functions.DataNodeCaseFunction#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCaseFunction#getCases()
	 * @see #getDataNodeCaseFunction()
	 * @generated
	 */
	EReference getDataNodeCaseFunction_Cases();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeCase <em>Data Node Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Case</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCase
	 * @generated
	 */
	EClass getDataNodeCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.DataNodeCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCase#getCondition()
	 * @see #getDataNodeCase()
	 * @generated
	 */
	EReference getDataNodeCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.DataNodeCase#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeCase#getThen()
	 * @see #getDataNodeCase()
	 * @generated
	 */
	EReference getDataNodeCase_Then();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.IDataNodeFunction <em>IData Node Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IData Node Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.IDataNodeFunction
	 * @generated
	 */
	EClass getIDataNodeFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeFunction <em>Data Node Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeFunction
	 * @generated
	 */
	EClass getDataNodeFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.DataNodeFunction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeFunction#getData()
	 * @see #getDataNodeFunction()
	 * @generated
	 */
	EReference getDataNodeFunction_Data();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.BagElementFunction <em>Bag Element Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Element Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagElementFunction
	 * @generated
	 */
	EClass getBagElementFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.BagElementFunction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagElementFunction#getData()
	 * @see #getBagElementFunction()
	 * @generated
	 */
	EReference getBagElementFunction_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.BagElementFunction#getIdx <em>Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idx</em>'.
	 * @see org.tud.inf.st.mbt.functions.BagElementFunction#getIdx()
	 * @see #getBagElementFunction()
	 * @generated
	 */
	EReference getBagElementFunction_Idx();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeValueFunction <em>Data Node Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Value Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeValueFunction
	 * @generated
	 */
	EClass getDataNodeValueFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.DataNodeValueFunction#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeValueFunction#getNode()
	 * @see #getDataNodeValueFunction()
	 * @generated
	 */
	EReference getDataNodeValueFunction_Node();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataValueFunction <em>Data Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataValueFunction
	 * @generated
	 */
	EClass getDataValueFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.DataValueFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataValueFunction#getValue()
	 * @see #getDataValueFunction()
	 * @generated
	 */
	EReference getDataValueFunction_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.SubClassFunction <em>Sub Class Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.SubClassFunction
	 * @generated
	 */
	EClass getSubClassFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.SubClassFunction#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.tud.inf.st.mbt.functions.SubClassFunction#getSub()
	 * @see #getSubClassFunction()
	 * @generated
	 */
	EReference getSubClassFunction_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.SubClassFunction#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see org.tud.inf.st.mbt.functions.SubClassFunction#getIn()
	 * @see #getSubClassFunction()
	 * @generated
	 */
	EReference getSubClassFunction_In();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.StandAloneFunction <em>Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stand Alone Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.StandAloneFunction
	 * @generated
	 */
	EClass getStandAloneFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.functions.StandAloneFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.tud.inf.st.mbt.functions.StandAloneFunction#getParameters()
	 * @see #getStandAloneFunction()
	 * @generated
	 */
	EReference getStandAloneFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.IValueFunction <em>IValue Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IValue Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.IValueFunction
	 * @generated
	 */
	EClass getIValueFunction();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction <em>Arithmetric Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Stand Alone Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction
	 * @generated
	 */
	EClass getArithmetricStandAloneFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction#getFunction()
	 * @see #getArithmetricStandAloneFunction()
	 * @generated
	 */
	EReference getArithmetricStandAloneFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction <em>Arithmetric Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetric Reference Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction
	 * @generated
	 */
	EClass getArithmetricReferenceFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction#getFunction()
	 * @see #getArithmetricReferenceFunction()
	 * @generated
	 */
	EReference getArithmetricReferenceFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction <em>Data Node Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Stand Alone Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction
	 * @generated
	 */
	EClass getDataNodeStandAloneFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction#getFunction()
	 * @see #getDataNodeStandAloneFunction()
	 * @generated
	 */
	EReference getDataNodeStandAloneFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.DataNodeReferenceFunction <em>Data Node Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node Reference Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeReferenceFunction
	 * @generated
	 */
	EClass getDataNodeReferenceFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.DataNodeReferenceFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.DataNodeReferenceFunction#getFunction()
	 * @see #getDataNodeReferenceFunction()
	 * @generated
	 */
	EReference getDataNodeReferenceFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ValueStandAloneFunction <em>Value Stand Alone Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Stand Alone Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueStandAloneFunction
	 * @generated
	 */
	EClass getValueStandAloneFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.functions.ValueStandAloneFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueStandAloneFunction#getFunction()
	 * @see #getValueStandAloneFunction()
	 * @generated
	 */
	EReference getValueStandAloneFunction_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.functions.ValueReferenceFunction <em>Value Reference Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Reference Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueReferenceFunction
	 * @generated
	 */
	EClass getValueReferenceFunction();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.functions.ValueReferenceFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.functions.ValueReferenceFunction#getFunction()
	 * @see #getValueReferenceFunction()
	 * @generated
	 */
	EReference getValueReferenceFunction_Function();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.IFunction <em>IFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.IFunction
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIFunction()
		 * @generated
		 */
		EClass IFUNCTION = eINSTANCE.getIFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.FunctionVariableImpl <em>Function Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionVariableImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFunctionVariable()
		 * @generated
		 */
		EClass FUNCTION_VARIABLE = eINSTANCE.getFunctionVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_VARIABLE__ID = eINSTANCE.getFunctionVariable_Id();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ReferenceFunctionImpl <em>Reference Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ReferenceFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getReferenceFunction()
		 * @generated
		 */
		EClass REFERENCE_FUNCTION = eINSTANCE.getReferenceFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_FUNCTION__PARAMETERS = eINSTANCE.getReferenceFunction_Parameters();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricFunctionVariableImpl <em>Arithmetric Function Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricFunctionVariableImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricFunctionVariable()
		 * @generated
		 */
		EClass ARITHMETRIC_FUNCTION_VARIABLE = eINSTANCE.getArithmetricFunctionVariable();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeFunctionVariableImpl <em>Data Node Function Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeFunctionVariableImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeFunctionVariable()
		 * @generated
		 */
		EClass DATA_NODE_FUNCTION_VARIABLE = eINSTANCE.getDataNodeFunctionVariable();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ValueFunctionVariableImpl <em>Value Function Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ValueFunctionVariableImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueFunctionVariable()
		 * @generated
		 */
		EClass VALUE_FUNCTION_VARIABLE = eINSTANCE.getValueFunctionVariable();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LogicStandAloneFunctionImpl <em>Logic Stand Alone Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LogicStandAloneFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicStandAloneFunction()
		 * @generated
		 */
		EClass LOGIC_STAND_ALONE_FUNCTION = eINSTANCE.getLogicStandAloneFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_STAND_ALONE_FUNCTION__FUNCTION = eINSTANCE.getLogicStandAloneFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LogicReferenceFunctionImpl <em>Logic Reference Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LogicReferenceFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicReferenceFunction()
		 * @generated
		 */
		EClass LOGIC_REFERENCE_FUNCTION = eINSTANCE.getLogicReferenceFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_REFERENCE_FUNCTION__FUNCTION = eINSTANCE.getLogicReferenceFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LogicFunctionVariableImpl <em>Logic Function Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LogicFunctionVariableImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLogicFunctionVariable()
		 * @generated
		 */
		EClass LOGIC_FUNCTION_VARIABLE = eINSTANCE.getLogicFunctionVariable();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.ILogicFunction <em>ILogic Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.ILogicFunction
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getILogicFunction()
		 * @generated
		 */
		EClass ILOGIC_FUNCTION = eINSTANCE.getILogicFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl <em>Arithmetric Logic Binary Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricLogicBinaryFunction()
		 * @generated
		 */
		EClass ARITHMETRIC_LOGIC_BINARY_FUNCTION = eINSTANCE.getArithmetricLogicBinaryFunction();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT = eINSTANCE.getArithmetricLogicBinaryFunction_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT = eINSTANCE.getArithmetricLogicBinaryFunction_Right();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.PredicateFunctionImpl <em>Predicate Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.PredicateFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getPredicateFunction()
		 * @generated
		 */
		EClass PREDICATE_FUNCTION = eINSTANCE.getPredicateFunction();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_FUNCTION__PREDICATE = eINSTANCE.getPredicateFunction_Predicate();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.FeatureTreeValidFunctionImpl <em>Feature Tree Valid Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.FeatureTreeValidFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFeatureTreeValidFunction()
		 * @generated
		 */
		EClass FEATURE_TREE_VALID_FUNCTION = eINSTANCE.getFeatureTreeValidFunction();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TREE_VALID_FUNCTION__TREE = eINSTANCE.getFeatureTreeValidFunction_Tree();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.EqualFunctionImpl <em>Equal Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.EqualFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getEqualFunction()
		 * @generated
		 */
		EClass EQUAL_FUNCTION = eINSTANCE.getEqualFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LargerThanFunctionImpl <em>Larger Than Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LargerThanFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLargerThanFunction()
		 * @generated
		 */
		EClass LARGER_THAN_FUNCTION = eINSTANCE.getLargerThanFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LowerThanFunctionImpl <em>Lower Than Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LowerThanFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLowerThanFunction()
		 * @generated
		 */
		EClass LOWER_THAN_FUNCTION = eINSTANCE.getLowerThanFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.IArithmetricFunction <em>IArithmetric Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.IArithmetricFunction
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIArithmetricFunction()
		 * @generated
		 */
		EClass IARITHMETRIC_FUNCTION = eINSTANCE.getIArithmetricFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.UnaryFunctionImpl <em>Unary Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.UnaryFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getUnaryFunction()
		 * @generated
		 */
		EClass UNARY_FUNCTION = eINSTANCE.getUnaryFunction();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_FUNCTION__OPERAND = eINSTANCE.getUnaryFunction_Operand();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BinaryFunctionImpl <em>Binary Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BinaryFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBinaryFunction()
		 * @generated
		 */
		EClass BINARY_FUNCTION = eINSTANCE.getBinaryFunction();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_FUNCTION__LEFT = eINSTANCE.getBinaryFunction_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_FUNCTION__RIGHT = eINSTANCE.getBinaryFunction_Right();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.PlusFunctionImpl <em>Plus Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.PlusFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getPlusFunction()
		 * @generated
		 */
		EClass PLUS_FUNCTION = eINSTANCE.getPlusFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.SubFunctionImpl <em>Sub Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.SubFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getSubFunction()
		 * @generated
		 */
		EClass SUB_FUNCTION = eINSTANCE.getSubFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.MinusFunctionImpl <em>Minus Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.MinusFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getMinusFunction()
		 * @generated
		 */
		EClass MINUS_FUNCTION = eINSTANCE.getMinusFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.MultiplyFunctionImpl <em>Multiply Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.MultiplyFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getMultiplyFunction()
		 * @generated
		 */
		EClass MULTIPLY_FUNCTION = eINSTANCE.getMultiplyFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DivisionFunctionImpl <em>Division Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DivisionFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDivisionFunction()
		 * @generated
		 */
		EClass DIVISION_FUNCTION = eINSTANCE.getDivisionFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.FloatFunctionImpl <em>Float Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.FloatFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getFloatFunction()
		 * @generated
		 */
		EClass FLOAT_FUNCTION = eINSTANCE.getFloatFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_FUNCTION__VALUE = eINSTANCE.getFloatFunction_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.IntFunctionImpl <em>Int Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.IntFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIntFunction()
		 * @generated
		 */
		EClass INT_FUNCTION = eINSTANCE.getIntFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_FUNCTION__VALUE = eINSTANCE.getIntFunction_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.LongFunctionImpl <em>Long Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.LongFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getLongFunction()
		 * @generated
		 */
		EClass LONG_FUNCTION = eINSTANCE.getLongFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_FUNCTION__VALUE = eINSTANCE.getLongFunction_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagCountFunctionImpl <em>Bag Count Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagCountFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagCountFunction()
		 * @generated
		 */
		EClass BAG_COUNT_FUNCTION = eINSTANCE.getBagCountFunction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_COUNT_FUNCTION__BAG = eINSTANCE.getBagCountFunction_Bag();

		/**
		 * The meta object literal for the '<em><b>Needle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_COUNT_FUNCTION__NEEDLE = eINSTANCE.getBagCountFunction_Needle();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl <em>Bag Idx Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagIdxFunction()
		 * @generated
		 */
		EClass BAG_IDX_FUNCTION = eINSTANCE.getBagIdxFunction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_IDX_FUNCTION__BAG = eINSTANCE.getBagIdxFunction_Bag();

		/**
		 * The meta object literal for the '<em><b>Needle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_IDX_FUNCTION__NEEDLE = eINSTANCE.getBagIdxFunction_Needle();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagSizeFunctionImpl <em>Bag Size Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagSizeFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagSizeFunction()
		 * @generated
		 */
		EClass BAG_SIZE_FUNCTION = eINSTANCE.getBagSizeFunction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_SIZE_FUNCTION__BAG = eINSTANCE.getBagSizeFunction_Bag();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagNextFunctionImpl <em>Bag Next Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagNextFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagNextFunction()
		 * @generated
		 */
		EClass BAG_NEXT_FUNCTION = eINSTANCE.getBagNextFunction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_NEXT_FUNCTION__BAG = eINSTANCE.getBagNextFunction_Bag();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagFirstFreeFunctionImpl <em>Bag First Free Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagFirstFreeFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagFirstFreeFunction()
		 * @generated
		 */
		EClass BAG_FIRST_FREE_FUNCTION = eINSTANCE.getBagFirstFreeFunction();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_FIRST_FREE_FUNCTION__BAG = eINSTANCE.getBagFirstFreeFunction_Bag();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.TimeFunctionImpl <em>Time Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.TimeFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getTimeFunction()
		 * @generated
		 */
		EClass TIME_FUNCTION = eINSTANCE.getTimeFunction();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_FUNCTION__CONSUMER = eINSTANCE.getTimeFunction_Consumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.TokenFunctionImpl <em>Token Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.TokenFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getTokenFunction()
		 * @generated
		 */
		EClass TOKEN_FUNCTION = eINSTANCE.getTokenFunction();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_FUNCTION__PLACE = eINSTANCE.getTokenFunction_Place();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricCaseFunctionImpl <em>Arithmetric Case Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricCaseFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricCaseFunction()
		 * @generated
		 */
		EClass ARITHMETRIC_CASE_FUNCTION = eINSTANCE.getArithmetricCaseFunction();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_CASE_FUNCTION__CASES = eINSTANCE.getArithmetricCaseFunction_Cases();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricCaseImpl <em>Arithmetric Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricCaseImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricCase()
		 * @generated
		 */
		EClass ARITHMETRIC_CASE = eINSTANCE.getArithmetricCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_CASE__CONDITION = eINSTANCE.getArithmetricCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_CASE__THEN = eINSTANCE.getArithmetricCase_Then();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ValueCaseFunctionImpl <em>Value Case Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ValueCaseFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueCaseFunction()
		 * @generated
		 */
		EClass VALUE_CASE_FUNCTION = eINSTANCE.getValueCaseFunction();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CASE_FUNCTION__CASES = eINSTANCE.getValueCaseFunction_Cases();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ValueCaseImpl <em>Value Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ValueCaseImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueCase()
		 * @generated
		 */
		EClass VALUE_CASE = eINSTANCE.getValueCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CASE__CONDITION = eINSTANCE.getValueCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CASE__THEN = eINSTANCE.getValueCase_Then();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeCaseFunctionImpl <em>Data Node Case Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeCaseFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeCaseFunction()
		 * @generated
		 */
		EClass DATA_NODE_CASE_FUNCTION = eINSTANCE.getDataNodeCaseFunction();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_CASE_FUNCTION__CASES = eINSTANCE.getDataNodeCaseFunction_Cases();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeCaseImpl <em>Data Node Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeCaseImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeCase()
		 * @generated
		 */
		EClass DATA_NODE_CASE = eINSTANCE.getDataNodeCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_CASE__CONDITION = eINSTANCE.getDataNodeCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_CASE__THEN = eINSTANCE.getDataNodeCase_Then();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.IDataNodeFunction <em>IData Node Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.IDataNodeFunction
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIDataNodeFunction()
		 * @generated
		 */
		EClass IDATA_NODE_FUNCTION = eINSTANCE.getIDataNodeFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeFunctionImpl <em>Data Node Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeFunction()
		 * @generated
		 */
		EClass DATA_NODE_FUNCTION = eINSTANCE.getDataNodeFunction();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_FUNCTION__DATA = eINSTANCE.getDataNodeFunction_Data();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl <em>Bag Element Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getBagElementFunction()
		 * @generated
		 */
		EClass BAG_ELEMENT_FUNCTION = eINSTANCE.getBagElementFunction();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ELEMENT_FUNCTION__DATA = eINSTANCE.getBagElementFunction_Data();

		/**
		 * The meta object literal for the '<em><b>Idx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ELEMENT_FUNCTION__IDX = eINSTANCE.getBagElementFunction_Idx();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeValueFunctionImpl <em>Data Node Value Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeValueFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeValueFunction()
		 * @generated
		 */
		EClass DATA_NODE_VALUE_FUNCTION = eINSTANCE.getDataNodeValueFunction();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_VALUE_FUNCTION__NODE = eINSTANCE.getDataNodeValueFunction_Node();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataValueFunctionImpl <em>Data Value Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataValueFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataValueFunction()
		 * @generated
		 */
		EClass DATA_VALUE_FUNCTION = eINSTANCE.getDataValueFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE_FUNCTION__VALUE = eINSTANCE.getDataValueFunction_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.SubClassFunctionImpl <em>Sub Class Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.SubClassFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getSubClassFunction()
		 * @generated
		 */
		EClass SUB_CLASS_FUNCTION = eINSTANCE.getSubClassFunction();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_FUNCTION__SUB = eINSTANCE.getSubClassFunction_Sub();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_FUNCTION__IN = eINSTANCE.getSubClassFunction_In();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.StandAloneFunctionImpl <em>Stand Alone Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.StandAloneFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getStandAloneFunction()
		 * @generated
		 */
		EClass STAND_ALONE_FUNCTION = eINSTANCE.getStandAloneFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAND_ALONE_FUNCTION__PARAMETERS = eINSTANCE.getStandAloneFunction_Parameters();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.IValueFunction <em>IValue Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.IValueFunction
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getIValueFunction()
		 * @generated
		 */
		EClass IVALUE_FUNCTION = eINSTANCE.getIValueFunction();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricStandAloneFunctionImpl <em>Arithmetric Stand Alone Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricStandAloneFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricStandAloneFunction()
		 * @generated
		 */
		EClass ARITHMETRIC_STAND_ALONE_FUNCTION = eINSTANCE.getArithmetricStandAloneFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_STAND_ALONE_FUNCTION__FUNCTION = eINSTANCE.getArithmetricStandAloneFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ArithmetricReferenceFunctionImpl <em>Arithmetric Reference Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ArithmetricReferenceFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getArithmetricReferenceFunction()
		 * @generated
		 */
		EClass ARITHMETRIC_REFERENCE_FUNCTION = eINSTANCE.getArithmetricReferenceFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETRIC_REFERENCE_FUNCTION__FUNCTION = eINSTANCE.getArithmetricReferenceFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeStandAloneFunctionImpl <em>Data Node Stand Alone Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeStandAloneFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeStandAloneFunction()
		 * @generated
		 */
		EClass DATA_NODE_STAND_ALONE_FUNCTION = eINSTANCE.getDataNodeStandAloneFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_STAND_ALONE_FUNCTION__FUNCTION = eINSTANCE.getDataNodeStandAloneFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.DataNodeReferenceFunctionImpl <em>Data Node Reference Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.DataNodeReferenceFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getDataNodeReferenceFunction()
		 * @generated
		 */
		EClass DATA_NODE_REFERENCE_FUNCTION = eINSTANCE.getDataNodeReferenceFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE_REFERENCE_FUNCTION__FUNCTION = eINSTANCE.getDataNodeReferenceFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ValueStandAloneFunctionImpl <em>Value Stand Alone Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ValueStandAloneFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueStandAloneFunction()
		 * @generated
		 */
		EClass VALUE_STAND_ALONE_FUNCTION = eINSTANCE.getValueStandAloneFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_STAND_ALONE_FUNCTION__FUNCTION = eINSTANCE.getValueStandAloneFunction_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl <em>Value Reference Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl
		 * @see org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl#getValueReferenceFunction()
		 * @generated
		 */
		EClass VALUE_REFERENCE_FUNCTION = eINSTANCE.getValueReferenceFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_REFERENCE_FUNCTION__FUNCTION = eINSTANCE.getValueReferenceFunction_Function();

	}

} //FunctionsPackage
