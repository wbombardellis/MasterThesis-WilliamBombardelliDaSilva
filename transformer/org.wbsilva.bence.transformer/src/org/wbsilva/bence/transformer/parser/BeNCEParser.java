package org.wbsilva.bence.transformer.parser;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.transformer.BeNCETransformer;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class BeNCEParser {
	
	static final Logger logger = LogManager.getLogger(BeNCEParser.class);
	
	final Grammar grammar;
	
	public BeNCEParser(final Grammar grammar){
		this.grammar = grammar;
	}
	
	/**
	 * TODO
	 * @param graph
	 * @return
	 */
	public Optional<ParsingTree> parse(final Graph graph){
		assert graph != null;
		
		logger.debug(String.format("Starting parsing of the graph %s", graph.getId()));
		
		//Sanitize ids
		//ensureUniqueIds(graph);
		
		//Create bottom-up parse set
		final Bup bup = new Bup(zoneVertices(graph.getVertices()));
		
		//Forest of possible parsing trees
		final Set<ParsingTree> parsingForest = new HashSet<ParsingTree>();
		
		final ZoneVertex rootZV = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		rootZV.setId(EcoreUtil.generateUUID());
		rootZV.setLabel(grammar.getInitial());
		rootZV.getVertices().addAll(graph.getVertices());
		
		//Bottom-up loop to create all possible derivations
		while(bup.hasNext() && !bup.contains(rootZV)){
			//Select a handle
			final Set<ZoneVertex> handle = bup.next();					//R
			
			logger.debug(String.format("Selected handle {%s}", handle.stream()
					.map(z -> z.getLabel().getName()+", ")
					.reduce(String::concat)));
			
			for (final Symbol d : grammar.getNonterminals()) {
				
				logger.debug(String.format("Trying to reduce with symbol %s", d.getName()));
				
				final Graph handleGraph = zoneGraph(graph, handle);		//Z(R)
				final Graph rhs = induce(handleGraph, handle);			//Y(R)
				
				final ZoneVertex lhs = contract(d, handle);				//(d,V(R))
				final Graph reducedGraph = zoneGraph(graph, new HashSet<ZoneVertex>(Arrays.asList(lhs)));	//Z({(d,V(R)})
				
				//If handle can be reduced with rule (lhs -> rhs). I.e. if reducedGraph=>handleGraph
				final DerivationStep newDS = grammar.derives(reducedGraph, handleGraph, lhs, rhs);
				if (newDS != null) {
					//Possible derivation step found
					bup.add(lhs);
					
					logger.debug(String.format("Can reduce. Derivation step %s, %s", newDS.getRule().getName(), newDS.getVertex().getId()));
					
					//Construct parsing tree bottom-up 
					final ParsingTree parsingTreeNode = GraphgrammarFactory.eINSTANCE.createParsingTree();
					parsingTreeNode.setZoneVertex(lhs);
					parsingTreeNode.setDerivationStep(newDS);
					parsingTreeNode.getChildren().addAll(parsingForest.stream()
							.filter(pt -> handle.contains(pt.getZoneVertex()))
							.collect(Collectors.toSet()));
					//TODO: assert amount of children
					parsingForest.add(parsingTreeNode);
					
					logger.debug(String.format("Adding to the parsing forest the parsing tree %s => %s", newDS.getVertex().getId(),
							parsingTreeNode.getChildren().stream()
								.map(pt -> pt.getZoneVertex().getId()+", ")
								.reduce(String::concat)));
				}
			}
		}
		
		//Successfully parsed
		if (bup.contains(rootZV)) {
			final ParsingTree parsingTree = parsingForest.parallelStream()
					.filter(pt -> pt.getZoneVertex().equivalates(rootZV))
					.findAny()
					.orElse(null);
			assert parsingTree != null;
			
			logger.debug("Parsing finished successfully");
			return Optional.of(parsingTree);
		} else {
			logger.debug("Parsing finished unsuccessfully");
			return Optional.empty();
		}
	}

	private Graph zoneGraph(final Graph graph, final Set<ZoneVertex> zoneVertices) {
		final Graph zoneGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		zoneGraph.setId(EcoreUtil.generateUUID());
		
		//Add main zoneVertices R
		zoneGraph.getVertices().addAll(zoneVertices.stream()
				.map((ZoneVertex zv) -> EcoreUtil.copy(zv))
				.collect(Collectors.toSet()));
		
		//V(R)
		final Set<Vertex> vs = merge(zoneVertices);
		
		//Add the set of all neighbors of V(R)
		zoneGraph.getVertices().addAll(zoneVertices(graph.neighbors(new BasicEList<Vertex>(vs))));
		
		for(Vertex v : zoneGraph.getVertices()) {
			final Set<Edge> newEdges = zoneGraph.getVertices().stream()
				.filter(w -> v != w)
				.flatMap(w -> graph.getEdges().stream().filter(e -> edgeBetween(e, v, w)))
				.collect(Collectors.toSet());
			zoneGraph.getEdges().addAll(newEdges);
		}
		
		return zoneGraph;
	}
	
	private Set<ZoneVertex> zoneVertices(final EList<Vertex> simpleVertices) {
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

	private boolean edgeBetween(final Edge e, final Vertex v, final Vertex w){
		return (e.getFrom().getId().equals(v.getId()) && e.getTo().getId().equals(w.getId()))
				|| (e.getTo().getId().equals(v.getId()) && e.getFrom().getId().equals(w.getId()));
	}

	@SuppressWarnings("unchecked")
	private Graph induce(final Graph graph, final Set<ZoneVertex> retainSet) {
		//TODO: assert unique ids
		//TODO: assert graph is a zone graph
		
		final Set<String> retainIds = retainSet.stream()
				.map(v -> v.getId())
				.collect(Collectors.toSet());
		
		final Set<Vertex> retainedVertices = graph.getVertices().stream()
			.filter(v -> retainIds.contains(v.getId()))
			.collect(Collectors.toSet());
		
		Set<ZoneVertex> zv = new HashSet<ZoneVertex>((Collection<? extends ZoneVertex>) retainedVertices);
		
		return zoneGraph(graph, zv);
	}

	private ZoneVertex contract(final Symbol label, final Set<ZoneVertex> zoneVertices) {
		//TODO: Assert zoneVertices are disjunct
		final ZoneVertex zone = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		zone.setId(EcoreUtil.generateUUID());
		zone.setLabel(EcoreUtil.copy(label));
		
		//Merge all vertices from zoneVertices and copy them
		zone.getVertices().addAll(merge(zoneVertices));
		
		return zone;
	}

	private Set<Vertex> merge(final Set<ZoneVertex> zoneVertices) {
		//TODO: assert the vertices of zone vertices are not zone vertices
		return zoneVertices.stream()
			.flatMap(v -> v.getVertices().stream().map(w -> EcoreUtil.copy(w))) 
			.collect(Collectors.toSet());
	}
}
