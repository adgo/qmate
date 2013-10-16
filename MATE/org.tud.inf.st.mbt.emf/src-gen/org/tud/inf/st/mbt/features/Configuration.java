/**
 */
package org.tud.inf.st.mbt.features;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.data.DataBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.Configuration#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.Configuration#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends AbstractModelElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.features.FeatureReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getConfiguration_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureReference> getFeatures();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.data.DataBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getConfiguration_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataBinding> getBindings();

} // Configuration
