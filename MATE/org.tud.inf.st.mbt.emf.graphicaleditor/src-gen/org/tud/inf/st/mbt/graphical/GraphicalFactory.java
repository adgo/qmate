/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage
 * @generated
 */
public interface GraphicalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicalFactory eINSTANCE = org.tud.inf.st.mbt.graphical.impl.GraphicalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	GraphicalDescription createGraphicalDescription();

	/**
	 * Returns a new object of class '<em>Node Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Definition</em>'.
	 * @generated
	 */
	GraphicalNodeDefinition createGraphicalNodeDefinition();

	/**
	 * Returns a new object of class '<em>Connection Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Definition</em>'.
	 * @generated
	 */
	GraphicalConnectionDefinition createGraphicalConnectionDefinition();

	/**
	 * Returns a new object of class '<em>Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bendpoint</em>'.
	 * @generated
	 */
	Bendpoint createBendpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphicalPackage getGraphicalPackage();

} //GraphicalFactory
