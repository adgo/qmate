/**
 */
package org.tud.inf.st.mbt.terms;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functor Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.FunctorTerm#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.terms.FunctorTerm#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFunctorTerm()
 * @model
 * @generated
 */
public interface FunctorTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor</em>' attribute.
	 * @see #setFunctor(String)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFunctorTerm_Functor()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getFunctor();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.FunctorTerm#getFunctor <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor</em>' attribute.
	 * @see #getFunctor()
	 * @generated
	 */
	void setFunctor(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.terms.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getFunctorTerm_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getArguments();

} // FunctorTerm
