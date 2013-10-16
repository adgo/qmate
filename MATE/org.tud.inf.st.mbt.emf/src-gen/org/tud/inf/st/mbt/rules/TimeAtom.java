/**
 */
package org.tud.inf.st.mbt.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.TimeAtom#getTime <em>Time</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.TimeAtom#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTimeAtom()
 * @model
 * @generated
 */
public interface TimeAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTimeAtom_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.TimeAtom#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(ITimeConsumer)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getTimeAtom_Consumer()
	 * @model required="true"
	 * @generated
	 */
	ITimeConsumer getConsumer();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.TimeAtom#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(ITimeConsumer value);

} // TimeAtom
