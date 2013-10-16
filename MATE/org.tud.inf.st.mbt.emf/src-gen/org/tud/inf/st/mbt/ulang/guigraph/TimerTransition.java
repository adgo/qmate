/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.tud.inf.st.mbt.rules.ITimeConsumer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTimerTransition()
 * @model
 * @generated
 */
public interface TimerTransition extends Transition {
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
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTimerTransition_Duration()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

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
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTimerTransition_Consumer()
	 * @model required="true"
	 * @generated
	 */
	ITimeConsumer getConsumer();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(ITimeConsumer value);

} // TimerTransition
