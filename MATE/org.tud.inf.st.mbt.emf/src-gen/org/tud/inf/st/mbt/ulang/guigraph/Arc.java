/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(GuiGraphNode)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getArc_Source()
	 * @model required="true"
	 * @generated
	 */
	GuiGraphNode getSource();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(GuiGraphNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GuiGraphNode)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getArc_Target()
	 * @model required="true"
	 * @generated
	 */
	GuiGraphNode getTarget();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GuiGraphNode value);

} // Arc
