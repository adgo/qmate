/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage
 * @generated
 */
public interface GuigraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuigraphFactory eINSTANCE = org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gui Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Graph</em>'.
	 * @generated
	 */
	GuiGraph createGuiGraph();

	/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>No Widget Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Widget Node</em>'.
	 * @generated
	 */
	NoWidgetNode createNoWidgetNode();

	/**
	 * Returns a new object of class '<em>Condition Action Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Action Transition</em>'.
	 * @generated
	 */
	ConditionActionTransition createConditionActionTransition();

	/**
	 * Returns a new object of class '<em>Timer Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Transition</em>'.
	 * @generated
	 */
	TimerTransition createTimerTransition();

	/**
	 * Returns a new object of class '<em>Standard Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Arc</em>'.
	 * @generated
	 */
	StandardArc createStandardArc();

	/**
	 * Returns a new object of class '<em>Inhibitor Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inhibitor Arc</em>'.
	 * @generated
	 */
	InhibitorArc createInhibitorArc();

	/**
	 * Returns a new object of class '<em>Page Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Transition</em>'.
	 * @generated
	 */
	PageTransition createPageTransition();

	/**
	 * Returns a new object of class '<em>Page Mapping Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Mapping Arc</em>'.
	 * @generated
	 */
	PageMappingArc createPageMappingArc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuigraphPackage getGuigraphPackage();

} //GuigraphFactory
