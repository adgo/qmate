/**
 */
package org.tud.inf.st.mbt.features;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standalone Feature Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.StandaloneFeatureSet#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getStandaloneFeatureSet()
 * @model
 * @generated
 */
public interface StandaloneFeatureSet extends AbstractModelElement, IFeatureDomain, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference.
	 * @see #setFeatures(FeatureSet)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getStandaloneFeatureSet_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureSet getFeatures();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.StandaloneFeatureSet#getFeatures <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' containment reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(FeatureSet value);

} // StandaloneFeatureSet
