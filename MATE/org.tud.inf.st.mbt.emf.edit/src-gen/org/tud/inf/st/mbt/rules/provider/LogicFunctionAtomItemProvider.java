/**
 */
package org.tud.inf.st.mbt.rules.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.functions.FunctionsFactory;

import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.rules.LogicFunctionAtom} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicFunctionAtomItemProvider
	extends ReasonableAtomItemProvider
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
	public LogicFunctionAtomItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getText(Object object) {
		return object+"";
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

		switch (notification.getFeatureID(LogicFunctionAtom.class)) {
			case RulesPackage.LOGIC_FUNCTION_ATOM__FUNCTION:
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
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.LOGIC_FUNCTION_ATOM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));
	}

}
