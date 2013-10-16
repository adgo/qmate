/**
 */
package org.tud.inf.st.mbt.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Generation Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.PreGenerationSequence#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getPreGenerationSequence()
 * @model
 * @generated
 */
public interface PreGenerationSequence extends PreGenerationAction {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.actions.PreGenerationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getPreGenerationSequence_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreGenerationAction> getActions();

} // PreGenerationSequence
