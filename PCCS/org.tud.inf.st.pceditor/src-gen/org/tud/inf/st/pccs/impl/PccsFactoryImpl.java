/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.pccs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PccsFactoryImpl extends EFactoryImpl implements PccsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PccsFactory init() {
		try {
			PccsFactory thePccsFactory = (PccsFactory)EPackage.Registry.INSTANCE.getEFactory("http://st.inf.tud.org/pccs"); 
			if (thePccsFactory != null) {
				return thePccsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PccsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PccsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PccsPackage.OR_PARSER: return createOrParser();
			case PccsPackage.SEQUENCE_PARSER: return createSequenceParser();
			case PccsPackage.CONCRETE_SYNTAX: return createConcreteSyntax();
			case PccsPackage.TERMINAL_PARSER: return createTerminalParser();
			case PccsPackage.TERMINAL: return createTerminal();
			case PccsPackage.REF_PARSER: return createRefParser();
			case PccsPackage.PARSER_DEFINITION: return createParserDefinition();
			case PccsPackage.IDENTIFIER_PARSER: return createIdentifierParser();
			case PccsPackage.STRING_PARSER: return createStringParser();
			case PccsPackage.ECORE_MAPPING: return createEcoreMapping();
			case PccsPackage.ASSIGNMENT: return createAssignment();
			case PccsPackage.AS_QNAME: return createAsQName();
			case PccsPackage.IDENTITY_PARSER: return createIdentityParser();
			case PccsPackage.INT_PARSER: return createIntParser();
			case PccsPackage.DOUBLE_PARSER: return createDoubleParser();
			case PccsPackage.FLOAT_PARSER: return createFloatParser();
			case PccsPackage.REFERENCE_MAPPING: return createReferenceMapping();
			case PccsPackage.OPERATOR_TABLE_PARSER: return createOperatorTableParser();
			case PccsPackage.PREFIX_OPERATOR: return createPrefixOperator();
			case PccsPackage.POSTFIX_OPERATOR: return createPostfixOperator();
			case PccsPackage.UNIT: return createUnit();
			case PccsPackage.LEFT_ASSOCIATIVE_OPERATOR: return createLeftAssociativeOperator();
			case PccsPackage.RIGHT_ASSOCIATIVE_OPERATOR: return createRightAssociativeOperator();
			case PccsPackage.NON_ASSOCIATIVE_OPERATOR: return createNonAssociativeOperator();
			case PccsPackage.META_MODEL: return createMetaModel();
			case PccsPackage.STRING_VALUE_MAPPING: return createStringValueMapping();
			case PccsPackage.REGULAR_EXPRESSION: return createRegularExpression();
			case PccsPackage.QUALIFIED_NAME: return createQualifiedName();
			case PccsPackage.LONG_PARSER: return createLongParser();
			case PccsPackage.BOOL_PARSER: return createBoolParser();
			case PccsPackage.IMPORT_PARSER: return createImportParser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrParser createOrParser() {
		OrParserImpl orParser = new OrParserImpl();
		return orParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceParser createSequenceParser() {
		SequenceParserImpl sequenceParser = new SequenceParserImpl();
		return sequenceParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSyntax createConcreteSyntax() {
		ConcreteSyntaxImpl concreteSyntax = new ConcreteSyntaxImpl();
		return concreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalParser createTerminalParser() {
		TerminalParserImpl terminalParser = new TerminalParserImpl();
		return terminalParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefParser createRefParser() {
		RefParserImpl refParser = new RefParserImpl();
		return refParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserDefinition createParserDefinition() {
		ParserDefinitionImpl parserDefinition = new ParserDefinitionImpl();
		return parserDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierParser createIdentifierParser() {
		IdentifierParserImpl identifierParser = new IdentifierParserImpl();
		return identifierParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParser createStringParser() {
		StringParserImpl stringParser = new StringParserImpl();
		return stringParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreMapping createEcoreMapping() {
		EcoreMappingImpl ecoreMapping = new EcoreMappingImpl();
		return ecoreMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsQName createAsQName() {
		AsQNameImpl asQName = new AsQNameImpl();
		return asQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityParser createIdentityParser() {
		IdentityParserImpl identityParser = new IdentityParserImpl();
		return identityParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParser createIntParser() {
		IntParserImpl intParser = new IntParserImpl();
		return intParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleParser createDoubleParser() {
		DoubleParserImpl doubleParser = new DoubleParserImpl();
		return doubleParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatParser createFloatParser() {
		FloatParserImpl floatParser = new FloatParserImpl();
		return floatParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMapping createReferenceMapping() {
		ReferenceMappingImpl referenceMapping = new ReferenceMappingImpl();
		return referenceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorTableParser createOperatorTableParser() {
		OperatorTableParserImpl operatorTableParser = new OperatorTableParserImpl();
		return operatorTableParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixOperator createPrefixOperator() {
		PrefixOperatorImpl prefixOperator = new PrefixOperatorImpl();
		return prefixOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixOperator createPostfixOperator() {
		PostfixOperatorImpl postfixOperator = new PostfixOperatorImpl();
		return postfixOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftAssociativeOperator createLeftAssociativeOperator() {
		LeftAssociativeOperatorImpl leftAssociativeOperator = new LeftAssociativeOperatorImpl();
		return leftAssociativeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightAssociativeOperator createRightAssociativeOperator() {
		RightAssociativeOperatorImpl rightAssociativeOperator = new RightAssociativeOperatorImpl();
		return rightAssociativeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonAssociativeOperator createNonAssociativeOperator() {
		NonAssociativeOperatorImpl nonAssociativeOperator = new NonAssociativeOperatorImpl();
		return nonAssociativeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel createMetaModel() {
		MetaModelImpl metaModel = new MetaModelImpl();
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueMapping createStringValueMapping() {
		StringValueMappingImpl stringValueMapping = new StringValueMappingImpl();
		return stringValueMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularExpression createRegularExpression() {
		RegularExpressionImpl regularExpression = new RegularExpressionImpl();
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName createQualifiedName() {
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongParser createLongParser() {
		LongParserImpl longParser = new LongParserImpl();
		return longParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolParser createBoolParser() {
		BoolParserImpl boolParser = new BoolParserImpl();
		return boolParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportParser createImportParser() {
		ImportParserImpl importParser = new ImportParserImpl();
		return importParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PccsPackage getPccsPackage() {
		return (PccsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PccsPackage getPackage() {
		return PccsPackage.eINSTANCE;
	}

} //PccsFactoryImpl
