/**
 */
package org.tud.inf.st.mbt.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.StepDataBinding#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getStepDataBinding()
 * @model
 * @generated
 */
public interface StepDataBinding extends DataBinding {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getStepDataBinding_Step()
	 * @model required="true"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.StepDataBinding#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

} // StepDataBinding
