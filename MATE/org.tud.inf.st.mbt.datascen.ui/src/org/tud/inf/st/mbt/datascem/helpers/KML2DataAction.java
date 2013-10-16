package org.tud.inf.st.mbt.datascem.helpers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.actions.ActionDelegate;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataValue;
import org.tud.inf.st.mbt.data.StepDataBinding;

public class KML2DataAction extends ActionDelegate {
	private IFile selected;

	@Override
	public void run(IAction action) {
		try {
			SAXBuilder builder = new SAXBuilder();
			File f = new File(new java.net.URI(selected.getLocationURI()
					.toString()));
			Document document = (Document) builder.build(f);

			String outURI = selected.getLocationURI().toString();
			ResourceSet rs = new ResourceSetImpl();
			Resource rdata = new XMIResourceImpl(
					URI.createURI(outURI + ".data"));
			rs.getResources().add(rdata);

			DataClass dlongitude = DataFactory.eINSTANCE.createDataClass();
			dlongitude.setId("longitude_range");
			dlongitude.setName("longitude_range");
			rdata.getContents().add(dlongitude);
			DataClass dlatitude = DataFactory.eINSTANCE.createDataClass();
			dlatitude.setId("latitude_range");
			dlatitude.setName("latitude_range");
			rdata.getContents().add(dlatitude);

			DataStructure pos = DataFactory.eINSTANCE.createDataStructure();
			pos.setId("position");
			pos.setName("position");
			DataLeaf longitude = DataFactory.eINSTANCE.createDataLeaf();
			longitude.setId("longitude");
			longitude.setName("longitude");
			longitude.setDomain(dlongitude);
			DataLeaf latitude = DataFactory.eINSTANCE.createDataLeaf();
			latitude.setId("latitude");
			latitude.setName("latitude");
			latitude.setDomain(dlatitude);
			pos.getChildren().add(latitude);
			pos.getChildren().add(longitude);
			rdata.getContents().add(pos);

			List<Element> placemarks = getChildren(getChild(document.getRootElement(), "Document"), "Placemark"); 

			int vid = 0;
			for (Element pm : placemarks) {
				String name = getChild(pm,"name").getText();
				Resource rpm = new XMIResourceImpl(URI.createURI(outURI + "_"
						+ name + ".scen"));
				rs.getResources().add(rpm);
				DataScenario scenario = DataFactory.eINSTANCE
						.createDataScenario();
				rpm.getContents().add(scenario);
				scenario.setId(name);
				scenario.setName(name);

				Element ls = getChild(pm,"LineString");
				String coordinates = getChild(ls,"coordinates").getText();

				String[] coordsArr = coordinates.split("\\s");

				int t = 0;
				for (String coords : coordsArr) {
					if(coords.equals(""))continue;
					String[] coordArr = coords.split(",");
					{
						StepDataBinding sdb = DataFactory.eINSTANCE
								.createStepDataBinding();
						sdb.setLeaf(longitude);
						sdb.setStep(t);

						DataValue v = null;
						for (DataElement e : dlongitude.getChildren()) {
							if (e instanceof DataValue
									&& ((DataValue) e).getValueLiteral()
											.equals(coordArr[0])) {
								v = (DataValue) e;
								break;
							}
						}
						if (v == null) {
							v = DataFactory.eINSTANCE.createDataValue();
							v.setId("v" + vid++);
							v.setName(v.getId());
							v.setValueLiteral(coordArr[0]);
							dlongitude.getChildren().add(v);
						}
						sdb.setValue(v);
						scenario.getStepDataBindings().add(sdb);
					}
					{
						StepDataBinding sdb = DataFactory.eINSTANCE
								.createStepDataBinding();
						sdb.setLeaf(latitude);
						sdb.setStep(t);

						DataValue v = null;
						for (DataElement e : dlatitude.getChildren()) {
							if (e instanceof DataValue
									&& ((DataValue) e).getValueLiteral()
											.equals(coordArr[0])) {
								v = (DataValue) e;
								break;
							}
						}
						if (v == null) {
							v = DataFactory.eINSTANCE.createDataValue();
							v.setId("v" + vid++);
							v.setName(v.getId());
							v.setValueLiteral(coordArr[1]);
							dlatitude.getChildren().add(v);
						}
						sdb.setValue(v);
						scenario.getStepDataBindings().add(sdb);
					}
					t++;
				}
				
				scenario.setLength(scenario.getStepDataBindings().size());
				rpm.save(new HashMap<>());
			}

			Comparator<DataElement> comparator = new Comparator<DataElement>() {
				public int compare(DataElement o1, DataElement o2) {
					Double i1 = Double.parseDouble(((DataValue)o1).getValueLiteral());
					Double i2 = Double.parseDouble(((DataValue)o2).getValueLiteral());
					return i1.compareTo(i2);
				}
			};
			List<DataElement> values = new ArrayList<>(dlongitude.getChildren());
			Collections.sort(values, comparator);
			dlongitude.getChildren().clear();
			dlongitude.getChildren().addAll(values);
			values = new ArrayList<>(dlatitude.getChildren());
			Collections.sort(values, comparator);
			dlatitude.getChildren().clear();
			dlatitude.getChildren().addAll(values);
			
			rdata.save(new HashMap<>());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Element getChild(Element parent,String name){
		for(Element e:parent.getChildren()){
			if(e.getName().equals(name))return e;
		}
		return null;
	}	
	
	private List<Element> getChildren(Element parent,String name){
		List<Element> l = new ArrayList<>();
		
		for(Element e:parent.getChildren()){
			if(e.getName().equals(name))l.add(e);
		}
		return l;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = (IFile) ((StructuredSelection) selection).getFirstElement();
	}
}
