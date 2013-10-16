/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataClass#getChildren <em>Children</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataClass#isOrdered <em>Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataClass()
 * @model
 * @generated
 */
public interface DataClass extends DataElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.DataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataClass_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataClass_Ordered()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataClass#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

} // DataClass
