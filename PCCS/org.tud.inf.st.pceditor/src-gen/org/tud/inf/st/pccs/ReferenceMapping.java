/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.ReferenceMapping#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getReferenceMapping()
 * @model
 * @generated
 */
public interface ReferenceMapping extends ComposableMapping {
	/**
	 * Returns the value of the '<em><b>QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' containment reference.
	 * @see #setQName(QualifiedName)
	 * @see org.tud.inf.st.pccs.PccsPackage#getReferenceMapping_QName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QualifiedName getQName();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ReferenceMapping#getQName <em>QName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' containment reference.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(QualifiedName value);

} // ReferenceMapping
