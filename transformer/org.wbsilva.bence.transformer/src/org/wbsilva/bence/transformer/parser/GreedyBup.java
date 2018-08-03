package org.wbsilva.bence.transformer.parser;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * This extension of {@linkplain Bup} implements a greedy strategy that creates subsets of different sizes
 * upon the addition of a new zone vertex and retrieves them from the greatest to the smallest.
 * 
 * @author wbombardellis
 *
 */
class GreedyBup extends Bup {
	
	/**
	 * topPhase holds the phase with currently biggest subsets that are to be returned through {@link GreedyBup#next()} 
	 */
	private int topPhase;
	
	/**
	 * Same contract as {@link Bup#Bup(Set, int)}
	 * @see Bup
	 */
	public GreedyBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize) {
		super(initialSet, maximalSubsetSize);
		this.topPhase = this.phase;
	}

	@Override
	public synchronized boolean add(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		assert this.phase > 0;
		assert this.topPhase >= this.phase;
		assert this.topPhase <= lastPhase();
		assert this.subsets.size() >= this.phase;
		assert this.queues.size() == this.subsets.size();
		
		final boolean contains = this.contains(zoneVertex);
		
		if (!contains) {
			//Bottom phase go down, because new elements in phase 1 will be created
			this.phase = 1;
			
			this.bupSet.add(zoneVertex);
			
			//Create new subsets for the newly added zone vertex from the phase 1 until the last phase
			int p = 0;
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
						this.queues.get(p).addAll(newSubsets);
					}
				}
			} while((p + 1) <= lastPhase() && !newSubsets.isEmpty());
			
			//Top phase climb up
			this.topPhase = this.subsets.size() - 1;
			
			return true;
			
		} else {
			return false;
		}
	}

	@Override
	public synchronized Optional<Set<ZoneVertex>> next() {
		assert this.phase > 0;
		assert this.topPhase >= this.phase - 1;
		assert this.topPhase <= lastPhase();
		assert this.subsets.size() >= this.phase;
		assert this.subsets.size() == this.queues.size();
		
		//Greedy strategy trying to get bigger subsets first
		if (this.topPhase >= this.phase) {
			
			final ArrayDeque<Set<ZoneVertex>> topQueue = this.queues.get(this.topPhase);
			
			if(!topQueue.isEmpty()) {
				//Take an element from the toppest queue
				final Set<ZoneVertex> ret = topQueue.poll();
				assert ret != null;
				
				return Optional.of(ret);
			} else {
				//No element on the toppest queue, go down for the smaller subsets
				this.topPhase--;
				return next();
				//Surely the recursion ends, because topPhase will go down until phase -1
				//when either a new queue will be created or it will have reached the last phase and will stop
			}
		} else {
			//Exhausted all generated queues
			assert this.topPhase == this.phase - 1;
			
			//Generated new queue/ subsets and advances phase until generates a phase with non empty subsets or reaches the last phase
			int p = this.phase - 1;
			Set<Set<ZoneVertex>> newSubsets;
			do {
				p++;
				newSubsets = createNewSubsets(p, this.bupSet);
				
				if (this.subsets.size() <= p) {
					addNewSubsetQueue(newSubsets);
				} else {
					this.subsets.get(p).addAll(newSubsets);
					this.queues.get(p).addAll(newSubsets);
				}
			} while ((p + 1) <= lastPhase() && newSubsets.isEmpty());
			this.phase = p;
			this.topPhase = this.phase;
			
			//Reached the last phase
			if (newSubsets.isEmpty()) {
				return Optional.empty();
			} else {
				assert this.topPhase <= lastPhase();
				assert this.subsets.size() >= this.phase;
				assert this.subsets.size() == this.queues.size();
				
				final Set<ZoneVertex> ret = this.queues.get(this.phase).poll();
				assert ret != null;
				
				return Optional.of(ret);
			}
		}
	}

}
