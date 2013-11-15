/**
 */
package org.tud.inf.st.mbt.features;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.CausalLinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.Feature#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.Feature#getCausalLinkType <em>Causal Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends AbstractModelElement, IFeature {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.features.FeatureAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.features.FeatureVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeature_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Causal Link Type</b></em>' attribute.
	 * The default value is <code>"Virtual"</code>.
	 * The literals are from the enumeration {@link org.tud.inf.st.mbt.core.CausalLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causal Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causal Link Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @see #setCausalLinkType(CausalLinkType)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getFeature_CausalLinkType()
	 * @model default="Virtual" required="true"
	 * @generated
	 */
	CausalLinkType getCausalLinkType();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.Feature#getCausalLinkType <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causal Link Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @see #getCausalLinkType()
	 * @generated
	 */
	void setCausalLinkType(CausalLinkType value);

} // Feature
