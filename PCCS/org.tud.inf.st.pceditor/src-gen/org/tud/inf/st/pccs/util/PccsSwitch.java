/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.pccs.*;

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
 * @see org.tud.inf.st.pccs.PccsPackage
 * @generated
 */
public class PccsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PccsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PccsSwitch() {
		if (modelPackage == null) {
			modelPackage = PccsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PccsPackage.ABSTRACT_PARSER: {
				AbstractParser abstractParser = (AbstractParser)theEObject;
				Object result = caseAbstractParser(abstractParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.OR_PARSER: {
				OrParser orParser = (OrParser)theEObject;
				Object result = caseOrParser(orParser);
				if (result == null) result = caseAbstractParser(orParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.SEQUENCE_PARSER: {
				SequenceParser sequenceParser = (SequenceParser)theEObject;
				Object result = caseSequenceParser(sequenceParser);
				if (result == null) result = caseAbstractParser(sequenceParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.CONCRETE_SYNTAX: {
				ConcreteSyntax concreteSyntax = (ConcreteSyntax)theEObject;
				Object result = caseConcreteSyntax(concreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.TERMINAL_PARSER: {
				TerminalParser terminalParser = (TerminalParser)theEObject;
				Object result = caseTerminalParser(terminalParser);
				if (result == null) result = caseAbstractParser(terminalParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				Object result = caseTerminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.REF_PARSER: {
				RefParser refParser = (RefParser)theEObject;
				Object result = caseRefParser(refParser);
				if (result == null) result = caseAbstractParser(refParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.LITERAL_PARSER: {
				LiteralParser literalParser = (LiteralParser)theEObject;
				Object result = caseLiteralParser(literalParser);
				if (result == null) result = caseAbstractParser(literalParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.PARSER_DEFINITION: {
				ParserDefinition parserDefinition = (ParserDefinition)theEObject;
				Object result = caseParserDefinition(parserDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.IDENTIFIER_PARSER: {
				IdentifierParser identifierParser = (IdentifierParser)theEObject;
				Object result = caseIdentifierParser(identifierParser);
				if (result == null) result = caseLiteralParser(identifierParser);
				if (result == null) result = caseAbstractParser(identifierParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.STRING_PARSER: {
				StringParser stringParser = (StringParser)theEObject;
				Object result = caseStringParser(stringParser);
				if (result == null) result = caseLiteralParser(stringParser);
				if (result == null) result = caseAbstractParser(stringParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.ECORE_MAPPING: {
				EcoreMapping ecoreMapping = (EcoreMapping)theEObject;
				Object result = caseEcoreMapping(ecoreMapping);
				if (result == null) result = caseComposableMapping(ecoreMapping);
				if (result == null) result = caseMapping(ecoreMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				Object result = caseAssignment(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.AS_QNAME: {
				AsQName asQName = (AsQName)theEObject;
				Object result = caseAsQName(asQName);
				if (result == null) result = caseMapping(asQName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.IDENTITY_PARSER: {
				IdentityParser identityParser = (IdentityParser)theEObject;
				Object result = caseIdentityParser(identityParser);
				if (result == null) result = caseAbstractParser(identityParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.NUMBER_PARSER: {
				NumberParser numberParser = (NumberParser)theEObject;
				Object result = caseNumberParser(numberParser);
				if (result == null) result = caseLiteralParser(numberParser);
				if (result == null) result = caseAbstractParser(numberParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.INT_PARSER: {
				IntParser intParser = (IntParser)theEObject;
				Object result = caseIntParser(intParser);
				if (result == null) result = caseNumberParser(intParser);
				if (result == null) result = caseLiteralParser(intParser);
				if (result == null) result = caseAbstractParser(intParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.DOUBLE_PARSER: {
				DoubleParser doubleParser = (DoubleParser)theEObject;
				Object result = caseDoubleParser(doubleParser);
				if (result == null) result = caseNumberParser(doubleParser);
				if (result == null) result = caseLiteralParser(doubleParser);
				if (result == null) result = caseAbstractParser(doubleParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.FLOAT_PARSER: {
				FloatParser floatParser = (FloatParser)theEObject;
				Object result = caseFloatParser(floatParser);
				if (result == null) result = caseNumberParser(floatParser);
				if (result == null) result = caseLiteralParser(floatParser);
				if (result == null) result = caseAbstractParser(floatParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				Object result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.REFERENCE_MAPPING: {
				ReferenceMapping referenceMapping = (ReferenceMapping)theEObject;
				Object result = caseReferenceMapping(referenceMapping);
				if (result == null) result = caseComposableMapping(referenceMapping);
				if (result == null) result = caseMapping(referenceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.OPERATOR_TABLE_PARSER: {
				OperatorTableParser operatorTableParser = (OperatorTableParser)theEObject;
				Object result = caseOperatorTableParser(operatorTableParser);
				if (result == null) result = caseAbstractParser(operatorTableParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.OPERATOR_TABLE_ENTRY: {
				OperatorTableEntry operatorTableEntry = (OperatorTableEntry)theEObject;
				Object result = caseOperatorTableEntry(operatorTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.INFIX_OPERATOR: {
				InfixOperator infixOperator = (InfixOperator)theEObject;
				Object result = caseInfixOperator(infixOperator);
				if (result == null) result = casePrecedenceOperator(infixOperator);
				if (result == null) result = caseOperatorTableEntry(infixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				Object result = caseUnaryOperator(unaryOperator);
				if (result == null) result = casePrecedenceOperator(unaryOperator);
				if (result == null) result = caseOperatorTableEntry(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.PREFIX_OPERATOR: {
				PrefixOperator prefixOperator = (PrefixOperator)theEObject;
				Object result = casePrefixOperator(prefixOperator);
				if (result == null) result = caseUnaryOperator(prefixOperator);
				if (result == null) result = casePrecedenceOperator(prefixOperator);
				if (result == null) result = caseOperatorTableEntry(prefixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.POSTFIX_OPERATOR: {
				PostfixOperator postfixOperator = (PostfixOperator)theEObject;
				Object result = casePostfixOperator(postfixOperator);
				if (result == null) result = caseUnaryOperator(postfixOperator);
				if (result == null) result = casePrecedenceOperator(postfixOperator);
				if (result == null) result = caseOperatorTableEntry(postfixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				Object result = caseUnit(unit);
				if (result == null) result = caseOperatorTableEntry(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.LEFT_ASSOCIATIVE_OPERATOR: {
				LeftAssociativeOperator leftAssociativeOperator = (LeftAssociativeOperator)theEObject;
				Object result = caseLeftAssociativeOperator(leftAssociativeOperator);
				if (result == null) result = caseInfixOperator(leftAssociativeOperator);
				if (result == null) result = casePrecedenceOperator(leftAssociativeOperator);
				if (result == null) result = caseOperatorTableEntry(leftAssociativeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.RIGHT_ASSOCIATIVE_OPERATOR: {
				RightAssociativeOperator rightAssociativeOperator = (RightAssociativeOperator)theEObject;
				Object result = caseRightAssociativeOperator(rightAssociativeOperator);
				if (result == null) result = caseInfixOperator(rightAssociativeOperator);
				if (result == null) result = casePrecedenceOperator(rightAssociativeOperator);
				if (result == null) result = caseOperatorTableEntry(rightAssociativeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.NON_ASSOCIATIVE_OPERATOR: {
				NonAssociativeOperator nonAssociativeOperator = (NonAssociativeOperator)theEObject;
				Object result = caseNonAssociativeOperator(nonAssociativeOperator);
				if (result == null) result = caseInfixOperator(nonAssociativeOperator);
				if (result == null) result = casePrecedenceOperator(nonAssociativeOperator);
				if (result == null) result = caseOperatorTableEntry(nonAssociativeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.META_MODEL: {
				MetaModel metaModel = (MetaModel)theEObject;
				Object result = caseMetaModel(metaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.STRING_VALUE_MAPPING: {
				StringValueMapping stringValueMapping = (StringValueMapping)theEObject;
				Object result = caseStringValueMapping(stringValueMapping);
				if (result == null) result = caseComposableMapping(stringValueMapping);
				if (result == null) result = caseMapping(stringValueMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.COMPOSABLE_MAPPING: {
				ComposableMapping composableMapping = (ComposableMapping)theEObject;
				Object result = caseComposableMapping(composableMapping);
				if (result == null) result = caseMapping(composableMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.PRECEDENCE_OPERATOR: {
				PrecedenceOperator precedenceOperator = (PrecedenceOperator)theEObject;
				Object result = casePrecedenceOperator(precedenceOperator);
				if (result == null) result = caseOperatorTableEntry(precedenceOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.REGULAR_EXPRESSION: {
				RegularExpression regularExpression = (RegularExpression)theEObject;
				Object result = caseRegularExpression(regularExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.QUALIFIED_NAME: {
				QualifiedName qualifiedName = (QualifiedName)theEObject;
				Object result = caseQualifiedName(qualifiedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.LONG_PARSER: {
				LongParser longParser = (LongParser)theEObject;
				Object result = caseLongParser(longParser);
				if (result == null) result = caseNumberParser(longParser);
				if (result == null) result = caseLiteralParser(longParser);
				if (result == null) result = caseAbstractParser(longParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.BOOL_PARSER: {
				BoolParser boolParser = (BoolParser)theEObject;
				Object result = caseBoolParser(boolParser);
				if (result == null) result = caseLiteralParser(boolParser);
				if (result == null) result = caseAbstractParser(boolParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PccsPackage.IMPORT_PARSER: {
				ImportParser importParser = (ImportParser)theEObject;
				Object result = caseImportParser(importParser);
				if (result == null) result = caseAbstractParser(importParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractParser(AbstractParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrParser(OrParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceParser(SequenceParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConcreteSyntax(ConcreteSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTerminalParser(TerminalParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRefParser(RefParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralParser(LiteralParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parser Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parser Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParserDefinition(ParserDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifierParser(IdentifierParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringParser(StringParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEcoreMapping(EcoreMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As QName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As QName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAsQName(AsQName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentityParser(IdentityParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNumberParser(NumberParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntParser(IntParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoubleParser(DoubleParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFloatParser(FloatParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferenceMapping(ReferenceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Table Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Table Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperatorTableParser(OperatorTableParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Table Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperatorTableEntry(OperatorTableEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInfixOperator(InfixOperator object) {
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
	public Object caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrefixOperator(PrefixOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostfixOperator(PostfixOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Associative Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftAssociativeOperator(LeftAssociativeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Associative Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRightAssociativeOperator(RightAssociativeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Associative Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNonAssociativeOperator(NonAssociativeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringValueMapping(StringValueMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composable Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComposableMapping(ComposableMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrecedenceOperator(PrecedenceOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegularExpression(RegularExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualifiedName(QualifiedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLongParser(LongParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBoolParser(BoolParser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImportParser(ImportParser object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //PccsSwitch
