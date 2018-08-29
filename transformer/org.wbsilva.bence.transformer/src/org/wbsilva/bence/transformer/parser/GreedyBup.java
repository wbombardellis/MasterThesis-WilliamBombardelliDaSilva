package org.wbsilva.bence.transformer.parser;

import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * This extension of {@linkplain Bup} implements a greedy strategy that creates subsets of different sizes
 * upon the addition of a new zone vertex and retrieves them ordered by the amount of vertices inside it. 
 * That is, sets with zone vertices containing more vertices are retrieved first. If they have the same amount
 * of vertices, furhter criteria are used to order them.
 * 
 * @author wbombardellis
 *
 */
class GreedyBup extends Bup {
	
	/**
	 * The central queue holds all generated but not yet consumed subsets ordered in their size
	 * The size is the amount of vertices in each set of zone vertices
	 * 
	 * @example centralQueue = [{},{a,b},{a,b,c},{a},{b}]
	 */
	final protected PriorityQueue<Set<ZoneVertex>> centralQueue;
	
	/**
	 * The graph to which the vertices in the zone vertices belong. Used for heuristics only.
	 */
	final protected Graph graph;
	
	/**
	 * The comparator for the sets of zone vertices. The more vertices the zone vertices of a set has,
	 * the smaller it is in this total order. If two sets have the same amount of vertices in their
	 * zone vertices, then further criteria decide their order.
	 * This order is not consistent with equals
	 */
	final private Comparator<Set<ZoneVertex>> ZVSET_COMPARATOR = new Comparator<Set<ZoneVertex>>() {

		/**
		 * This method imposes a total order on the sets of zone vertices.
		 */
		@Override
		public int compare(final Set<ZoneVertex> a, final Set<ZoneVertex> b) {
			assert a != null;
			assert b != null;
			
			final int aSize = a.stream()
								.mapToInt(z -> z.getVertices().size())
								.reduce(Integer::sum)
								.orElse(0);
			final int bSize = b.stream()
					.mapToInt(z -> z.getVertices().size())
					.reduce(Integer::sum)
					.orElse(0);
			
			//A bigger set a is smaller in our order, so that it goes in the beginning of the queue
			if (aSize > bSize) {
				return -1;
			} else if (aSize < bSize) {
				return 1;
			} else {
				//The second criterion is the amount of outEdges
				final int aOutEdges = a.stream()
								.mapToInt(z -> z.getVertices().stream()
													.mapToInt(v -> graph.outEdges(v).size())
													.reduce(Integer::sum)
													.orElse(0))
								.reduce(Integer::sum)
								.orElse(0);
				final int bOutEdges = b.stream()
						.mapToInt(z -> z.getVertices().stream()
											.mapToInt(v -> graph.outEdges(v).size())
											.reduce(Integer::sum)
											.orElse(0))
						.reduce(Integer::sum)
						.orElse(0);
				if (aOutEdges < bOutEdges) {
					return -1;
				} else if (aOutEdges > bOutEdges) {
					return 1;					
				} else {
					return 0;
				}
			}
		}
	};
	
	/**
	 * Same contract as {@link Bup#Bup(Set, int, ZoneVertex)} with additional parameter for the graph.
	 * @param graph			The graph to which the vertices of the zone vertices belong
	 * @see Bup
	 */
	public GreedyBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root, final Graph graph) {
		super(initialSet, maximalSubsetSize, root);
		
		this.graph = graph;
		
		//The central queue holds all generated but not yet consumed subsets ordered in their size
		this.centralQueue = new PriorityQueue<>(ZVSET_COMPARATOR);
		
		if (phase <= lastPhase()) {
			assert this.queues.size() > 0;
			
			this.centralQueue.addAll(this.queues.get(this.phase));
		}
	}
	
	/**
	 * Add new subsets to the {@code subsets}  at the end of it, that is, at the position corresponding to a phase.
	 * as well as to the {@code centralQueue} according to the priority criteria.
	 * 
	 * @param newSubsets	The set of subsets of zone vertices to be added to the end of the {@code subsets} and {@code centralQueue}
	 */
	protected synchronized void addNewSubsetQueue(final Set<Set<ZoneVertex>> newSubsets) {
		assert newSubsets != null;
		this.subsets.add(newSubsets);
		this.centralQueue.addAll(newSubsets);
	}

	@Override
	public synchronized boolean add(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		assert this.phase >= 0;
		assert this.phase <= lastPhase();
		assert this.subsets.size() >= this.phase;
		
		if (canAdd(zoneVertex)) {
			//Bottom phase go down, because new elements in phase 1 will be created
			this.phase = 0;
			
			this.bupSet.add(zoneVertex);
			
			//Create new subsets for the newly added zone vertex from the phase 1 until the last phase
			int p = -1;
			Set<Set<ZoneVertex>> newSubsets;
			do {
				p++;
				newSubsets = createNewSubsets(p, zoneVertex);
				
				//if new subsets were created, add them
				if (!newSubsets.isEmpty()) {
					if (this.subsets.size() <= p) {
						addNewSubsetQueue(newSubsets);
					} else {
						this.subsets.get(p).addAll(newSubsets);
						this.centralQueue.addAll(newSubsets);
					}
				}
			} while((p + 1) <= lastPhase() && !newSubsets.isEmpty());
			
			checkIsParsed(zoneVertex);
			
			return true;
			
		} else {
			return false;
		}
	}

	@Override
	public synchronized Optional<Set<ZoneVertex>> next() {		
		assert this.phase >= 0;
		assert this.phase <= lastPhase();
		assert this.subsets.size() >= this.phase;
		
		//Greedy strategy trying to get bigger subsets first
		if (!this.centralQueue.isEmpty()) {
			//Take the biggest element from the queue
			final Set<ZoneVertex> ret = this.centralQueue.poll();
			assert ret != null;
			
			return Optional.of(ret);
		} else {
			//Exhausted all the generated queue
			
			//Generated new subsets and advances phase until generates a phase with non empty subsets or reaches the last phase
			int p = Math.max(this.phase - 1, 0);
			if ((p + 1) <= lastPhase()) {
				Set<Set<ZoneVertex>> newSubsets;
				do {
					p++;
					newSubsets = createNewSubsets(p, this.bupSet);
					
					if (this.subsets.size() <= p) {
						addNewSubsetQueue(newSubsets);
					} else {
						this.subsets.get(p).addAll(newSubsets);
						this.centralQueue.addAll(newSubsets);
					}
				} while ((p + 1) <= lastPhase() && newSubsets.isEmpty());
				
				this.phase = p;
				
				//Reached the last phase
				if (newSubsets.isEmpty()) {
					return Optional.empty();
				} else {
					assert this.subsets.size() >= this.phase;
					
					final Set<ZoneVertex> ret = this.centralQueue.poll();
					assert ret != null;
					
					return Optional.of(ret);
				}
			} else {
				return Optional.empty();
			}
		}
	}

}
