/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.pccs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.pccs.PccsPackage
 * @generated
 */
public class PccsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PccsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PccsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PccsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PccsSwitch modelSwitch =
		new PccsSwitch() {
			public Object caseAbstractParser(AbstractParser object) {
				return createAbstractParserAdapter();
			}
			public Object caseOrParser(OrParser object) {
				return createOrParserAdapter();
			}
			public Object caseSequenceParser(SequenceParser object) {
				return createSequenceParserAdapter();
			}
			public Object caseConcreteSyntax(ConcreteSyntax object) {
				return createConcreteSyntaxAdapter();
			}
			public Object caseTerminalParser(TerminalParser object) {
				return createTerminalParserAdapter();
			}
			public Object caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			public Object caseRefParser(RefParser object) {
				return createRefParserAdapter();
			}
			public Object caseLiteralParser(LiteralParser object) {
				return createLiteralParserAdapter();
			}
			public Object caseParserDefinition(ParserDefinition object) {
				return createParserDefinitionAdapter();
			}
			public Object caseIdentifierParser(IdentifierParser object) {
				return createIdentifierParserAdapter();
			}
			public Object caseStringParser(StringParser object) {
				return createStringParserAdapter();
			}
			public Object caseEcoreMapping(EcoreMapping object) {
				return createEcoreMappingAdapter();
			}
			public Object caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			public Object caseAsQName(AsQName object) {
				return createAsQNameAdapter();
			}
			public Object caseIdentityParser(IdentityParser object) {
				return createIdentityParserAdapter();
			}
			public Object caseNumberParser(NumberParser object) {
				return createNumberParserAdapter();
			}
			public Object caseIntParser(IntParser object) {
				return createIntParserAdapter();
			}
			public Object caseDoubleParser(DoubleParser object) {
				return createDoubleParserAdapter();
			}
			public Object caseFloatParser(FloatParser object) {
				return createFloatParserAdapter();
			}
			public Object caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			public Object caseReferenceMapping(ReferenceMapping object) {
				return createReferenceMappingAdapter();
			}
			public Object caseOperatorTableParser(OperatorTableParser object) {
				return createOperatorTableParserAdapter();
			}
			public Object caseOperatorTableEntry(OperatorTableEntry object) {
				return createOperatorTableEntryAdapter();
			}
			public Object caseInfixOperator(InfixOperator object) {
				return createInfixOperatorAdapter();
			}
			public Object caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			public Object casePrefixOperator(PrefixOperator object) {
				return createPrefixOperatorAdapter();
			}
			public Object casePostfixOperator(PostfixOperator object) {
				return createPostfixOperatorAdapter();
			}
			public Object caseUnit(Unit object) {
				return createUnitAdapter();
			}
			public Object caseLeftAssociativeOperator(LeftAssociativeOperator object) {
				return createLeftAssociativeOperatorAdapter();
			}
			public Object caseRightAssociativeOperator(RightAssociativeOperator object) {
				return createRightAssociativeOperatorAdapter();
			}
			public Object caseNonAssociativeOperator(NonAssociativeOperator object) {
				return createNonAssociativeOperatorAdapter();
			}
			public Object caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			public Object caseStringValueMapping(StringValueMapping object) {
				return createStringValueMappingAdapter();
			}
			public Object caseComposableMapping(ComposableMapping object) {
				return createComposableMappingAdapter();
			}
			public Object casePrecedenceOperator(PrecedenceOperator object) {
				return createPrecedenceOperatorAdapter();
			}
			public Object caseRegularExpression(RegularExpression object) {
				return createRegularExpressionAdapter();
			}
			public Object caseQualifiedName(QualifiedName object) {
				return createQualifiedNameAdapter();
			}
			public Object caseLongParser(LongParser object) {
				return createLongParserAdapter();
			}
			public Object caseBoolParser(BoolParser object) {
				return createBoolParserAdapter();
			}
			public Object caseImportParser(ImportParser object) {
				return createImportParserAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.AbstractParser <em>Abstract Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.AbstractParser
	 * @generated
	 */
	public Adapter createAbstractParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.OrParser <em>Or Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.OrParser
	 * @generated
	 */
	public Adapter createOrParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.SequenceParser <em>Sequence Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.SequenceParser
	 * @generated
	 */
	public Adapter createSequenceParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax
	 * @generated
	 */
	public Adapter createConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.TerminalParser <em>Terminal Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.TerminalParser
	 * @generated
	 */
	public Adapter createTerminalParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.RefParser <em>Ref Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.RefParser
	 * @generated
	 */
	public Adapter createRefParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.LiteralParser <em>Literal Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.LiteralParser
	 * @generated
	 */
	public Adapter createLiteralParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.ParserDefinition <em>Parser Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.ParserDefinition
	 * @generated
	 */
	public Adapter createParserDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.IdentifierParser <em>Identifier Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.IdentifierParser
	 * @generated
	 */
	public Adapter createIdentifierParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.StringParser <em>String Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.StringParser
	 * @generated
	 */
	public Adapter createStringParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.EcoreMapping <em>Ecore Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.EcoreMapping
	 * @generated
	 */
	public Adapter createEcoreMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.AsQName <em>As QName</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.AsQName
	 * @generated
	 */
	public Adapter createAsQNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.IdentityParser <em>Identity Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.IdentityParser
	 * @generated
	 */
	public Adapter createIdentityParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.NumberParser <em>Number Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.NumberParser
	 * @generated
	 */
	public Adapter createNumberParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.IntParser <em>Int Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.IntParser
	 * @generated
	 */
	public Adapter createIntParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.DoubleParser <em>Double Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.DoubleParser
	 * @generated
	 */
	public Adapter createDoubleParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.FloatParser <em>Float Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.FloatParser
	 * @generated
	 */
	public Adapter createFloatParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.ReferenceMapping <em>Reference Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.ReferenceMapping
	 * @generated
	 */
	public Adapter createReferenceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.OperatorTableParser <em>Operator Table Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.OperatorTableParser
	 * @generated
	 */
	public Adapter createOperatorTableParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.OperatorTableEntry <em>Operator Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.OperatorTableEntry
	 * @generated
	 */
	public Adapter createOperatorTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.InfixOperator <em>Infix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.InfixOperator
	 * @generated
	 */
	public Adapter createInfixOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.PrefixOperator <em>Prefix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.PrefixOperator
	 * @generated
	 */
	public Adapter createPrefixOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.PostfixOperator <em>Postfix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.PostfixOperator
	 * @generated
	 */
	public Adapter createPostfixOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.LeftAssociativeOperator <em>Left Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.LeftAssociativeOperator
	 * @generated
	 */
	public Adapter createLeftAssociativeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.RightAssociativeOperator <em>Right Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.RightAssociativeOperator
	 * @generated
	 */
	public Adapter createRightAssociativeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.NonAssociativeOperator <em>Non Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.NonAssociativeOperator
	 * @generated
	 */
	public Adapter createNonAssociativeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.StringValueMapping <em>String Value Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.StringValueMapping
	 * @generated
	 */
	public Adapter createStringValueMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.ComposableMapping <em>Composable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.ComposableMapping
	 * @generated
	 */
	public Adapter createComposableMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.PrecedenceOperator <em>Precedence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.PrecedenceOperator
	 * @generated
	 */
	public Adapter createPrecedenceOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.RegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.RegularExpression
	 * @generated
	 */
	public Adapter createRegularExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.QualifiedName
	 * @generated
	 */
	public Adapter createQualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.LongParser <em>Long Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.LongParser
	 * @generated
	 */
	public Adapter createLongParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.BoolParser <em>Bool Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.BoolParser
	 * @generated
	 */
	public Adapter createBoolParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.pccs.ImportParser <em>Import Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.pccs.ImportParser
	 * @generated
	 */
	public Adapter createImportParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PccsAdapterFactory
