package org.wbsilva.bence.transformer.parser;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.impl.ZoneVertexImpl;

/**
 * This class implements the bottom-up parsing set.
 * It basically stores a set of zone vertices generated during parsing
 * and retrieves subsets of it.
 * 
 * @author wbombardellis
 *
 */
public class Bup implements IBup{
	
	/**
	 * The set of zone vertices added so far to the bup
	 */
	protected final HashSet<ZoneVertex> bupSet;
	
	/**
	 * The current phase. This field stores how big the retrieved subsets should be at this time.
	 * The phase is used so that only the subsets are generated gradually (not all at a time)
	 * Moreover, the phase is necessary when new zone vertices are added to the {@code bupSet}, so that
	 * new subsets are created for the new state without losing the control of already retreived subsets.
	 * 
	 * @inv subsets[phase].all(s -> s.size == phase)
	 */
	protected int phase;
	
	/**
	 * The maximal desired size for the subsets that will be created and retrieved with {@link Bup#next()}
	 * This correspondts in this implementation to the last phase
	 * 
	 * @inv lastPhase() = maximalSubsetSize
	 * @inv phase <= maximalSubsetSize 
	 */
	private final int maximalSubsetSize;
	
	/**
	 * The subsets created from {@code bupSet} for the current {@code phase}
	 * Each element i of the list keeps the set of subsets of bupSet with size i
	 * 
	 * @example subsets[0] = {}; subsets[1] = {{a},{b}}; subsets[2] = {{a,b}} 
	 */
	protected final ArrayList<Set<Set<ZoneVertex>>> subsets;
	
	/**
	 * The queues consist of the subsets of each phase, that has not been retrieved yet.
	 * It serves to retrieved only unique subsets.
	 * Each element i of the list keeps the queue of subsets of bupSet with size i
	 * 
	 * @example queues[0] = [{}]; queues[1] = [{a},{b}]; queues[2] = [{a,b}]
	 */
	 protected final ArrayList<ArrayDeque<Set<ZoneVertex>>> queues;

	/**
	 * The root zone vertex for this Bup. If it generates something equivalent to {@code rootZV}, 
	 * then it means that is is finished parsing and it sets {@code successfullyParsed} as true
	 * 
	 *  @inv this->bupSet->contains(z | z.equivalates(rootZV)) == successfullyParsed
	 */
	private final ZoneVertex rootZV;
	private boolean successfullyParsed;
	
	/**
	 * Initialize the bup with {@code initialSet}. If it is null, treat it as an empty set.
	 * @param initialSet			The initial set of zone vertices to be used as bup set
	 * @param maximalSubsetSize		The desired maximal size for the bup's subsets that will be retrieved through {@link Bup#next()}
	 * @param root					The root zone vertex for this bup, so that it knows when it has successfuly finished the parsing
	 */
	public Bup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root) {
		if (initialSet != null)
			bupSet = new HashSet<>(initialSet);
		else
			bupSet = new HashSet<>();
		
		this.maximalSubsetSize = maximalSubsetSize; 
		
		phase = 0;
		successfullyParsed = false;
		rootZV = root;
		
		subsets = new ArrayList<>();
		queues = new ArrayList<>();
		
		//Phase zero's queue consists of the empty set
		final HashSet<Set<ZoneVertex>> ss0 = new HashSet<>(1);
		ss0.add (new HashSet<>(0));
		subsets.add(ss0); 
		queues.add(new ArrayDeque<>(ss0));
		
		/*if (1 <= lastPhase()) {
			//Add new subsets and queues
			final Set<Set<ZoneVertex>> newDinjunctSubsets = createNewSubsets(1, bupSet);
			subsets.add(newDinjunctSubsets);
			queues.add(new ArrayDeque<Set<ZoneVertex>>(newDinjunctSubsets));
			assert subsets.size() > 1;
			assert subsets.get(0).size() > 0;
			assert 1 == subsets.size() - 1;
		}*/
	}

	/**
	 * Add new subsets to the {@code subsets} as well as to the {@code queues} at the end of these lists
	 * That is, at the position corresponding to a new phase.
	 * 
	 * @param newSubsets	The set of subsets of zone vertices to be added to the end of the {@code subsets} and {@code queues} lists
	 */
	protected synchronized void addNewSubsetQueue(final Set<Set<ZoneVertex>> newSubsets) {
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
	protected synchronized Set<Set<ZoneVertex>> createNewSubsets(final int p, final HashSet<ZoneVertex> zoneVertices) {
		assert zoneVertices != null;
		assert p >= 0;
		assert p <= lastPhase() + 1;
		
		//newQueueSize = zoneVertices chooses phase
		final HashSet<Set<ZoneVertex>> newSubsets = new HashSet<>();
		
		if (p == 0) {
			newSubsets.add(new HashSet<>(0));
			
		} else {
			assert p > 0;
			final int previousPhase = p - 1;
			assert subsets.size() >= previousPhase;
			//assert queues.size() >= previousPhase;
			
			final Set<Set<ZoneVertex>> oldPhaseSubsets = subsets.get(previousPhase);
			final Set<Set<ZoneVertex>> thisPhaseSubsets = p < subsets.size() ? subsets.get(p) : new HashSet<>(0);
	
			//For each subset of the last phase
			final Iterator<Set<ZoneVertex>> it = oldPhaseSubsets.iterator();
			while (it.hasNext()) {
				final Set<ZoneVertex> ss = it.next();
				
				//Add each zone vertex of interest
				final Iterator<ZoneVertex> itt = zoneVertices.iterator();
				while(itt.hasNext()) {
					final ZoneVertex bup = itt.next();
					assert bup != null;
					
					if(!ss.contains(bup)) {
						final HashSet<ZoneVertex> newSs = new HashSet<>(ss);
						newSs.add(bup);
						
						//Do not add, if newSS is already in the current phase's subsets
						if (!thisPhaseSubsets.contains(newSs)) {
							newSubsets.add(newSs); //two sets with same bups are equal
						}
					}
				}
			}
		}
		
		return newSubsets.stream()
			.filter(ss -> {
				//Filter zone vertices with non-disjunct vertices out
				final int count = ss.stream().mapToInt(v -> v.getVertices().size()).reduce(0, (a,b)-> a+b);
				return count == ss.stream()
							.flatMap(zv -> zv.getVertices().stream().map(z -> z.getId()))
							.distinct()
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
	protected Set<Set<ZoneVertex>> createNewSubsets(int p, final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		return createNewSubsets(p, new HashSet<ZoneVertex>(Arrays.asList(zoneVertex)));
	}
	
	/**
	 * Return the number of the last phase
	 * @return			The last phase
	 */
	protected int lastPhase() {
		return this.maximalSubsetSize;
	}
	
	/**
	 * Check if this Bup is done with parsing, i.e. if it is has just inserted some zone vertex equivalent to {@code Bup#rootZV}
	 * If true, then set {@code Bup#successfullyParsed} as true, otherwise do nothing.
	 * 
	 * @param zoneVertex		The just added zone vertex to compare against the root {@code Bup#rootZV}
	 * @see Bup#isParsed()
	 */
	protected void checkIsParsed(final ZoneVertex zoneVertex) {
		//Got at the initial symbol, successfully parsed
		if (zoneVertex.equivalates(this.rootZV)) {
			this.successfullyParsed = true;
			assert this.contains(this.rootZV);
		}
	}

	/**
	 * Return true iff {@code zoneVertex} or any equivalent zone vertex is contained by the {@link Bup#bupSet}.
	 * @param zoneVertex	The zone vertex to be tested. Cannot be null.
	 * @return				True if {@link Bup#bupSet} contains any zone vertex equivalent to {@code zoneVertex}, false otherwise. 
	 * @see ZoneVertex#equivalates(ZoneVertex)
	 */
	@Override
	public synchronized boolean contains(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		return bupSet.stream().anyMatch(zv -> zoneVertex.equivalates(zv));
	}
	
	/**
	 * Add a new zone vertex {@code zoneVertex} to {@link Bup#bupSet}, if it has not been added yet
	 * and care to create new subsets for it.
	 * @param zoneVertex		The new zone vertex to be added. Cannot be null.
	 * @return					True iff {@code zoneVertex} has been added
	 */
	@Override
	public synchronized boolean add(final ZoneVertex zoneVertex) {
		assert zoneVertex != null;
		
		if (canAdd(zoneVertex)) {
			assert phase >= 0;
			assert phase <= subsets.size();
			assert phase <= lastPhase() + 1;
			
			//If it had already exhausted all phases or all subsets
			//if (phase > lastPhase() || phase >= subsets.size()) {
				//addNewSubsetQueue(new HashSet<Set<ZoneVertex>>(1));
			//}
			
			//Go back to the first phase and add new element to the bupSet
			//int oldPhase = phase;
			phase = 0;
			bupSet.add(zoneVertex);
			
			//assert subsets.size() > oldPhase;
			//assert queues.size() > oldPhase;
			
			//Regenerate all previous phases' subsets and queues
			for (int p = 0; p < subsets.size(); p++) {
				final Set<Set<ZoneVertex>> newSubsets = createNewSubsets(p, zoneVertex);
				
				subsets.get(p).addAll(newSubsets);
				queues.get(p).addAll(newSubsets);
			}
			
			checkIsParsed(zoneVertex);
			
			return true;
		} else { 
			return false;
		}
	}

	/**
	 * Return true iff {@code zonevertex} can be added to the bup
	 * @param zoneVertex		The zone vertex to be tested
	 * @return					True if {@code zonevertex} can be added, false otherwise.
	 * @see Bup#canAddEmptyZV()
	 */
	protected boolean canAdd(final ZoneVertex zoneVertex) {
		final boolean contained = this.contains(zoneVertex);
		//If not contained, or it is an empty production, then allow
		return !contained || (zoneVertex.getVertices().isEmpty() && canAddEmptyZV()); 
	}

	/**
	 * Return true iff it still is allowed to add empty zone vertice's
	 * @return		True if can add empty ZV. False otherwise
	 * @see Bup#canAdd(ZoneVertex)
	 */
	protected boolean canAddEmptyZV() {
		return this.bupSet.stream().filter(b -> b.getVertices().isEmpty()).count() < this.maximalSubsetSize;
	}

	/**
	 * Retrieve the next subset of bup, if it has a next. Empty otherwise
	 * 
	 * @return		The next subset of zone vertices of bup or empty, if reached the last phase
	 */
	@Override
	public synchronized Optional<Set<ZoneVertex>> next() {
		assert this.phase >= 0;
		assert this.subsets.size() >= this.phase;
		assert this.queues.size() == this.subsets.size();
		
		if (phase > lastPhase()) {
			return Optional.empty();
		} else { 
			assert this.phase <= lastPhase();
			
			//If we are at the next phase 
			if (phase >= subsets.size()) {
				//Add new subsets and queues
				final Set<Set<ZoneVertex>> newDinjunctSubsets = createNewSubsets(phase, bupSet);
				addNewSubsetQueue(newDinjunctSubsets);
				
				assert subsets.size() > 1;
				assert phase == subsets.size() - 1;
				assert queues.size() == subsets.size();
			}
			
			assert queues.get(phase) != null;
			
			//No more element in this phase. Go to the next
			if (queues.get(phase).isEmpty()) {
				phase++;
				//Recursive call to get the next at the next phase
				return next();
			} else {
				//Surely the recursion ends, because the phase will scale until the last phase,
				//when it stops
				final Set<ZoneVertex> ret = queues.get(phase).poll();
				assert ret != null;
				
				return Optional.of(ret);
			}
		}
	}

	/**
	 * Return true iff this Bup has generated the root subset, and thus has finished the parsing
	 * @return			True if this Bup is finished parsing, false otherwise 
	 */
	@Override
	public boolean isParsed() {
		return this.successfullyParsed;
	}

}
