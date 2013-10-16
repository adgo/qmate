package org.tud.inf.st.mbt.emf.transformations;

import java.awt.Rectangle;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.data.DataValue;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;
import org.tud.inf.st.mbt.scenario.ScenarioModel;
import org.tud.inf.st.mbt.scenario.SpatialBase;

public class ScenarioModelAnalyzer {
	private static Map<ScenarioModel, ScenarioModelAnalyzer> instances = new HashMap<>();

	public static ScenarioModelAnalyzer getInstance(ScenarioModel sm) {
		ScenarioModelAnalyzer i = instances.get(sm);
		if (i == null) {
			i = new ScenarioModelAnalyzer(sm);
			instances.put(sm, i);
		}
		return i;
	}

	private ScenarioModel model;

	private ScenarioModelAnalyzer(ScenarioModel model) {
		this.model = model;
	}

	public void dispose() {
		instances.remove(model);
	}

	public void computeSpatialBaseBounds(SpatialBase base) {
		int x0 = Integer.MAX_VALUE, y0 = Integer.MAX_VALUE, x1 = Integer.MIN_VALUE, y1 = Integer.MIN_VALUE;
		boolean hasPlacements = false;

		for (Scenario s : base.getScenarios()) {
			for (Placement placement : s.getPlacements()) {
				Rectangle p = new Rectangle(placement.getX(), placement.getY(),
						placement.getWidth(), placement.getHeight());
				if (p.x < x0)
					x0 = p.x;
				if (p.y < y0)
					y0 = p.y;
				if (p.x + p.width > x1)
					x1 = p.x + p.width;
				if (p.y + p.height > y1)
					y1 = p.y + p.height;
				hasPlacements = true;
			}
		}

		Rectangle bounds = hasPlacements ? new Rectangle(x0, y0, x1 - x0, y1
				- y0) : new Rectangle(0, 0, 0, 0);

		base.setX(bounds.x);
		base.setY(bounds.y);
		base.setWidth(bounds.width);
		base.setHeight(bounds.height);
	}

	public boolean isPositive(Scenario s, int x, int y) {
		for (Placement placement : s.getPlacements()) {
			Rectangle p = new Rectangle(placement.getX(), placement.getY(),
					placement.getWidth(), placement.getHeight());
			if (x >= p.x && x <= p.x + p.width && y >= p.y
					&& y <= p.y + p.height)
				return true;
		}

		return false;
	}

	public Integer[] getHorizontalBorders(SpatialBase base) {
		Set<Integer> hBorders = new HashSet<>();

		for (Scenario s : base.getScenarios()) {
			for (Placement placement : s.getPlacements()) {
				Rectangle p = new Rectangle(placement.getX(), placement.getY(),
						placement.getWidth(), placement.getHeight());
				hBorders.add(p.x);
				hBorders.add(p.x + p.width);
			}
		}

		LinkedList<Integer> l = new LinkedList<Integer>(hBorders);
		Collections.sort(l);

		return l.toArray(new Integer[0]);
	}

	public Integer[] getVerticalBorders(SpatialBase base) {
		Set<Integer> vBorders = new HashSet<>();

		for (Scenario s : base.getScenarios()) {
			for (Placement placement : s.getPlacements()) {
				Rectangle p = new Rectangle(placement.getX(), placement.getY(),
						placement.getWidth(), placement.getHeight());
				vBorders.add(p.y);
				vBorders.add(p.y + p.height);
			}
		}

		LinkedList<Integer> l = new LinkedList<Integer>(vBorders);
		Collections.sort(l);

		return l.toArray(new Integer[0]);
	}
	
	public void generateData(ScenarioModel sm, SpatialBase sb) {
		DataFactory df = DataFactory.eINSTANCE;
		
		DataClass dcOuter = df.createDataClass();
		dcOuter.setId("outer");
		dcOuter.setName(dcOuter.getId());
		
		Integer[] hborders = getHorizontalBorders(sb);
		Integer[] vborders = getVerticalBorders(sb);

		// invalid out-of-room positions
		DataValue out = df.createDataValue();
		name(out,-1,-1);
		dcOuter.getChildren().add(out);
		out = df.createDataValue();
		name(out,hborders.length,vborders.length);
		dcOuter.getChildren().add(out);
		for (int xi = 0; xi < hborders.length - 1; xi++) {
			out = df.createDataValue();
			name(out,xi,-1);
			dcOuter.getChildren().add(out);
			out = df.createDataValue();
			name(out,xi,vborders.length-1);
			dcOuter.getChildren().add(out);
		}
		for (int yi = 0; yi < vborders.length - 1; yi++) {
			out = df.createDataValue();
			name(out,-1,yi);
			dcOuter.getChildren().add(out);
			out = df.createDataValue();
			name(out,hborders.length-1,yi);
			dcOuter.getChildren().add(out);
		}

		// in-room positions/must be done for each scenario
		for (Scenario s : sb.getScenarios()) {
			DataClass dc = df.createDataClass();
			dc.setId("space");
			dc.setName(dc.getId());

			dc.getChildren().add(dcOuter);
			
			DataClass dcNeg = df.createDataClass();
			dcNeg.setId("negative");
			dcNeg.setName(dcNeg.getId());

			dc.getChildren().add(dcNeg);

			DataClass dcPos = df.createDataClass();
			dcPos.setId("positive");
			dcPos.setName(dcPos.getId());

			dc.getChildren().add(dcPos);
			
			s.setGeneratedDomain(dc);
			
			for(int xi=0;xi<hborders.length-1;xi++){
				int x = hborders[xi];

				for(int yi=0;yi<vborders.length-1;yi++){
					int y = vborders[yi];

					DataValue dv = df.createDataValue();
					name(dv,xi,yi);

					if (isPositive(s, x+1, y+1)) {
						dcPos.getChildren().add(dv);
					} else {
						dcNeg.getChildren().add(dv);
					}
				}
			}
			
			
		}
	}
	
	private static void name(DataValue dv, int x, int y){
		dv.setName(x+"|"+y);
		dv.setId("pos_"+(x<0 ? "m" : "")+Math.abs(x)+"_"+(y<0 ? "m" : "")+Math.abs(y));
	}
}
