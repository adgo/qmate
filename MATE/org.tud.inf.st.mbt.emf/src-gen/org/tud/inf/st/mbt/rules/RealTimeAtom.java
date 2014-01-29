/**
 */
package org.tud.inf.st.mbt.rules;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Time Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getTime <em>Time</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getRealTimeAtom()
 * @model
 * @generated
 */
public interface RealTimeAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getRealTimeAtom_Time()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(IRealTimeConsumer)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getRealTimeAtom_Consumer()
	 * @model required="true"
	 * @generated
	 */
	IRealTimeConsumer getConsumer();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.RealTimeAtom#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(IRealTimeConsumer value);

} // RealTimeAtom
