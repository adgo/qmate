/**
 */
package org.tud.inf.st.mbt.ocm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.ocm.OcmPackage
 * @generated
 */
public interface OcmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcmFactory eINSTANCE = org.tud.inf.st.mbt.ocm.impl.OcmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operational Configuration Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Configuration Model</em>'.
	 * @generated
	 */
	OperationalConfigurationModel createOperationalConfigurationModel();

	/**
	 * Returns a new object of class '<em>Standard Configuration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Configuration Node</em>'.
	 * @generated
	 */
	StandardConfigurationNode createStandardConfigurationNode();

	/**
	 * Returns a new object of class '<em>Reconfiguration Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Action Node</em>'.
	 * @generated
	 */
	ReconfigurationActionNode createReconfigurationActionNode();

	/**
	 * Returns a new object of class '<em>Timed Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Edge</em>'.
	 * @generated
	 */
	TimedEdge createTimedEdge();

	/**
	 * Returns a new object of class '<em>Event Guarded Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Guarded Edge</em>'.
	 * @generated
	 */
	EventGuardedEdge createEventGuardedEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcmPackage getOcmPackage();

} //OcmFactory
