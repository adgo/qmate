/**
 */
package org.tud.inf.st.mbt.features;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.data.DataStructureNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.FeatureAttribute#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeatureAttribute()
 * @model
 * @generated
 */
public interface FeatureAttribute extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataStructureNode)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeatureAttribute_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataStructureNode getData();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.FeatureAttribute#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataStructureNode value);

} // FeatureAttribute
