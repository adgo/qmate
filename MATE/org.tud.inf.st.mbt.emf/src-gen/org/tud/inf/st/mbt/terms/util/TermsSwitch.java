/**
 */
package org.tud.inf.st.mbt.terms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.IContextVariable;
import org.tud.inf.st.mbt.terms.*;

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
 * @see org.tud.inf.st.mbt.terms.TermsPackage
 * @generated
 */
public class TermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsSwitch() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
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
			case TermsPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.FUNCTOR_TERM: {
				FunctorTerm functorTerm = (FunctorTerm)theEObject;
				T result = caseFunctorTerm(functorTerm);
				if (result == null) result = caseTerm(functorTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.STRING_TERM: {
				StringTerm stringTerm = (StringTerm)theEObject;
				T result = caseStringTerm(stringTerm);
				if (result == null) result = caseTerm(stringTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.NUMBER_TERM: {
				NumberTerm numberTerm = (NumberTerm)theEObject;
				T result = caseNumberTerm(numberTerm);
				if (result == null) result = caseTerm(numberTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.FLOAT_TERM: {
				FloatTerm floatTerm = (FloatTerm)theEObject;
				T result = caseFloatTerm(floatTerm);
				if (result == null) result = caseNumberTerm(floatTerm);
				if (result == null) result = caseTerm(floatTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.INTEGER_TERM: {
				IntegerTerm integerTerm = (IntegerTerm)theEObject;
				T result = caseIntegerTerm(integerTerm);
				if (result == null) result = caseNumberTerm(integerTerm);
				if (result == null) result = caseTerm(integerTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.LONG_TERM: {
				LongTerm longTerm = (LongTerm)theEObject;
				T result = caseLongTerm(longTerm);
				if (result == null) result = caseNumberTerm(longTerm);
				if (result == null) result = caseTerm(longTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.LIST_TERM: {
				ListTerm listTerm = (ListTerm)theEObject;
				T result = caseListTerm(listTerm);
				if (result == null) result = caseTerm(listTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.FUNCTION_TERM: {
				FunctionTerm functionTerm = (FunctionTerm)theEObject;
				T result = caseFunctionTerm(functionTerm);
				if (result == null) result = caseTerm(functionTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.REFERENCE_TERM: {
				ReferenceTerm referenceTerm = (ReferenceTerm)theEObject;
				T result = caseReferenceTerm(referenceTerm);
				if (result == null) result = caseTerm(referenceTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.CONTAINER_TERM: {
				ContainerTerm containerTerm = (ContainerTerm)theEObject;
				T result = caseContainerTerm(containerTerm);
				if (result == null) result = caseTerm(containerTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.BOOL_TERM: {
				BoolTerm boolTerm = (BoolTerm)theEObject;
				T result = caseBoolTerm(boolTerm);
				if (result == null) result = caseTerm(boolTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.TERM_VARIABLE: {
				TermVariable termVariable = (TermVariable)theEObject;
				T result = caseTermVariable(termVariable);
				if (result == null) result = caseTerm(termVariable);
				if (result == null) result = caseIContextVariable(termVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functor Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functor Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctorTerm(FunctorTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTerm(StringTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberTerm(NumberTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatTerm(FloatTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerTerm(IntegerTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListTerm(ListTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionTerm(FunctionTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTerm(ReferenceTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerTerm(ContainerTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolTerm(BoolTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermVariable(TermVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContext Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContext Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIContextVariable(IContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongTerm(LongTerm object) {
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

} //TermsSwitch
