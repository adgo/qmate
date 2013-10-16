/**
 */
package org.tud.inf.st.mbt.terms;

import org.tud.inf.st.mbt.functions.IFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.FunctionTerm#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFunctionTerm()
 * @model
 * @generated
 */
public interface FunctionTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(IFunction)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFunctionTerm_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IFunction getFunction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.FunctionTerm#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(IFunction value);

} // FunctionTerm
