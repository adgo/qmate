/**
 */
package org.tud.inf.st.mbt.ocm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.TimedEdge#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getTimedEdge()
 * @model
 * @generated
 */
public interface TimedEdge extends OperationalEdge {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getTimedEdge_Duration()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.TimedEdge#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // TimedEdge
