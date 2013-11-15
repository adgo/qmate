/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.tud.inf.st.mbt.rules.IRealTimeConsumer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getRate <em>Rate</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultImpact <em>Fault Impact</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultProbability <em>Fault Probability</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#isTerminates <em>Terminates</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMin <em>Time Min</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMax <em>Time Max</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimingType <em>Timing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends GuiGraphNode, IRealTimeConsumer {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(int)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_Rate()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRate();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(int value);

	/**
	 * Returns the value of the '<em><b>Fault Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Impact</em>' attribute.
	 * @see #setFaultImpact(double)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_FaultImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getFaultImpact();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultImpact <em>Fault Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Impact</em>' attribute.
	 * @see #getFaultImpact()
	 * @generated
	 */
	void setFaultImpact(double value);

	/**
	 * Returns the value of the '<em><b>Fault Probability</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Probability</em>' attribute.
	 * @see #setFaultProbability(double)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_FaultProbability()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getFaultProbability();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getFaultProbability <em>Fault Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Probability</em>' attribute.
	 * @see #getFaultProbability()
	 * @generated
	 */
	void setFaultProbability(double value);

	/**
	 * Returns the value of the '<em><b>Terminates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminates</em>' attribute.
	 * @see #setTerminates(boolean)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_Terminates()
	 * @model required="true"
	 * @generated
	 */
	boolean isTerminates();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#isTerminates <em>Terminates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminates</em>' attribute.
	 * @see #isTerminates()
	 * @generated
	 */
	void setTerminates(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Min</em>' attribute.
	 * @see #setTimeMin(long)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_TimeMin()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getTimeMin();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMin <em>Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Min</em>' attribute.
	 * @see #getTimeMin()
	 * @generated
	 */
	void setTimeMin(long value);

	/**
	 * Returns the value of the '<em><b>Time Max</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Max</em>' attribute.
	 * @see #setTimeMax(long)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_TimeMax()
	 * @model default="-1" required="true"
	 * @generated
	 */
	long getTimeMax();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimeMax <em>Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Max</em>' attribute.
	 * @see #getTimeMax()
	 * @generated
	 */
	void setTimeMax(long value);

	/**
	 * Returns the value of the '<em><b>Timing Type</b></em>' attribute.
	 * The default value is <code>"DelayUntilStart"</code>.
	 * The literals are from the enumeration {@link org.tud.inf.st.mbt.ulang.guigraph.TimingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimingType
	 * @see #setTimingType(TimingType)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getTransition_TimingType()
	 * @model default="DelayUntilStart" required="true"
	 * @generated
	 */
	TimingType getTimingType();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Transition#getTimingType <em>Timing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.TimingType
	 * @see #getTimingType()
	 * @generated
	 */
	void setTimingType(TimingType value);

} // Transition
