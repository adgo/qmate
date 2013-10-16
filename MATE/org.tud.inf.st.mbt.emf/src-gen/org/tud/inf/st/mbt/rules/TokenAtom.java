/**
 */
package org.tud.inf.st.mbt.rules;

import org.tud.inf.st.mbt.ulang.guigraph.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.TokenAtom#getCount <em>Count</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.TokenAtom#getPlace <em>Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTokenAtom()
 * @model
 * @generated
 */
public interface TokenAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTokenAtom_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.TokenAtom#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTokenAtom_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.TokenAtom#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // TokenAtom
