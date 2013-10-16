/**
 */
package org.tud.inf.st.mbt.scenario;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.scenario.ScenarioModel#getInventory <em>Inventory</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.ScenarioModel#getBases <em>Bases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenarioModel()
 * @model
 * @generated
 */
public interface ScenarioModel extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.scenario.ScenarioEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenarioModel_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioEntity> getInventory();

	/**
	 * Returns the value of the '<em><b>Bases</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.scenario.SpatialBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bases</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenarioModel_Bases()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpatialBase> getBases();

} // ScenarioModel
