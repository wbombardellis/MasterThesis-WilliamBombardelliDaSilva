package org.wbsilva.bence.transformer.parser;

import java.lang.Character.Subset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class Bup {
	
	final HashSet<ZoneVertex> bupSet;
	/**
	 * TODO: inv phase is always the size of the subsets
	 */
	int phase;
	
	final ArrayList<Set<Set<ZoneVertex>>> subsets;
	private ArrayList<ArrayDeque<Set<ZoneVertex>>> queues;
	
	public Bup(final Set<ZoneVertex> initialSet) {
		bupSet = new HashSet<>(initialSet);
		phase = 1;
		
		subsets = new ArrayList<>();
		queues = new ArrayList<>();
		//Phase zero's queue consists of the empty set
		final HashSet<Set<ZoneVertex>> ss0 = new HashSet<>(1);
		ss0.add (new HashSet<>(0));
		subsets.add(ss0); 
		queues.add(new ArrayDeque<>(0));
	}
	
	protected synchronized Set<ZoneVertex> next() {
		assert hasNext();
		
		final Set<ZoneVertex> ret = queues.get(phase).poll();
		assert ret != null;
		
		//No more element in this phase. Go to the next
		if (queues.get(phase).isEmpty()) {
			phase++;
		}
		
		return ret;
	}

	private synchronized void addNewSubsetQueue(final Set<Set<ZoneVertex>> newSubsets) {		
		subsets.add(newSubsets);
		queues.add(new ArrayDeque<Set<ZoneVertex>>(newSubsets));
	}

	private synchronized Set<Set<ZoneVertex>> createNewSubsets(final int p, final HashSet<ZoneVertex> zoneVertices) {

		final int lastPhase = p - 1;
		final Set<Set<ZoneVertex>> oldPhaseSubsets = subsets.get(lastPhase);
		//TODO: add assertions about existence of subsets and queues
		
		//TODO: newQueueSize = bupSet.size() chooses phase
		final HashSet<Set<ZoneVertex>> newSubsets = new HashSet<>();
		
		//For each subset of the last phase
		final Iterator<Set<ZoneVertex>> it = oldPhaseSubsets.iterator();
		while (it.hasNext()) {
			final Set<ZoneVertex> ss = it.next();
			
			//Add each zone vertex of interest
			final Iterator<ZoneVertex> itt = zoneVertices.iterator();
			while(itt.hasNext()) {
				final ZoneVertex bup = itt.next();
				
				//Add it if current subset still does not have it
				if (!ss.contains(bup)) {
					final HashSet<ZoneVertex> newSs = new HashSet<>(ss);
					newSs.add(bup);
					
					newSubsets.add(newSs); //TODO: are two sets with same bups equal?
				}
			}
		}
		
		return newSubsets.stream()
			.filter(ss -> {
				final int count = ss.stream().mapToInt(v -> v.getVertices().size()).reduce(0, (a,b)-> a+b);
				return count == ss.stream()
							.flatMap(zv -> zv.getVertices().stream())
							.collect(Collectors.toSet()).size();
			})
			.collect(Collectors.toSet());
	}

	private Set<Set<ZoneVertex>> createNewSubsets(int p, final ZoneVertex zoneVertex) {
		return createNewSubsets(p, new HashSet<ZoneVertex>(Arrays.asList(zoneVertex)));
	}
	
	public synchronized void add(final ZoneVertex zoneVertex) {
		//TODO: add assertions about existence of subsets and queues
		
		boolean added = contains(zoneVertex);
		
		if (!added) {
			//If it had already exhausted all phases
			if (phase > lastPhase()) {
				addNewSubsetQueue(new HashSet<Set<ZoneVertex>>(1));
			}
			
			//Go back to the first phase and add new element to the bupSet
			int oldPhase = phase;
			phase = 1;
			bupSet.add(zoneVertex);
			
			//Regenerate all previous phases' subsets and queues
			for (int p = 1; p <= oldPhase; p++) {
				final Set<Set<ZoneVertex>> newSubsets = createNewSubsets(p, zoneVertex);			
				subsets.get(p).addAll(newSubsets);
				queues.get(p).addAll(newSubsets);
			}
		}
	}

	private int lastPhase() {
		//Last phase is the one where there is only one subset, with all elements of bupSet
		return bupSet.size();
	}

	public synchronized boolean hasNext() {
		//TODO: add assertions about phase

		//If we are at the next phase 
		if (phase >= subsets.size() && phase <= lastPhase()) {
			//Add new subsets and queues
			final Set<Set<ZoneVertex>> newDinjunctSubsets = createNewSubsets(phase, bupSet);
			addNewSubsetQueue(newDinjunctSubsets);
		}
		
		return phase <= lastPhase() && !queues.get(phase).isEmpty();
	}

	public synchronized boolean contains(final ZoneVertex zoneVertex) {
		return bupSet.parallelStream().anyMatch(zv -> zoneVertex.equivalates(zv));
	}
}
