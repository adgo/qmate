/**
 */
package org.tud.inf.st.mbt.rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Pointer Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getStackLevel <em>Stack Level</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getContext <em>Context</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getFallBack <em>Fall Back</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom()
 * @model
 * @generated
 */
public interface InstructionPointerAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see #setSequence(PreGenerationSequence)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom_Sequence()
	 * @model required="true"
	 * @generated
	 */
	PreGenerationSequence getSequence();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PreGenerationSequence value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see #setInstruction(int)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom_Instruction()
	 * @model required="true"
	 * @generated
	 */
	int getInstruction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(int value);

	/**
	 * Returns the value of the '<em><b>Stack Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Level</em>' attribute.
	 * @see #setStackLevel(int)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom_StackLevel()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getStackLevel();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getStackLevel <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Level</em>' attribute.
	 * @see #getStackLevel()
	 * @generated
	 */
	void setStackLevel(int value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.rules.ContextEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextEntry> getContext();

	/**
	 * Returns the value of the '<em><b>Fall Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fall Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall Back</em>' reference.
	 * @see #setFallBack(EObject)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getInstructionPointerAtom_FallBack()
	 * @model
	 * @generated
	 */
	EObject getFallBack();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.InstructionPointerAtom#getFallBack <em>Fall Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall Back</em>' reference.
	 * @see #getFallBack()
	 * @generated
	 */
	void setFallBack(EObject value);

} // InstructionPointerAtom
