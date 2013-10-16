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
 * A representation of the model object '<em><b>Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalConnectionDefinition()
 * @model
 * @generated
 */
public interface GraphicalConnectionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Id</em>' attribute.
	 * @see #setReferenceId(String)
	 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalConnectionDefinition_ReferenceId()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceId();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getReferenceId <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Id</em>' attribute.
	 * @see #getReferenceId()
	 * @generated
	 */
	void setReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.graphical.Bendpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#getGraphicalConnectionDefinition_Bendpoints()
	 * @model type="org.tud.inf.st.mbt.graphical.Bendpoint" containment="true"
	 * @generated
	 */
	EList getBendpoints();

} // GraphicalConnectionDefinition
