import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;
import com.android.hierarchyviewerlib.HierarchyViewerDirector;
import com.android.hierarchyviewerlib.models.TreeViewModel;
import com.android.hierarchyviewerlib.ui.util.DrawableViewNode;
import com.android.ide.eclipse.adt.AdtPlugin;


public class UiTest {

	public static void main(String[] args) {
		HierarchyViewerDirector director = new HierarchyViewerDirector() {
			
			@Override
			public String getAdbLocation() {
				return "";
			}
			
			@Override
			public void executeInBackground(String arg0, Runnable arg1) {
				new Thread(arg1, arg0).start();	
			}
			
			@Override
			public void deviceConnected(IDevice device) {
				try{
					super.deviceConnected(device);
				} catch(Exception e){
					System.err.println(e);
				}
				DrawableViewNode dvn = TreeViewModel.getModel().getTree();
				System.out.println(device);
				System.out.println(dvn);
			}
			
		};
		
		director.initDebugBridge();
		director.startListenForDevices();
		
		//DrawableViewNode dvn = TreeViewModel.getModel().getTree();
		//System.out.println(dvn);
	}

}
