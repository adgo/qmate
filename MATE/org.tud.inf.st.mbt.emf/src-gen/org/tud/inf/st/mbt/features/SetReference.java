/**
 */
package org.tud.inf.st.mbt.features;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.SetReference#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getSetReference()
 * @model
 * @generated
 */
public interface SetReference extends FeatureSet {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference.
	 * @see #setFeatures(IFeatureDomain)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getSetReference_Features()
	 * @model required="true"
	 * @generated
	 */
	IFeatureDomain getFeatures();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.SetReference#getFeatures <em>Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(IFeatureDomain value);

} // SetReference
