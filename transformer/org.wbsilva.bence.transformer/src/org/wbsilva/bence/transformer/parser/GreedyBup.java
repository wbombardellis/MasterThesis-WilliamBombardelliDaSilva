package org.wbsilva.bence.transformer.parser;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * This extension of {@linkplain Bup} implements a greedy strategy that creates subsets of different sizes
 * upon the addition of a new zone vertex and retrieves them ordered by the amount of vertices inside it. 
 * That is, sets with zone vertices containing more vertices are retrieved first
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
	 * The comparator for the sets of zone vertices. The more vertices the zone vertices of a set has,
	 * the smaller it is in this total order. If two sets have the same amount of vertices in their
	 * zone vertices, then they are equal.
	 * This order is not consistent with equals
	 */
	static final private Comparator<Set<ZoneVertex>> ZVSET_COMPARATOR = new Comparator<Set<ZoneVertex>>() {

		/**
		 * This method imposes a total order on the sets of zone vertices.
		 * Semi formally the order is defined as follows
		 * a < b iff a.zoneVertices.vertices.size > b.zoneVertices.vertices.size
		 * a = b iff a.zoneVertices.vertices.size = b.zoneVertices.vertices.size
		 * a > b iff a.zoneVertices.vertices.size < b.zoneVertices.vertices.size
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
			return aSize > bSize ? -1 : aSize == bSize ? 0 : 1;
		}
	};
	
	/**
	 * Same contract as {@link Bup#Bup(Set, int, ZoneVertex)}
	 * @see Bup
	 */
	public GreedyBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root) {
		super(initialSet, maximalSubsetSize, root);
		
		//The central queue holds all generated but not yet consumed subsets ordered in their size
		this.centralQueue = new PriorityQueue<>(ZVSET_COMPARATOR);
		
		if (phase <= lastPhase()) {
			assert this.queues.size() > 0;
			
			this.centralQueue.addAll(this.queues.get(this.phase));
		}
	}
	
	/**
	 * Same contract as {@link Bup#Bup(Set, int, ZoneVertex)} with additional parameter for the subsets comparator
	 * @see Bup
	 * @see Comparator
	 */
	protected GreedyBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root, final Comparator<Set<ZoneVertex>> ssComparator) {
		super(initialSet, maximalSubsetSize, root);
		
		//The central queue holds all generated but not yet consumed subsets ordered in their size
		this.centralQueue = new PriorityQueue<>(ssComparator);
		
		if (phase <= lastPhase()) {
			assert this.queues.size() > 0;
			
			this.centralQueue.addAll(this.queues.get(this.phase));
		}
	}
	
	/**
	 * Return whether a subset with size {@code p} can be enqueued or not. Extensions of this class may want to overwrite this method for optimization
	 * @param p			The size of the subset to be created and added to the queues
	 * @return			Always true
	 */
	protected boolean canEnqueue(final int p) {
		return true;
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
			Set<Set<ZoneVertex>> queueSubsets;
			do {
				p++;
				newSubsets = createNewSubsets(p, zoneVertex);
				queueSubsets = canEnqueue(p) ? newSubsets : new HashSet<>(0);
				
				//if new subsets were created, add them
				if (!newSubsets.isEmpty()) {
					if (this.subsets.size() <= p) {
						this.subsets.add(newSubsets);
						this.centralQueue.addAll(queueSubsets);
					} else {
						this.subsets.get(p).addAll(newSubsets);
						this.centralQueue.addAll(queueSubsets);
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
				Set<Set<ZoneVertex>> queueSubsets;
				do {
					p++;
					newSubsets = createNewSubsets(p, this.bupSet);
					queueSubsets = canEnqueue(p) ? newSubsets : new HashSet<>(0);
					
					if (this.subsets.size() <= p) {
						this.subsets.add(newSubsets);
						this.centralQueue.addAll(queueSubsets);
					} else {
						this.subsets.get(p).addAll(newSubsets);
						this.centralQueue.addAll(queueSubsets);
					}
				} while ((p + 1) <= lastPhase() && queueSubsets.isEmpty());
				
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
