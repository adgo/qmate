/**
 */
package org.tud.inf.st.mbt.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitutable Int Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getFrom <em>From</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getSubstitutableIntRange()
 * @model
 * @generated
 */
public interface SubstitutableIntRange extends TypedDataElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getSubstitutableIntRange_From()
	 * @model required="true"
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getSubstitutableIntRange_To()
	 * @model
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.SubstitutableIntRange#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

} // SubstitutableIntRange
