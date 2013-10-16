package org.tud.inf.st.pceditor.emf;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class PCCSBasedXMIResourceImpl extends XMIResourceImpl {
	
	  public PCCSBasedXMIResourceImpl() {
		super();
	  }
	  
	  public PCCSBasedXMIResourceImpl(URI uri){
		  super(uri);
	  }
	
	  @Override
	  protected XMLHelper createXMLHelper()
	  {
	    return new XMIHelperImpl(this){
	    	@Override
	    	protected String getURIFragment(Resource containingResource,
	    			EObject object) {
	    		try {
					return URLEncoder.encode(PCCSResourceSetImpl.getObjectPath(object),"UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
	    		return null;
	    	}
	    };
	  }
}
