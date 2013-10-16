/**
 */
package org.tud.inf.st.mbt.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.FloatTerm#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFloatTerm()
 * @model
 * @generated
 */
public interface FloatTerm extends NumberTerm {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFloatTerm_Value()
	 * @model id="true" required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.FloatTerm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FloatTerm
