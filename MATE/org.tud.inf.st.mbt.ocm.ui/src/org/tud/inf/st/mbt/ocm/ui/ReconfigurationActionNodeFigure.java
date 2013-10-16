package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.tud.inf.st.mbt.emf.graphicaleditor.basics.LabeledRectangle;
import org.tud.inf.st.mbt.ocm.OcmPackage;

public class ReconfigurationActionNodeFigure extends LabeledRectangle {

	private int severity = -1;
	private String toolTip = "action-based configuration";

	public ReconfigurationActionNodeFigure() {
		super(ColorConstants.black, ColorConstants.lightBlue,
				OcmPackage.eINSTANCE.getReconfigurationActionNode_ActionsText());
	}

	public void setProblem(int severity, String text) {
		if (severity == IMarker.SEVERITY_WARNING) {
			if (this.severity != IMarker.SEVERITY_ERROR)
				this.severity = severity;
		} else
			this.severity = severity;

		switch (this.severity) {
		case IMarker.SEVERITY_WARNING: {
			setBackgroundColor(ColorConstants.yellow);
			break;
		}
		case IMarker.SEVERITY_ERROR: {
			setBackgroundColor(ColorConstants.red);
			break;
		}
		default: {
		}
			setBackgroundColor(ColorConstants.white);
		}
		
		Label tt = (Label) getToolTip();

		if (text == null)
			tt.setText(toolTip);
		else {
			tt.setText(toolTip + "\n" + text);
		}
	}

}
