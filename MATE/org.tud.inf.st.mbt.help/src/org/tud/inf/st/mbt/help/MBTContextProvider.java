package org.tud.inf.st.mbt.help;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;

public class MBTContextProvider implements IContextProvider {
	
	private String contextID;
	
	public MBTContextProvider(String contextID) {
		this.contextID = contextID;
	}

	@Override
	public int getContextChangeMask() {
		return IContextProvider.NONE;
	}

	@Override
	public IContext getContext(Object target) {
		System.out.println(target);
		return HelpSystem.getContext(contextID);
	}

	@Override
	public String getSearchExpression(Object target) {
		return "MATE";
	}

}
