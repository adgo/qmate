/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.inf.st.pccs.AbstractParser;
import org.tud.inf.st.pccs.AsQName;
import org.tud.inf.st.pccs.Assignment;
import org.tud.inf.st.pccs.BoolParser;
import org.tud.inf.st.pccs.ComposableMapping;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.DoubleParser;
import org.tud.inf.st.pccs.EcoreMapping;
import org.tud.inf.st.pccs.FloatParser;
import org.tud.inf.st.pccs.IdentifierParser;
import org.tud.inf.st.pccs.IdentityParser;
import org.tud.inf.st.pccs.ImportParser;
import org.tud.inf.st.pccs.InfixOperator;
import org.tud.inf.st.pccs.IntParser;
import org.tud.inf.st.pccs.LeftAssociativeOperator;
import org.tud.inf.st.pccs.LiteralParser;
import org.tud.inf.st.pccs.LongParser;
import org.tud.inf.st.pccs.Mapping;
import org.tud.inf.st.pccs.MetaModel;
import org.tud.inf.st.pccs.NonAssociativeOperator;
import org.tud.inf.st.pccs.NumberParser;
import org.tud.inf.st.pccs.OperatorTableEntry;
import org.tud.inf.st.pccs.OperatorTableParser;
import org.tud.inf.st.pccs.OrParser;
import org.tud.inf.st.pccs.ParserDefinition;
import org.tud.inf.st.pccs.PccsFactory;
import org.tud.inf.st.pccs.PccsPackage;
import org.tud.inf.st.pccs.PostfixOperator;
import org.tud.inf.st.pccs.PrecedenceOperator;
import org.tud.inf.st.pccs.PrefixOperator;
import org.tud.inf.st.pccs.QualifiedName;
import org.tud.inf.st.pccs.RefParser;
import org.tud.inf.st.pccs.ReferenceMapping;
import org.tud.inf.st.pccs.RegularExpression;
import org.tud.inf.st.pccs.RightAssociativeOperator;
import org.tud.inf.st.pccs.SequenceParser;
import org.tud.inf.st.pccs.StringParser;
import org.tud.inf.st.pccs.StringValueMapping;
import org.tud.inf.st.pccs.Terminal;
import org.tud.inf.st.pccs.TerminalParser;
import org.tud.inf.st.pccs.UnaryOperator;
import org.tud.inf.st.pccs.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PccsPackageImpl extends EPackageImpl implements PccsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parserDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asQNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorTableParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftAssociativeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightAssociativeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonAssociativeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composableMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importParserEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tud.inf.st.pccs.PccsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PccsPackageImpl() {
		super(eNS_URI, PccsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PccsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PccsPackage init() {
		if (isInited) return (PccsPackage)EPackage.Registry.INSTANCE.getEPackage(PccsPackage.eNS_URI);

		// Obtain or create and register package
		PccsPackageImpl thePccsPackage = (PccsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PccsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PccsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePccsPackage.createPackageContents();

		// Initialize created meta-data
		thePccsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePccsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PccsPackage.eNS_URI, thePccsPackage);
		return thePccsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractParser() {
		return abstractParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParser_Multiplicity() {
		return (EAttribute)abstractParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParser_Label() {
		return (EAttribute)abstractParserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractParser_Mapping() {
		return (EReference)abstractParserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrParser() {
		return orParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrParser_Parsers() {
		return (EReference)orParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceParser() {
		return sequenceParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceParser_Parsers() {
		return (EReference)sequenceParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteSyntax() {
		return concreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Startwith() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Operators() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Keywords() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Parsers() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Metamodels() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Regex() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteSyntax_MultiLineCommentIndicationStart() {
		return (EAttribute)concreteSyntaxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteSyntax_MultiLineCommentIndicationEnd() {
		return (EAttribute)concreteSyntaxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteSyntax_SingleLineCommentIndicationStart() {
		return (EAttribute)concreteSyntaxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteSyntax_Id() {
		return (EAttribute)concreteSyntaxEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalParser() {
		return terminalParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalParser_Terminal() {
		return (EReference)terminalParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Terminal() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefParser() {
		return refParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefParser_Ref() {
		return (EReference)refParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralParser() {
		return literalParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralParser_Regex() {
		return (EReference)literalParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParserDefinition() {
		return parserDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserDefinition_Name() {
		return (EAttribute)parserDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParserDefinition_Rule() {
		return (EReference)parserDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierParser() {
		return identifierParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringParser() {
		return stringParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreMapping() {
		return ecoreMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreMapping_EClass() {
		return (EReference)ecoreMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreMapping_Assignments() {
		return (EReference)ecoreMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreMapping_Metamodel() {
		return (EReference)ecoreMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_To() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_From() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsQName() {
		return asQNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsQName_Delim() {
		return (EAttribute)asQNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityParser() {
		return identityParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityParser_Parser() {
		return (EReference)identityParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberParser() {
		return numberParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntParser() {
		return intParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleParser() {
		return doubleParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatParser() {
		return floatParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceMapping() {
		return referenceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceMapping_QName() {
		return (EReference)referenceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorTableParser() {
		return operatorTableParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorTableParser_Entries() {
		return (EReference)operatorTableParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorTableEntry() {
		return operatorTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorTableEntry_Parser() {
		return (EReference)operatorTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfixOperator() {
		return infixOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixOperator() {
		return prefixOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostfixOperator() {
		return postfixOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftAssociativeOperator() {
		return leftAssociativeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightAssociativeOperator() {
		return rightAssociativeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonAssociativeOperator() {
		return nonAssociativeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModel() {
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaModel_ModelURI() {
		return (EAttribute)metaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaModel_Prefix() {
		return (EAttribute)metaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueMapping() {
		return stringValueMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueMapping_Value() {
		return (EAttribute)stringValueMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposableMapping() {
		return composableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceOperator() {
		return precedenceOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedenceOperator_Precedence() {
		return (EAttribute)precedenceOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceOperator_Mapping() {
		return (EReference)precedenceOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularExpression() {
		return regularExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularExpression_Regex() {
		return (EAttribute)regularExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularExpression_Name() {
		return (EAttribute)regularExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedName() {
		return qualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Sections() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongParser() {
		return longParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolParser() {
		return boolParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolParser_TrueLit() {
		return (EAttribute)boolParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolParser_FalseLit() {
		return (EAttribute)boolParserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportParser() {
		return importParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportParser_Parser() {
		return (EReference)importParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PccsFactory getPccsFactory() {
		return (PccsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractParserEClass = createEClass(ABSTRACT_PARSER);
		createEAttribute(abstractParserEClass, ABSTRACT_PARSER__MULTIPLICITY);
		createEAttribute(abstractParserEClass, ABSTRACT_PARSER__LABEL);
		createEReference(abstractParserEClass, ABSTRACT_PARSER__MAPPING);

		orParserEClass = createEClass(OR_PARSER);
		createEReference(orParserEClass, OR_PARSER__PARSERS);

		sequenceParserEClass = createEClass(SEQUENCE_PARSER);
		createEReference(sequenceParserEClass, SEQUENCE_PARSER__PARSERS);

		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__STARTWITH);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__OPERATORS);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__KEYWORDS);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__PARSERS);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__METAMODELS);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__REGEX);
		createEAttribute(concreteSyntaxEClass, CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START);
		createEAttribute(concreteSyntaxEClass, CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END);
		createEAttribute(concreteSyntaxEClass, CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START);
		createEAttribute(concreteSyntaxEClass, CONCRETE_SYNTAX__ID);

		terminalParserEClass = createEClass(TERMINAL_PARSER);
		createEReference(terminalParserEClass, TERMINAL_PARSER__TERMINAL);

		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__TERMINAL);

		refParserEClass = createEClass(REF_PARSER);
		createEReference(refParserEClass, REF_PARSER__REF);

		literalParserEClass = createEClass(LITERAL_PARSER);
		createEReference(literalParserEClass, LITERAL_PARSER__REGEX);

		parserDefinitionEClass = createEClass(PARSER_DEFINITION);
		createEAttribute(parserDefinitionEClass, PARSER_DEFINITION__NAME);
		createEReference(parserDefinitionEClass, PARSER_DEFINITION__RULE);

		identifierParserEClass = createEClass(IDENTIFIER_PARSER);

		stringParserEClass = createEClass(STRING_PARSER);

		ecoreMappingEClass = createEClass(ECORE_MAPPING);
		createEReference(ecoreMappingEClass, ECORE_MAPPING__ASSIGNMENTS);
		createEReference(ecoreMappingEClass, ECORE_MAPPING__METAMODEL);
		createEReference(ecoreMappingEClass, ECORE_MAPPING__ECLASS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__TO);
		createEReference(assignmentEClass, ASSIGNMENT__FROM);

		asQNameEClass = createEClass(AS_QNAME);
		createEAttribute(asQNameEClass, AS_QNAME__DELIM);

		identityParserEClass = createEClass(IDENTITY_PARSER);
		createEReference(identityParserEClass, IDENTITY_PARSER__PARSER);

		numberParserEClass = createEClass(NUMBER_PARSER);

		intParserEClass = createEClass(INT_PARSER);

		doubleParserEClass = createEClass(DOUBLE_PARSER);

		floatParserEClass = createEClass(FLOAT_PARSER);

		mappingEClass = createEClass(MAPPING);

		referenceMappingEClass = createEClass(REFERENCE_MAPPING);
		createEReference(referenceMappingEClass, REFERENCE_MAPPING__QNAME);

		operatorTableParserEClass = createEClass(OPERATOR_TABLE_PARSER);
		createEReference(operatorTableParserEClass, OPERATOR_TABLE_PARSER__ENTRIES);

		operatorTableEntryEClass = createEClass(OPERATOR_TABLE_ENTRY);
		createEReference(operatorTableEntryEClass, OPERATOR_TABLE_ENTRY__PARSER);

		infixOperatorEClass = createEClass(INFIX_OPERATOR);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);

		prefixOperatorEClass = createEClass(PREFIX_OPERATOR);

		postfixOperatorEClass = createEClass(POSTFIX_OPERATOR);

		unitEClass = createEClass(UNIT);

		leftAssociativeOperatorEClass = createEClass(LEFT_ASSOCIATIVE_OPERATOR);

		rightAssociativeOperatorEClass = createEClass(RIGHT_ASSOCIATIVE_OPERATOR);

		nonAssociativeOperatorEClass = createEClass(NON_ASSOCIATIVE_OPERATOR);

		metaModelEClass = createEClass(META_MODEL);
		createEAttribute(metaModelEClass, META_MODEL__MODEL_URI);
		createEAttribute(metaModelEClass, META_MODEL__PREFIX);

		stringValueMappingEClass = createEClass(STRING_VALUE_MAPPING);
		createEAttribute(stringValueMappingEClass, STRING_VALUE_MAPPING__VALUE);

		composableMappingEClass = createEClass(COMPOSABLE_MAPPING);

		precedenceOperatorEClass = createEClass(PRECEDENCE_OPERATOR);
		createEAttribute(precedenceOperatorEClass, PRECEDENCE_OPERATOR__PRECEDENCE);
		createEReference(precedenceOperatorEClass, PRECEDENCE_OPERATOR__MAPPING);

		regularExpressionEClass = createEClass(REGULAR_EXPRESSION);
		createEAttribute(regularExpressionEClass, REGULAR_EXPRESSION__REGEX);
		createEAttribute(regularExpressionEClass, REGULAR_EXPRESSION__NAME);

		qualifiedNameEClass = createEClass(QUALIFIED_NAME);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__SECTIONS);

		longParserEClass = createEClass(LONG_PARSER);

		boolParserEClass = createEClass(BOOL_PARSER);
		createEAttribute(boolParserEClass, BOOL_PARSER__TRUE_LIT);
		createEAttribute(boolParserEClass, BOOL_PARSER__FALSE_LIT);

		importParserEClass = createEClass(IMPORT_PARSER);
		createEReference(importParserEClass, IMPORT_PARSER__PARSER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		orParserEClass.getESuperTypes().add(this.getAbstractParser());
		sequenceParserEClass.getESuperTypes().add(this.getAbstractParser());
		terminalParserEClass.getESuperTypes().add(this.getAbstractParser());
		refParserEClass.getESuperTypes().add(this.getAbstractParser());
		literalParserEClass.getESuperTypes().add(this.getAbstractParser());
		identifierParserEClass.getESuperTypes().add(this.getLiteralParser());
		stringParserEClass.getESuperTypes().add(this.getLiteralParser());
		ecoreMappingEClass.getESuperTypes().add(this.getComposableMapping());
		asQNameEClass.getESuperTypes().add(this.getMapping());
		identityParserEClass.getESuperTypes().add(this.getAbstractParser());
		numberParserEClass.getESuperTypes().add(this.getLiteralParser());
		intParserEClass.getESuperTypes().add(this.getNumberParser());
		doubleParserEClass.getESuperTypes().add(this.getNumberParser());
		floatParserEClass.getESuperTypes().add(this.getNumberParser());
		referenceMappingEClass.getESuperTypes().add(this.getComposableMapping());
		operatorTableParserEClass.getESuperTypes().add(this.getAbstractParser());
		infixOperatorEClass.getESuperTypes().add(this.getPrecedenceOperator());
		unaryOperatorEClass.getESuperTypes().add(this.getPrecedenceOperator());
		prefixOperatorEClass.getESuperTypes().add(this.getUnaryOperator());
		postfixOperatorEClass.getESuperTypes().add(this.getUnaryOperator());
		unitEClass.getESuperTypes().add(this.getOperatorTableEntry());
		leftAssociativeOperatorEClass.getESuperTypes().add(this.getInfixOperator());
		rightAssociativeOperatorEClass.getESuperTypes().add(this.getInfixOperator());
		nonAssociativeOperatorEClass.getESuperTypes().add(this.getInfixOperator());
		stringValueMappingEClass.getESuperTypes().add(this.getComposableMapping());
		composableMappingEClass.getESuperTypes().add(this.getMapping());
		precedenceOperatorEClass.getESuperTypes().add(this.getOperatorTableEntry());
		longParserEClass.getESuperTypes().add(this.getNumberParser());
		boolParserEClass.getESuperTypes().add(this.getLiteralParser());
		importParserEClass.getESuperTypes().add(this.getAbstractParser());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractParserEClass, AbstractParser.class, "AbstractParser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractParser_Multiplicity(), ecorePackage.getEString(), "multiplicity", null, 0, 1, AbstractParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractParser_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractParser_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, AbstractParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orParserEClass, OrParser.class, "OrParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrParser_Parsers(), this.getAbstractParser(), null, "parsers", null, 1, -1, OrParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceParserEClass, SequenceParser.class, "SequenceParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceParser_Parsers(), this.getAbstractParser(), null, "parsers", null, 1, -1, SequenceParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_Startwith(), this.getParserDefinition(), null, "startwith", null, 1, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Operators(), this.getTerminal(), null, "operators", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Keywords(), this.getTerminal(), null, "keywords", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Parsers(), this.getParserDefinition(), null, "parsers", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Metamodels(), this.getMetaModel(), null, "metamodels", null, 1, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Regex(), this.getRegularExpression(), null, "regex", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteSyntax_MultiLineCommentIndicationStart(), ecorePackage.getEString(), "multiLineCommentIndicationStart", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteSyntax_MultiLineCommentIndicationEnd(), ecorePackage.getEString(), "multiLineCommentIndicationEnd", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteSyntax_SingleLineCommentIndicationStart(), ecorePackage.getEString(), "singleLineCommentIndicationStart", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteSyntax_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalParserEClass, TerminalParser.class, "TerminalParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminalParser_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, TerminalParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminal_Terminal(), ecorePackage.getEString(), "terminal", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refParserEClass, RefParser.class, "RefParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefParser_Ref(), this.getParserDefinition(), null, "ref", null, 1, 1, RefParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalParserEClass, LiteralParser.class, "LiteralParser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralParser_Regex(), this.getRegularExpression(), null, "regex", null, 0, 1, LiteralParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parserDefinitionEClass, ParserDefinition.class, "ParserDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParserDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParserDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParserDefinition_Rule(), this.getAbstractParser(), null, "rule", null, 1, 1, ParserDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierParserEClass, IdentifierParser.class, "IdentifierParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringParserEClass, StringParser.class, "StringParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreMappingEClass, EcoreMapping.class, "EcoreMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcoreMapping_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, EcoreMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreMapping_Metamodel(), this.getMetaModel(), null, "metamodel", null, 1, 1, EcoreMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreMapping_EClass(), this.getQualifiedName(), null, "eClass", null, 1, 1, EcoreMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_To(), ecorePackage.getEString(), "to", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_From(), this.getComposableMapping(), null, "from", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asQNameEClass, AsQName.class, "AsQName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsQName_Delim(), ecorePackage.getEString(), "delim", null, 0, 1, AsQName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityParserEClass, IdentityParser.class, "IdentityParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentityParser_Parser(), this.getAbstractParser(), null, "parser", null, 1, 1, IdentityParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberParserEClass, NumberParser.class, "NumberParser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intParserEClass, IntParser.class, "IntParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleParserEClass, DoubleParser.class, "DoubleParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatParserEClass, FloatParser.class, "FloatParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceMappingEClass, ReferenceMapping.class, "ReferenceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceMapping_QName(), this.getQualifiedName(), null, "qName", null, 1, 1, ReferenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorTableParserEClass, OperatorTableParser.class, "OperatorTableParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorTableParser_Entries(), this.getOperatorTableEntry(), null, "entries", null, 0, -1, OperatorTableParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorTableEntryEClass, OperatorTableEntry.class, "OperatorTableEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorTableEntry_Parser(), this.getAbstractParser(), null, "parser", null, 1, 1, OperatorTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infixOperatorEClass, InfixOperator.class, "InfixOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prefixOperatorEClass, PrefixOperator.class, "PrefixOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postfixOperatorEClass, PostfixOperator.class, "PostfixOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftAssociativeOperatorEClass, LeftAssociativeOperator.class, "LeftAssociativeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightAssociativeOperatorEClass, RightAssociativeOperator.class, "RightAssociativeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonAssociativeOperatorEClass, NonAssociativeOperator.class, "NonAssociativeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaModel_ModelURI(), ecorePackage.getEString(), "modelURI", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModel_Prefix(), ecorePackage.getEString(), "prefix", "default", 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueMappingEClass, StringValueMapping.class, "StringValueMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValueMapping_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValueMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composableMappingEClass, ComposableMapping.class, "ComposableMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceOperatorEClass, PrecedenceOperator.class, "PrecedenceOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceOperator_Precedence(), ecorePackage.getEInt(), "precedence", null, 1, 1, PrecedenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceOperator_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, PrecedenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularExpressionEClass, RegularExpression.class, "RegularExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularExpression_Regex(), ecorePackage.getEString(), "regex", null, 1, 1, RegularExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularExpression_Name(), ecorePackage.getEString(), "name", null, 1, 1, RegularExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedName_Sections(), ecorePackage.getEString(), "sections", null, 1, -1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longParserEClass, LongParser.class, "LongParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolParserEClass, BoolParser.class, "BoolParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolParser_TrueLit(), ecorePackage.getEString(), "trueLit", "true", 0, 1, BoolParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolParser_FalseLit(), ecorePackage.getEString(), "falseLit", "false", 0, 1, BoolParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importParserEClass, ImportParser.class, "ImportParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportParser_Parser(), this.getAbstractParser(), null, "parser", null, 1, 1, ImportParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PccsPackageImpl
