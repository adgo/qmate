/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.TypedDataClass#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getTypedDataClass()
 * @model
 * @generated
 */
public interface TypedDataClass extends TypedDataElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.TypedDataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getTypedDataClass_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedDataElement> getChildren();

} // TypedDataClass
