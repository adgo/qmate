package org.tud.inf.st.mbt.devices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Node;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.ValidityException;
import nu.xom.XPathContext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.data.DataBinding;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataStructure;
import org.tud.inf.st.mbt.data.DataStructureNode;
import org.tud.inf.st.mbt.data.DataValue;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.FeatureAttribute;
import org.tud.inf.st.mbt.features.FeatureReference;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.FeaturesFactory;
import org.tud.inf.st.mbt.featuretree.FeatureTree;
import org.tud.inf.st.mbt.featuretree.FeaturetreeFactory;
import org.tud.inf.st.mbt.featuretree.TreeFeature;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Scraper {

	private static final XPathContext html = new XPathContext("html",
			"http://www.w3.org/1999/xhtml");

	private static final String BASE_URL = "http://www.android.com";
	// private static final String SELECT = "/devices/?country=de&m=sony";
	private static final String SELECT = "/devices/?country=all";

	private static final FeaturetreeFactory fTree = FeaturetreeFactory.eINSTANCE;
	private static final FeaturesFactory fFeat = FeaturesFactory.eINSTANCE;
	private static final DataFactory fData = DataFactory.eINSTANCE;

	private static final String ROOT = "Android";

	private static String id(String str) {
		str = str.trim();
		str = str.replaceAll("\\W+", "_");
		if (str.length() > 0 && str.substring(str.length() - 1).equals("_"))
			str = str.substring(0, str.length() - 1);
		if (str.length() > 0 && str.substring(0, 1).matches("\\d"))
			str = "_" + str;
		return str;
	}

	private XMLReader tagsoup;
	private Builder builder;

	private FeatureTree tree = fTree.createFeatureTree();
	private Resource resource = new XMIResourceImpl(
			URI.createURI("file://c:/users/Georg/Desktop/devices.featuretree"));

	private Configuration currentConf;
	private Document currentDoc;

	private List<Configuration> configurations = new ArrayList<Configuration>();
	private List<DataClass> domains = new ArrayList<DataClass>();

	public Scraper() throws SAXException {
		tagsoup = XMLReaderFactory
				.createXMLReader("org.ccil.cowan.tagsoup.Parser");
		tagsoup.setFeature("http://xml.org/sax/features/namespace-prefixes",
				true);
		builder = new Builder(tagsoup);

		// tree.setId("devices");
		tree.setRoot(fTree.createTreeFeature());
		tree.getRoot().setName(ROOT);
		tree.getRoot().setId(ROOT);
		resource.getContents().add(tree);
	}

	private void save() throws Exception {
		System.out.println(resource.getURI());
		resource.save(new HashMap<>());
	}

	private TreeFeature feature(String... path) {
		if (path.length == 0)
			return tree.getRoot();
		else
			return feature(tree.getRoot(), path);
	}

	private TreeFeature feature(TreeFeature parent, String... path) {
		for (TreeFeature f : parent.getChildren()) {
			if (id(f.getId()).equals(id(path[0]))) {
				if (path.length == 1)
					return f;
				else {
					return feature(f, Arrays.copyOfRange(path, 1, path.length));
				}
			}
		}

		TreeFeature tf = fTree.createTreeFeature();
		tf.setId(id(path[0]));
		tf.setName(path[0]);
		parent.getChildren().add(tf);
		if (path.length == 1)
			return tf;
		else {
			return feature(tf, Arrays.copyOfRange(path, 1, path.length));
		}

	}

	private FeatureVersion version(TreeFeature f, String name) {
		for (FeatureVersion v : f.getVersions()) {
			if (v.getId().equals(id(name))) {
				return v;
			}
		}

		FeatureVersion v = fFeat.createFeatureVersion();
		v.setId(id(name));
		v.setName(name);
		f.getVersions().add(v);
		return v;
	}

	private DataClass domain(String domain) {
		for (DataClass eo : domains) {
			if (id(((DataClass) eo).getId()).equals(id(domain))) {
				return (DataClass) eo;
			}
		}
		DataClass d = fData.createDataClass();
		d.setId(id(domain));
		d.setName(domain);
		domains.add(d);
		return d;
	}

	private DataElement data(Collection<DataElement> datas, boolean asValue,
			String... path) {
		for (DataElement e : datas) {
			if (id(e.getId()).equals(id(path[0]))) {
				if (path.length == 1) {
					return e;
				} else if (e instanceof DataClass) {
					return data(((DataClass) e).getChildren(), asValue,
							Arrays.copyOfRange(path, 1, path.length));
				} else
					return null;
			}
		}
		if (path.length > 1) {
			DataClass c = fData.createDataClass();
			c.setId(id(path[0]));
			c.setName(path[0]);
			datas.add(c);
			return data(c.getChildren(), asValue,
					Arrays.copyOfRange(path, 1, path.length));
		} else {
			if (asValue) {
				DataValue v = fData.createDataValue();
				v.setId(id(path[0]));
				v.setName(path[0]);
				datas.add(v);
				return v;
			} else {
				DataClass c = fData.createDataClass();
				c.setId(id(path[0]));
				c.setName(path[0]);
				datas.add(c);
				return c;
			}
		}
	}

	private FeatureAttribute attribute(TreeFeature f, String prop) {
		for (FeatureAttribute p : f.getAttributes()) {
			if (id(p.getId()).equals(id(prop)))
				return p;
		}
		FeatureAttribute p = fFeat.createFeatureAttribute();
		p.setId(id(prop));
		p.setName(prop);
		f.getAttributes().add(p);
		return p;
	}

	private DataLeaf leaf(DataStructureNode node, String... path) {
		if (path.length == 0 || !node.getId().equals(path[0]))
			return null;
		else if (path.length == 1) {
			if (node instanceof DataLeaf)
				return (DataLeaf) node;
			else
				return null;
		} else {
			if (node instanceof DataLeaf)
				return null;
			else {
				for (DataStructureNode c : ((DataStructure) node).getChildren()) {
					if (c.getId().equals(path[1]))
						return leaf(c, Arrays.copyOfRange(path, 1, path.length));
				}

				if (path.length == 2) {
					DataLeaf l = fData.createDataLeaf();
					l.setId(path[1]);
					l.setName(path[1]);
					((DataStructure) node).getChildren().add(l);
					return l;
				} else {
					DataStructure s = fData.createDataStructure();
					s.setId(path[1]);
					s.setName(path[1]);
					((DataStructure) node).getChildren().add(s);
					return leaf(s, Arrays.copyOfRange(path, 1, path.length));
				}
			}
		}
	}

	private DataLeaf leaf(FeatureAttribute attr, String... path) {
		if (attr.getData() == null) {
			DataStructureNode node = null;
			if (path.length > 1) {
				node = fData.createDataStructure();
			} else {
				node = fData.createDataLeaf();
			}

			node.setId(path[0]);
			node.setName(path[0]);
			attr.setData(node);
		}

		return leaf(attr.getData(), path);
	}

	private FeatureReference ref(TreeFeature f) {
		FeatureReference r = fFeat.createFeatureReference();
		r.setFeature(f);
		return r;
	}

	private FeatureReference ref(FeatureVersion v) {
		FeatureReference r = ref((TreeFeature) v.eContainer());
		r.setVersion(v);
		return r;
	}

	private void completeConfiguration(Configuration conf) {
		Set<Integer> featureHashs = new HashSet<Integer>();
		for (FeatureReference r : conf.getFeatures()) {
			featureHashs.add(((AbstractModelElement) r.getFeature()).getId()
					.hashCode());
		}
		for (DataBinding b : conf.getBindings()) {
			EObject container = b.getLeaf().eContainer();
			while (!(container instanceof TreeFeature))
				container = container.eContainer();

			TreeFeature tf = (TreeFeature) container;
			if (featureHashs.add(tf.getId().hashCode())) {
				conf.getFeatures().add(ref(tf));
			}
		}
	}

	private void scrapDevices() throws SAXException, ValidityException,
			ParsingException, IOException {

		currentDoc = builder.build(BASE_URL + SELECT);

		Nodes devices = currentDoc.query("//html:a[@class=\"title\"]", html);
		for (int i = 0; i < devices.size(); i++) {
			Node n = devices.get(i);

			String url = BASE_URL + n.query("@href", html).get(0).getValue();

			currentDoc = builder.build(url);

			Configuration conf = fFeat.createConfiguration();
			conf.setId(id(n.getValue()));
			conf.setName(n.getValue().replaceAll("\\W+", " ").trim());

			currentConf = conf;

			scrapConnectivity();
			scrapBattery();
			scrapStorage();
			scrapDisplay();
			scrapOS();
			scrapCamera();
			scrapHardware();

			completeConfiguration(conf);
			configurations.add(conf);
		}

		resource.getContents().addAll(domains);
		resource.getContents().addAll(configurations);

		// domain sorting
		for (DataClass c : domains) {
			sort(((DataClass) c).getChildren());
		}

		sortVersions();
	}

	private static void sort(List<DataElement> el) {
		List<DataElement> worklist = new LinkedList<>(el);
		Collections.sort(worklist, new Comparator<DataElement>() {
			public int compare(DataElement o1, DataElement o2) {
				Double v1 = Double.parseDouble(o1.getId().replaceAll(
						"[^0-9|'.']", ""));
				Double v2 = Double.parseDouble(o2.getId().replaceAll(
						"[^0-9|'.']", ""));
				return v1.compareTo(v2);
			}
		});
		el.clear();
		el.addAll(worklist);
		for (DataElement e : el) {
			if (e instanceof DataClass) {
				sort(((DataClass) e).getChildren());
			}
		}
	}

	private void sortVersions() {
		Iterator<EObject> i = tree.eAllContents();
		while (i.hasNext()) {
			EObject eo = i.next();
			if (!(eo instanceof TreeFeature)
					|| ((TreeFeature) eo).getVersions().isEmpty())
				continue;

			List<FeatureVersion> el = ((TreeFeature) eo).getVersions();

			List<FeatureVersion> worklist = new LinkedList<>(el);
			Collections.sort(worklist, new Comparator<FeatureVersion>() {
				public int compare(FeatureVersion o1, FeatureVersion o2) {
					Double v1 = Double.parseDouble(o1.getId().replaceAll(
							"[^0-9|'.']", ""));
					Double v2 = Double.parseDouble(o2.getId().replaceAll(
							"[^0-9|'.']", ""));
					return v1.compareTo(v2);
				}
			});
			el.clear();
			el.addAll(worklist);
		}
	}

	private List<String> repairParagraphs(Nodes nodes) {
		List<String> result = new ArrayList<>(nodes.size() * 2);
		for (int i = 0; i < nodes.size(); i++) {
			String n = nodes.get(i).getValue().trim();
			String[] split = n.split("<p>");
			for (String s : split)
				result.add(s);
		}
		return result;
	}

	private void scrapDisplay() {
		boolean touch = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"Touch screen\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (touch)
			currentConf.getFeatures().add(ref(feature("Display", "Touch")));

		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Screen resolution\"]//html:td",
							html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (val.length() > 0) {
					if (val.contains("(")) {
						String[] split = val.split("\\(");
						String dims = split[1].trim();
						if (dims.endsWith(")") && val.contains("x")) {
							dims = dims.substring(0, dims.length() - 1);
							split = dims.split("x");
							split[0] = split[0].trim();
							split[1] = split[1].trim();

							DataElement w = data(domain("ScreenPixels")
									.getChildren(), true, split[0]);
							DataBinding bw = fData.createDataBinding();
							bw.setValue(w);
							bw.setLeaf(leaf(
									attribute(feature("Display", "Screen"),
											"Resolution"), "screenDim",
									"screenWidth"));
							currentConf.getBindings().add(bw);
							leaf(
									attribute(feature("Display", "Screen"),
											"Resolution"), "screenDim",
									"screenWidth").setDomain(
									domain("ScreenPixels"));

							DataElement h = data(domain("ScreenPixels")
									.getChildren(), true, split[1]);
							DataBinding bh = fData.createDataBinding();
							bh.setValue(h);
							bh.setLeaf(leaf(
									attribute(feature("Display", "Screen"),
											"Resolution"), "screenDim",
									"screenHeight"));
							currentConf.getBindings().add(bh);
							leaf(
									attribute(feature("Display", "Screen"),
											"Resolution"), "screenDim",
									"screenHeight").setDomain(
									domain("ScreenPixels"));
						}
					}
				}
			}
		}
	}

	private void scrapBattery() {
		try {
			String talk = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Talk time\"]//html:td",
							html).get(0).getValue().trim();
			DataElement d = data(domain("Duration").getChildren(), true, talk);

			DataBinding b = fData.createDataBinding();
			b.setLeaf(leaf(attribute(feature("Battery"), "TalkTime"),
					"talkTime"));
			b.setValue(d);
			currentConf.getBindings().add(b);

			leaf(attribute(feature("Battery"), "TalkTime"), "talkTime")
					.setDomain(domain("Duration"));
		} catch (Exception e) {
			// nothing found
		}

		try {
			String standby = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Standby time (max)\"]//html:td",
							html).get(0).getValue().trim();
			DataElement d = data(domain("Duration").getChildren(), true,
					standby);
			leaf(attribute(feature("Battery"), "MaxStandbyTime"), "standbyTime")
					.setDomain(domain("Duration"));

			DataBinding b = fData.createDataBinding();
			b.setLeaf(leaf(attribute(feature("Battery"), "MaxStandbyTime"),
					"standbyTime"));
			b.setValue(d);
			currentConf.getBindings().add(b);
		} catch (Exception e) {
			// nothing found
		}
	}

	private void scrapConnectivity() {
		boolean infra = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"Infrared\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (infra)
			currentConf.getFeatures().add(
					ref(feature("Connectivity", "Infrared")));

		boolean gps = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"GPS\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (gps)
			currentConf.getFeatures().add(ref(feature("Connectivity", "GPS")));

		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Bluetooth\"]//html:td",
							html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (val.length() > 0 && !val.toLowerCase().equals("no")) {
					currentConf.getFeatures().add(
							ref(version(feature("Connectivity", "Bluetooth"),
									val)));
				}
			}
		}
		{
			Nodes nodes = currentDoc.query(
					"//html:tr[fn:normalize-space(html:th)=\"WiFi\"]//html:td",
					html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (id(val).length() > 0) {
					currentConf.getFeatures().add(
							ref(version(feature("Connectivity", "WiFi"), val)));
				}
			}
		}
		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Network support\"]//html:td/html:p",
							html);
			String[] networks = { "GSM", "GPRS", "EDGE", "UMTS", "HDSPA",
					"LTE", "WCDMA", "CDMA" };

			for (String nw : networks) {
				if (repairParagraphs(nodes).toString().contains(nw)) {
					currentConf.getFeatures().add(
							ref(feature("Connectivity", "Networks", nw)));
				}
			}

		}

	}

	private void scrapStorage() {
		try {
			String ram = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"RAM\"]//html:td",
							html).get(0).getValue().trim();
			DataElement d = data(domain("Memory").getChildren(), true, ram);

			DataBinding b = fData.createDataBinding();
			b.setLeaf(leaf(
					attribute(feature("StorageAndMemory", "RAM"), "Size"),
					"size"));
			b.setValue(d);
			currentConf.getBindings().add(b);

			leaf(attribute(feature("StorageAndMemory", "RAM"), "Size"), "size")
					.setDomain(domain("Memory"));
		} catch (Exception e) {
			// nothing found
		}

		try {
			String internal = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Internal storage\"]//html:td",
							html).get(0).getValue().trim();
			DataElement d = data(domain("Memory").getChildren(), true, internal);

			DataBinding b = fData.createDataBinding();
			b.setLeaf(leaf(
					attribute(feature("StorageAndMemory", "Internal"),
							"InternalSize"), "internalSize"));
			b.setValue(d);
			currentConf.getBindings().add(b);

			leaf(
					attribute(feature("StorageAndMemory", "Internal"),
							"InternalSize"), "internalSize")
					.setDomain(domain("Memory"));
		} catch (Exception e) {
			// nothing found
		}

		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Removable storage\"]//html:td",
							html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (val.length() > 0) {

					if (val.contains("micro")) {
						currentConf.getFeatures().add(
								ref(feature("StorageAndMemory", "Removeable",
										"microSDCard")));
					} else {
						currentConf.getFeatures().add(
								ref(feature("StorageAndMemory", "Removeable",
										"SDCard")));
					}
					TreeFeature rem = feature("StorageAndMemory", "Removeable");

					if (val.contains("GB")) {
						String included = val.substring(val.indexOf("(") + 1,
								val.indexOf("GB"));
						String max = val.substring(val.indexOf("max ") + 4,
								val.lastIndexOf("GB"));

						leaf(attribute(rem, "SizeIncluded"), "sizeIncluded")
								.setDomain(domain("Memory"));
						leaf(attribute(rem, "SizeMax"), "sizeMax").setDomain(
								domain("Memory"));

						DataElement d = data(domain("Memory").getChildren(),
								true, included);
						DataBinding pb = fData.createDataBinding();
						pb.setLeaf(leaf(attribute(rem, "SizeIncluded"),
								"sizeIncluded"));
						pb.setValue(d);
						currentConf.getBindings().add(pb);

						d = data(domain("Memory").getChildren(), true, max);
						pb = fData.createDataBinding();
						pb.setLeaf(leaf(attribute(rem, "SizeMax"), "sizeMax"));
						pb.setValue(d);
						currentConf.getBindings().add(pb);
					}

				}
			}
		}
	}

	private void scrapOS() {
		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"OS Version\"]//html:td",
							html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (val.length() > 0) {
					currentConf.getFeatures().add(
							ref(version(feature("OS"), val)));
				}
			}
		}
	}

	private void scrapCamera() {
		try {
			String camres = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Primary\"]//html:td",
							html).get(0).getValue().trim();
			DataElement d = data(domain("CamPixels").getChildren(), true,
					camres);

			DataBinding b = fData.createDataBinding();
			b.setLeaf(leaf(
					attribute(feature("Camera", "Primary"), "CamResolution"),
					"camResolution"));
			b.setValue(d);
			currentConf.getBindings().add(b);

			leaf(attribute(feature("Camera", "Primary"), "CamResolution"),
					"camResolution").setDomain(domain("CamPixels"));
		} catch (Exception e) {
			// nothing found
		}

		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Features\"]//html:td/html:p",
							html);
			for (String val : repairParagraphs(nodes)) {
				if (val.length() > 0) {
					currentConf.getFeatures().add(ref(feature("Camera", val)));
				}
			}
		}
	}

	private void scrapHardware() {
		/*
		 * { Nodes nodes = currentDoc.query(
		 * "//html:tr[fn:normalize-space(html:th)=\"CPU\"]//html:td", html); if
		 * (nodes.size() > 0) { String val = nodes.get(0).getValue().trim(); if
		 * (val.length() > 0) { currentConf.getFeatures().add(
		 * ref(feature("Hardware", "CPU", val))); } } }
		 */
		{
			Nodes nodes = currentDoc.query(
					"//html:tr[fn:normalize-space(html:th)=\"USB\"]//html:td",
					html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (val.length() > 0 && !val.equals("No")) {
					currentConf.getFeatures().add(
							ref(version(feature("Hardware", "USB"), val)));
				}
			}
		}
		{
			Nodes nodes = currentDoc
					.query("//html:tr[fn:normalize-space(html:th)=\"Audio / headphone jack\"]//html:td",
							html);
			if (nodes.size() > 0) {
				String val = nodes.get(0).getValue().trim();
				if (id(val).length() > 0) {
					currentConf.getFeatures().add(
							ref(feature("Hardware", "HeadphoneJack", val)));
				}
			}
		}

		boolean radio = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"FM Radio\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (radio)
			currentConf.getFeatures().add(ref(feature("Hardware", "FMRadio")));

		boolean kb = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"Physical keyboard\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (kb)
			currentConf.getFeatures().add(
					ref(feature("Hardware", "PhysicalKeyboard")));

		boolean acc = currentDoc
				.query("//html:tr[fn:normalize-space(html:th)=\"Accelerometer\"]//html:span[@class=\"bullet active\"]",
						html).size() > 0;
		if (acc)
			currentConf.getFeatures().add(
					ref(feature("Hardware", "Accelerometer")));
	}

	public static void main(String[] args) throws Exception {
		Scraper s = new Scraper();
		s.scrapDevices();
		s.save();
	}

}
