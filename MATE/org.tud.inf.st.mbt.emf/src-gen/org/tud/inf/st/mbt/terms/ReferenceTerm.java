/**
 */
package org.tud.inf.st.mbt.terms;

import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.ReferenceTerm#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getReferenceTerm()
 * @model
 * @generated
 */
public interface ReferenceTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(AbstractModelElement)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getReferenceTerm_Reference()
	 * @model required="true"
	 * @generated
	 */
	AbstractModelElement getReference();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.ReferenceTerm#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(AbstractModelElement value);

} // ReferenceTerm
