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
import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.exampleStructures.SimpleNode;
import org.eclipse.zest.layouts.exampleStructures.SimpleRelationship;
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

	private static class DistanceComparator implements
			Comparator<GraphicalNodeDefinition> {

		private GraphicalNodeDefinition origin;
		private GraphicalDescription desc;
		private EndpointProvider endpoints;

		public DistanceComparator(GraphicalNodeDefinition origin,
				GraphicalDescription desc, EndpointProvider endpoints) {
			this.origin = origin;
			this.desc = desc;
			this.endpoints = endpoints;
		}

		@Override
		public int compare(GraphicalNodeDefinition a, GraphicalNodeDefinition b) {
			return distance(b, new HashSet<GraphicalNodeDefinition>())
					- distance(a, new HashSet<GraphicalNodeDefinition>());
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

	private static GraphicalNodeDefinition getGND(String id,
			GraphicalDescription desc) {
		for (Object o : desc.getNodes())
			if (o instanceof GraphicalNodeDefinition
					&& ((GraphicalNodeDefinition) o).getReferenceId()
							.equals(id))
				return (GraphicalNodeDefinition) o;
		return null;
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

	private SimpleNode getEntityByNodeID(List<SimpleNode> entities, String id) {
		for (SimpleNode e : entities) {
			if (((GraphicalNodeDefinition) e.getRealObject()).getReferenceId()
					.equals(id))
				return e;
		}
		return null;
	}

	public void layoutGraphicalDesicription(GraphicalDescription gd,
			EndpointProvider endpoints) {
		if (gd.getNodes().isEmpty())
			return;

		// delete bendpoints
		for (Object o : gd.getConnections()) {
			GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition) o;
			gcd.getBendpoints().clear();
		}

		// build raster
		List<GraphicalNodeDefinition> todo = new ArrayList<>();
		for (Object o : gd.getNodes())
			if (o instanceof GraphicalNodeDefinition) {
				if(((GraphicalNodeDefinition) o).getReferenceId()==null)continue;
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

		// find nearest neighbour
		while (!todo.isEmpty()) {
			Collections.sort(todo, new DistanceComparator(gnd, gd, endpoints));
			gnd = todo.remove(0);
			free = nearestFreePosition(raster, free);
			raster[free.x][free.y] = gnd;
			gnd.setX(free.x * fieldSize);
			gnd.setY(free.y * fieldSize);
		}
	}
	
	private int measureArcLengths(GraphicalDescription gd, EndpointProvider ep){
		int result = 0;
		for(Object o:gd.getConnections()){
			if(o instanceof GraphicalConnectionDefinition){
				GraphicalConnectionDefinition gcd = (GraphicalConnectionDefinition)o;
				GraphicalNodeDefinition source = getGND(ep.getSourceID(gcd.getReferenceId()),gd);
				GraphicalNodeDefinition target = getGND(ep.getTargetID(gcd.getReferenceId()),gd);
				result += Math.abs(source.getX()-target.getX())+Math.abs(source.getY()-target.getY());
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

	public void layoutGraphicalDesicription_old(GraphicalDescription gd,
			EndpointProvider endpoints) {
		int maxWidth = 50, maxHeight = 50;

		// create zest graph
		List<SimpleNode> entities = new LinkedList<>();
		List<SimpleRelationship> relationships = new LinkedList<>();
		for (Object o : gd.getNodes()) {
			GraphicalNodeDefinition node = (GraphicalNodeDefinition) o;
			Dimension hint = endpoints.getSizeHint(node.getReferenceId());
			node.setWidth(hint.width);
			node.setHeight(hint.height);

			maxWidth = Math.max(maxWidth, node.getWidth());
			maxHeight = Math.max(maxHeight, node.getHeight());

			SimpleNode entity = new SimpleNode(node);
			entity.setSizeInLayout(node.getWidth(), node.getWidth());
			entity.setLocationInLayout(node.getX(), node.getY());
			entities.add(entity);

		}
		for (Object o : gd.getConnections()) {
			GraphicalConnectionDefinition con = (GraphicalConnectionDefinition) o;
			con.getBendpoints().clear();
			SimpleRelationship rel = new SimpleRelationship(getEntityByNodeID(
					entities, endpoints.getSourceID(con.getReferenceId())),
					getEntityByNodeID(entities,
							endpoints.getTargetID(con.getReferenceId())), false);
			if (rel.getDestinationInLayout() != null
					&& rel.getSourceInLayout() != null)
				relationships.add(rel);
		}

		// apply layout
		AbstractLayoutAlgorithm layout = new CompositeLayoutAlgorithm(
				new LayoutAlgorithm[] { new SpringLayoutAlgorithm(
						LayoutStyles.NO_LAYOUT_NODE_RESIZING) });

		try {
			layout.applyLayout(entities.toArray(new LayoutEntity[0]),
					relationships.toArray(new LayoutRelationship[0]), 0, 0,
					maxWidth * Math.log(entities.size()) / Math.log(2),
					maxHeight * Math.log(entities.size()) / Math.log(2), false,
					false);
		} catch (InvalidLayoutConfiguration e) {
			e.printStackTrace();
		}

		// zoom out until all intersections are gone
		int w = 0, h = 0;
		for (SimpleNode e : entities) {
			w = (int) Math.max(e.getX() + e.getWidth(), w);
			h = (int) Math.max(e.getY() + e.getHeight(), h);
		}

		scale: while (true) {
			double scalingFactor = 1d;
			retry: for (SimpleNode n1 : entities) {
				for (SimpleNode n2 : entities) {
					Rectangle r1 = new Rectangle((int) n1.getX(),
							(int) n1.getY(), (int) n1.getWidth(),
							(int) n1.getHeight());
					Rectangle r2 = new Rectangle((int) n2.getX(),
							(int) n2.getY(), (int) n2.getWidth(),
							(int) n2.getHeight());
					if (n1 != n2 && r1.intersects(r2)) {
						scalingFactor = 1 + Math.max((r1.x >= r2.x ? (r1.x
								+ r1.width - r2.x) : (r2.x + r2.width - r1.x))
								/ (double) w,
								(r1.y >= r2.y ? (r1.y + r1.height - r2.y)
										: (r2.y + r2.height - r1.y))
										/ (double) h);
						break retry;
					}
				}
			}
			if (scalingFactor == 1d)
				break scale;

			for (SimpleNode n : entities) {
				n.setLocation(n.getX() * scalingFactor, n.getY()
						* scalingFactor);
			}
		}

		// shift to diagram beginning
		List<SimpleNode> reducedX = new ArrayList<SimpleNode>();
		List<SimpleNode> reducedY = new ArrayList<SimpleNode>();
		final int minDist = 50;
		int minXLast = 0, minYLast = 0;

		while (reducedX.size() < entities.size()
				|| reducedY.size() < entities.size()) {

			SimpleNode minNodeX = null, minNodeY = null;
			int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;

			for (SimpleNode e : entities) {
				if (!reducedX.contains(e) && e.getX() <= minX) {
					minX = (int) e.getX();
					minNodeX = e;
				}
				if (!reducedY.contains(e) && e.getY() <= minY) {
					minY = (int) e.getY();
					minNodeY = e;
				}
			}

			minNodeX.setLocation(minXLast + minDist, minNodeX.getY());
			minNodeY.setLocation(minNodeY.getX(), minYLast + minDist);

			for (SimpleNode e : entities) {
				if (!reducedX.contains(e) && e != minNodeX) {
					e.setLocation(e.getX() - (minX - minXLast) + minDist
							+ minNodeX.getWidth(), e.getY());
				}
				if (!reducedY.contains(e) && e != minNodeY) {
					e.setLocation(e.getX(), e.getY() - (minY - minYLast)
							+ minDist + minNodeY.getHeight());
				}
			}

			reducedX.add(minNodeX);
			reducedY.add(minNodeY);
			minXLast = minX;
			minYLast = minY;
		}

		// apply
		for (SimpleNode e : entities) {
			GraphicalNodeDefinition n = (GraphicalNodeDefinition) e
					.getRealObject();
			n.setX((int) e.getX());
			n.setY((int) e.getY());
		}

	}
}
