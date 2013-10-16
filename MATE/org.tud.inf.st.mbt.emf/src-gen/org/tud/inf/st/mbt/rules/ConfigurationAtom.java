/**
 */
package org.tud.inf.st.mbt.rules;

import org.tud.inf.st.mbt.ocm.ConfigurationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.ConfigurationAtom#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getConfigurationAtom()
 * @model
 * @generated
 */
public interface ConfigurationAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(ConfigurationNode)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getConfigurationAtom_Configuration()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationNode getConfiguration();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.ConfigurationAtom#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationNode value);

} // ConfigurationAtom
