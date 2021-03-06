/**
 */
package org.tud.inf.st.mbt.rules;

import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.FeatureAtom#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.FeatureAtom#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getFeatureAtom()
 * @model
 * @generated
 */
public interface FeatureAtom extends ReasonableAtom {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(IFeature)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getFeatureAtom_Feature()
	 * @model required="true"
	 * @generated
	 */
	IFeature getFeature();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.FeatureAtom#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(IFeature value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(FeatureVersion)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getFeatureAtom_Version()
	 * @model
	 * @generated
	 */
	FeatureVersion getVersion();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.FeatureAtom#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(FeatureVersion value);

} // FeatureAtom
