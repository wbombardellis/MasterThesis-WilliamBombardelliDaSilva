package org.wbsilva.bence.transformer.parser;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * This class implements the bottom-up parsing set.
 * It basically stores a set of zone vertices generated during parsing
 * and retrieves subsets of it.
 * 
 * @author wbombardellis
 *
 */
public class Bup {
	
	/**
	 * The set of zone vertices added so far to the bup
	 */
	private final HashSet<ZoneVertex> bupSet;
	
	/**
	 * The current phase. This field stores how big the retrieved subsets should be at this time.
	 * The phase is used so that only the subsets are generated gradually (not all at a time)
	 * Moreover, the phase is necessary when new zone vertices are added to the {@code bupSet}, so that
	 * new subsets are created for the new state without losing the control of already retreived subsets.
	 * 
	 * @inv subsets[phase].all(s -> s.size == phase)
	 */
	private int phase;
	
	/**
	 * The subsets created from {@code bupSet} for the current {@code phase}
	 * Each element i of the list keeps the set of subsets of bupSet with size i
	 * 
	 * @example subsets[0] = {}; subsets[1] = {{a},{b}}; subsets[2] = {{a,b}} 
	 */
	private final ArrayList<Set<Set<ZoneVertex>>> subsets;
	
	/**
	 * The queues consist of the subsets of each phase, that has not been retrieved yet.
	 * It serves to retrieved only unique subsets.
	 * Each element i of the list keeps the queue of subsets of bupSet with size i
	 * 
	 * @example queues[0] = []; queues[1] = [{a},{b}]; queues[2] = [{a,b}]
	 */
	private ArrayList<ArrayDeque<Set<ZoneVertex>>> queues;
	
	/**
	 * Initialize the bup with {@code initialSet}. If it is null, treat it as an empty set.
	 * @param initialSet		The initial set of zone vertices to be used as bup set
	 */
	public Bup(final Set<ZoneVertex> initialSet) {
		if (initialSet != null)
			bupSet = new HashSet<>(initialSet);
		else
			bupSet = new HashSet<>();
		
		phase = 1;
		
		subsets = new ArrayList<>();
		queues = new ArrayList<>();
		
		//Phase zero's queue consists of the empty set
		final HashSet<Set<ZoneVertex>> ss0 = new HashSet<>(1);
		ss0.add (new HashSet<>(0));
		subsets.add(ss0); 
		queues.add(new ArrayDeque<>(0));
		
		if (phase <= lastPhase()) {
			//Add new subsets and queues
			final Set<Set<ZoneVertex>> newDinjunctSubsets = createNewSubsets(phase, bupSet);
			addNewSubsetQueue(newDinjunctSubsets);
			assert subsets.size() > 1;
			assert subsets.get(0).size() > 0;
			assert phase == subsets.size() - 1;
		}
	}
	
	/**
	 * Retrieve the next subset of bup, if it has a next.
	 * 
	 * @return		The next subset of zone vertices of bup or null
	 */
	public synchronized Set<ZoneVertex> next() {
		if(hasNext()) {
			assert queues.get(phase) != null;
			assert phase > 0;
			
			final Set<ZoneVertex> ret = queues.get(phase).poll();
			assert ret != null;
			
			//No more element in this phase. Go to the next
			if (queues.get(phase).isEmpty()) {
				phase++;
			}
			
			return ret;
		} else {
			return null;
		}
	}

	/**
	 * Add new subsets to the {@code subsets} as well as to the {@code queues} at the end of these lists
	 * That is, at the position corresponding to a new phase.
	 * 
	 * @param newSubsets	The set of subsets of zone vertices to be added to the end of the {@code subsets} and {@code queues} lists
	 */
	private synchronized void addNewSubsetQueue(final Set<Set<ZoneVertex>> newSubsets) {
		assert newSubsets != null;
		subsets.add(newSubsets);
		queues.add(new ArrayDeque<Set<ZoneVertex>>(newSubsets));
	}

	/**
	 * Create new subsets of bup for phase {@code p} (i.e. with size p) from the new zone vertices {@code zoneVertices}.
	 * This implementation uses the subsets of the last phase (p-1) to create the new subsets for phase p in linear time.
	 * Moreover, it does not include in the result subsets that were already in the phase p.
	 * This method only creates new subsets, it does not add it to the lists of {@link Bup#subsets} or {@link Bup#queues}. 
	 * 
	 * @param p					The desired phase
	 * @param zoneVertices		The new zone vertices of bup for which to create new subsets for phase {@code p}
	 * @return					The set of new subsets of bup for phase {@code p} for the new zone vertices {@code zoneVertices}
	 */
	private synchronized Set<Set<ZoneVertex>> createNewSubsets(final int p, final HashSet<ZoneVertex> zoneVertices) {
		assert zoneVertices != null;
		assert p > 0;
		assert p <= lastPhase() + 1;
		
		final int lastPhase = p - 1;
		assert subsets.size() >= lastPhase;
		assert queues.size() >= lastPhase;
		
		final Set<Set<ZoneVertex>> oldPhaseSubsets = subsets.get(lastPhase);
		
		//newQueueSize = bupSet.size() chooses phase
		final HashSet<Set<ZoneVertex>> newSubsets = new HashSet<>();
		
		//For each subset of the last phase
		final Iterator<Set<ZoneVertex>> it = oldPhaseSubsets.iterator();
		while (it.hasNext()) {
			final Set<ZoneVertex> ss = it.next();
			
			//Add each zone vertex of interest
			final Iterator<ZoneVertex> itt = zoneVertices.iterator();
			while(itt.hasNext()) {
				final ZoneVertex bup = itt.next();
				assert bup != null;
				
				//Add it if current subset still does not have it
				if (!ss.contains(bup)) {
					final HashSet<ZoneVertex> newSs = new HashSet<>(ss);
					newSs.add(bup);
					
					newSubsets.add(newSs); //two sets with same bups are equal
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

	/**
	 * Same contract as {@link Bup#createNewSubsets(int, HashSet)} with the difference that only one zone vertex is the new one.
	 * 
	 * @param zoneVertex	The new zone vertex of bup for which to create new subsets for phase {@code p}. Cannot be null.
	 * @see Bup#createNewSubsets(int, HashSet)
	 */
	private Set<Set<ZoneVertex>> createNewSubsets(int p, final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		return createNewSubsets(p, new HashSet<ZoneVertex>(Arrays.asList(zoneVertex)));
	}
	
	/**
	 * Add a new zone vertex {@code zoneVertex} to {@link Bup#bupSet}, if it has not been added yet
	 * and care to create new subsets for it.
	 * @param zoneVertex		The new zone vertex to be added. Cannot be null.
	 */
	public synchronized void add(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		
		boolean added = contains(zoneVertex);
		
		if (!added) {
			assert phase > 0;
			assert phase <= subsets.size();
			assert phase <= lastPhase() + 1;
			
			//If it had already exhausted all phases
			if (phase > lastPhase()) {
				addNewSubsetQueue(new HashSet<Set<ZoneVertex>>(1));
			}
			
			//Go back to the first phase and add new element to the bupSet
			int oldPhase = phase;
			phase = 1;
			bupSet.add(zoneVertex);
			
			assert subsets.size() == oldPhase + 1;
			assert queues.size() == oldPhase + 1;
			
			//Regenerate all previous phases' subsets and queues
			for (int p = 1; p <= oldPhase; p++) {
				final Set<Set<ZoneVertex>> newSubsets = createNewSubsets(p, zoneVertex);
				assert newSubsets.size() > 0;
				
				subsets.get(p).addAll(newSubsets);
				queues.get(p).addAll(newSubsets);
			}
		}
	}

	/**
	 * Return the number of the last phase according the current state of {@link Bup#bupSet}
	 * @return			The last phase for the {@link Bup#bupSet}
	 * @see Bup#bupSet
	 */
	private int lastPhase() {
		//Last phase is the one where there is only one subset, with all elements of bupSet
		return bupSet.size();
	}

	/**
	 * Return if it has a next subset to be retrieved according to the current state of {@link Bup#bupSet}.
	 * This method takes care of creating new subsets, if it hasn't been created yet.
	 * 
	 * @return				True if there is at least one subset to be retrieved, false otherwise.
	 * @see Bup#lastPhase()
	 */
	public synchronized boolean hasNext() {
		assert phase >= 0;
		assert phase <= subsets.size();

		//If we are at the next phase 
		if (phase >= subsets.size() && phase <= lastPhase()) {
			//Add new subsets and queues
			final Set<Set<ZoneVertex>> newDinjunctSubsets = createNewSubsets(phase, bupSet);
			addNewSubsetQueue(newDinjunctSubsets);
			
			assert subsets.size() > 1;
			assert subsets.get(phase).size() > 0;
			assert phase == subsets.size() - 1;
			assert queues.size() > 1;
			assert queues.get(phase).size() > 0;
			assert phase == queues.size() - 1;
		}
		
		//If current phase is beyond the last phase, i.e. all subsets has been retrieved, then it has no next and returns false
		return phase <= lastPhase() && !queues.get(phase).isEmpty();
	}

	/**
	 * Return true iff {@code zoneVertex} or any equivalent zone vertex is contained by the {@link Bup#bupSet}.
	 * @param zoneVertex	The zone vertex to be tested. Cannot be null.
	 * @return				True if {@link Bup#bupSet} contains any zone vertex equivalent to {@code zoneVertex}, false otherwise. 
	 * @see ZoneVertex#equivalates(ZoneVertex)
	 */
	public synchronized boolean contains(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		return bupSet.parallelStream().anyMatch(zv -> zoneVertex.equivalates(zv));
	}
}
