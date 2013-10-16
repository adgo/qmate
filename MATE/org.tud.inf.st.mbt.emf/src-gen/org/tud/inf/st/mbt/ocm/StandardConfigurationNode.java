/**
 */
package org.tud.inf.st.mbt.ocm;

import org.tud.inf.st.mbt.features.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Configuration Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.StandardConfigurationNode#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getStandardConfigurationNode()
 * @model
 * @generated
 */
public interface StandardConfigurationNode extends ConfigurationNode {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getStandardConfigurationNode_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.StandardConfigurationNode#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // StandardConfigurationNode
