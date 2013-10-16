/**
 */
package org.tud.inf.st.mbt.featuretree;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.features.Feature;
import org.tud.inf.st.mbt.features.IFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.featuretree.TreeFeature#getChildren <em>Children</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.featuretree.TreeFeature#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage#getTreeFeature()
 * @model
 * @generated
 */
public interface TreeFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.featuretree.TreeFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage#getTreeFeature_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreeFeature> getChildren();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.tud.inf.st.mbt.featuretree.FeaturetreePackage#getTreeFeature_Mandatory()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.featuretree.TreeFeature#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

} // TreeFeature
