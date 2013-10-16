/**
 */
package org.tud.inf.st.mbt.scenario;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.data.DataClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Scenario#getPlacements <em>Placements</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.Scenario#getGeneratedDomain <em>Generated Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Placements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.scenario.Placement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placements</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenario_Placements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Placement> getPlacements();

	/**
	 * Returns the value of the '<em><b>Generated Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Domain</em>' containment reference.
	 * @see #setGeneratedDomain(DataClass)
	 * @see org.tud.inf.st.mbt.scenario.ScenarioPackage#getScenario_GeneratedDomain()
	 * @model containment="true"
	 * @generated
	 */
	DataClass getGeneratedDomain();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.scenario.Scenario#getGeneratedDomain <em>Generated Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Domain</em>' containment reference.
	 * @see #getGeneratedDomain()
	 * @generated
	 */
	void setGeneratedDomain(DataClass value);

} // Scenario
