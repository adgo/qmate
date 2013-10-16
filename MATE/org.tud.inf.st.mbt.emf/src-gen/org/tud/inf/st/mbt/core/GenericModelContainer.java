/**
 */
package org.tud.inf.st.mbt.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.core.GenericModelContainer#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.core.CorePackage#getGenericModelContainer()
 * @model
 * @generated
 */
public interface GenericModelContainer extends AbstractModelElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.core.ITopLevelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.core.CorePackage#getGenericModelContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ITopLevelElement> getElements();

} // GenericModelContainer
