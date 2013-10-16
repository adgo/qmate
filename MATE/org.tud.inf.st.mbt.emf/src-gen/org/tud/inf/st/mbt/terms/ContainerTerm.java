/**
 */
package org.tud.inf.st.mbt.terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.ContainerTerm#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.terms.TermsPackage#getContainerTerm()
 * @model
 * @generated
 */
public interface ContainerTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' containment reference.
	 * @see #setContainment(EObject)
	 * @see org.tud.inf.st.mbt.terms.TermsPackage#getContainerTerm_Containment()
	 * @model containment="true"
	 * @generated
	 */
	EObject getContainment();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.terms.ContainerTerm#getContainment <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' containment reference.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(EObject value);

} // ContainerTerm
