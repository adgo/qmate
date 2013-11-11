/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.tud.inf.st.mbt.ulang.guigraph.util.GuigraphAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GuigraphItemProviderAdapterFactory extends GuigraphAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigraphItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiGraphItemProvider guiGraphItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.GuiGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuiGraphAdapter() {
		if (guiGraphItemProvider == null) {
			guiGraphItemProvider = new GuiGraphItemProvider(this);
		}

		return guiGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.Widget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetItemProvider widgetItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWidgetAdapter() {
		if (widgetItemProvider == null) {
			widgetItemProvider = new WidgetItemProvider(this);
		}

		return widgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoWidgetNodeItemProvider noWidgetNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoWidgetNodeAdapter() {
		if (noWidgetNodeItemProvider == null) {
			noWidgetNodeItemProvider = new NoWidgetNodeItemProvider(this);
		}

		return noWidgetNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionActionTransitionItemProvider conditionActionTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionActionTransitionAdapter() {
		if (conditionActionTransitionItemProvider == null) {
			conditionActionTransitionItemProvider = new ConditionActionTransitionItemProvider(this);
		}

		return conditionActionTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerTransitionItemProvider timerTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.TimerTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerTransitionAdapter() {
		if (timerTransitionItemProvider == null) {
			timerTransitionItemProvider = new TimerTransitionItemProvider(this);
		}

		return timerTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.StandardArc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardArcItemProvider standardArcItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.StandardArc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardArcAdapter() {
		if (standardArcItemProvider == null) {
			standardArcItemProvider = new StandardArcItemProvider(this);
		}

		return standardArcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhibitorArcItemProvider inhibitorArcItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInhibitorArcAdapter() {
		if (inhibitorArcItemProvider == null) {
			inhibitorArcItemProvider = new InhibitorArcItemProvider(this);
		}

		return inhibitorArcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageTransitionItemProvider pageTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.mbt.ulang.guigraph.PageTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageTransitionAdapter() {
		if (pageTransitionItemProvider == null) {
			pageTransitionItemProvider = new PageTransitionItemProvider(this);
		}

		return pageTransitionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (guiGraphItemProvider != null) guiGraphItemProvider.dispose();
		if (widgetItemProvider != null) widgetItemProvider.dispose();
		if (formItemProvider != null) formItemProvider.dispose();
		if (noWidgetNodeItemProvider != null) noWidgetNodeItemProvider.dispose();
		if (conditionActionTransitionItemProvider != null) conditionActionTransitionItemProvider.dispose();
		if (timerTransitionItemProvider != null) timerTransitionItemProvider.dispose();
		if (standardArcItemProvider != null) standardArcItemProvider.dispose();
		if (inhibitorArcItemProvider != null) inhibitorArcItemProvider.dispose();
		if (pageTransitionItemProvider != null) pageTransitionItemProvider.dispose();
	}

}
