/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stand Alone Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.StandAloneFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getStandAloneFunction()
 * @model abstract="true"
 * @generated
 */
public interface StandAloneFunction extends AbstractModelElement, ITopLevelElement {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.core.IContextVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getStandAloneFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IContextVariable> getParameters();
} // StandAloneFunction
