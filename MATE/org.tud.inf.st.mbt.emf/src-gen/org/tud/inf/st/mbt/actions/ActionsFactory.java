/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.actions.ActionsPackage
 * @generated
 */
public interface ActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsFactory eINSTANCE = org.tud.inf.st.mbt.actions.impl.ActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pre Generation Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Generation Sequence</em>'.
	 * @generated
	 */
	PreGenerationSequence createPreGenerationSequence();

	/**
	 * Returns a new object of class '<em>Post Generation Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Generation Sequence</em>'.
	 * @generated
	 */
	PostGenerationSequence createPostGenerationSequence();

	/**
	 * Returns a new object of class '<em>Term Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Action</em>'.
	 * @generated
	 */
	TermAction createTermAction();

	/**
	 * Returns a new object of class '<em>Set Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Data Action</em>'.
	 * @generated
	 */
	SetDataAction createSetDataAction();

	/**
	 * Returns a new object of class '<em>Get Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Data Action</em>'.
	 * @generated
	 */
	GetDataAction createGetDataAction();

	/**
	 * Returns a new object of class '<em>Remove Bag Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Bag Action</em>'.
	 * @generated
	 */
	RemoveBagAction createRemoveBagAction();

	/**
	 * Returns a new object of class '<em>Throw Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Action</em>'.
	 * @generated
	 */
	ThrowAction createThrowAction();

	/**
	 * Returns a new object of class '<em>Activate Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activate Feature Action</em>'.
	 * @generated
	 */
	ActivateFeatureAction createActivateFeatureAction();

	/**
	 * Returns a new object of class '<em>Deactivate Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deactivate Feature Action</em>'.
	 * @generated
	 */
	DeactivateFeatureAction createDeactivateFeatureAction();

	/**
	 * Returns a new object of class '<em>Set Property Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Property Action</em>'.
	 * @generated
	 */
	SetPropertyAction createSetPropertyAction();

	/**
	 * Returns a new object of class '<em>Get Property Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Property Action</em>'.
	 * @generated
	 */
	GetPropertyAction createGetPropertyAction();

	/**
	 * Returns a new object of class '<em>Get Real Time Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Real Time Action</em>'.
	 * @generated
	 */
	GetRealTimeAction createGetRealTimeAction();

	/**
	 * Returns a new object of class '<em>Get Feature State Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Feature State Action</em>'.
	 * @generated
	 */
	GetFeatureStateAction createGetFeatureStateAction();

	/**
	 * Returns a new object of class '<em>Fail Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fail Action</em>'.
	 * @generated
	 */
	FailAction createFailAction();

	/**
	 * Returns a new object of class '<em>Stand Alone Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stand Alone Action</em>'.
	 * @generated
	 */
	StandAloneAction createStandAloneAction();

	/**
	 * Returns a new object of class '<em>Timed Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Condition Action</em>'.
	 * @generated
	 */
	TimedConditionAction createTimedConditionAction();

	/**
	 * Returns a new object of class '<em>Action Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Reference</em>'.
	 * @generated
	 */
	ActionReference createActionReference();

	/**
	 * Returns a new object of class '<em>Time Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Action</em>'.
	 * @generated
	 */
	TimeAction createTimeAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionsPackage getActionsPackage();

} //ActionsFactory
