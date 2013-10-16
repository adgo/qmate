/**
 */
package org.tud.inf.st.mbt.rules;

import org.tud.inf.st.mbt.data.DataBag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Element Assigned Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getIdx <em>Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBagElementAssignedAtom()
 * @model
 * @generated
 */
public interface BagElementAssignedAtom extends Atom {
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
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBagElementAssignedAtom_Bag()
	 * @model required="true"
	 * @generated
	 */
	DataBag getBag();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getBag <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag</em>' reference.
	 * @see #getBag()
	 * @generated
	 */
	void setBag(DataBag value);

	/**
	 * Returns the value of the '<em><b>Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idx</em>' attribute.
	 * @see #setIdx(int)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBagElementAssignedAtom_Idx()
	 * @model required="true"
	 * @generated
	 */
	int getIdx();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.BagElementAssignedAtom#getIdx <em>Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idx</em>' attribute.
	 * @see #getIdx()
	 * @generated
	 */
	void setIdx(int value);

} // BagElementAssignedAtom
