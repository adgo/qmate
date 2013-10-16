/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataBinding#getLeaf <em>Leaf</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataBinding#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBinding()
 * @model
 * @generated
 */
public interface DataBinding extends EObject {
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
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBinding_Leaf()
	 * @model required="true"
	 * @generated
	 */
	DataLeaf getLeaf();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataBinding#getLeaf <em>Leaf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' reference.
	 * @see #getLeaf()
	 * @generated
	 */
	void setLeaf(DataLeaf value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(DataElement)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBinding_Value()
	 * @model required="true"
	 * @generated
	 */
	DataElement getValue();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataBinding#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataElement value);

} // DataBinding
