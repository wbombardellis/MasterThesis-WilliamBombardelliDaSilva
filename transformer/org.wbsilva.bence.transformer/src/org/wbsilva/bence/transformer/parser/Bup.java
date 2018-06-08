package org.wbsilva.bence.transformer.parser;

import java.lang.Character.Subset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class Bup {
	
	final HashSet<ZoneVertex> bupSet;
	int phase;
	
	final ArrayList<Set<Set<ZoneVertex>>> subsets;
	private ArrayList<ArrayDeque<Set<ZoneVertex>>> queues;
	
	public Bup(final Set<ZoneVertex> initialSet) {
		bupSet = new HashSet<>(initialSet);
		phase = 1;
		
		subsets = new ArrayList<>();
		queues = new ArrayList<>();
		//Phase zero's queue consists of the empty set
		subsets.add(new HashSet<>(0)); 
		queues.add(new ArrayDeque<>(0));
	}
	
	protected synchronized Set<ZoneVertex> next() {
		if (phase >= subsets.size()) {
			addNewQueue();
		}
		//TODO: assert hasNext
		return queues.get(phase).poll();
	}

	private void addNewQueue() {
		final int lastPhase = phase - 1;
		final Set<Set<ZoneVertex>> oldPhaseSubsets = subsets.get(lastPhase);
		
		//TODO: newQueueSize = bupSet.size() chooses phase
		final HashSet<Set<ZoneVertex>> newSubsets = new HashSet<>();
		
		final Iterator<Set<ZoneVertex>> it = oldPhaseSubsets.iterator();
		while (it.hasNext()) {
			Set<ZoneVertex> ss = it.next();
			
			final Iterator<ZoneVertex> itt = bupSet.iterator();
			while(itt.hasNext()) {
				final ZoneVertex bup = itt.next();
				
				final HashSet<ZoneVertex> newSs = new HashSet<>(ss);
				newSs.add(bup);
				
				newSubsets.add(newSs); //TODO: Are different references of same elements equal?
			}
		}
		
		Set<Set<ZoneVertex>> newDinjunctSubsets = newSubsets.stream()
			.filter(ss -> {
				final int count = ss.stream().mapToInt(v -> v.getVertices().size()).reduce(0, (a,b)-> a+b);
				return count == ss.stream()
							.flatMap(zv -> zv.getVertices().stream())
							.collect(Collectors.toSet()).size();
			})
			.collect(Collectors.toSet());
		
		subsets.add(newDinjunctSubsets);
		queues.add(new ArrayDeque<Set<ZoneVertex>>(newDinjunctSubsets));
	}

	public void add(final ZoneVertex zoneVertex) {
		int oldPhase = phase;
		phase = 1;
		bupSet.add(zoneVertex);
		
		for (int p = 1; p <= oldPhase; p++) {
			//TODO: add new zv to the queues			
		}
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return true;
	}
}
