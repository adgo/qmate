/**
 */
package org.tud.inf.st.mbt.features;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.ExplicitSet#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getExplicitSet()
 * @model
 * @generated
 */
public interface ExplicitSet extends FeatureSet {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.features.IFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getExplicitSet_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<IFeature> getFeatures();

} // ExplicitSet
