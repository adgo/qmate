package org.tud.inf.st.mbt.emf.graphicaleditor.layout;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import math.geom2d.Box2D;
import math.geom2d.Point2D;
import math.geom2d.line.Line2D;
import math.geom2d.line.LinearShape2D;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;

import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class EMFGraphicalLayouter {
	public static interface EndpointProvider {
		String getSourceID(String conID);

		String getTargetID(String conID);

		Dimension getSizeHint(String nodeID);
	}

	private class DistanceComparator implements
			Comparator<GraphicalNodeDefinition> {

		private GraphicalNodeDefinition origin;
		private GraphicalDescription desc;
		private EndpointProvider endpoints;
		private Map<Integer, Integer> hash2Distance = new HashMap<>();

		public DistanceComparator(GraphicalNodeDefinition origin,
				GraphicalDescription desc, EndpointProvider endpoints) {
			this.origin = origin;
			this.desc = desc;
			this.endpoints = endpoints;
		}

		@Override
		public int compare(GraphicalNodeDefinition a, GraphicalNodeDefinition b) {
			if (hash2Distance.containsKey(a.hashCode() + b.hashCode())) {
				return hash2Distance.get(a.hashCode() + b.hashCode());
			} else {
				int distance = distance(b,
						new HashSet<GraphicalNodeDefinition>())
						- distance(a, new HashSet<GraphicalNodeDefinition>());
				hash2Distance.put(a.hashCode() + b.hashCode(), distance);
				return distance;
			}
		}

		public int distance(GraphicalNodeDefinition node,
				Set<GraphicalNodeDefinition> done) {
			if (node == origin)
				return 0;
			done = new HashSet<>(done);
			if (!done.add(node))
				return Integer.MAX_VALUE;

			List<GraphicalNodeDefinition> neighbours = new ArrayList<>();

			for (Object o : desc.getConnections())
				if (o instanceof GraphicalConnectionDefinition) {
					GraphicalConnectionDefinition cd = (GraphicalConnectionDefinition) o;
					GraphicalNodeDefinition source = getGND(
							endpoints.getSourceID(cd.getReferenceId()), desc);
					GraphicalNodeDefinition target = getGND(
							endpoints.getTargetID(cd.getReferenceId()), desc);
					if (source == node || target == node) {
						if (target == origin || source == origin) {
							return 0;
						}

						if (source == node) {
							neighbours.add(target);
						} else {
							neighbours.add(source);
						}

					}
				}

			if (neighbours.isEmpty())
				return Integer.MAX_VALUE;

			int min = Integer.MAX_VALUE;
			for (GraphicalNodeDefinition n : neighbours) {
				int nd = distance(n, done);
				if (nd < min)
					min = nd;
			}

			return min + 1;
		}

	}

	private GraphicalNodeDefinition getGND(String id, GraphicalDescription desc) {
		if (id2DescCache.containsKey(id)) {
			return id2DescCache.get(id);
		} else {
			GraphicalNodeDefinition result = null;

			for (Object o : desc.getNodes())
				if (o instanceof GraphicalNodeDefinition
						&& ((GraphicalNodeDefinition) o).getReferenceId()
								.equals(id)) {
					result = (GraphicalNodeDefinition) o;
					break;
				}
			id2DescCache.put(id, result);
			return result;
		}
	}

	private static Point nearestFreePosition(
			GraphicalNodeDefinition[][] raster, Point pos) {
		pos = new Point(pos);
		int w = raster.length;
		int h = raster[0].length;

		if (pos.x < 0)
			pos.x = 0;
		if (pos.y < 0)
			pos.y = 0;
		if (pos.x > w - 1)
			pos.x = w - 1;
		if (pos.y > h - 1)
			pos.y = h - 1;

		if (raster[pos.x][pos.y] == null)
			return pos;

		int diff = 1;
		while (diff < Math.max(h, w)) {
			Point test = new Point(pos.x + diff, pos.y);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x - diff, pos.y);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x + diff, pos.y + diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x + diff, pos.y - diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x, pos.y - diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x, pos.y + diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x - diff, pos.y - diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			test = new Point(pos.x - diff, pos.y - diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;

			test = new Point(pos.x - diff, pos.y + diff);
			if (test.x >= 0 && test.x < w && test.y >= 0 && test.y < h
					&& raster[test.x][test.y] == null)
				return test;
			diff++;
		}

		throw new RuntimeException("No free position found!");
	}

	private static Random rand = new Random();
	private Map<String, GraphicalNodeDefinition> id2DescCache = new HashMap<>();


	public void layoutGraphicalDesicription(GraphicalDescription gd,
			EndpointProvider endpoints) {
		if (gd.getNodes().isEmpty())
			return;
		id2DescCache.clear();

		// delete bendpoints
		for (Object o : gd.getConnections()) {
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
			gcd.getBendpoints().clear();
		}

		// build raster
		List<GraphicalNodeDefinition> todo = new ArrayList<>();
		for (Object o : gd.getNodes())
			if (o instanceof GraphicalNodeDefinition) {
				if (((GraphicalNodeDefinition) o).getReferenceId() == null)
					continue;
				int surface = (int) ((float) endpoints
						.getSizeHint(((GraphicalNodeDefinition) o)
								.getReferenceId()).width * (float) endpoints
						.getSizeHint(((GraphicalNodeDefinition) o)
								.getReferenceId()).height);
				if (surface > 0)
					todo.add((GraphicalNodeDefinition) o);
			}

		final float marginScale = 1.1f;
		final float freePositionScale = 1.3f;

		int nodeCount = (int) (gd.getNodes().size() * freePositionScale);
		int rasterLength = 1;
		while (rasterLength * rasterLength < nodeCount)
			rasterLength++;
		int fieldSize = 1;
		for (Object o : gd.getNodes()) {
			GraphicalNodeDefinition gnd = (GraphicalNodeDefinition) o;
			Dimension hint = endpoints.getSizeHint(gnd.getReferenceId());
			gnd.setWidth(hint.width);
			gnd.setHeight(hint.height);

			if (gnd.getWidth() > fieldSize)
				fieldSize = gnd.getWidth();
			if (gnd.getHeight() > fieldSize)
				fieldSize = gnd.getHeight();
		}

		fieldSize *= marginScale; // add margins

		GraphicalNodeDefinition[][] raster = new GraphicalNodeDefinition[rasterLength][rasterLength];

		// place nodes
		GraphicalNodeDefinition gnd = todo.remove(rand.nextInt(todo.size()));

		// find free position
		Point free = nearestFreePosition(raster, new Point(0, 0));
		raster[free.x][free.y] = gnd;
		gnd.setX(free.x * fieldSize);
		gnd.setY(free.y * fieldSize);
		
		Map<GraphicalNodeDefinition, List<GraphicalNodeDefinition>> neighbours = new HashMap<>();
		for(Object o:gd.getConnections()){
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
			GraphicalNodeDefinition source = getGND(endpoints.getSourceID(gcd.getReferenceId()), gd);
			GraphicalNodeDefinition target = getGND(endpoints.getTargetID(gcd.getReferenceId()), gd);
			List<GraphicalNodeDefinition> l = neighbours.get(source);
			if(l == null){
				l = new ArrayList<>();
				neighbours.put(source, l);
			}
			l.add(target);
			l = neighbours.get(target);
			if(l == null){
				l = new ArrayList<>();
				neighbours.put(target, l);
			}
			l.add(source);
		}

		// find nearest neighbour
		while (!todo.isEmpty()) {
			if(neighbours.containsKey(gnd) && !neighbours.get(gnd).isEmpty())
				gnd = neighbours.get(gnd).remove(0);
			else gnd = todo.remove(0);
			free = nearestFreePosition(raster, free);
			raster[free.x][free.y] = gnd;
			gnd.setX(free.x * fieldSize);
			gnd.setY(free.y * fieldSize);
		}
	}

	private int measureArcLengths(GraphicalDescription gd, EndpointProvider ep) {
		int result = 0;
		for (Object o : gd.getConnections()) {
			if (o instanceof GraphicalConnectionDefinition) {
				GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
				GraphicalNodeDefinition source = getGND(
						ep.getSourceID(gcd.getReferenceId()), gd);
				GraphicalNodeDefinition target = getGND(
						ep.getTargetID(gcd.getReferenceId()), gd);
				result += Math.abs(source.getX() - target.getX())
						+ Math.abs(source.getY() - target.getY());
			}
		}
		return result;
	}

	public void layoutGraphicalDesicription_old3(GraphicalDescription gd,
			EndpointProvider endpoints) {
		final float marginScale = 1.3f;
		final float freePositionScale = 1.3f;
		final int operations = 30;
		final int tryOuts = 15;

		int nodeCount = (int) (gd.getNodes().size() * freePositionScale);
		int rasterLength = 1;
		while (rasterLength * rasterLength < nodeCount)
			rasterLength++;
		int fieldSize = 1;
		for (Object o : gd.getNodes()) {
			GraphicalNodeDefinition gnd = (GraphicalNodeDefinition) o;
			Dimension hint = endpoints.getSizeHint(gnd.getReferenceId());
			gnd.setWidth(hint.width);
			gnd.setHeight(hint.height);

			if (gnd.getWidth() > fieldSize)
				fieldSize = gnd.getWidth();
			if (gnd.getHeight() > fieldSize)
				fieldSize = gnd.getHeight();
		}

		fieldSize *= marginScale; // add margins

		// choose random distribution
		Random rand = new Random();
		GraphicalNodeDefinition[][] raster = new GraphicalNodeDefinition[rasterLength][rasterLength];
		for (Object o : gd.getNodes()) {
			GraphicalNodeDefinition gnd = (GraphicalNodeDefinition) o;
			int x = 0, y = 0;
			do {
				x = rand.nextInt(rasterLength);
				y = rand.nextInt(rasterLength);
			} while (raster[x][y] != null);
			raster[x][y] = gnd;
		}

		// delete bendpoints
		for (Object o : gd.getConnections()) {
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
			gcd.getBendpoints().clear();
		}

		// run some improvements
		for (int operationsLeft = operations; operationsLeft > 0; operationsLeft--) {
			Map<String, GraphicalNodeDefinition> byId = new HashMap<>();
			Map<GraphicalNodeDefinition, Box2D> constraints = new HashMap<>();
			for (int y = 0; y < rasterLength; y++) {
				for (int x = 0; x < rasterLength; x++) {
					GraphicalNodeDefinition gnd = raster[x][y];
					if (gnd != null) {
						byId.put(gnd.getReferenceId(), gnd);
						constraints.put(gnd, new Box2D(new Point2D(x
								* fieldSize, y * fieldSize), gnd.getWidth(),
								gnd.getHeight()));
					}
				}// x iter
			}// y iter

			int before = measureCrossings(gd, endpoints, byId, constraints);
			for (int tryOutsLeft = tryOuts; tryOutsLeft > 0; tryOutsLeft--) {
				Point a = new Point(rand.nextInt(rasterLength),
						rand.nextInt(rasterLength));
				Point b = new Point(rand.nextInt(rasterLength),
						rand.nextInt(rasterLength));
				GraphicalNodeDefinition swap = raster[a.x][a.y];
				raster[a.x][a.y] = raster[b.x][b.y];
				raster[b.x][b.y] = swap;
				int after = measureCrossings(gd, endpoints, byId, constraints);
				if (after < before)
					break;
			}
		}

		// save
		for (int y = 0; y < rasterLength; y++) {
			for (int x = 0; x < rasterLength; x++) {
				GraphicalNodeDefinition gnd = raster[x][y];
				if (gnd != null) {
					gnd.setX(x * fieldSize);
					gnd.setY(y * fieldSize);
				}
			}// x iter
		}// y iter
	}

	private int measureCrossings(GraphicalDescription gd,
			EndpointProvider endpoints,
			Map<String, GraphicalNodeDefinition> byId,
			Map<GraphicalNodeDefinition, Box2D> constraints) {
		int crossings = 0;
		for (Object o : gd.getConnections()) {
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
			GraphicalNodeDefinition gndSource = byId.get(endpoints
					.getSourceID(gcd.getReferenceId()));
			GraphicalNodeDefinition gndTarget = byId.get(endpoints
					.getTargetID(gcd.getReferenceId()));
			Box2D rectSource = constraints.get(gndSource);
			Box2D rectTarget = constraints.get(gndTarget);
			Line2D line = new Line2D(rectSource.getMinX()
					+ rectSource.getWidth() / 2, rectSource.getMinY()
					+ rectSource.getHeight() / 2, rectTarget.getMinX()
					+ rectTarget.getWidth() / 2, rectTarget.getMinY()
					+ rectTarget.getHeight() / 2);
			for (Box2D c : constraints.values()) {
				Point2D i1 = null, i2 = null;
				Iterator<LinearShape2D> i = c.edges().iterator();
				while (i.hasNext() && i1 == null) {
					LinearShape2D l = i.next();
					Point2D intersection = l.intersection(line);
					if (intersection != null) {
						i1 = intersection;
						break;
					}
				}
				while (i.hasNext() && i2 == null) {
					LinearShape2D l = i.next();
					Point2D intersection = l.intersection(line);
					if (intersection != null) {
						i2 = intersection;
						break;
					}
				}
				if (i1 != null && i2 != null) {
					crossings += i1.distance(i2);
				}
			}
		}
		return crossings;
	}

	public void layoutGraphicalDesicription_old2(GraphicalDescription gd,
			EndpointProvider endpoints) {
		DirectedGraph<GraphicalNodeDefinition, GraphicalConnectionDefinition> graph = new DirectedSparseMultigraph<>();
		Map<String, GraphicalNodeDefinition> id2node = new HashMap<>();

		int max = 0;

		for (Object on : gd.getNodes()) {
			GraphicalNodeDefinition n = (GraphicalNodeDefinition) on;
			graph.addVertex(n);
			id2node.put(n.getReferenceId(), n);

			Dimension hint = endpoints.getSizeHint(n.getReferenceId());
			n.setWidth(hint.width);
			n.setHeight(hint.height);

			max = Math.max(max, n.getWidth());
			max = Math.max(max, n.getHeight());
		}
		for (Object oc : gd.getConnections()) {
			GraphicalConnectionDefinition c = (GraphicalConnectionDefinition) oc;
			graph.addEdge(c,
					id2node.get(endpoints.getSourceID(c.getReferenceId())),
					id2node.get(endpoints.getSourceID(c.getReferenceId())),
					EdgeType.DIRECTED);
		}

		/*
		 * SpringLayout2<GraphicalNodeDefinition, GraphicalConnectionDefinition>
		 * layout = new SpringLayout2<GraphicalNodeDefinition,
		 * GraphicalConnectionDefinition>( graph);
		 */

		ISOMLayout<GraphicalNodeDefinition, GraphicalConnectionDefinition> layout = new ISOMLayout<GraphicalNodeDefinition, GraphicalConnectionDefinition>(
				graph);

		layout.setSize(new java.awt.Dimension((int) (2 * max * Math.log(id2node
				.size())), (int) (2 * max * Math.log(id2node.size()))));

		int maxStep = 100;
		while (!layout.done() && maxStep > 0) {
			layout.step();
			maxStep--;
		}

		for (Object on : gd.getNodes()) {
			GraphicalNodeDefinition n = (GraphicalNodeDefinition) on;
			n.setX((int) layout.getX(n));
			n.setY((int) layout.getY(n));
		}

	}

	
}
