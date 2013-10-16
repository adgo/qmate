/**
 */
package org.tud.inf.st.mbt.terms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.terms.TermsPackage
 * @generated
 */
public interface TermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsFactory eINSTANCE = org.tud.inf.st.mbt.terms.impl.TermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functor Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functor Term</em>'.
	 * @generated
	 */
	FunctorTerm createFunctorTerm();

	/**
	 * Returns a new object of class '<em>String Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Term</em>'.
	 * @generated
	 */
	StringTerm createStringTerm();

	/**
	 * Returns a new object of class '<em>Float Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Term</em>'.
	 * @generated
	 */
	FloatTerm createFloatTerm();

	/**
	 * Returns a new object of class '<em>Integer Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Term</em>'.
	 * @generated
	 */
	IntegerTerm createIntegerTerm();

	/**
	 * Returns a new object of class '<em>List Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Term</em>'.
	 * @generated
	 */
	ListTerm createListTerm();

	/**
	 * Returns a new object of class '<em>Function Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Term</em>'.
	 * @generated
	 */
	FunctionTerm createFunctionTerm();

	/**
	 * Returns a new object of class '<em>Reference Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Term</em>'.
	 * @generated
	 */
	ReferenceTerm createReferenceTerm();

	/**
	 * Returns a new object of class '<em>Container Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Term</em>'.
	 * @generated
	 */
	ContainerTerm createContainerTerm();

	/**
	 * Returns a new object of class '<em>Bool Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Term</em>'.
	 * @generated
	 */
	BoolTerm createBoolTerm();

	/**
	 * Returns a new object of class '<em>Term Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Variable</em>'.
	 * @generated
	 */
	TermVariable createTermVariable();

	/**
	 * Returns a new object of class '<em>Long Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Term</em>'.
	 * @generated
	 */
	LongTerm createLongTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TermsPackage getTermsPackage();

} //TermsFactory
