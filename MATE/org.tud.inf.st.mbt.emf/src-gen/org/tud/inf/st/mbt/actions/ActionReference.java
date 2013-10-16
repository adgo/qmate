/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.core.IContextVariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.ActionReference#getAction <em>Action</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.ActionReference#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getActionReference()
 * @model
 * @generated
 */
public interface ActionReference extends PreGenerationAction {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(StandAloneAction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getActionReference_Action()
	 * @model required="true"
	 * @generated
	 */
	StandAloneAction getAction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.ActionReference#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(StandAloneAction value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getActionReference_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getParameters();

} // ActionReference
