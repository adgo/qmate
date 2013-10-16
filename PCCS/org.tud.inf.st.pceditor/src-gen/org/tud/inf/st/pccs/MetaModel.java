/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.MetaModel#getModelURI <em>Model URI</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.MetaModel#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getMetaModel()
 * @model
 * @generated
 */
public interface MetaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model URI</em>' attribute.
	 * @see #setModelURI(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getMetaModel_ModelURI()
	 * @model
	 * @generated
	 */
	String getModelURI();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.MetaModel#getModelURI <em>Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model URI</em>' attribute.
	 * @see #getModelURI()
	 * @generated
	 */
	void setModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getMetaModel_Prefix()
	 * @model default="default" id="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.MetaModel#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // MetaModel
