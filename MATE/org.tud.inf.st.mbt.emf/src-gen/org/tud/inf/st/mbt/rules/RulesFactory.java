/**
 */
package org.tud.inf.st.mbt.rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.tud.inf.st.mbt.rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Sub Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Predicate</em>'.
	 * @generated
	 */
	SubPredicate createSubPredicate();

	/**
	 * Returns a new object of class '<em>Reasonable Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasonable Atom</em>'.
	 * @generated
	 */
	ReasonableAtom createReasonableAtom();

	/**
	 * Returns a new object of class '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor</em>'.
	 * @generated
	 */
	Xor createXor();

	/**
	 * Returns a new object of class '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication</em>'.
	 * @generated
	 */
	Implication createImplication();

	/**
	 * Returns a new object of class '<em>Feature Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Atom</em>'.
	 * @generated
	 */
	FeatureAtom createFeatureAtom();

	/**
	 * Returns a new object of class '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True</em>'.
	 * @generated
	 */
	True createTrue();

	/**
	 * Returns a new object of class '<em>Token Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Atom</em>'.
	 * @generated
	 */
	TokenAtom createTokenAtom();

	/**
	 * Returns a new object of class '<em>Instruction Pointer Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Pointer Atom</em>'.
	 * @generated
	 */
	InstructionPointerAtom createInstructionPointerAtom();

	/**
	 * Returns a new object of class '<em>Time Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Atom</em>'.
	 * @generated
	 */
	TimeAtom createTimeAtom();

	/**
	 * Returns a new object of class '<em>Real Time Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Time Atom</em>'.
	 * @generated
	 */
	RealTimeAtom createRealTimeAtom();

	/**
	 * Returns a new object of class '<em>Configuration Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Atom</em>'.
	 * @generated
	 */
	ConfigurationAtom createConfigurationAtom();

	/**
	 * Returns a new object of class '<em>Data Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Atom</em>'.
	 * @generated
	 */
	DataAtom createDataAtom();

	/**
	 * Returns a new object of class '<em>Logic Function Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Function Atom</em>'.
	 * @generated
	 */
	LogicFunctionAtom createLogicFunctionAtom();

	/**
	 * Returns a new object of class '<em>Bag Element Assigned Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Element Assigned Atom</em>'.
	 * @generated
	 */
	BagElementAssignedAtom createBagElementAssignedAtom();

	/**
	 * Returns a new object of class '<em>Context Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Entry</em>'.
	 * @generated
	 */
	ContextEntry createContextEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
