/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Widget Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode#getInitialTokens <em>Initial Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getNoWidgetNode()
 * @model
 * @generated
 */
public interface NoWidgetNode extends Place {
	/**
	 * Returns the value of the '<em><b>Initial Tokens</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tokens</em>' attribute.
	 * @see #setInitialTokens(int)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getNoWidgetNode_InitialTokens()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getInitialTokens();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode#getInitialTokens <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tokens</em>' attribute.
	 * @see #getInitialTokens()
	 * @generated
	 */
	void setInitialTokens(int value);

} // NoWidgetNode
