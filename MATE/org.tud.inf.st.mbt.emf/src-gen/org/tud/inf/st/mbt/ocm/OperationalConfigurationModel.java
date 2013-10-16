/**
 */
package org.tud.inf.st.mbt.ocm;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.rules.ITimeConsumer;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Configuration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalConfigurationModel()
 * @model
 * @generated
 */
public interface OperationalConfigurationModel extends AbstractModelElement, ITimeConsumer {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.ocm.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalConfigurationModel_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.ocm.ConfigurationNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalConfigurationModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ConfigurationNode)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getOperationalConfigurationModel_Start()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationNode getStart();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ConfigurationNode value);

} // OperationalConfigurationModel
