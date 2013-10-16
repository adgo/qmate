/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Generation Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.PostGenerationSequence#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getPostGenerationSequence()
 * @model
 * @generated
 */
public interface PostGenerationSequence extends PostGenerationAction {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.actions.PostGenerationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getPostGenerationSequence_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PostGenerationAction> getActions();

} // PostGenerationSequence
