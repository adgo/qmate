/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataRange#getValues <em>Values</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataRange#getEventID <em>Event ID</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataRange#getLeaf <em>Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataRange()
 * @model
 * @generated
 */
public interface DataRange extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.DataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataRange_Values()
	 * @model
	 * @generated
	 */
	EList<DataElement> getValues();

	/**
	 * Returns the value of the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event ID</em>' attribute.
	 * @see #setEventID(String)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataRange_EventID()
	 * @model
	 * @generated
	 */
	String getEventID();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataRange#getEventID <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event ID</em>' attribute.
	 * @see #getEventID()
	 * @generated
	 */
	void setEventID(String value);

	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' reference.
	 * @see #setLeaf(DataLeaf)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataRange_Leaf()
	 * @model required="true"
	 * @generated
	 */
	DataLeaf getLeaf();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataRange#getLeaf <em>Leaf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' reference.
	 * @see #getLeaf()
	 * @generated
	 */
	void setLeaf(DataLeaf value);

} // DataRange
