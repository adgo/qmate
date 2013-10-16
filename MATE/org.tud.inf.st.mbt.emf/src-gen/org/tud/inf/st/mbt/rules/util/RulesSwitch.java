/**
 */
package org.tud.inf.st.mbt.rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RulesPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = casePredicate(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = casePredicate(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.SUB_PREDICATE: {
				SubPredicate subPredicate = (SubPredicate)theEObject;
				T result = caseSubPredicate(subPredicate);
				if (result == null) result = casePredicate(subPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = casePredicate(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REASONABLE_ATOM: {
				ReasonableAtom reasonableAtom = (ReasonableAtom)theEObject;
				T result = caseReasonableAtom(reasonableAtom);
				if (result == null) result = caseAtom(reasonableAtom);
				if (result == null) result = casePredicate(reasonableAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryOperator(not);
				if (result == null) result = casePredicate(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryOperator(and);
				if (result == null) result = casePredicate(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryOperator(or);
				if (result == null) result = casePredicate(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseBinaryOperator(xor);
				if (result == null) result = casePredicate(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.IMPLICATION: {
				Implication implication = (Implication)theEObject;
				T result = caseImplication(implication);
				if (result == null) result = caseBinaryOperator(implication);
				if (result == null) result = casePredicate(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.TRUE: {
				True true_ = (True)theEObject;
				T result = caseTrue(true_);
				if (result == null) result = caseReasonableAtom(true_);
				if (result == null) result = caseAtom(true_);
				if (result == null) result = casePredicate(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.FEATURE_ATOM: {
				FeatureAtom featureAtom = (FeatureAtom)theEObject;
				T result = caseFeatureAtom(featureAtom);
				if (result == null) result = caseReasonableAtom(featureAtom);
				if (result == null) result = caseAtom(featureAtom);
				if (result == null) result = casePredicate(featureAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.DATA_ATOM: {
				DataAtom dataAtom = (DataAtom)theEObject;
				T result = caseDataAtom(dataAtom);
				if (result == null) result = caseReasonableAtom(dataAtom);
				if (result == null) result = caseAtom(dataAtom);
				if (result == null) result = casePredicate(dataAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.LOGIC_FUNCTION_ATOM: {
				LogicFunctionAtom logicFunctionAtom = (LogicFunctionAtom)theEObject;
				T result = caseLogicFunctionAtom(logicFunctionAtom);
				if (result == null) result = caseReasonableAtom(logicFunctionAtom);
				if (result == null) result = caseAtom(logicFunctionAtom);
				if (result == null) result = casePredicate(logicFunctionAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.TOKEN_ATOM: {
				TokenAtom tokenAtom = (TokenAtom)theEObject;
				T result = caseTokenAtom(tokenAtom);
				if (result == null) result = caseAtom(tokenAtom);
				if (result == null) result = casePredicate(tokenAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.INSTRUCTION_POINTER_ATOM: {
				InstructionPointerAtom instructionPointerAtom = (InstructionPointerAtom)theEObject;
				T result = caseInstructionPointerAtom(instructionPointerAtom);
				if (result == null) result = caseAtom(instructionPointerAtom);
				if (result == null) result = casePredicate(instructionPointerAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.CONFIGURATION_ATOM: {
				ConfigurationAtom configurationAtom = (ConfigurationAtom)theEObject;
				T result = caseConfigurationAtom(configurationAtom);
				if (result == null) result = caseAtom(configurationAtom);
				if (result == null) result = casePredicate(configurationAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM: {
				BagElementAssignedAtom bagElementAssignedAtom = (BagElementAssignedAtom)theEObject;
				T result = caseBagElementAssignedAtom(bagElementAssignedAtom);
				if (result == null) result = caseAtom(bagElementAssignedAtom);
				if (result == null) result = casePredicate(bagElementAssignedAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.ITIME_CONSUMER: {
				ITimeConsumer iTimeConsumer = (ITimeConsumer)theEObject;
				T result = caseITimeConsumer(iTimeConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.TIME_ATOM: {
				TimeAtom timeAtom = (TimeAtom)theEObject;
				T result = caseTimeAtom(timeAtom);
				if (result == null) result = caseAtom(timeAtom);
				if (result == null) result = casePredicate(timeAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.IREAL_TIME_CONSUMER: {
				IRealTimeConsumer iRealTimeConsumer = (IRealTimeConsumer)theEObject;
				T result = caseIRealTimeConsumer(iRealTimeConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REAL_TIME_ATOM: {
				RealTimeAtom realTimeAtom = (RealTimeAtom)theEObject;
				T result = caseRealTimeAtom(realTimeAtom);
				if (result == null) result = caseAtom(realTimeAtom);
				if (result == null) result = casePredicate(realTimeAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.CONTEXT_ENTRY: {
				ContextEntry contextEntry = (ContextEntry)theEObject;
				T result = caseContextEntry(contextEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPredicate(SubPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplication(Implication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAtom(FeatureAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrue(True object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAtom(DataAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Function Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Function Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicFunctionAtom(LogicFunctionAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Element Assigned Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Element Assigned Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagElementAssignedAtom(BagElementAssignedAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextEntry(ContextEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasonable Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasonable Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonableAtom(ReasonableAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenAtom(TokenAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Pointer Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Pointer Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionPointerAtom(InstructionPointerAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAtom(TimeAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRealTimeConsumer(IRealTimeConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTimeAtom(RealTimeAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITimeConsumer(ITimeConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationAtom(ConfigurationAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
