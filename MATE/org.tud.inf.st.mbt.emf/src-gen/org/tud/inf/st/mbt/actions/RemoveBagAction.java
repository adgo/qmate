/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.data.DataBag;

import org.tud.inf.st.mbt.functions.IArithmetricFunction;
import org.tud.inf.st.mbt.terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Bag Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getRemoveBagAction()
 * @model
 * @generated
 */
public interface RemoveBagAction extends ReconfigurationAction {
	/**
	 * Returns the value of the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag</em>' reference.
	 * @see #setBag(DataBag)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getRemoveBagAction_Bag()
	 * @model required="true"
	 * @generated
	 */
	DataBag getBag();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getBag <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag</em>' reference.
	 * @see #getBag()
	 * @generated
	 */
	void setBag(DataBag value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getRemoveBagAction_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getIndex();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.RemoveBagAction#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(IArithmetricFunction value);

} // RemoveBagAction
