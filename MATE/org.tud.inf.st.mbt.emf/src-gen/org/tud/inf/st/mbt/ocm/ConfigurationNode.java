/**
 */
package org.tud.inf.st.mbt.ocm;

import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.ConfigurationNode#getPostConfEventID <em>Post Conf Event ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getConfigurationNode()
 * @model abstract="true"
 * @generated
 */
public interface ConfigurationNode extends AbstractModelElement {

	/**
	 * Returns the value of the '<em><b>Post Conf Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Conf Event ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Conf Event ID</em>' attribute.
	 * @see #setPostConfEventID(String)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getConfigurationNode_PostConfEventID()
	 * @model
	 * @generated
	 */
	String getPostConfEventID();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.ConfigurationNode#getPostConfEventID <em>Post Conf Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Conf Event ID</em>' attribute.
	 * @see #getPostConfEventID()
	 * @generated
	 */
	void setPostConfEventID(String value);
} // ConfigurationNode
