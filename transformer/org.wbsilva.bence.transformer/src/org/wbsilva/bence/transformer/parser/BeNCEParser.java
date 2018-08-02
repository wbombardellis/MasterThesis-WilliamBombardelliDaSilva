package org.wbsilva.bence.transformer.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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

/**
 * This class implements a B-eNCE graph parser.
 * @author wbombardellis
 *
 */
public class BeNCEParser {
	
	static final Logger logger = LogManager.getLogger(BeNCEParser.class);

	public enum Strategy{
		NAIVE,
		GREEDY;
	};
	
	private final Grammar grammar;

	private final Strategy strategy;
	
	public BeNCEParser(final Grammar grammar){
		this(grammar, Strategy.GREEDY);
	}
	
	public BeNCEParser(final Grammar grammar, final Strategy strategy){
		assert grammar != null;
		assert strategy != null;
		
		this.grammar = grammar;
		this.strategy = strategy;
	}
	
	/**
	 * Parse the input {@code graph} according to the {@code grammar} of this class.
	 * Returns a parsing tree if {@code graph} belongs to the language defined with the {@code grammar},
	 * otherwise empty.
	 * The parser works even if the grammar is ambiguous, in which case only one parsing tree is returned by this method.
	 * The graph has to be a valid boundary graph.
	 * The grammar has also to be valid and neighborhood preserving boundary.
	 *  
	 * @param graph			The graph to be parsed. Cannot be null
	 * @return				The parsing tree for the input {@code graph} and the {@code grammar} of this class. 
	 * 						Or empty if it is not part of the language.
	 */
	public Optional<ParsingTree> parse(final Graph graph){
		assert graph != null;
		assert GraphgrammarUtil.isValidGrammar(this.grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(this.grammar);
		assert GraphgrammarUtil.isValidGraph(graph);
		
		logger.debug(String.format("Starting parsing of the graph %s", graph));
		
		//If not all labels are terminals, return fail right away
		if (graph.getVertices().stream()
				.anyMatch(v -> !grammar.getTerminals().stream()
								.anyMatch(t -> t.equivalates(v.getLabel())))) {
			logger.debug(String.format("Not all vertices of the graph %s are terminal vertices. Cannot parse.", graph));
			return Optional.empty();
			
		} else {
			
			//Create bottom-up parse set
			final Set<ZoneVertex> initialZoneVertices = zoneVertices(graph.getVertices());
			
			final IBup bup;
			switch(this.strategy) {
			case NAIVE:
				bup = new Bup(initialZoneVertices);
			break;
			case GREEDY:
				bup = new GreedyBup(initialZoneVertices);
			break;
			default:
				logger.debug(String.format("Chosen strategy %s not implemented, falling back to %s.", this.strategy, Strategy.GREEDY));
				bup = new GreedyBup(initialZoneVertices);
			}
			logger.debug(String.format("Using strategy %s", this.strategy));
			
			//Forest of possible parsing trees
			final Set<ParsingTree> parsingForest = new HashSet<ParsingTree>();
			
			//Add these zone vertices to the parsing forest
			parsingForest.addAll(initialZoneVertices.stream().map(iZV -> {
				final ParsingTree pTNode = GraphgrammarFactory.eINSTANCE.createParsingTree();
				pTNode.setZoneVertex(iZV);
				return pTNode;
			}).collect(Collectors.toSet()));
			
			
			final ZoneVertex rootZV = GraphgrammarFactory.eINSTANCE.createZoneVertex();
			rootZV.setId(EcoreUtil.generateUUID());
			rootZV.setLabel(EcoreUtil.copy(grammar.getInitial()));
			rootZV.getVertices().addAll(EcoreUtil.copyAll(graph.getVertices()));
			
			//Bottom-up loop to create all possible derivations
			while(bup.hasNext() && !bup.contains(rootZV)){
				//Select a handle
				final Set<ZoneVertex> handle = bup.next();					//R
				assert !handle.isEmpty();
				
				logger.debug(String.format("Selected handle {%s}", handle.stream()
						.map(z -> String.format("%s:(%s, {%s})", z.getId(), z.getLabel(), z.getVertices().stream()
																.map(v -> v.getId())
																.reduce((a,b) -> a.concat(", ").concat(b))
																.orElse("")))
						.reduce((a,b) -> a.concat(", ").concat(b))
						.orElse("")));
				
				for (final Symbol d : grammar.getNonterminals()) {
					
					logger.debug(String.format("Trying to reduce with symbol %s", d));
					
					final Graph handleGraph = zoneGraph(graph, handle);		//Z(R)
					assert GraphgrammarUtil.isValidGraph(handleGraph);
					assert !handleGraph.getVertices().isEmpty();
					assert GraphgrammarUtil.isWeaklyConnectedGraph(handleGraph);
					//assert GraphgrammarUtil.isBoundaryGraph(handleGraph, this.grammar.getNonterminals());
					
					final Graph rhs = induce(handleGraph, handle);			//Y(R)
					assert GraphgrammarUtil.isValidGraph(rhs);
					assert !rhs.getVertices().isEmpty();
					//assert GraphgrammarUtil.isBoundaryGraph(rhs, this.grammar.getNonterminals());
					
					final ZoneVertex lhs = contract(d, handle);				//(d,V(R))
					assert !lhs.getVertices().isEmpty();
					
					final Graph reducedGraph = zoneGraph(graph, new HashSet<ZoneVertex>(Arrays.asList(lhs)));	//Z({(d,V(R)})
					assert GraphgrammarUtil.isValidGraph(reducedGraph);
					assert !reducedGraph.getVertices().isEmpty();
					assert GraphgrammarUtil.isWeaklyConnectedGraph(reducedGraph);
					//assert GraphgrammarUtil.isBoundaryGraph(reducedGraph, this.grammar.getNonterminals());
					
					//If handle can be reduced with rule (lhs -> rhs). I.e. if reducedGraph=>handleGraph
					final DerivationStep newDS = grammar.derives(reducedGraph, handleGraph, lhs, rhs);
					
					if (newDS != null) {
						assert GraphgrammarUtil.isValidDerivationStep(newDS);
						
						//Derivation must be neighborhood preserving
						if (NPUtil.isNeighborhoodPreserving(newDS)) {
						
							//Possible derivation step found
							bup.add(lhs);
							
							logger.debug(String.format("Can reduce. Derivation step %s, %s", newDS.getRule().getId(), newDS.getVertex().getId()));
							
							//Construct parsing tree bottom-up 
							final ParsingTree parsingTreeNode = GraphgrammarFactory.eINSTANCE.createParsingTree();
							parsingTreeNode.setZoneVertex(lhs);
							parsingTreeNode.setDerivationStep(newDS);
							parsingTreeNode.getChildren().addAll(EcoreUtil.copyAll(parsingForest.stream()
									.filter(pt -> handle.contains(pt.getZoneVertex()))
									.collect(Collectors.toSet())));
							assert parsingTreeNode.getChildren().size() == rhs.getVertices().size();
							
							parsingForest.add(parsingTreeNode);
							
							logger.debug(String.format("Adding to the parsing forest the parsing tree %s => [%s]", parsingTreeNode.getZoneVertex().getId(),
									parsingTreeNode.getChildren().stream()
										.map(pt -> pt.getZoneVertex().getId())
										.reduce((a,b) -> a.concat(", ").concat(b))
										.orElse("")));
						} else {
							logger.debug(String.format("Could reduce, but derivation step %s, %s is not neighborhood preserving", newDS.getRule().getName(), newDS.getVertex().getId()));
						}
					} else {
						logger.debug(String.format("Cannot reduce with symbol %s", d));
					}
				}
			}
			
			//Successfully parsed
			if (bup.contains(rootZV)) {
				final ParsingTree parsingTree = parsingForest.stream()
						.filter(pt -> pt.getZoneVertex().equivalates(rootZV))
						.findAny()
						.orElse(null);
				assert parsingTree != null;
				assert !parsingTree.getChildren().isEmpty();
				assert parsingTree.getDerivationStep() != null;
				
				logger.debug("Parsing finished successfully");
				return Optional.of(parsingTree);
			} else {
				logger.debug("Parsing finished unsuccessfully");
				return Optional.empty();
			}
		}
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
		
		//Add the set of all neighbors of V(R)
		zoneGraph.getVertices().addAll(zoneVertices(graph.neighborhood(new BasicEList<Vertex>(vs))));
		
		for(Vertex v : zoneGraph.getVertices()) {
			//Add edges between two zone vertices v and w, iff, any vertex of v is neighbor of w
			final Set<Edge> newEdges = zoneGraph.getVertices().stream()
				.filter(w -> v != w)
				.flatMap(w -> {
					final ZoneVertex zw = ((ZoneVertex)w);
					final ZoneVertex zv = ((ZoneVertex)v);
					final Set<Edge> es = new HashSet<Edge>(1);
					
					for (Vertex ww : zw.getVertices()) {
						for (Vertex vv : zv.getVertices()) {
							//Do only for in edges to not create duplicates
							es.addAll(graph.inEdges(ww).stream()
								.filter(ie -> ie.getFrom().getId().equals(vv.getId()))
								.map(ie -> {
									final Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
									e.setFrom(v);
									e.setTo(w);
									e.setLabel(EcoreUtil.copy(ie.getLabel()));
									return e;
								})
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
	 * @param simpleVertices	The list of (not zone) vertices that are to be copied into zone vertices. Cannot be null.
	 * @return					The set of zone vertices.
	 */
	Set<ZoneVertex> zoneVertices(final EList<Vertex> simpleVertices) {
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
	@SuppressWarnings("unchecked")
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
		assert mergedVertices.stream()
			.map(zv -> zv.getId()).distinct().count() == mergedVertices.size();
		
		zone.getVertices().addAll(mergedVertices);
		
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
}
