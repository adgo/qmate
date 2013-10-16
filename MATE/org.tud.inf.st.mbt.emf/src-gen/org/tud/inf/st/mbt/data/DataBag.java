/**
 */
package org.tud.inf.st.mbt.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataBag#getSingleElementPrototype <em>Single Element Prototype</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataBag#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataBag#getGeneratedElements <em>Generated Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBag()
 * @model
 * @generated
 */
public interface DataBag extends DataStructureNode {
	/**
	 * Returns the value of the '<em><b>Single Element Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Element Prototype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Element Prototype</em>' containment reference.
	 * @see #setSingleElementPrototype(DataStructureNode)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBag_SingleElementPrototype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataStructureNode getSingleElementPrototype();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataBag#getSingleElementPrototype <em>Single Element Prototype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Element Prototype</em>' containment reference.
	 * @see #getSingleElementPrototype()
	 * @generated
	 */
	void setSingleElementPrototype(DataStructureNode value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBag_MaxSize()
	 * @model required="true"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataBag#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

	/**
	 * Returns the value of the '<em><b>Generated Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.DataStructureNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Elements</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataBag_GeneratedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStructureNode> getGeneratedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void organize();

} // DataBag
