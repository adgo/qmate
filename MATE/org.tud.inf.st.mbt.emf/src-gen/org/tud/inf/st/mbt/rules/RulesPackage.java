/**
 */
package org.tud.inf.st.mbt.rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.tud.inf.st.mbt.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.tud.inf.st.mbt.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.ITimeConsumer <em>ITime Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.ITimeConsumer
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getITimeConsumer()
	 * @generated
	 */
	int ITIME_CONSUMER = 19;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.Predicate <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.Predicate
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.UnaryOperatorImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__OPERAND = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.NotImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 6;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__OPERAND1 = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__OPERAND2 = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.AndImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.OrImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getOr()
	 * @generated
	 */
	int OR = 8;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.SubPredicateImpl <em>Sub Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.SubPredicateImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getSubPredicate()
	 * @generated
	 */
	int SUB_PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREDICATE__OPERAND = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.XorImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 9;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.ImplicationImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 10;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.Atom <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.Atom
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 4;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.ReasonableAtomImpl <em>Reasonable Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.ReasonableAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getReasonableAtom()
	 * @generated
	 */
	int REASONABLE_ATOM = 5;

	/**
	 * The number of structural features of the '<em>Reasonable Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONABLE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = UNARY_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERAND1 = BINARY_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERAND2 = BINARY_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERAND1 = BINARY_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERAND2 = BINARY_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OPERAND1 = BINARY_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OPERAND2 = BINARY_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__OPERAND1 = BINARY_OPERATOR__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__OPERAND2 = BINARY_OPERATOR__OPERAND2;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.FeatureAtomImpl <em>Feature Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.FeatureAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getFeatureAtom()
	 * @generated
	 */
	int FEATURE_ATOM = 12;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.TrueImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 11;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = REASONABLE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATOM__FEATURE = REASONABLE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATOM__VERSION = REASONABLE_ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ATOM_FEATURE_COUNT = REASONABLE_ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.TokenAtomImpl <em>Token Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.TokenAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTokenAtom()
	 * @generated
	 */
	int TOKEN_ATOM = 15;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl <em>Instruction Pointer Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getInstructionPointerAtom()
	 * @generated
	 */
	int INSTRUCTION_POINTER_ATOM = 16;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.TimeAtomImpl <em>Time Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.TimeAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTimeAtom()
	 * @generated
	 */
	int TIME_ATOM = 20;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.IRealTimeConsumer <em>IReal Time Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.IRealTimeConsumer
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getIRealTimeConsumer()
	 * @generated
	 */
	int IREAL_TIME_CONSUMER = 21;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl <em>Real Time Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getRealTimeAtom()
	 * @generated
	 */
	int REAL_TIME_ATOM = 22;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.ConfigurationAtomImpl <em>Configuration Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.ConfigurationAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getConfigurationAtom()
	 * @generated
	 */
	int CONFIGURATION_ATOM = 17;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.DataAtomImpl <em>Data Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.DataAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getDataAtom()
	 * @generated
	 */
	int DATA_ATOM = 13;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATOM__LEAF = REASONABLE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATOM__VALUE = REASONABLE_ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATOM_FEATURE_COUNT = REASONABLE_ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.LogicFunctionAtomImpl <em>Logic Function Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.LogicFunctionAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getLogicFunctionAtom()
	 * @generated
	 */
	int LOGIC_FUNCTION_ATOM = 14;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_ATOM__FUNCTION = REASONABLE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Function Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_ATOM_FEATURE_COUNT = REASONABLE_ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOM__COUNT = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOM__PLACE = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM__SEQUENCE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM__INSTRUCTION = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stack Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM__STACK_LEVEL = ATOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM__CONTEXT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fall Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM__FALL_BACK = ATOM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Instruction Pointer Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_POINTER_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ATOM__CONFIGURATION = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl <em>Bag Element Assigned Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getBagElementAssignedAtom()
	 * @generated
	 */
	int BAG_ELEMENT_ASSIGNED_ATOM = 18;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_ASSIGNED_ATOM__BAG = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_ASSIGNED_ATOM__IDX = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bag Element Assigned Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ELEMENT_ASSIGNED_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ITime Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITIME_CONSUMER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ATOM__TIME = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ATOM__CONSUMER = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IReal Time Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREAL_TIME_CONSUMER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_ATOM__TIME = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_ATOM__CONSUMER = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real Time Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.rules.impl.ContextEntryImpl <em>Context Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.rules.impl.ContextEntryImpl
	 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getContextEntry()
	 * @generated
	 */
	int CONTEXT_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Context Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.ITimeConsumer <em>ITime Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITime Consumer</em>'.
	 * @see org.tud.inf.st.mbt.rules.ITimeConsumer
	 * @generated
	 */
	EClass getITimeConsumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.tud.inf.st.mbt.rules.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.tud.inf.st.mbt.rules.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.tud.inf.st.mbt.rules.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see org.tud.inf.st.mbt.rules.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.UnaryOperator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.tud.inf.st.mbt.rules.UnaryOperator#getOperand()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EReference getUnaryOperator_Operand();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see org.tud.inf.st.mbt.rules.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand1</em>'.
	 * @see org.tud.inf.st.mbt.rules.BinaryOperator#getOperand1()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Operand1();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand2</em>'.
	 * @see org.tud.inf.st.mbt.rules.BinaryOperator#getOperand2()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Operand2();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.tud.inf.st.mbt.rules.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.SubPredicate <em>Sub Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Predicate</em>'.
	 * @see org.tud.inf.st.mbt.rules.SubPredicate
	 * @generated
	 */
	EClass getSubPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.SubPredicate#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.tud.inf.st.mbt.rules.SubPredicate#getOperand()
	 * @see #getSubPredicate()
	 * @generated
	 */
	EReference getSubPredicate_Operand();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see org.tud.inf.st.mbt.rules.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see org.tud.inf.st.mbt.rules.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.FeatureAtom <em>Feature Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.FeatureAtom
	 * @generated
	 */
	EClass getFeatureAtom();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.FeatureAtom#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tud.inf.st.mbt.rules.FeatureAtom#getFeature()
	 * @see #getFeatureAtom()
	 * @generated
	 */
	EReference getFeatureAtom_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.FeatureAtom#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.tud.inf.st.mbt.rules.FeatureAtom#getVersion()
	 * @see #getFeatureAtom()
	 * @generated
	 */
	EReference getFeatureAtom_Version();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see org.tud.inf.st.mbt.rules.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.ReasonableAtom <em>Reasonable Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasonable Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.ReasonableAtom
	 * @generated
	 */
	EClass getReasonableAtom();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.TokenAtom <em>Token Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.TokenAtom
	 * @generated
	 */
	EClass getTokenAtom();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.TokenAtom#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.tud.inf.st.mbt.rules.TokenAtom#getCount()
	 * @see #getTokenAtom()
	 * @generated
	 */
	EAttribute getTokenAtom_Count();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.TokenAtom#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see org.tud.inf.st.mbt.rules.TokenAtom#getPlace()
	 * @see #getTokenAtom()
	 * @generated
	 */
	EReference getTokenAtom_Place();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom <em>Instruction Pointer Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Pointer Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom
	 * @generated
	 */
	EClass getInstructionPointerAtom();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom#getSequence()
	 * @see #getInstructionPointerAtom()
	 * @generated
	 */
	EReference getInstructionPointerAtom_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom#getInstruction()
	 * @see #getInstructionPointerAtom()
	 * @generated
	 */
	EAttribute getInstructionPointerAtom_Instruction();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getStackLevel <em>Stack Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Level</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom#getStackLevel()
	 * @see #getInstructionPointerAtom()
	 * @generated
	 */
	EAttribute getInstructionPointerAtom_StackLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom#getContext()
	 * @see #getInstructionPointerAtom()
	 * @generated
	 */
	EReference getInstructionPointerAtom_Context();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getFallBack <em>Fall Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fall Back</em>'.
	 * @see org.tud.inf.st.mbt.rules.InstructionPointerAtom#getFallBack()
	 * @see #getInstructionPointerAtom()
	 * @generated
	 */
	EReference getInstructionPointerAtom_FallBack();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.TimeAtom <em>Time Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.TimeAtom
	 * @generated
	 */
	EClass getTimeAtom();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.TimeAtom#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tud.inf.st.mbt.rules.TimeAtom#getTime()
	 * @see #getTimeAtom()
	 * @generated
	 */
	EAttribute getTimeAtom_Time();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.TimeAtom#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.tud.inf.st.mbt.rules.TimeAtom#getConsumer()
	 * @see #getTimeAtom()
	 * @generated
	 */
	EReference getTimeAtom_Consumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.IRealTimeConsumer <em>IReal Time Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReal Time Consumer</em>'.
	 * @see org.tud.inf.st.mbt.rules.IRealTimeConsumer
	 * @generated
	 */
	EClass getIRealTimeConsumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.RealTimeAtom <em>Real Time Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.RealTimeAtom
	 * @generated
	 */
	EClass getRealTimeAtom();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tud.inf.st.mbt.rules.RealTimeAtom#getTime()
	 * @see #getRealTimeAtom()
	 * @generated
	 */
	EAttribute getRealTimeAtom_Time();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.tud.inf.st.mbt.rules.RealTimeAtom#getConsumer()
	 * @see #getRealTimeAtom()
	 * @generated
	 */
	EReference getRealTimeAtom_Consumer();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.ConfigurationAtom <em>Configuration Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.ConfigurationAtom
	 * @generated
	 */
	EClass getConfigurationAtom();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.ConfigurationAtom#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see org.tud.inf.st.mbt.rules.ConfigurationAtom#getConfiguration()
	 * @see #getConfigurationAtom()
	 * @generated
	 */
	EReference getConfigurationAtom_Configuration();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.DataAtom <em>Data Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.DataAtom
	 * @generated
	 */
	EClass getDataAtom();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.DataAtom#getLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf</em>'.
	 * @see org.tud.inf.st.mbt.rules.DataAtom#getLeaf()
	 * @see #getDataAtom()
	 * @generated
	 */
	EReference getDataAtom_Leaf();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.DataAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.rules.DataAtom#getValue()
	 * @see #getDataAtom()
	 * @generated
	 */
	EReference getDataAtom_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.LogicFunctionAtom <em>Logic Function Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Function Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.LogicFunctionAtom
	 * @generated
	 */
	EClass getLogicFunctionAtom();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.LogicFunctionAtom#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.rules.LogicFunctionAtom#getFunction()
	 * @see #getLogicFunctionAtom()
	 * @generated
	 */
	EReference getLogicFunctionAtom_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom <em>Bag Element Assigned Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Element Assigned Atom</em>'.
	 * @see org.tud.inf.st.mbt.rules.BagElementAssignedAtom
	 * @generated
	 */
	EClass getBagElementAssignedAtom();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getBag()
	 * @see #getBagElementAssignedAtom()
	 * @generated
	 */
	EReference getBagElementAssignedAtom_Bag();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getIdx <em>Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idx</em>'.
	 * @see org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getIdx()
	 * @see #getBagElementAssignedAtom()
	 * @generated
	 */
	EAttribute getBagElementAssignedAtom_Idx();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.rules.ContextEntry <em>Context Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Entry</em>'.
	 * @see org.tud.inf.st.mbt.rules.ContextEntry
	 * @generated
	 */
	EClass getContextEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.rules.ContextEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tud.inf.st.mbt.rules.ContextEntry#getId()
	 * @see #getContextEntry()
	 * @generated
	 */
	EAttribute getContextEntry_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.rules.ContextEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.rules.ContextEntry#getValue()
	 * @see #getContextEntry()
	 * @generated
	 */
	EReference getContextEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.ITimeConsumer <em>ITime Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.ITimeConsumer
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getITimeConsumer()
		 * @generated
		 */
		EClass ITIME_CONSUMER = eINSTANCE.getITimeConsumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.Predicate <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.Predicate
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.NotImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.AndImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.UnaryOperatorImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR__OPERAND = eINSTANCE.getUnaryOperator_Operand();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__OPERAND1 = eINSTANCE.getBinaryOperator_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__OPERAND2 = eINSTANCE.getBinaryOperator_Operand2();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.OrImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.SubPredicateImpl <em>Sub Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.SubPredicateImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getSubPredicate()
		 * @generated
		 */
		EClass SUB_PREDICATE = eINSTANCE.getSubPredicate();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PREDICATE__OPERAND = eINSTANCE.getSubPredicate_Operand();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.XorImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.ImplicationImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.FeatureAtomImpl <em>Feature Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.FeatureAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getFeatureAtom()
		 * @generated
		 */
		EClass FEATURE_ATOM = eINSTANCE.getFeatureAtom();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ATOM__FEATURE = eINSTANCE.getFeatureAtom_Feature();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ATOM__VERSION = eINSTANCE.getFeatureAtom_Version();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.TrueImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.Atom <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.Atom
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.ReasonableAtomImpl <em>Reasonable Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.ReasonableAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getReasonableAtom()
		 * @generated
		 */
		EClass REASONABLE_ATOM = eINSTANCE.getReasonableAtom();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.TokenAtomImpl <em>Token Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.TokenAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTokenAtom()
		 * @generated
		 */
		EClass TOKEN_ATOM = eINSTANCE.getTokenAtom();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ATOM__COUNT = eINSTANCE.getTokenAtom_Count();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_ATOM__PLACE = eINSTANCE.getTokenAtom_Place();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl <em>Instruction Pointer Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getInstructionPointerAtom()
		 * @generated
		 */
		EClass INSTRUCTION_POINTER_ATOM = eINSTANCE.getInstructionPointerAtom();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_POINTER_ATOM__SEQUENCE = eINSTANCE.getInstructionPointerAtom_Sequence();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_POINTER_ATOM__INSTRUCTION = eINSTANCE.getInstructionPointerAtom_Instruction();

		/**
		 * The meta object literal for the '<em><b>Stack Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_POINTER_ATOM__STACK_LEVEL = eINSTANCE.getInstructionPointerAtom_StackLevel();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_POINTER_ATOM__CONTEXT = eINSTANCE.getInstructionPointerAtom_Context();

		/**
		 * The meta object literal for the '<em><b>Fall Back</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_POINTER_ATOM__FALL_BACK = eINSTANCE.getInstructionPointerAtom_FallBack();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.TimeAtomImpl <em>Time Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.TimeAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getTimeAtom()
		 * @generated
		 */
		EClass TIME_ATOM = eINSTANCE.getTimeAtom();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ATOM__TIME = eINSTANCE.getTimeAtom_Time();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ATOM__CONSUMER = eINSTANCE.getTimeAtom_Consumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.IRealTimeConsumer <em>IReal Time Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.IRealTimeConsumer
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getIRealTimeConsumer()
		 * @generated
		 */
		EClass IREAL_TIME_CONSUMER = eINSTANCE.getIRealTimeConsumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl <em>Real Time Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getRealTimeAtom()
		 * @generated
		 */
		EClass REAL_TIME_ATOM = eINSTANCE.getRealTimeAtom();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TIME_ATOM__TIME = eINSTANCE.getRealTimeAtom_Time();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_TIME_ATOM__CONSUMER = eINSTANCE.getRealTimeAtom_Consumer();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.ConfigurationAtomImpl <em>Configuration Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.ConfigurationAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getConfigurationAtom()
		 * @generated
		 */
		EClass CONFIGURATION_ATOM = eINSTANCE.getConfigurationAtom();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ATOM__CONFIGURATION = eINSTANCE.getConfigurationAtom_Configuration();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.DataAtomImpl <em>Data Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.DataAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getDataAtom()
		 * @generated
		 */
		EClass DATA_ATOM = eINSTANCE.getDataAtom();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ATOM__LEAF = eINSTANCE.getDataAtom_Leaf();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ATOM__VALUE = eINSTANCE.getDataAtom_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.LogicFunctionAtomImpl <em>Logic Function Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.LogicFunctionAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getLogicFunctionAtom()
		 * @generated
		 */
		EClass LOGIC_FUNCTION_ATOM = eINSTANCE.getLogicFunctionAtom();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_FUNCTION_ATOM__FUNCTION = eINSTANCE.getLogicFunctionAtom_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl <em>Bag Element Assigned Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getBagElementAssignedAtom()
		 * @generated
		 */
		EClass BAG_ELEMENT_ASSIGNED_ATOM = eINSTANCE.getBagElementAssignedAtom();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ELEMENT_ASSIGNED_ATOM__BAG = eINSTANCE.getBagElementAssignedAtom_Bag();

		/**
		 * The meta object literal for the '<em><b>Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAG_ELEMENT_ASSIGNED_ATOM__IDX = eINSTANCE.getBagElementAssignedAtom_Idx();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.rules.impl.ContextEntryImpl <em>Context Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.rules.impl.ContextEntryImpl
		 * @see org.tud.inf.st.mbt.rules.impl.RulesPackageImpl#getContextEntry()
		 * @generated
		 */
		EClass CONTEXT_ENTRY = eINSTANCE.getContextEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ENTRY__ID = eINSTANCE.getContextEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENTRY__VALUE = eINSTANCE.getContextEntry_Value();

	}

} //RulesPackage
