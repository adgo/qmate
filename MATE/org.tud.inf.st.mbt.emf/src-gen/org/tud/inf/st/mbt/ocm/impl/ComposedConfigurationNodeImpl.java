/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.ocm.ComposedConfigurationNode;
import org.tud.inf.st.mbt.ocm.CompositionEdge;
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Configuration Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComposedConfigurationNodeImpl extends ConfigurationNodeImpl implements ComposedConfigurationNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedConfigurationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcmPackage.Literals.COMPOSED_CONFIGURATION_NODE;
	}
	
	@Override
	public String toString() {
		OperationalConfigurationModel ocm = (OperationalConfigurationModel)eContainer();
		if(ocm != null){
			Set<ConfigurationNode> composed = new HashSet<ConfigurationNode>();
			for(Edge e:ocm.getEdges()){
				if(e instanceof CompositionEdge){
					composed.add(((CompositionEdge) e).getSource());
				}
			}
			Iterator<ConfigurationNode> i = composed.iterator();
			StringBuffer buf = new StringBuffer();
			while(i.hasNext()){
				ConfigurationNode cn = i.next();
				buf.append(""+cn);
				if(i.hasNext())buf.append(" U ");
			}
			return buf.toString();
		} else return "{}";		
	}

} //ComposedConfigurationNodeImpl
