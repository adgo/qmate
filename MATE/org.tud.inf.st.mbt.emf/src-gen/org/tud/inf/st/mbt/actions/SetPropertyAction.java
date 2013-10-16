/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Property Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getProperty <em>Property</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetPropertyAction()
 * @model
 * @generated
 */
public interface SetPropertyAction extends PostGenerationAction {
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
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetPropertyAction_Property()
	 * @model required="true"
	 * @generated
	 */
	DataLeaf getProperty();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataLeaf value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(DataElement)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetPropertyAction_Value()
	 * @model required="true"
	 * @generated
	 */
	DataElement getValue();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.SetPropertyAction#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataElement value);

} // SetPropertyAction
