/**
 */
package org.tud.inf.st.mbt.data;

import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.DataLeaf#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.DataLeaf#getCausalLinkType <em>Causal Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.data.DataPackage#getDataLeaf()
 * @model
 * @generated
 */
public interface DataLeaf extends DataStructureNode {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(DataClass)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataLeaf_Domain()
	 * @model required="true"
	 * @generated
	 */
	DataClass getDomain();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataLeaf#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DataClass value);

	/**
	 * Returns the value of the '<em><b>Causal Link Type</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * The literals are from the enumeration {@link org.tud.inf.st.mbt.core.CausalLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causal Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causal Link Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @see #setCausalLinkType(CausalLinkType)
	 * @see org.tud.inf.st.mbt.data.DataPackage#getDataLeaf_CausalLinkType()
	 * @model default="3" required="true"
	 * @generated
	 */
	CausalLinkType getCausalLinkType();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.data.DataLeaf#getCausalLinkType <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causal Link Type</em>' attribute.
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @see #getCausalLinkType()
	 * @generated
	 */
	void setCausalLinkType(CausalLinkType value);

} // DataLeaf
