/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.ActionsFactory;

import org.tud.inf.st.mbt.rules.RulesFactory;

import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionActionTransitionItemProvider
	extends TransitionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionActionTransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addApplicationConditionTextPropertyDescriptor(object);
			addActionsTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Application Condition Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationConditionTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConditionActionTransition_applicationConditionText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConditionActionTransition_applicationConditionText_feature", "_UI_ConditionActionTransition_type"),
				 GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConditionActionTransition_actionsText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConditionActionTransition_actionsText_feature", "_UI_ConditionActionTransition_type"),
				 GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION);
			childrenFeatures.add(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConditionActionTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionActionTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConditionActionTransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConditionActionTransition_type") :
			getString("_UI_ConditionActionTransition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConditionActionTransition.class)) {
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT:
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createSubPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION__ACTIONS,
				 ActionsFactory.eINSTANCE.createPreGenerationSequence()));
	}

}
