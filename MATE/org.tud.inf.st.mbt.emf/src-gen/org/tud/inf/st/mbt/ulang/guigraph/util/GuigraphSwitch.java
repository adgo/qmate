/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.ulang.guigraph.*;

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
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage
 * @generated
 */
public class GuigraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuigraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigraphSwitch() {
		if (modelPackage == null) {
			modelPackage = GuigraphPackage.eINSTANCE;
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
			case GuigraphPackage.GUI_GRAPH: {
				GuiGraph guiGraph = (GuiGraph)theEObject;
				T result = caseGuiGraph(guiGraph);
				if (result == null) result = caseAbstractModelElement(guiGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseAbstractModelElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseWidget(form);
				if (result == null) result = casePlace(form);
				if (result == null) result = caseGuiGraphNode(form);
				if (result == null) result = caseAbstractModelElement(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseGuiGraphNode(transition);
				if (result == null) result = caseIRealTimeConsumer(transition);
				if (result == null) result = caseAbstractModelElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.GUI_GRAPH_NODE: {
				GuiGraphNode guiGraphNode = (GuiGraphNode)theEObject;
				T result = caseGuiGraphNode(guiGraphNode);
				if (result == null) result = caseAbstractModelElement(guiGraphNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.NO_WIDGET_NODE: {
				NoWidgetNode noWidgetNode = (NoWidgetNode)theEObject;
				T result = caseNoWidgetNode(noWidgetNode);
				if (result == null) result = casePlace(noWidgetNode);
				if (result == null) result = caseGuiGraphNode(noWidgetNode);
				if (result == null) result = caseAbstractModelElement(noWidgetNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseGuiGraphNode(place);
				if (result == null) result = caseAbstractModelElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.CONDITION_ACTION_TRANSITION: {
				ConditionActionTransition conditionActionTransition = (ConditionActionTransition)theEObject;
				T result = caseConditionActionTransition(conditionActionTransition);
				if (result == null) result = caseTransition(conditionActionTransition);
				if (result == null) result = caseGuiGraphNode(conditionActionTransition);
				if (result == null) result = caseIRealTimeConsumer(conditionActionTransition);
				if (result == null) result = caseAbstractModelElement(conditionActionTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.TIMER_TRANSITION: {
				TimerTransition timerTransition = (TimerTransition)theEObject;
				T result = caseTimerTransition(timerTransition);
				if (result == null) result = caseTransition(timerTransition);
				if (result == null) result = caseGuiGraphNode(timerTransition);
				if (result == null) result = caseIRealTimeConsumer(timerTransition);
				if (result == null) result = caseAbstractModelElement(timerTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = caseAbstractModelElement(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.STANDARD_ARC: {
				StandardArc standardArc = (StandardArc)theEObject;
				T result = caseStandardArc(standardArc);
				if (result == null) result = caseArc(standardArc);
				if (result == null) result = caseAbstractModelElement(standardArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigraphPackage.INHIBITOR_ARC: {
				InhibitorArc inhibitorArc = (InhibitorArc)theEObject;
				T result = caseInhibitorArc(inhibitorArc);
				if (result == null) result = caseArc(inhibitorArc);
				if (result == null) result = caseAbstractModelElement(inhibitorArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiGraph(GuiGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Graph Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiGraphNode(GuiGraphNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Widget Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Widget Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoWidgetNode(NoWidgetNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Action Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Action Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionActionTransition(ConditionActionTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerTransition(TimerTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardArc(StandardArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inhibitor Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inhibitor Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInhibitorArc(InhibitorArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelElement(AbstractModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReal Time Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRealTimeConsumer(IRealTimeConsumer object) {
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

} //GuigraphSwitch
