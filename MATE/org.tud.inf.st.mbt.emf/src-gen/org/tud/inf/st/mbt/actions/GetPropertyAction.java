/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.data.DataLeaf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Property Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.GetPropertyAction#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetPropertyAction()
 * @model
 * @generated
 */
public interface GetPropertyAction extends DependentAction {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DataLeaf)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetPropertyAction_Property()
	 * @model required="true"
	 * @generated
	 */
	DataLeaf getProperty();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.GetPropertyAction#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataLeaf value);

} // GetPropertyAction
