/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.features.IFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deactivate Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.DeactivateFeatureAction#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getDeactivateFeatureAction()
 * @model
 * @generated
 */
public interface DeactivateFeatureAction extends PostGenerationAction, ReconfigurationAction {
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
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getDeactivateFeatureAction_Feature()
	 * @model required="true"
	 * @generated
	 */
	IFeature getFeature();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.DeactivateFeatureAction#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(IFeature value);

} // DeactivateFeatureAction
