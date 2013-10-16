/**
 */
package org.tud.inf.st.mbt.terms.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;

import org.tud.inf.st.mbt.functions.FunctionsFactory;

import org.tud.inf.st.mbt.terms.FunctionTerm;
import org.tud.inf.st.mbt.terms.TermsPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.terms.FunctionTerm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionTermItemProvider
	extends ItemProviderAdapter
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
	public FunctionTermItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TermsPackage.Literals.FUNCTION_TERM__FUNCTION);
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
	 * This returns FunctionTerm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionTerm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FunctionTerm_type");
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

		switch (notification.getFeatureID(FunctionTerm.class)) {
			case TermsPackage.FUNCTION_TERM__FUNCTION:
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
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createValueReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createValueFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createBagElementFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createValueCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.FUNCTION_TERM__FUNCTION,
				 FunctionsFactory.eINSTANCE.createDataNodeCaseFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AllEditPlugin.INSTANCE;
	}

}
