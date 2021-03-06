package org.wbsilva.bence.transformer.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.graphgrammar.util.NPUtil;
import org.wbsilva.bence.graphgrammar.util.SymbolSet;

/**
 * This class implements a B-eNCE graph parser.
 * @author wbombardellis
 *
 */
public class BeNCEParser {
	
	static final Logger logger = LogManager.getLogger(BeNCEParser.class);

	private static final int DEFAULT_THREAD_COUNT = 4;

	public enum Strategy{
		NAIVE,
		GREEDY,
		GREEDY_AWARE;
	};
	
	private final Grammar grammar;
	
	/**
	 * The maximal size of the grammar's rules
	 */
	private final int maxr;

	private final Strategy strategy;
	
	/**
	 * The thread that performs the main loop of the parsing, trying to reduce the handles 
	 * and create the parsing forest. 
	 */
	private class BupReducer extends Thread {
		private final IBup bup;
		private final Graph graph;
		private final Grammar grammar;
		private final Set<ParsingTree> parsingForest;
		private boolean abort = false;
		
		private BupReducer(final IBup bup, final Graph graph, final Grammar grammar, final Set<ParsingTree> parsingForest) {
			this.bup = bup;
			this.graph = graph;
			this.grammar = grammar;
			this.parsingForest = parsingForest;
		}
		
		/**
		 * Consume the subsets from {@code BupReducer#bup}, that is shared with other BupReduces threads and that produces new subsets
		 * under necessity and according to its strategy.
		 * If it finds a reduction, then add the handle to {@code BupReducer#bup} and add a parsing tree to {@code BupReducer#parsingForest}
		 * This implementation is deadlock-free and takes care to keep shared data consistent between the threads,
		 * although the execution order is non-deterministic. 
		 */
		public void run() {
			Optional<Set<ZoneVertex>> nextHandle = this.bup.next();
			while(nextHandle.isPresent() && !this.bup.isParsed() && !this.abort){
				final Set<ZoneVertex> handle = nextHandle.get(); 			//R
				
				logger.debug(String.format("Selected handle {%s}", handle.stream()
						.map(z -> String.format("%s:(%s, {%s})", z.getId(), z.getLabel(), z.getVertices().stream()
																.map(v -> v.getId())
																.reduce((a,b) -> a.concat(", ").concat(b))
																.orElse("")))
						.reduce((a,b) -> a.concat(", ").concat(b))
						.orElse("")));
					
				final Graph handleGraph = zoneGraph(this.graph, handle);		//Z(R)
				assert GraphgrammarUtil.isValidGraph(handleGraph);
				
				final Graph rhs = induce(handleGraph, handle);			//Y(R)
				assert GraphgrammarUtil.isValidGraph(rhs);
					
				for (final Symbol d : this.grammar.getNonterminals()) {
					logger.debug(String.format("Trying to reduce with symbol %s", d));
					
					final ZoneVertex lhs = contract(d, handle);				//(d,V(R))
					assert lhs != null;
					
					final Graph reducedGraph = zoneGraph(this.graph, new HashSet<ZoneVertex>(Arrays.asList(lhs)));	//Z({(d,V(R)})
					assert GraphgrammarUtil.isValidGraph(reducedGraph);
					
					//If handle can be reduced with rule (lhs -> rhs). I.e. if reducedGraph=>handleGraph
					final DerivationStep newDS = this.grammar.derives(reducedGraph, handleGraph, lhs, rhs);
					
					if (newDS != null) {
						assert GraphgrammarUtil.isValidDerivationStep(newDS);
						
						//Derivation must be neighborhood preserving
						if (NPUtil.isNeighborhoodPreserving(newDS)) {
							assert GraphgrammarUtil.isBoundaryGraph(reducedGraph, this.grammar.getNonterminals());
						
							synchronized(this.parsingForest) {
								//Possible derivation step found
								final ZoneVertex consumedLhs = configurePac(lhs, newDS);
								assert consumedLhs != null;
								final boolean added = this.bup.add(consumedLhs);
								
								if (added) {
									logger.debug(String.format("Can reduce. Derivation step %s, %s", newDS.getRule().getId(), newDS.getVertex().getId()));
									
									//Construct parsing tree bottom-up 
									final ParsingTree parsingTreeNode = GraphgrammarFactory.eINSTANCE.createParsingTree();
									parsingTreeNode.setZoneVertex(consumedLhs);
									parsingTreeNode.setDerivationStep(newDS);
								
									parsingTreeNode.getChildren().addAll(EcoreUtil.copyAll(this.parsingForest.stream()
											.filter(pt -> handle.contains(pt.getZoneVertex()))
											.collect(Collectors.toSet())));
									assert parsingTreeNode.getChildren().size() == rhs.getVertices().size();
									
									this.parsingForest.add(parsingTreeNode);
								
									logger.debug(String.format("Adding to the parsing forest the parsing tree %s => [%s]", parsingTreeNode.getZoneVertex().getId(),
										parsingTreeNode.getChildren().stream()
											.map(pt -> pt.getZoneVertex().getId())
											.reduce((a,b) -> a.concat(", ").concat(b))
											.orElse("")));
								} else {
									logger.debug(String.format("Can reduce but cannot add to Bup. LHS %s, %s", lhs.getLabel(), lhs.getId()));
								}
							}
						} else {
							logger.debug(String.format("Could reduce, but derivation step %s, %s is not neighborhood preserving", newDS.getRule().getName(), newDS.getVertex().getId()));
						}
					} else {
						logger.debug(String.format("Cannot reduce with symbol %s", d));
					}
				}

				//Select next handle
				nextHandle = this.bup.next();
			}
			assert !nextHandle.isPresent() || this.bup.isParsed();
		}
		
		/**
		 * Abort this BupReducer. This method does not interrupts this reducer immediately.
		 * Instead, it causes it to jump out of the parsing loop in the sooner chance it has.
		 * Thus, it assures that this reducer will finish as soon as it can (i.e this thread will die as soon as possible)
		 * If this thread is not alive anymore, a call to {@link BupReducer#abort} has no effect
		 */
		public synchronized void abort() {
			if (this.isAlive())
				this.abort = true;
		}

		/**
		 * Return true iff this reducer was aborted manually through a call to {@link BupReducer#abort}
		 * @return			True if this thread was aborted, false otherwise
		 */
		public boolean isAborted() {
			return this.abort;
		}
	}
	
	public BeNCEParser(final Grammar grammar){
		this(grammar, Strategy.GREEDY_AWARE);
	}

	public BeNCEParser(final Grammar grammar, final Strategy strategy){
		assert grammar != null;
		assert strategy != null;
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);
		
		this.grammar = grammar;
		this.strategy = strategy;
		
		this.maxr = this.grammar.getRules().stream()
				.mapToInt(r -> r.getRhs().getVertices().size())
				.max()
				.orElse(0);
	}
	
	/**
	 * Parse the input {@code graph} according to the {@code grammar} of this class.
	 * Returns a parsing tree if {@code graph} belongs to the language defined with the {@code grammar},
	 * otherwise empty.
	 * The parser works even if the grammar is ambiguous, in which case only one parsing tree is returned by this method.
	 * The graph has to be a valid boundary graph.
	 * The grammar has also to be valid and neighborhood preserving boundary.
	 * The depth of a vertex v can be seen as some kind of distance from v to the graph's root, supposing the graph has a root
	 * or a pseudoroot, that was e.g. the first vertex to be load. It cannot contain ids that are not in the graph. 
	 * It does not need to contain the depth of all vertices, though.
	 * The parameter {@code threadCount} informs the amount of threads to be instanced for the parsing.
	 * If the parameter {@code timeout} is greater than zero, then the parsing procedure is aborted as soon as this time interval
	 * has been reached. If it is less or equal to zero, then the parsing procedure executes until the end and is guaranteed to finish
	 * in a finite time.
	 *  
	 * @param graph			The graph to be parsed. Cannot be null
	 * @param depths		The depth of each vertex of {@code graph}, mapped by its id. Cannot be null. May be empty.
	 * @param threadCount	The amount of thread to use for the parsing
	 * @param timeout		The maximal time interval to wait for the parsing to be completed, in milliseconds.
	 * @return				The parsing tree for the input {@code graph} and the {@code grammar} of this class. 
	 * 						Or empty if it is not part of the language or the timeout was reached.
	 */
	public Optional<ParsingTree> parse(final Graph graph, final Map<String, Integer> depths, int threadCount, long timeout) {
		assert graph != null;
		assert depths != null;
		assert GraphgrammarUtil.isValidGraph(graph);
		assert depths.size() == graph.getVertices().size();
		assert depths.entrySet().stream()
				.noneMatch(e -> !graph.getVertices().stream()
									.map(v -> v.getId())
									.collect(Collectors.toSet())
									.contains(e.getKey()));
		
		long start = System.nanoTime();
		
		if (threadCount <= 0) {
			threadCount = DEFAULT_THREAD_COUNT;
		}
		if (timeout < 0) {
			timeout = 0;
		}
		
		logger.debug(String.format("Starting parsing of the graph %s with %d threads", graph, threadCount));
		
		//If not all labels are terminals, return fail right away
		if (graph.getVertices().stream()
				.anyMatch(v -> !grammar.getTerminals().stream()
								.anyMatch(t -> t.equivalates(v.getLabel())))) {
			logger.debug(String.format("Not all vertices of the graph %s are terminal vertices. Cannot parse.", graph));
			return Optional.empty();
			
		} else if (graph.getEdges().stream()
				.anyMatch(e -> !grammar.getTerminals().stream()
						.anyMatch(t -> t.equivalates(e.getLabel())))) {
			logger.debug(String.format("Not all edges of the graph %s are terminal edges. Cannot parse.", graph));
			return Optional.empty();
		} else {
			//Create bottom-up parse set
			final Set<ZoneVertex> initialZoneVertices = zoneVertices(graph.getVertices());
			
			final ZoneVertex rootZV = GraphgrammarFactory.eINSTANCE.createZoneVertex();
			rootZV.setId(EcoreUtil.generateUUID());
			rootZV.setLabel(EcoreUtil.copy(grammar.getInitial()));
			rootZV.getVertices().addAll(EcoreUtil.copyAll(graph.getVertices()));
			
			final IBup bup;
			switch(this.strategy) {
			case NAIVE:
				bup = new Bup(initialZoneVertices, this.maxr, rootZV);
				logger.debug(String.format("Using strategy %s", this.strategy));
			break;
			case GREEDY:
				bup = new GreedyBup(initialZoneVertices, this.maxr, rootZV);
				logger.debug(String.format("Using strategy %s", this.strategy));
			break;
			case GREEDY_AWARE:
				bup = new GreedyAwareBup(initialZoneVertices, this.maxr, rootZV, this.grammar, graph, depths);
				logger.debug(String.format("Using strategy %s", this.strategy));
			break;
			default:
				assert false;
				logger.debug(String.format("Chosen strategy %s not implemented, falling back to %s.", this.strategy, Strategy.GREEDY));
				bup = new GreedyBup(initialZoneVertices, this.maxr, rootZV);
			}
			
			//Forest of possible parsing trees
			final Set<ParsingTree> parsingForest = new HashSet<ParsingTree>();
			
			//Add these zone vertices to the parsing forest
			parsingForest.addAll(initialZoneVertices.stream().map(iZV -> {
				final ParsingTree pTNode = GraphgrammarFactory.eINSTANCE.createParsingTree();
				pTNode.setZoneVertex(iZV);
				return pTNode;
			}).collect(Collectors.toSet()));
			
			//Parallel bottom-up loop to create possible derivations
			final List<BupReducer> bupReducers = new ArrayList<>(threadCount);
			for (int i = 0; i < threadCount; i++) {
				bupReducers.add(new BupReducer(bup, graph, this.grammar, parsingForest));
			}
			
			//Start actual parsing
			bupReducers.forEach(b -> b.start());
			
			//Wait for all to finish
			for (BupReducer b : bupReducers) {
				try {
					//With timeout
					if (timeout > 0) {
						final long elapsed = (System.nanoTime() - start) / (long) 1e6; 
						final long rest = timeout - elapsed;
						
						//No time available anymore, abort
						if (rest <= 0) {
							b.abort();
						} else {
							//Wait the available rest time and abort
							b.join(rest);
							b.abort();
						}
					}
					
					//With or without timeout, wait for all threads to die, all in all
					b.join();
					
				} catch (InterruptedException e) {
					//Log and survive for failure tolerance
					logger.error(e);
				}
			}

			if (bup.isParsed()) {
				final ParsingTree parsingTree = parsingForest.stream()
						.filter(pt -> pt.getZoneVertex().equivalates(rootZV))
						.findAny()
						.orElse(null);
				assert parsingTree != null;
				assert !parsingTree.getChildren().isEmpty();
				assert parsingTree.getDerivationStep() != null;
				
				logger.debug("Parsing finished successfully");
				return Optional.of(parsingTree);
			} else if (bupReducers.stream().anyMatch(b -> b.isAborted())){
				logger.debug("Parsing timed out");
				return Optional.empty();
			} else {
				logger.debug("Parsing finished unsuccessfully");
				return Optional.empty();
			}
		}
	}
	
	/**
	 * Same contract as {@link BeNCEParser#parse(Graph, Map, int)} except that it uses the default thread count
	 * @see BeNCEParser#parse(Graph, Map, int, long)
	 */
	public Optional<ParsingTree> parse(final Graph graph, final Map<String, Integer> depths, final long timeout) {
		return this.parse(graph, depths, DEFAULT_THREAD_COUNT, timeout);
	}

	/**
	 * Create the zone graph for the zone vertices {@code zoneVertices} from {@code graph}.
	 * That is, Z(R) with R being the zone vertices.
	 * If {@code zoneVertices} are empty, than return an empty graph (not null).
	 *  
	 * @param graph				The graph containing the vertices referred by the zone vertices. Cannot be null.
	 * @param zoneVertices		The zone vertices that go into the zone graph. Cannot be null. May be empty.
	 * @return					The zone graph with the zone vertices {@code zoneVertices} 
	 * 							plus their neighbors in {@code graph}.
	 */
	Graph zoneGraph(final Graph graph, final Set<ZoneVertex> zoneVertices) {
		assert graph != null;
		assert zoneVertices != null;
		
		final Graph zoneGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		
		assert zoneVertices.stream().map(v -> v.getId()).distinct().count() == 
				zoneVertices.size();
		
		//Add main zoneVertices R
		zoneGraph.getVertices().addAll(zoneVertices.stream()
				.map((ZoneVertex zv) -> EcoreUtil.copy(zv))
				.collect(Collectors.toSet()));
		
		//V(R)
		final Set<Vertex> vs = merge(zoneVertices);
		
		final Set<String> pacIds = zoneVertices.stream()
				.flatMap(zv -> zv.getPac().stream()
								.map(p -> p.getId()))
				.collect(Collectors.toSet());
		
		//Add the set of all neighbors of V(R) minus the PACs
		final Set<Vertex> neighbors = graph.neighborhood(new BasicEList<Vertex>(vs)).stream()
				.filter(v -> !pacIds.contains(v.getId()))
				.collect(Collectors.toSet());
		zoneGraph.getVertices().addAll(zoneVertices(neighbors));
		
		for(Vertex v : zoneGraph.getVertices()) {
			//Add edges between two zone vertices v and w, iff, any vertex of v is neighbor of w
			final Set<Edge> newEdges = zoneGraph.getVertices().stream()
				.filter(w -> v != w)
				.flatMap(w -> {
					final ZoneVertex zw = ((ZoneVertex)w);
					final ZoneVertex zv = ((ZoneVertex)v);
					final Set<Edge> es = new HashSet<Edge>(1);
					final SymbolSet addedLabels = new SymbolSet();
					//Control to not edges that go or come from a pac
					final Set<String> pacs = zw.getPac().stream()
												.map(p -> p.getId())
												.collect(Collectors.toSet());
					pacs.addAll(zv.getPac().stream()
									.map(p -> p.getId())
									.collect(Collectors.toSet()));
					
					for (Vertex ww : zw.getVertices()) {
						for (Vertex vv : zv.getVertices()) {
							assert !(ww instanceof ZoneVertex);
							assert !(vv instanceof ZoneVertex);
							
							//Do only for in edges to not create duplicates
							final Set<Edge> newEs = graph.inEdges(ww).stream()
									.filter(ie -> ie.getFrom().getId().equals(vv.getId())
											&& !pacs.contains(ie.getFrom().getId())
											&& !pacs.contains(ie.getTo().getId())
											&& !addedLabels.contains(ie.getLabel()))
									.map(ie -> {
										final Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
										e.setFrom(zv);
										e.setTo(zw);
										e.setLabel(EcoreUtil.copy(ie.getLabel()));
										return e;
									})
									.collect(Collectors.toSet());
							es.addAll(newEs);
							//Remember added labels between zw and zv to disallow duplicate vertices (multivertices)
							addedLabels.addAll(newEs.stream()
									.map(e -> e.getLabel())
									.collect(Collectors.toSet()));
						}
					}
					return es.stream();
				})
				.collect(Collectors.toSet());
			
			zoneGraph.getEdges().addAll(newEdges);
		}
		
		return zoneGraph;
	}
	
	/**
	 * Return a set of zone vertices, one for each {@code simpleVertices}, with new IDs and copied vertex and label.
	 * If {@code simpleVertices} are empty, return an empty set.
	 * 
	 * @param simpleVertices	The collection of (not zone) vertices that are to be copied into zone vertices. Cannot be null.
	 * @return					The set of zone vertices.
	 */
	Set<ZoneVertex> zoneVertices(final Collection<Vertex> simpleVertices) {
		assert simpleVertices != null;
		
		return simpleVertices.stream()
			.map((Vertex v) -> {
				final ZoneVertex z = GraphgrammarFactory.eINSTANCE.createZoneVertex();
				z.setId(EcoreUtil.generateUUID());
				z.getVertices().add(EcoreUtil.copy(v));
				z.setLabel(EcoreUtil.copy(v.getLabel()));
				return z;
			})
			.collect(Collectors.toSet());
	}

	/**
	 * Return true iff the edge {@code e} is between the vertices {@code v} and {@code w} (using IDs as identifiers).
	 * That is, true if e = (v,w) or e = (w,v). False otherwise.
	 * Important: This method uses the IDs of the vertices as their identifiers, 
	 * instead of their objects.
	 * If edge has one end valued with null or if any vertex has null ID, then return false.
	 * 
	 * @param e		The edge. Cannot be null.
	 * @param v		The one vertex. Cannot be null.
	 * @param w		The other vertex. Cannot be null.
	 * @return		True iff {@code e} is an edge connecting {@code v} and {@code w}
	 */
	boolean edgeBetween(final Edge e, final Vertex v, final Vertex w){
		assert e != null;
		assert v != null;
		assert w != null;
		
		if (e.getFrom() == null || e.getTo() == null 
				|| e.getFrom().getId() == null || e.getTo().getId() == null
				|| v.getId() == null || w.getId() == null) {
			return false;
		} else {
			return (e.getFrom().getId().equals(v.getId()) && e.getTo().getId().equals(w.getId()))
				|| (e.getTo().getId().equals(v.getId()) && e.getFrom().getId().equals(w.getId()));
		}
	}

	/**
	 * Return the zone graph induced by the IDs of the zone vertices in {@code retainSet} from the zone graph {@code graph}.
	 * That is, Y(R) where R is the zone vertices in {@code retainSet}.
	 * The induction of a graph consists basically of creating a new zone graph using only 
	 * the vertices in {@code retainSet} (without the inclusion of further neighbors).
	 * If {@code retainSet} is empty, then return an empty zone graph.
	 *    
	 * @param graph			The zone graph containing the vertices used to induce the new zone graph. Cannot be null.
	 * @param retainSet		The zone vertices with the IDs of the vertices used to induce the new zone graph. Cannot be null.
	 * @return				The zone graph induced from {@code graph} by the vertices with IDs in {@code retainSet}
	 */
	Graph induce(final Graph graph, final Set<ZoneVertex> retainSet) {
		assert graph != null;
		assert retainSet != null;
		
		//Assert unique ids
		assert graph.getVertices().stream().map(v -> v.getId()).distinct().count() == 
				graph.getVertices().size();
		
		//Assert graph is a zone graph
		assert graph.getVertices().stream()
			.allMatch(v -> v instanceof ZoneVertex);
		
		final Set<String> retainIds = retainSet.stream()
				.map(v -> v.getId())
				.collect(Collectors.toSet());
		assert retainIds.size() == retainSet.size();
		
		//R
		final Set<Vertex> retainedVertices = graph.getVertices().stream()
			.filter(v -> retainIds.contains(v.getId()))
			.collect(Collectors.toSet());
		
		
		final Graph zoneGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		
		//Add main zoneVertices R
		zoneGraph.getVertices().addAll(retainedVertices.stream()
				.map(zv -> EcoreUtil.copy(zv))
				.collect(Collectors.toSet()));
		
		//The edges within R
		final Set<Edge> retainedEdges = graph.getEdges().stream()
				.filter(e -> retainedVertices.contains(e.getFrom()) && retainedVertices.contains(e.getTo()))
				.map(e -> {
					final Edge ee = EcoreUtil.copy(e);
					ee.setFrom(zoneGraph.getVertices().stream()
							.filter(v -> v.getId().equals(e.getFrom().getId()))
							.findAny()
							.orElse(null));
					ee.setTo(zoneGraph.getVertices().stream()
							.filter(v -> v.getId().equals(e.getTo().getId()))
							.findAny()
							.orElse(null));
					return ee;
				})
				.collect(Collectors.toSet());
		
		zoneGraph.getEdges().addAll(retainedEdges);
		
		
		return zoneGraph;
	}

	/**
	 * Contract the vertices in {@code zoneVertices} into a new zone vertex with label {@code label}.
	 * Return a new zone vertex, in which both the label and the vertices are copied from the arguments.
	 * If {@code zoneVertices} are emtpy, return a new zone vertex with no vertices inside.
	 * 
	 * @param label				The label of the new zone vertex. Cannot be null.
	 * @param zoneVertices		The set of zone vertices, from which to obtain the vertices that go into the new zone vertex. Cannot be null.
	 * @return					A new zone vertex containing copies of the vertices that are in the zone vertices {@code zoneVertices} and label {@code label}
	 */
	ZoneVertex contract(final Symbol label, final Set<ZoneVertex> zoneVertices) {
		assert label != null;
		assert zoneVertices != null;
		
		final ZoneVertex zone = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		zone.setId(EcoreUtil.generateUUID());
		zone.setLabel(EcoreUtil.copy(label));
		
		//Merge all vertices from zoneVertices and copy them
		final Set<Vertex> mergedVertices = merge(zoneVertices);
		//Assert zoneVertices are disjunct
		final Set<String> mergedVerticesIds = mergedVertices.stream()
							.map(zv -> zv.getId())
							.collect(Collectors.toSet());
		assert mergedVerticesIds.size() == mergedVertices.size();
		
		zone.getVertices().addAll(mergedVertices);
		
		//Merge also all pacs that are not vertices and copy them
		final Set<Vertex> pacs = zoneVertices.stream()
				.flatMap(v -> v.getPac().stream())
				.filter(p -> !mergedVerticesIds.contains(p.getId()))
				.collect(Collectors.toSet());
		//But only distinct pacs
		final Set<Vertex> mergedPacs = new HashSet<>(pacs.size());
		final Set<String> mergedPacsIds = new HashSet<>(pacs.size());
		for (Vertex p : pacs) {
			if (!mergedPacsIds.contains(p.getId())) {
				mergedPacs.add(EcoreUtil.copy(p));
				mergedPacsIds.add(p.getId());
			}
		}
		zone.getPac().addAll(mergedPacs);
		
		return zone;
	}

	/**
	 * Return the set of vertices that are contained by the zone vertices {@code zoneVertices}.
	 * Vertices are copied.
	 * 
	 * @param zoneVertices		The zone vertices from which to obtain the vertices. Cannot be null.
	 * @return					The set of vertices copied from {@code zoneVertices}
	 */
	Set<Vertex> merge(final Set<ZoneVertex> zoneVertices) {
		assert zoneVertices != null;
		assert zoneVertices.stream().noneMatch(zv -> zv.getVertices() instanceof ZoneVertex);
		
		return zoneVertices.stream()
			.flatMap(v -> v.getVertices().stream().map(w -> EcoreUtil.copy(w))) 
			.collect(Collectors.toSet());
	}
	
	/**
	 * Move vertices that are inside {@code zoneVertex} to its set of pacs, according to the
	 * pac vertices of the rule in {@code dStep}. Ensure a correct configuration of {@code zoneVertex},
	 * without duplicate pacs.  
	 * @param zoneVertex		The zone vertex to be configured for PAC, according to {@code dStep}. Important: This object is modified.
	 * @param dStep				The derivation step whose vertex is {@code zoneVertex}
	 * @return					The {@code zoneVertex} with its Pac attribute configured properly, according to
	 * 							the pac in the rule of {@code dStep}. Important: The returned object is the same instance as {@code zoneVertex},
	 * 							that is, data is not copied.
	 */
	ZoneVertex configurePac(final ZoneVertex zoneVertex, final DerivationStep dStep) {
		assert zoneVertex != null;
		assert zoneVertex.getVertices().stream().noneMatch(v -> v instanceof ZoneVertex);
		assert dStep != null;
		assert dStep.getVertex().getId().equals(zoneVertex.getId());
		
		final List<Vertex> pacs = dStep.getRule().getPac();
		//Derivation includes pacs, that are 1-sized zone vertices
		assert pacs.stream()
					.allMatch(p -> dStep.getUnifier().get(p) instanceof ZoneVertex 
							&& ((ZoneVertex)dStep.getUnifier().get(p)).getVertices().size() == 1);
		
		final Set<String> realPacIds = pacs.stream()
				.map(p -> ((ZoneVertex)dStep.getUnifier().get(p)).getVertices().get(0).getId())
				.collect(Collectors.toSet());
		assert realPacIds.size() == pacs.size();
		
		final Set<Vertex> realPacs = zoneVertex.getVertices().stream()
				.filter(h -> realPacIds.contains(h.getId()))
				.collect(Collectors.toSet());
		assert realPacs.size() == pacs.size();
		
		final boolean removed = zoneVertex.getVertices().removeAll(realPacs);
		assert realPacs.size() > 0 ? removed : true;
		
		//But only distinct pacs
		final Set<Vertex> uniquePacs = new HashSet<>(realPacs.size());
		final Set<String> uniquePacsIds = zoneVertex.getPac().stream().map(p -> p.getId()).collect(Collectors.toSet());
		for (Vertex p : realPacs) {
			if (!uniquePacsIds.contains(p.getId())) {
				uniquePacs.add(p);
				uniquePacsIds.add(p.getId());
			}
		}
		zoneVertex.getPac().addAll(uniquePacs);
		
		assert pacs.size() <= zoneVertex.getPac().size();
		
		return zoneVertex;
	}

}
