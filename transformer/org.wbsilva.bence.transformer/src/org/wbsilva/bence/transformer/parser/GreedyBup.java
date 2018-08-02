package org.wbsilva.bence.transformer.parser;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
class GreedyBup extends Bup {
	
	/**
	 * TODO
	 */
	private int topPhase;
	
	public GreedyBup(final Set<ZoneVertex> initialSet) {
		super(initialSet);
		this.topPhase = this.phase;
	}

	@Override
	public boolean add(final ZoneVertex zoneVertex) {
		final int oldPhase = this.phase;
		
		final boolean added = super.add(zoneVertex);
		
		if (added) {
			if (zoneVertex.getVertices().size() > this.topPhase) {
				this.topPhase = zoneVertex.getVertices().size();
			}
			assert this.topPhase >= this.phase;
			assert this.topPhase >= oldPhase;
			
			//Regenerate all phases' subsets and queues from the oldPhase to the top
			for (int p = oldPhase + 1; p <= this.topPhase; p++) {
				final Set<Set<ZoneVertex>> newSubsets = createNewSubsets(p, zoneVertex);
				
				if (p >= subsets.size()) {
					addNewSubsetQueue(newSubsets);
				} else {
					subsets.get(p).addAll(newSubsets);
					queues.get(p).addAll(newSubsets);
				}
			}
		}
		return added;
	}

	@Override
	public Set<ZoneVertex> next() {
		if (hasNext()) {
			if (this.topPhase >= this.phase) {
				assert this.queues.get(this.phase) != null;
				assert this.queues.get(this.topPhase) != null;
				assert this.phase > 0;
			
				final ArrayDeque<Set<ZoneVertex>> topQueue = this.queues.get(this.topPhase);
				//If there is no element on the toppest queue, go down
				if (topQueue.isEmpty()) {
					this.topPhase--;
					//Recursive call with a lesser phase
					return next();
				} else {
					//Surely the recursion ends, because the phase will scale until the last phase,
					//when the queue consists of only one subset containing all elements of bubSet
					
					//Take an element from the toppest queue
					final Set<ZoneVertex> ret = topQueue.poll();
					assert ret != null;
					
					return ret;
				}
			} else {
				final Set<ZoneVertex> ret = super.next();
				
				if (this.phase > this.topPhase)
					this.topPhase = this.phase;
				
				return ret;
			}
		} else {
			return null;
		}
	}

}
