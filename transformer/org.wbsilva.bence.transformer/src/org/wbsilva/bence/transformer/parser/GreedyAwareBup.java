package org.wbsilva.bence.transformer.parser;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

/**
 * This extension of {@linkplain GreedyBup} is aware of the grammar and graph being used by the parser and can optimize
 * its decisions to provide subsets that will result in faster execution of the parser.
 * 
 * @author wbombardellis
 *
 */
public class GreedyAwareBup extends GreedyBup {

	/**
	 * The grammar for which the generated subsets will be used. Used for heuristics only.
	 */
	final protected Grammar grammar;
	
	/**
	 * The graph to which the vertices in the zone vertices belong. Used for heuristics only.
	 */
	final protected Graph graph;

	/**
	 * The taboo list of subsset's size, which are not allowed to be created
	 */
	private final Set<Integer> tabooSubsetsSize;
	
	/**
	 * The distance between the graph's vertices 
	 */
	private final Map<String, Map<String, Integer>> distance;
	
	/**
	 * The depth of the graph's vertices 
	 */
	private final Map<String, Integer> depths;
	
	/**
	 * The comparator for the sets of zone vertices. The more vertices the zone vertices of a set has,
	 * the smaller it is in this total order. If two sets have the same amount of vertices in their
	 * zone vertices, then further criteria decide their order.
	 * This order is not consistent with equals
	 */
	final private Comparator<Set<ZoneVertex>> ZVSET_AWARE_COMPARATOR = new Comparator<Set<ZoneVertex>>() {

		/**
		 * This method imposes a total order on the sets of zone vertices.
		 */
		@Override
		public int compare(final Set<ZoneVertex> a, final Set<ZoneVertex> b) {
			assert a != null;
			assert b != null;
			
			final int aSize = a.stream()
					.mapToInt(z -> z.getVertices().size())
					.reduce(Integer::max)
					.orElse(0);
			final int bSize = b.stream()
					.mapToInt(z -> z.getVertices().size())
					.reduce(Integer::max)
					.orElse(0);
			
			//A bigger set a is smaller in our order, so that it goes in the beginning of the queue
			if (aSize > bSize) {
				return -1;
			} else if (aSize < bSize) {
				return 1;
			} else  {
				//The second criterion is the amount of outEdges
				int aDistances = a.stream()
						.sorted((x,y) -> - x.getVertices().size() + y.getVertices().size()) //Sort ascendent by size
						.findFirst()														//Get the biggest
						//.skip(a.size() /2)
						.map(z -> a.stream()
								.mapToInt(y -> distance(z, y))
								.reduce(Integer::sum)
								.orElse(0))
						//.reduce(Integer::sum)
						.orElse(0);
				
				int bDistances = b.stream()
						.sorted((x,y) -> - x.getVertices().size() + y.getVertices().size()) //Sort ascendent by size
						.findFirst()														//Get the biggest
						//.skip(a.size() /2)
						.map(z -> b.stream()
								.mapToInt(y -> distance(z, y))
								.reduce(Integer::sum)
								.orElse(0))
						//.reduce(Integer::sum)
						.orElse(0);
				//The closer, the better
				if (aDistances < bDistances) {
					return -1;
				} else if (aDistances > bDistances) {
					return 1;
				} else {
					//The third criterion is the depth of the edges
					final int aD = a.stream()
							.mapToInt(z -> z.getVertices().stream()
									.mapToInt(v -> depths.get(v.getId()) != null ? depths.get(v.getId()) : 0)
									.reduce(Integer::max)
									.orElse(0))
							.reduce(Integer::sum)
							.orElse(0);
					final int bD = b.stream()
							.mapToInt(z -> z.getVertices().stream()
									.mapToInt(v -> depths.get(v.getId()) != null ? depths.get(v.getId()) : 0)
									.reduce(Integer::max)
									.orElse(0))
							.reduce(Integer::sum)
							.orElse(0);
					//The deeper, the better
					if (aD > bD) {
						return -1;
					} else if (aD < bD) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		}

		/**
		 * Calculates the least 2-distance between the vertices of {@code y} and {@code z}, according to
		 * the cache in {@code this.distance}. If it is undefined, then return 4 
		 * {@code y} and {@code z} must be either equals ({@code y == z}),
		 * in which case the return is zero, or disjunct (i.e. no vertex of {@code y} occurs in {@code z}).
		 * 
		 * @param y			One zone vertex, disjunct or equal to {@code z}
		 * @param z			Another zone vertex, disjunct or equal to {@code y}
		 * @return			The least 2-distance between {@code y} and {@code z} or 4, if it is undefined
		 * @see GraphgrammarUtil#distance(Graph)
		 */
		private int distance(final ZoneVertex y, final ZoneVertex z) {
			if (y == z)
				return 0;
			
			int d = 4;
			for (Vertex v : y.getVertices()) {
				for (Vertex w : z.getVertices()) {
					final Map<String, Integer> vD = distance.get(v.getId());
					if (vD != null) {
						final Integer vwD = vD.get(w.getId());
						if (vwD != null) {
							if (vwD == 1) {
								return vwD;
							} else {
								d = vwD;
							}
						}
					}
				}
			}
			
			return d;
		}
	};
	
	/**
	 * Same contract as {@link GreedyBup#GreedyBup(Set, int, ZoneVertex)} with additional parameters
	 * @param grammar				The grammar for which the generated subsets will be used
	 * @param graph					The graph to which the vertices in the zone vertices belong
	 * @param depths				The depth of each vertex of {@code graph}
	 * @see GreedyBup
	 */
	public GreedyAwareBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root, final Grammar grammar, final Graph graph, final Map<String, Integer> depths) {
		super(initialSet, maximalSubsetSize, root);
		
		//The central queue holds all generated but not yet consumed subsets ordered
		final PriorityQueue<Set<ZoneVertex>> parentCentralQueue = new PriorityQueue<>(this.centralQueue);
		this.centralQueue = new PriorityQueue<>(ZVSET_AWARE_COMPARATOR);
		this.centralQueue.addAll(parentCentralQueue);

		assert grammar != null;
		assert graph != null;
		assert depths != null;
		this.grammar = grammar;
		this.graph = graph;
		this.depths = depths;
		
		assert maximalSubsetSize >= 0;
		
		//If the grammar has no rule with RHS's size equal to n, then n goes in the taboo for subset sizes (0 and 1 are never taboo)
		final IntStream possibleSizes = IntStream.rangeClosed(2, maximalSubsetSize);
		final Set<Integer> grammarRuleSizes = grammar.getRules().stream()
				.map(r -> r.getRhs().getVertices().size())
				.distinct()
				.collect(Collectors.toSet());
		this.tabooSubsetsSize = possibleSizes
				.filter(s -> !grammarRuleSizes.contains(s))
				.mapToObj(s -> new Integer(s))
				.collect(Collectors.toSet());
		assert this.tabooSubsetsSize.size() <= grammarRuleSizes.size();
		
		//Pre-calculation of the graph distance metric
		this.distance = GraphgrammarUtil.distance(graph);
	}
	
	/**
	 * Return whether a subset with size {@code p} can be enqueued or not
	 * @param p			The size of the subset to be created and added to the queues
	 * @return			True iff {@code grammar} has at least a rule with RHS's size equal to {@code p} 
	 */
	protected boolean canEnqueue(final int p) {
		return !this.tabooSubsetsSize.contains(p);
	}

}
