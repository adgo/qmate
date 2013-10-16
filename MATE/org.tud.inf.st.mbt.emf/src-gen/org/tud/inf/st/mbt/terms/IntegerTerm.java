/**
 */
package org.tud.inf.st.mbt.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.IntegerTerm#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getIntegerTerm()
 * @model
 * @generated
 */
public interface IntegerTerm extends NumberTerm {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getIntegerTerm_Value()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.IntegerTerm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerTerm
