/**
 */
package org.tud.inf.st.mbt.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.core.AbstractModelElement#getNote <em>Note</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.AbstractModelElement#getId <em>Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.AbstractModelElement#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.AbstractModelElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.core.CorePackage#getAbstractModelElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.tud.inf.st.mbt.core.CorePackage#getAbstractModelElement_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.tud.inf.st.mbt.core.CorePackage#getAbstractModelElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Traceable To</b></em>' reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.core.AbstractModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceable To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceable To</em>' reference list.
	 * @see org.tud.inf.st.mbt.core.CorePackage#getAbstractModelElement_TraceableTo()
	 * @model
	 * @generated
	 */
	EList<AbstractModelElement> getTraceableTo();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tud.inf.st.mbt.core.CorePackage#getAbstractModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractModelElement
