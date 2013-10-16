/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.pccs.PccsPackage
 * @generated
 */
public interface PccsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PccsFactory eINSTANCE = org.tud.inf.st.pccs.impl.PccsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Or Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Parser</em>'.
	 * @generated
	 */
	OrParser createOrParser();

	/**
	 * Returns a new object of class '<em>Sequence Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Parser</em>'.
	 * @generated
	 */
	SequenceParser createSequenceParser();

	/**
	 * Returns a new object of class '<em>Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Syntax</em>'.
	 * @generated
	 */
	ConcreteSyntax createConcreteSyntax();

	/**
	 * Returns a new object of class '<em>Terminal Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Parser</em>'.
	 * @generated
	 */
	TerminalParser createTerminalParser();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Ref Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Parser</em>'.
	 * @generated
	 */
	RefParser createRefParser();

	/**
	 * Returns a new object of class '<em>Parser Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parser Definition</em>'.
	 * @generated
	 */
	ParserDefinition createParserDefinition();

	/**
	 * Returns a new object of class '<em>Identifier Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Parser</em>'.
	 * @generated
	 */
	IdentifierParser createIdentifierParser();

	/**
	 * Returns a new object of class '<em>String Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Parser</em>'.
	 * @generated
	 */
	StringParser createStringParser();

	/**
	 * Returns a new object of class '<em>Ecore Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Mapping</em>'.
	 * @generated
	 */
	EcoreMapping createEcoreMapping();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>As QName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As QName</em>'.
	 * @generated
	 */
	AsQName createAsQName();

	/**
	 * Returns a new object of class '<em>Identity Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Parser</em>'.
	 * @generated
	 */
	IdentityParser createIdentityParser();

	/**
	 * Returns a new object of class '<em>Int Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Parser</em>'.
	 * @generated
	 */
	IntParser createIntParser();

	/**
	 * Returns a new object of class '<em>Double Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Parser</em>'.
	 * @generated
	 */
	DoubleParser createDoubleParser();

	/**
	 * Returns a new object of class '<em>Float Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Parser</em>'.
	 * @generated
	 */
	FloatParser createFloatParser();

	/**
	 * Returns a new object of class '<em>Reference Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Mapping</em>'.
	 * @generated
	 */
	ReferenceMapping createReferenceMapping();

	/**
	 * Returns a new object of class '<em>Operator Table Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Table Parser</em>'.
	 * @generated
	 */
	OperatorTableParser createOperatorTableParser();

	/**
	 * Returns a new object of class '<em>Prefix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix Operator</em>'.
	 * @generated
	 */
	PrefixOperator createPrefixOperator();

	/**
	 * Returns a new object of class '<em>Postfix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postfix Operator</em>'.
	 * @generated
	 */
	PostfixOperator createPostfixOperator();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Left Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Associative Operator</em>'.
	 * @generated
	 */
	LeftAssociativeOperator createLeftAssociativeOperator();

	/**
	 * Returns a new object of class '<em>Right Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Associative Operator</em>'.
	 * @generated
	 */
	RightAssociativeOperator createRightAssociativeOperator();

	/**
	 * Returns a new object of class '<em>Non Associative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Associative Operator</em>'.
	 * @generated
	 */
	NonAssociativeOperator createNonAssociativeOperator();

	/**
	 * Returns a new object of class '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model</em>'.
	 * @generated
	 */
	MetaModel createMetaModel();

	/**
	 * Returns a new object of class '<em>String Value Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Mapping</em>'.
	 * @generated
	 */
	StringValueMapping createStringValueMapping();

	/**
	 * Returns a new object of class '<em>Regular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Expression</em>'.
	 * @generated
	 */
	RegularExpression createRegularExpression();

	/**
	 * Returns a new object of class '<em>Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Name</em>'.
	 * @generated
	 */
	QualifiedName createQualifiedName();

	/**
	 * Returns a new object of class '<em>Long Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Parser</em>'.
	 * @generated
	 */
	LongParser createLongParser();

	/**
	 * Returns a new object of class '<em>Bool Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Parser</em>'.
	 * @generated
	 */
	BoolParser createBoolParser();

	/**
	 * Returns a new object of class '<em>Import Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Parser</em>'.
	 * @generated
	 */
	ImportParser createImportParser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PccsPackage getPccsPackage();

} //PccsFactory
