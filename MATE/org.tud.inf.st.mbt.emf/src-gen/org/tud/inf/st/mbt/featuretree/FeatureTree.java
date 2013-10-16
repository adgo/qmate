/**
 */
package org.tud.inf.st.mbt.featuretree;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.features.IFeatureDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.featuretree.FeatureTree#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage#getFeatureTree()
 * @model
 * @generated
 */
public interface FeatureTree extends AbstractModelElement, IFeatureDomain, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(TreeFeature)
	 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage#getFeatureTree_Root()
	 * @model containment="true"
	 * @generated
	 */
	TreeFeature getRoot();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.featuretree.FeatureTree#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(TreeFeature value);

} // FeatureTree
