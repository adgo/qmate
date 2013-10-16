/**
 */
package org.tud.inf.st.mbt.ocm;

import org.tud.inf.st.mbt.actions.PreGenerationSequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalEdge()
 * @model abstract="true"
 * @generated
 */
public interface OperationalEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConfigurationNode)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationNode getSource();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConfigurationNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConfigurationNode)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationNode getTarget();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.OperationalEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConfigurationNode value);

} // OperationalEdge
