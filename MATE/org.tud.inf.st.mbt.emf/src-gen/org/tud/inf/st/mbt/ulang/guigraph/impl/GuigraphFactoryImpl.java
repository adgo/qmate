/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.ulang.guigraph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuigraphFactoryImpl extends EFactoryImpl implements GuigraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuigraphFactory init() {
		try {
			GuigraphFactory theGuigraphFactory = (GuigraphFactory)EPackage.Registry.INSTANCE.getEFactory(GuigraphPackage.eNS_URI);
			if (theGuigraphFactory != null) {
				return theGuigraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuigraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GuigraphPackage.GUI_GRAPH: return createGuiGraph();
			case GuigraphPackage.PAGE: return createPage();
			case GuigraphPackage.WIDGET: return createWidget();
			case GuigraphPackage.FORM: return createForm();
			case GuigraphPackage.NO_WIDGET_NODE: return createNoWidgetNode();
			case GuigraphPackage.CONDITION_ACTION_TRANSITION: return createConditionActionTransition();
			case GuigraphPackage.TIMER_TRANSITION: return createTimerTransition();
			case GuigraphPackage.STANDARD_ARC: return createStandardArc();
			case GuigraphPackage.INHIBITOR_ARC: return createInhibitorArc();
			case GuigraphPackage.PAGE_TRANSITION: return createPageTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GuigraphPackage.TIMING_TYPE:
				return createTimingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GuigraphPackage.TIMING_TYPE:
				return convertTimingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiGraph createGuiGraph() {
		GuiGraphImpl guiGraph = new GuiGraphImpl();
		return guiGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoWidgetNode createNoWidgetNode() {
		NoWidgetNodeImpl noWidgetNode = new NoWidgetNodeImpl();
		return noWidgetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionActionTransition createConditionActionTransition() {
		ConditionActionTransitionImpl conditionActionTransition = new ConditionActionTransitionImpl();
		return conditionActionTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerTransition createTimerTransition() {
		TimerTransitionImpl timerTransition = new TimerTransitionImpl();
		return timerTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardArc createStandardArc() {
		StandardArcImpl standardArc = new StandardArcImpl();
		return standardArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InhibitorArc createInhibitorArc() {
		InhibitorArcImpl inhibitorArc = new InhibitorArcImpl();
		return inhibitorArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTransition createPageTransition() {
		PageTransitionImpl pageTransition = new PageTransitionImpl();
		return pageTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingType createTimingTypeFromString(EDataType eDataType, String initialValue) {
		TimingType result = TimingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigraphPackage getGuigraphPackage() {
		return (GuigraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GuigraphPackage getPackage() {
		return GuigraphPackage.eINSTANCE;
	}

} //GuigraphFactoryImpl
