/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.rules.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getArcs <em>Arcs</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariantText <em>Invariant Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getGuiGraph()
 * @model
 * @generated
 */
public interface GuiGraph extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.ulang.guigraph.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getGuiGraph_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getGuiGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuiGraphNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(Predicate)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getGuiGraph_Invariant()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getInvariant();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Predicate value);

	/**
	 * Returns the value of the '<em><b>Invariant Text</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant Text</em>' attribute.
	 * @see #setInvariantText(String)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getGuiGraph_InvariantText()
	 * @model default="true"
	 * @generated
	 */
	String getInvariantText();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph#getInvariantText <em>Invariant Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Text</em>' attribute.
	 * @see #getInvariantText()
	 * @generated
	 */
	void setInvariantText(String value);

} // GuiGraph
