/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stand Alone Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.StandAloneAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.StandAloneAction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getStandAloneAction()
 * @model
 * @generated
 */
public interface StandAloneAction extends AbstractModelElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(PreGenerationAction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getStandAloneAction_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreGenerationAction getAction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.StandAloneAction#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(PreGenerationAction value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.core.IContextVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getStandAloneAction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IContextVariable> getParameters();

} // StandAloneAction
