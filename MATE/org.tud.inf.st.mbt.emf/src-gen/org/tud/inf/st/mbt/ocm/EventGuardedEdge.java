/**
 */
package org.tud.inf.st.mbt.ocm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Guarded Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.EventGuardedEdge#getGuardEventID <em>Guard Event ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getEventGuardedEdge()
 * @model
 * @generated
 */
public interface EventGuardedEdge extends OperationalEdge {
	/**
	 * Returns the value of the '<em><b>Guard Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Event ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Event ID</em>' attribute.
	 * @see #setGuardEventID(String)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getEventGuardedEdge_GuardEventID()
	 * @model
	 * @generated
	 */
	String getGuardEventID();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.EventGuardedEdge#getGuardEventID <em>Guard Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Event ID</em>' attribute.
	 * @see #getGuardEventID()
	 * @generated
	 */
	void setGuardEventID(String value);

} // EventGuardedEdge
