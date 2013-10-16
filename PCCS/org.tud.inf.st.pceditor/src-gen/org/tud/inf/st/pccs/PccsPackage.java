/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.pccs.PccsFactory
 * @model kind="package"
 * @generated
 */
public interface PccsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pccs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/pccs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pccs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PccsPackage eINSTANCE = org.tud.inf.st.pccs.impl.PccsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.AbstractParserImpl <em>Abstract Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.AbstractParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAbstractParser()
	 * @generated
	 */
	int ABSTRACT_PARSER = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARSER__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARSER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARSER__MAPPING = 2;

	/**
	 * The number of structural features of the '<em>Abstract Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARSER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.OrParserImpl <em>Or Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.OrParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOrParser()
	 * @generated
	 */
	int OR_PARSER = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Parsers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARSER__PARSERS = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.SequenceParserImpl <em>Sequence Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.SequenceParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getSequenceParser()
	 * @generated
	 */
	int SEQUENCE_PARSER = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Parsers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PARSER__PARSERS = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getConcreteSyntax()
	 * @generated
	 */
	int CONCRETE_SYNTAX = 3;

	/**
	 * The feature id for the '<em><b>Startwith</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__STARTWITH = 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__OPERATORS = 1;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__KEYWORDS = 2;

	/**
	 * The feature id for the '<em><b>Parsers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__PARSERS = 3;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__METAMODELS = 4;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__REGEX = 5;

	/**
	 * The feature id for the '<em><b>Multi Line Comment Indication Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START = 6;

	/**
	 * The feature id for the '<em><b>Multi Line Comment Indication End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END = 7;

	/**
	 * The feature id for the '<em><b>Single Line Comment Indication Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__ID = 9;

	/**
	 * The number of structural features of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.TerminalParserImpl <em>Terminal Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.TerminalParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getTerminalParser()
	 * @generated
	 */
	int TERMINAL_PARSER = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_PARSER__TERMINAL = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.TerminalImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 5;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.RefParserImpl <em>Ref Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.RefParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRefParser()
	 * @generated
	 */
	int REF_PARSER = 6;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PARSER__REF = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.LiteralParserImpl <em>Literal Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.LiteralParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLiteralParser()
	 * @generated
	 */
	int LITERAL_PARSER = 7;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARSER__REGEX = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.ParserDefinitionImpl <em>Parser Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.ParserDefinitionImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getParserDefinition()
	 * @generated
	 */
	int PARSER_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_DEFINITION__RULE = 1;

	/**
	 * The number of structural features of the '<em>Parser Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.IdentifierParserImpl <em>Identifier Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.IdentifierParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIdentifierParser()
	 * @generated
	 */
	int IDENTIFIER_PARSER = 9;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PARSER__MULTIPLICITY = LITERAL_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PARSER__LABEL = LITERAL_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PARSER__MAPPING = LITERAL_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PARSER__REGEX = LITERAL_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Identifier Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PARSER_FEATURE_COUNT = LITERAL_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.StringParserImpl <em>String Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.StringParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getStringParser()
	 * @generated
	 */
	int STRING_PARSER = 10;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARSER__MULTIPLICITY = LITERAL_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARSER__LABEL = LITERAL_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARSER__MAPPING = LITERAL_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARSER__REGEX = LITERAL_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>String Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARSER_FEATURE_COUNT = LITERAL_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.Mapping <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.Mapping
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 19;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.ComposableMapping <em>Composable Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.ComposableMapping
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getComposableMapping()
	 * @generated
	 */
	int COMPOSABLE_MAPPING = 33;

	/**
	 * The number of structural features of the '<em>Composable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.EcoreMappingImpl <em>Ecore Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.EcoreMappingImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getEcoreMapping()
	 * @generated
	 */
	int ECORE_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MAPPING__ASSIGNMENTS = COMPOSABLE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MAPPING__METAMODEL = COMPOSABLE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MAPPING__ECLASS = COMPOSABLE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ecore Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MAPPING_FEATURE_COUNT = COMPOSABLE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.AssignmentImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FROM = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.AsQNameImpl <em>As QName</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.AsQNameImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAsQName()
	 * @generated
	 */
	int AS_QNAME = 13;

	/**
	 * The feature id for the '<em><b>Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_QNAME__DELIM = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As QName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_QNAME_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.IdentityParserImpl <em>Identity Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.IdentityParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIdentityParser()
	 * @generated
	 */
	int IDENTITY_PARSER = 14;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_PARSER__PARSER = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identity Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.NumberParserImpl <em>Number Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.NumberParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getNumberParser()
	 * @generated
	 */
	int NUMBER_PARSER = 15;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARSER__MULTIPLICITY = LITERAL_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARSER__LABEL = LITERAL_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARSER__MAPPING = LITERAL_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARSER__REGEX = LITERAL_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Number Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PARSER_FEATURE_COUNT = LITERAL_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.IntParserImpl <em>Int Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.IntParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIntParser()
	 * @generated
	 */
	int INT_PARSER = 16;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARSER__MULTIPLICITY = NUMBER_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARSER__LABEL = NUMBER_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARSER__MAPPING = NUMBER_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARSER__REGEX = NUMBER_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Int Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARSER_FEATURE_COUNT = NUMBER_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.DoubleParserImpl <em>Double Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.DoubleParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getDoubleParser()
	 * @generated
	 */
	int DOUBLE_PARSER = 17;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARSER__MULTIPLICITY = NUMBER_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARSER__LABEL = NUMBER_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARSER__MAPPING = NUMBER_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARSER__REGEX = NUMBER_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Double Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARSER_FEATURE_COUNT = NUMBER_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.FloatParserImpl <em>Float Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.FloatParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getFloatParser()
	 * @generated
	 */
	int FLOAT_PARSER = 18;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARSER__MULTIPLICITY = NUMBER_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARSER__LABEL = NUMBER_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARSER__MAPPING = NUMBER_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARSER__REGEX = NUMBER_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Float Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARSER_FEATURE_COUNT = NUMBER_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.ReferenceMappingImpl <em>Reference Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.ReferenceMappingImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getReferenceMapping()
	 * @generated
	 */
	int REFERENCE_MAPPING = 20;

	/**
	 * The feature id for the '<em><b>QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MAPPING__QNAME = COMPOSABLE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MAPPING_FEATURE_COUNT = COMPOSABLE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.OperatorTableParserImpl <em>Operator Table Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.OperatorTableParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOperatorTableParser()
	 * @generated
	 */
	int OPERATOR_TABLE_PARSER = 21;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_PARSER__ENTRIES = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Table Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.OperatorTableEntryImpl <em>Operator Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.OperatorTableEntryImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOperatorTableEntry()
	 * @generated
	 */
	int OPERATOR_TABLE_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_ENTRY__PARSER = 0;

	/**
	 * The number of structural features of the '<em>Operator Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_TABLE_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.PrecedenceOperatorImpl <em>Precedence Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.PrecedenceOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPrecedenceOperator()
	 * @generated
	 */
	int PRECEDENCE_OPERATOR = 34;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATOR__PARSER = OPERATOR_TABLE_ENTRY__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATOR__PRECEDENCE = OPERATOR_TABLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATOR__MAPPING = OPERATOR_TABLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATOR_FEATURE_COUNT = OPERATOR_TABLE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.InfixOperatorImpl <em>Infix Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.InfixOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getInfixOperator()
	 * @generated
	 */
	int INFIX_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_OPERATOR__PARSER = PRECEDENCE_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_OPERATOR__PRECEDENCE = PRECEDENCE_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_OPERATOR__MAPPING = PRECEDENCE_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Infix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_OPERATOR_FEATURE_COUNT = PRECEDENCE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.UnaryOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 24;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__PARSER = PRECEDENCE_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__PRECEDENCE = PRECEDENCE_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__MAPPING = PRECEDENCE_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = PRECEDENCE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.PrefixOperatorImpl <em>Prefix Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.PrefixOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPrefixOperator()
	 * @generated
	 */
	int PREFIX_OPERATOR = 25;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATOR__PARSER = UNARY_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATOR__PRECEDENCE = UNARY_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATOR__MAPPING = UNARY_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Prefix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATOR_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.PostfixOperatorImpl <em>Postfix Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.PostfixOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPostfixOperator()
	 * @generated
	 */
	int POSTFIX_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_OPERATOR__PARSER = UNARY_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_OPERATOR__PRECEDENCE = UNARY_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_OPERATOR__MAPPING = UNARY_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Postfix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_OPERATOR_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.UnitImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 27;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PARSER = OPERATOR_TABLE_ENTRY__PARSER;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = OPERATOR_TABLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.LeftAssociativeOperatorImpl <em>Left Associative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.LeftAssociativeOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLeftAssociativeOperator()
	 * @generated
	 */
	int LEFT_ASSOCIATIVE_OPERATOR = 28;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ASSOCIATIVE_OPERATOR__PARSER = INFIX_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ASSOCIATIVE_OPERATOR__PRECEDENCE = INFIX_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ASSOCIATIVE_OPERATOR__MAPPING = INFIX_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Left Associative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ASSOCIATIVE_OPERATOR_FEATURE_COUNT = INFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.RightAssociativeOperatorImpl <em>Right Associative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.RightAssociativeOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRightAssociativeOperator()
	 * @generated
	 */
	int RIGHT_ASSOCIATIVE_OPERATOR = 29;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ASSOCIATIVE_OPERATOR__PARSER = INFIX_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ASSOCIATIVE_OPERATOR__PRECEDENCE = INFIX_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ASSOCIATIVE_OPERATOR__MAPPING = INFIX_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Right Associative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ASSOCIATIVE_OPERATOR_FEATURE_COUNT = INFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.NonAssociativeOperatorImpl <em>Non Associative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.NonAssociativeOperatorImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getNonAssociativeOperator()
	 * @generated
	 */
	int NON_ASSOCIATIVE_OPERATOR = 30;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ASSOCIATIVE_OPERATOR__PARSER = INFIX_OPERATOR__PARSER;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ASSOCIATIVE_OPERATOR__PRECEDENCE = INFIX_OPERATOR__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ASSOCIATIVE_OPERATOR__MAPPING = INFIX_OPERATOR__MAPPING;

	/**
	 * The number of structural features of the '<em>Non Associative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ASSOCIATIVE_OPERATOR_FEATURE_COUNT = INFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.MetaModelImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 31;

	/**
	 * The feature id for the '<em><b>Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__MODEL_URI = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.StringValueMappingImpl <em>String Value Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.StringValueMappingImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getStringValueMapping()
	 * @generated
	 */
	int STRING_VALUE_MAPPING = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_MAPPING__VALUE = COMPOSABLE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_MAPPING_FEATURE_COUNT = COMPOSABLE_MAPPING_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.RegularExpressionImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRegularExpression()
	 * @generated
	 */
	int REGULAR_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION__REGEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Regular Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.QualifiedNameImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 36;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.LongParserImpl <em>Long Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.LongParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLongParser()
	 * @generated
	 */
	int LONG_PARSER = 37;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PARSER__MULTIPLICITY = NUMBER_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PARSER__LABEL = NUMBER_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PARSER__MAPPING = NUMBER_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PARSER__REGEX = NUMBER_PARSER__REGEX;

	/**
	 * The number of structural features of the '<em>Long Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PARSER_FEATURE_COUNT = NUMBER_PARSER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.BoolParserImpl <em>Bool Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.BoolParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getBoolParser()
	 * @generated
	 */
	int BOOL_PARSER = 38;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__MULTIPLICITY = LITERAL_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__LABEL = LITERAL_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__MAPPING = LITERAL_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__REGEX = LITERAL_PARSER__REGEX;

	/**
	 * The feature id for the '<em><b>True Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__TRUE_LIT = LITERAL_PARSER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER__FALSE_LIT = LITERAL_PARSER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PARSER_FEATURE_COUNT = LITERAL_PARSER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.pccs.impl.ImportParserImpl <em>Import Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.pccs.impl.ImportParserImpl
	 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getImportParser()
	 * @generated
	 */
	int IMPORT_PARSER = 39;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PARSER__MULTIPLICITY = ABSTRACT_PARSER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PARSER__LABEL = ABSTRACT_PARSER__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PARSER__MAPPING = ABSTRACT_PARSER__MAPPING;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PARSER__PARSER = ABSTRACT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PARSER_FEATURE_COUNT = ABSTRACT_PARSER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.AbstractParser <em>Abstract Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parser</em>'.
	 * @see org.tud.inf.st.pccs.AbstractParser
	 * @generated
	 */
	EClass getAbstractParser();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.AbstractParser#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.tud.inf.st.pccs.AbstractParser#getMultiplicity()
	 * @see #getAbstractParser()
	 * @generated
	 */
	EAttribute getAbstractParser_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.AbstractParser#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.tud.inf.st.pccs.AbstractParser#getLabel()
	 * @see #getAbstractParser()
	 * @generated
	 */
	EAttribute getAbstractParser_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.AbstractParser#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.tud.inf.st.pccs.AbstractParser#getMapping()
	 * @see #getAbstractParser()
	 * @generated
	 */
	EReference getAbstractParser_Mapping();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.OrParser <em>Or Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Parser</em>'.
	 * @see org.tud.inf.st.pccs.OrParser
	 * @generated
	 */
	EClass getOrParser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.OrParser#getParsers <em>Parsers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parsers</em>'.
	 * @see org.tud.inf.st.pccs.OrParser#getParsers()
	 * @see #getOrParser()
	 * @generated
	 */
	EReference getOrParser_Parsers();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.SequenceParser <em>Sequence Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Parser</em>'.
	 * @see org.tud.inf.st.pccs.SequenceParser
	 * @generated
	 */
	EClass getSequenceParser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.SequenceParser#getParsers <em>Parsers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parsers</em>'.
	 * @see org.tud.inf.st.pccs.SequenceParser#getParsers()
	 * @see #getSequenceParser()
	 * @generated
	 */
	EReference getSequenceParser_Parsers();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax
	 * @generated
	 */
	EClass getConcreteSyntax();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.pccs.ConcreteSyntax#getStartwith <em>Startwith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startwith</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getStartwith()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Startwith();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.ConcreteSyntax#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getOperators()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.ConcreteSyntax#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getKeywords()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.ConcreteSyntax#getParsers <em>Parsers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parsers</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getParsers()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Parsers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.ConcreteSyntax#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getMetamodels()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Metamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.ConcreteSyntax#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regex</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getRegex()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Regex();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationStart <em>Multi Line Comment Indication Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line Comment Indication Start</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationStart()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EAttribute getConcreteSyntax_MultiLineCommentIndicationStart();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationEnd <em>Multi Line Comment Indication End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line Comment Indication End</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationEnd()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EAttribute getConcreteSyntax_MultiLineCommentIndicationEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.ConcreteSyntax#getSingleLineCommentIndicationStart <em>Single Line Comment Indication Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Line Comment Indication Start</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getSingleLineCommentIndicationStart()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EAttribute getConcreteSyntax_SingleLineCommentIndicationStart();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.ConcreteSyntax#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tud.inf.st.pccs.ConcreteSyntax#getId()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EAttribute getConcreteSyntax_Id();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.TerminalParser <em>Terminal Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Parser</em>'.
	 * @see org.tud.inf.st.pccs.TerminalParser
	 * @generated
	 */
	EClass getTerminalParser();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.pccs.TerminalParser#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see org.tud.inf.st.pccs.TerminalParser#getTerminal()
	 * @see #getTerminalParser()
	 * @generated
	 */
	EReference getTerminalParser_Terminal();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see org.tud.inf.st.pccs.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.Terminal#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see org.tud.inf.st.pccs.Terminal#getTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Terminal();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.RefParser <em>Ref Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Parser</em>'.
	 * @see org.tud.inf.st.pccs.RefParser
	 * @generated
	 */
	EClass getRefParser();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.pccs.RefParser#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.tud.inf.st.pccs.RefParser#getRef()
	 * @see #getRefParser()
	 * @generated
	 */
	EReference getRefParser_Ref();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.LiteralParser <em>Literal Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Parser</em>'.
	 * @see org.tud.inf.st.pccs.LiteralParser
	 * @generated
	 */
	EClass getLiteralParser();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.pccs.LiteralParser#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regex</em>'.
	 * @see org.tud.inf.st.pccs.LiteralParser#getRegex()
	 * @see #getLiteralParser()
	 * @generated
	 */
	EReference getLiteralParser_Regex();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.ParserDefinition <em>Parser Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Definition</em>'.
	 * @see org.tud.inf.st.pccs.ParserDefinition
	 * @generated
	 */
	EClass getParserDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.ParserDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.pccs.ParserDefinition#getName()
	 * @see #getParserDefinition()
	 * @generated
	 */
	EAttribute getParserDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.ParserDefinition#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.tud.inf.st.pccs.ParserDefinition#getRule()
	 * @see #getParserDefinition()
	 * @generated
	 */
	EReference getParserDefinition_Rule();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.IdentifierParser <em>Identifier Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Parser</em>'.
	 * @see org.tud.inf.st.pccs.IdentifierParser
	 * @generated
	 */
	EClass getIdentifierParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.StringParser <em>String Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Parser</em>'.
	 * @see org.tud.inf.st.pccs.StringParser
	 * @generated
	 */
	EClass getStringParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.EcoreMapping <em>Ecore Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Mapping</em>'.
	 * @see org.tud.inf.st.pccs.EcoreMapping
	 * @generated
	 */
	EClass getEcoreMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.EcoreMapping#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see org.tud.inf.st.pccs.EcoreMapping#getEClass()
	 * @see #getEcoreMapping()
	 * @generated
	 */
	EReference getEcoreMapping_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.EcoreMapping#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.tud.inf.st.pccs.EcoreMapping#getAssignments()
	 * @see #getEcoreMapping()
	 * @generated
	 */
	EReference getEcoreMapping_Assignments();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.pccs.EcoreMapping#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.tud.inf.st.pccs.EcoreMapping#getMetamodel()
	 * @see #getEcoreMapping()
	 * @generated
	 */
	EReference getEcoreMapping_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.tud.inf.st.pccs.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.Assignment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.tud.inf.st.pccs.Assignment#getTo()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.Assignment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.tud.inf.st.pccs.Assignment#getFrom()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_From();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.AsQName <em>As QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As QName</em>'.
	 * @see org.tud.inf.st.pccs.AsQName
	 * @generated
	 */
	EClass getAsQName();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.AsQName#getDelim <em>Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delim</em>'.
	 * @see org.tud.inf.st.pccs.AsQName#getDelim()
	 * @see #getAsQName()
	 * @generated
	 */
	EAttribute getAsQName_Delim();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.IdentityParser <em>Identity Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Parser</em>'.
	 * @see org.tud.inf.st.pccs.IdentityParser
	 * @generated
	 */
	EClass getIdentityParser();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.IdentityParser#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parser</em>'.
	 * @see org.tud.inf.st.pccs.IdentityParser#getParser()
	 * @see #getIdentityParser()
	 * @generated
	 */
	EReference getIdentityParser_Parser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.NumberParser <em>Number Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Parser</em>'.
	 * @see org.tud.inf.st.pccs.NumberParser
	 * @generated
	 */
	EClass getNumberParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.IntParser <em>Int Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Parser</em>'.
	 * @see org.tud.inf.st.pccs.IntParser
	 * @generated
	 */
	EClass getIntParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.DoubleParser <em>Double Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Parser</em>'.
	 * @see org.tud.inf.st.pccs.DoubleParser
	 * @generated
	 */
	EClass getDoubleParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.FloatParser <em>Float Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Parser</em>'.
	 * @see org.tud.inf.st.pccs.FloatParser
	 * @generated
	 */
	EClass getFloatParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.tud.inf.st.pccs.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.ReferenceMapping <em>Reference Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Mapping</em>'.
	 * @see org.tud.inf.st.pccs.ReferenceMapping
	 * @generated
	 */
	EClass getReferenceMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.ReferenceMapping#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>QName</em>'.
	 * @see org.tud.inf.st.pccs.ReferenceMapping#getQName()
	 * @see #getReferenceMapping()
	 * @generated
	 */
	EReference getReferenceMapping_QName();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.OperatorTableParser <em>Operator Table Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Table Parser</em>'.
	 * @see org.tud.inf.st.pccs.OperatorTableParser
	 * @generated
	 */
	EClass getOperatorTableParser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.pccs.OperatorTableParser#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.tud.inf.st.pccs.OperatorTableParser#getEntries()
	 * @see #getOperatorTableParser()
	 * @generated
	 */
	EReference getOperatorTableParser_Entries();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.OperatorTableEntry <em>Operator Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Table Entry</em>'.
	 * @see org.tud.inf.st.pccs.OperatorTableEntry
	 * @generated
	 */
	EClass getOperatorTableEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.OperatorTableEntry#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parser</em>'.
	 * @see org.tud.inf.st.pccs.OperatorTableEntry#getParser()
	 * @see #getOperatorTableEntry()
	 * @generated
	 */
	EReference getOperatorTableEntry_Parser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.InfixOperator <em>Infix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Operator</em>'.
	 * @see org.tud.inf.st.pccs.InfixOperator
	 * @generated
	 */
	EClass getInfixOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see org.tud.inf.st.pccs.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.PrefixOperator <em>Prefix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Operator</em>'.
	 * @see org.tud.inf.st.pccs.PrefixOperator
	 * @generated
	 */
	EClass getPrefixOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.PostfixOperator <em>Postfix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Operator</em>'.
	 * @see org.tud.inf.st.pccs.PostfixOperator
	 * @generated
	 */
	EClass getPostfixOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.tud.inf.st.pccs.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.LeftAssociativeOperator <em>Left Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Associative Operator</em>'.
	 * @see org.tud.inf.st.pccs.LeftAssociativeOperator
	 * @generated
	 */
	EClass getLeftAssociativeOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.RightAssociativeOperator <em>Right Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Associative Operator</em>'.
	 * @see org.tud.inf.st.pccs.RightAssociativeOperator
	 * @generated
	 */
	EClass getRightAssociativeOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.NonAssociativeOperator <em>Non Associative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Associative Operator</em>'.
	 * @see org.tud.inf.st.pccs.NonAssociativeOperator
	 * @generated
	 */
	EClass getNonAssociativeOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see org.tud.inf.st.pccs.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.MetaModel#getModelURI <em>Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model URI</em>'.
	 * @see org.tud.inf.st.pccs.MetaModel#getModelURI()
	 * @see #getMetaModel()
	 * @generated
	 */
	EAttribute getMetaModel_ModelURI();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.MetaModel#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.tud.inf.st.pccs.MetaModel#getPrefix()
	 * @see #getMetaModel()
	 * @generated
	 */
	EAttribute getMetaModel_Prefix();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.StringValueMapping <em>String Value Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Mapping</em>'.
	 * @see org.tud.inf.st.pccs.StringValueMapping
	 * @generated
	 */
	EClass getStringValueMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.StringValueMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.pccs.StringValueMapping#getValue()
	 * @see #getStringValueMapping()
	 * @generated
	 */
	EAttribute getStringValueMapping_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.ComposableMapping <em>Composable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Mapping</em>'.
	 * @see org.tud.inf.st.pccs.ComposableMapping
	 * @generated
	 */
	EClass getComposableMapping();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.PrecedenceOperator <em>Precedence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Operator</em>'.
	 * @see org.tud.inf.st.pccs.PrecedenceOperator
	 * @generated
	 */
	EClass getPrecedenceOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.PrecedenceOperator#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precedence</em>'.
	 * @see org.tud.inf.st.pccs.PrecedenceOperator#getPrecedence()
	 * @see #getPrecedenceOperator()
	 * @generated
	 */
	EAttribute getPrecedenceOperator_Precedence();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.PrecedenceOperator#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.tud.inf.st.pccs.PrecedenceOperator#getMapping()
	 * @see #getPrecedenceOperator()
	 * @generated
	 */
	EReference getPrecedenceOperator_Mapping();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.RegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Expression</em>'.
	 * @see org.tud.inf.st.pccs.RegularExpression
	 * @generated
	 */
	EClass getRegularExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.RegularExpression#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.tud.inf.st.pccs.RegularExpression#getRegex()
	 * @see #getRegularExpression()
	 * @generated
	 */
	EAttribute getRegularExpression_Regex();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.RegularExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.pccs.RegularExpression#getName()
	 * @see #getRegularExpression()
	 * @generated
	 */
	EAttribute getRegularExpression_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see org.tud.inf.st.pccs.QualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link org.tud.inf.st.pccs.QualifiedName#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sections</em>'.
	 * @see org.tud.inf.st.pccs.QualifiedName#getSections()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Sections();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.LongParser <em>Long Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Parser</em>'.
	 * @see org.tud.inf.st.pccs.LongParser
	 * @generated
	 */
	EClass getLongParser();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.BoolParser <em>Bool Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Parser</em>'.
	 * @see org.tud.inf.st.pccs.BoolParser
	 * @generated
	 */
	EClass getBoolParser();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.BoolParser#getTrueLit <em>True Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Lit</em>'.
	 * @see org.tud.inf.st.pccs.BoolParser#getTrueLit()
	 * @see #getBoolParser()
	 * @generated
	 */
	EAttribute getBoolParser_TrueLit();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.pccs.BoolParser#getFalseLit <em>False Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>False Lit</em>'.
	 * @see org.tud.inf.st.pccs.BoolParser#getFalseLit()
	 * @see #getBoolParser()
	 * @generated
	 */
	EAttribute getBoolParser_FalseLit();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.pccs.ImportParser <em>Import Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Parser</em>'.
	 * @see org.tud.inf.st.pccs.ImportParser
	 * @generated
	 */
	EClass getImportParser();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.pccs.ImportParser#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parser</em>'.
	 * @see org.tud.inf.st.pccs.ImportParser#getParser()
	 * @see #getImportParser()
	 * @generated
	 */
	EReference getImportParser_Parser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PccsFactory getPccsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.AbstractParserImpl <em>Abstract Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.AbstractParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAbstractParser()
		 * @generated
		 */
		EClass ABSTRACT_PARSER = eINSTANCE.getAbstractParser();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARSER__MULTIPLICITY = eINSTANCE.getAbstractParser_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARSER__LABEL = eINSTANCE.getAbstractParser_Label();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARSER__MAPPING = eINSTANCE.getAbstractParser_Mapping();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.OrParserImpl <em>Or Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.OrParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOrParser()
		 * @generated
		 */
		EClass OR_PARSER = eINSTANCE.getOrParser();

		/**
		 * The meta object literal for the '<em><b>Parsers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_PARSER__PARSERS = eINSTANCE.getOrParser_Parsers();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.SequenceParserImpl <em>Sequence Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.SequenceParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getSequenceParser()
		 * @generated
		 */
		EClass SEQUENCE_PARSER = eINSTANCE.getSequenceParser();

		/**
		 * The meta object literal for the '<em><b>Parsers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_PARSER__PARSERS = eINSTANCE.getSequenceParser_Parsers();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getConcreteSyntax()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX = eINSTANCE.getConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Startwith</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__STARTWITH = eINSTANCE.getConcreteSyntax_Startwith();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__OPERATORS = eINSTANCE.getConcreteSyntax_Operators();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__KEYWORDS = eINSTANCE.getConcreteSyntax_Keywords();

		/**
		 * The meta object literal for the '<em><b>Parsers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__PARSERS = eINSTANCE.getConcreteSyntax_Parsers();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__METAMODELS = eINSTANCE.getConcreteSyntax_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__REGEX = eINSTANCE.getConcreteSyntax_Regex();

		/**
		 * The meta object literal for the '<em><b>Multi Line Comment Indication Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START = eINSTANCE.getConcreteSyntax_MultiLineCommentIndicationStart();

		/**
		 * The meta object literal for the '<em><b>Multi Line Comment Indication End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END = eINSTANCE.getConcreteSyntax_MultiLineCommentIndicationEnd();

		/**
		 * The meta object literal for the '<em><b>Single Line Comment Indication Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START = eINSTANCE.getConcreteSyntax_SingleLineCommentIndicationStart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX__ID = eINSTANCE.getConcreteSyntax_Id();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.TerminalParserImpl <em>Terminal Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.TerminalParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getTerminalParser()
		 * @generated
		 */
		EClass TERMINAL_PARSER = eINSTANCE.getTerminalParser();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_PARSER__TERMINAL = eINSTANCE.getTerminalParser_Terminal();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.TerminalImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__TERMINAL = eINSTANCE.getTerminal_Terminal();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.RefParserImpl <em>Ref Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.RefParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRefParser()
		 * @generated
		 */
		EClass REF_PARSER = eINSTANCE.getRefParser();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_PARSER__REF = eINSTANCE.getRefParser_Ref();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.LiteralParserImpl <em>Literal Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.LiteralParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLiteralParser()
		 * @generated
		 */
		EClass LITERAL_PARSER = eINSTANCE.getLiteralParser();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_PARSER__REGEX = eINSTANCE.getLiteralParser_Regex();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.ParserDefinitionImpl <em>Parser Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.ParserDefinitionImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getParserDefinition()
		 * @generated
		 */
		EClass PARSER_DEFINITION = eINSTANCE.getParserDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_DEFINITION__NAME = eINSTANCE.getParserDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_DEFINITION__RULE = eINSTANCE.getParserDefinition_Rule();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.IdentifierParserImpl <em>Identifier Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.IdentifierParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIdentifierParser()
		 * @generated
		 */
		EClass IDENTIFIER_PARSER = eINSTANCE.getIdentifierParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.StringParserImpl <em>String Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.StringParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getStringParser()
		 * @generated
		 */
		EClass STRING_PARSER = eINSTANCE.getStringParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.EcoreMappingImpl <em>Ecore Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.EcoreMappingImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getEcoreMapping()
		 * @generated
		 */
		EClass ECORE_MAPPING = eINSTANCE.getEcoreMapping();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_MAPPING__ECLASS = eINSTANCE.getEcoreMapping_EClass();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_MAPPING__ASSIGNMENTS = eINSTANCE.getEcoreMapping_Assignments();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_MAPPING__METAMODEL = eINSTANCE.getEcoreMapping_Metamodel();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.AssignmentImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__TO = eINSTANCE.getAssignment_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__FROM = eINSTANCE.getAssignment_From();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.AsQNameImpl <em>As QName</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.AsQNameImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getAsQName()
		 * @generated
		 */
		EClass AS_QNAME = eINSTANCE.getAsQName();

		/**
		 * The meta object literal for the '<em><b>Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS_QNAME__DELIM = eINSTANCE.getAsQName_Delim();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.IdentityParserImpl <em>Identity Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.IdentityParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIdentityParser()
		 * @generated
		 */
		EClass IDENTITY_PARSER = eINSTANCE.getIdentityParser();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY_PARSER__PARSER = eINSTANCE.getIdentityParser_Parser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.NumberParserImpl <em>Number Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.NumberParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getNumberParser()
		 * @generated
		 */
		EClass NUMBER_PARSER = eINSTANCE.getNumberParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.IntParserImpl <em>Int Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.IntParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getIntParser()
		 * @generated
		 */
		EClass INT_PARSER = eINSTANCE.getIntParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.DoubleParserImpl <em>Double Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.DoubleParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getDoubleParser()
		 * @generated
		 */
		EClass DOUBLE_PARSER = eINSTANCE.getDoubleParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.FloatParserImpl <em>Float Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.FloatParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getFloatParser()
		 * @generated
		 */
		EClass FLOAT_PARSER = eINSTANCE.getFloatParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.Mapping <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.Mapping
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.ReferenceMappingImpl <em>Reference Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.ReferenceMappingImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getReferenceMapping()
		 * @generated
		 */
		EClass REFERENCE_MAPPING = eINSTANCE.getReferenceMapping();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MAPPING__QNAME = eINSTANCE.getReferenceMapping_QName();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.OperatorTableParserImpl <em>Operator Table Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.OperatorTableParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOperatorTableParser()
		 * @generated
		 */
		EClass OPERATOR_TABLE_PARSER = eINSTANCE.getOperatorTableParser();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_TABLE_PARSER__ENTRIES = eINSTANCE.getOperatorTableParser_Entries();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.OperatorTableEntryImpl <em>Operator Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.OperatorTableEntryImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getOperatorTableEntry()
		 * @generated
		 */
		EClass OPERATOR_TABLE_ENTRY = eINSTANCE.getOperatorTableEntry();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_TABLE_ENTRY__PARSER = eINSTANCE.getOperatorTableEntry_Parser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.InfixOperatorImpl <em>Infix Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.InfixOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getInfixOperator()
		 * @generated
		 */
		EClass INFIX_OPERATOR = eINSTANCE.getInfixOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.UnaryOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.PrefixOperatorImpl <em>Prefix Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.PrefixOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPrefixOperator()
		 * @generated
		 */
		EClass PREFIX_OPERATOR = eINSTANCE.getPrefixOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.PostfixOperatorImpl <em>Postfix Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.PostfixOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPostfixOperator()
		 * @generated
		 */
		EClass POSTFIX_OPERATOR = eINSTANCE.getPostfixOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.UnitImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.LeftAssociativeOperatorImpl <em>Left Associative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.LeftAssociativeOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLeftAssociativeOperator()
		 * @generated
		 */
		EClass LEFT_ASSOCIATIVE_OPERATOR = eINSTANCE.getLeftAssociativeOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.RightAssociativeOperatorImpl <em>Right Associative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.RightAssociativeOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRightAssociativeOperator()
		 * @generated
		 */
		EClass RIGHT_ASSOCIATIVE_OPERATOR = eINSTANCE.getRightAssociativeOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.NonAssociativeOperatorImpl <em>Non Associative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.NonAssociativeOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getNonAssociativeOperator()
		 * @generated
		 */
		EClass NON_ASSOCIATIVE_OPERATOR = eINSTANCE.getNonAssociativeOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.MetaModelImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '<em><b>Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL__MODEL_URI = eINSTANCE.getMetaModel_ModelURI();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL__PREFIX = eINSTANCE.getMetaModel_Prefix();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.StringValueMappingImpl <em>String Value Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.StringValueMappingImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getStringValueMapping()
		 * @generated
		 */
		EClass STRING_VALUE_MAPPING = eINSTANCE.getStringValueMapping();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_MAPPING__VALUE = eINSTANCE.getStringValueMapping_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.ComposableMapping <em>Composable Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.ComposableMapping
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getComposableMapping()
		 * @generated
		 */
		EClass COMPOSABLE_MAPPING = eINSTANCE.getComposableMapping();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.PrecedenceOperatorImpl <em>Precedence Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.PrecedenceOperatorImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getPrecedenceOperator()
		 * @generated
		 */
		EClass PRECEDENCE_OPERATOR = eINSTANCE.getPrecedenceOperator();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_OPERATOR__PRECEDENCE = eINSTANCE.getPrecedenceOperator_Precedence();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_OPERATOR__MAPPING = eINSTANCE.getPrecedenceOperator_Mapping();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.RegularExpressionImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getRegularExpression()
		 * @generated
		 */
		EClass REGULAR_EXPRESSION = eINSTANCE.getRegularExpression();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_EXPRESSION__REGEX = eINSTANCE.getRegularExpression_Regex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_EXPRESSION__NAME = eINSTANCE.getRegularExpression_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.QualifiedNameImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__SECTIONS = eINSTANCE.getQualifiedName_Sections();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.LongParserImpl <em>Long Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.LongParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getLongParser()
		 * @generated
		 */
		EClass LONG_PARSER = eINSTANCE.getLongParser();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.BoolParserImpl <em>Bool Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.BoolParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getBoolParser()
		 * @generated
		 */
		EClass BOOL_PARSER = eINSTANCE.getBoolParser();

		/**
		 * The meta object literal for the '<em><b>True Lit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_PARSER__TRUE_LIT = eINSTANCE.getBoolParser_TrueLit();

		/**
		 * The meta object literal for the '<em><b>False Lit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_PARSER__FALSE_LIT = eINSTANCE.getBoolParser_FalseLit();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.pccs.impl.ImportParserImpl <em>Import Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.pccs.impl.ImportParserImpl
		 * @see org.tud.inf.st.pccs.impl.PccsPackageImpl#getImportParser()
		 * @generated
		 */
		EClass IMPORT_PARSER = eINSTANCE.getImportParser();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_PARSER__PARSER = eINSTANCE.getImportParser_Parser();

	}

} //PccsPackage
