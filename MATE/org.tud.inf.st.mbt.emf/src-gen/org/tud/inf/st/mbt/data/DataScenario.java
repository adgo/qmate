/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.rules.ITimeConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataScenario#getStepDataBindings <em>Step Data Bindings</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataScenario#getLength <em>Length</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataScenario#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataScenario()
 * @model
 * @generated
 */
public interface DataScenario extends AbstractModelElement, ITimeConsumer, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Step Data Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.StepDataBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Data Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Data Bindings</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataScenario_StepDataBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepDataBinding> getStepDataBindings();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataScenario_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataScenario#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataScenario_Ranges()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRange> getRanges();

} // DataScenario
