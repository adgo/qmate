/**
 */
package org.tud.inf.st.mbt.rules.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.rules.ContextEntry;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Pointer Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl#getStackLevel <em>Stack Level</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.InstructionPointerAtomImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionPointerAtomImpl extends EObjectImpl implements InstructionPointerAtom {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PreGenerationSequence sequence;

	/**
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTRUCTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected int instruction = INSTRUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int STACK_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected int stackLevel = STACK_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextEntry> context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionPointerAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.INSTRUCTION_POINTER_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreGenerationSequence getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PreGenerationSequence)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreGenerationSequence basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PreGenerationSequence newSequence) {
		PreGenerationSequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(int newInstruction) {
		int oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.INSTRUCTION_POINTER_ATOM__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStackLevel() {
		return stackLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackLevel(int newStackLevel) {
		int oldStackLevel = stackLevel;
		stackLevel = newStackLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.INSTRUCTION_POINTER_ATOM__STACK_LEVEL, oldStackLevel, stackLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextEntry> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<ContextEntry>(ContextEntry.class, this, RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case RulesPackage.INSTRUCTION_POINTER_ATOM__INSTRUCTION:
				return getInstruction();
			case RulesPackage.INSTRUCTION_POINTER_ATOM__STACK_LEVEL:
				return getStackLevel();
			case RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT:
				return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE:
				setSequence((PreGenerationSequence)newValue);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__INSTRUCTION:
				setInstruction((Integer)newValue);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__STACK_LEVEL:
				setStackLevel((Integer)newValue);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends ContextEntry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE:
				setSequence((PreGenerationSequence)null);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__STACK_LEVEL:
				setStackLevel(STACK_LEVEL_EDEFAULT);
				return;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT:
				getContext().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RulesPackage.INSTRUCTION_POINTER_ATOM__SEQUENCE:
				return sequence != null;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__INSTRUCTION:
				return instruction != INSTRUCTION_EDEFAULT;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__STACK_LEVEL:
				return stackLevel != STACK_LEVEL_EDEFAULT;
			case RulesPackage.INSTRUCTION_POINTER_ATOM__CONTEXT:
				return context != null && !context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return sequence+":L"+getStackLevel()+":I"+instruction;
	}

} //InstructionPointerAtomImpl
