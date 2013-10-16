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
 * A representation of the model object '<em><b>Ecore Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.EcoreMapping#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.EcoreMapping#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.EcoreMapping#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getEcoreMapping()
 * @model
 * @generated
 */
public interface EcoreMapping extends ComposableMapping {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(QualifiedName)
	 * @see org.tud.inf.st.pccs.PccsPackage#getEcoreMapping_EClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QualifiedName getEClass();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.EcoreMapping#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getEcoreMapping_Assignments()
	 * @model type="org.tud.inf.st.pccs.Assignment" containment="true"
	 * @generated
	 */
	EList getAssignments();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(MetaModel)
	 * @see org.tud.inf.st.pccs.PccsPackage#getEcoreMapping_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	MetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.EcoreMapping#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetaModel value);

} // EcoreMapping
