/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.graphical.GraphicalDescription#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.GraphicalDescription#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalDescription()
 * @model
 * @generated
 */
public interface GraphicalDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalDescription_Nodes()
	 * @model type="org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalDescription_Connections()
	 * @model type="org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition" containment="true"
	 * @generated
	 */
	EList getConnections();

} // GraphicalDescription
