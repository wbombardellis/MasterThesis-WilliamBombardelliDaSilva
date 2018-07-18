package org.wbsilva.bence.transformer;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

/**
 * This class implements a transformer between a general ECore model to a graph (from the Graphgrammar metamodel)
 * 
 * @author wbombardellis
 *
 */
public class ECore2GraphTransformer {

	static final Logger logger = LogManager.getLogger(ECore2GraphTransformer.class);
	
	/**
	 * TODO
	 * @param inputModel
	 * @return
	 */
	public Graph transform(final EObject inputModel) {
		assert inputModel != null;
		
		logger.debug(String.format("Starting transformation from the eCore input model %s to a graph", inputModel));
		
		final Graph graph = GraphgrammarFactory.eINSTANCE.createGraph();
		final ConcurrentHashMap<EObject, Symbol> symbols = new ConcurrentHashMap<>();
		final ConcurrentHashMap<EObject, Vertex> vertices = new ConcurrentHashMap<>();

		transformVertex(vertices, symbols, graph, inputModel);
		
		assert GraphgrammarUtil.isValidGraph(graph);
		return graph;
	}

	/**
	 * TODO
	 * @param graph
	 * @param childObject
	 * @return
	 */
	private Vertex transformVertex(final ConcurrentHashMap<EObject, Vertex> vertices, final ConcurrentHashMap<EObject, Symbol> symbols, final Graph graph, final EObject modelObject) {
		
		final Vertex vertex = GraphgrammarFactory.eINSTANCE.createVertex();
		vertex.setId(EcoreUtil.generateUUID());
		
		logger.debug(String.format("Transforing element %s to a vertex with id: %s", modelObject, vertex.getId()));
		
		final EClass eClass = modelObject.eClass();
		Symbol label = symbols.get(eClass);
		//EClass not transformed to a symbol yet
		if (label == null) {
			label = GraphgrammarFactory.eINSTANCE.createSymbol();
			label.setName(eClass.getName());
			
			symbols.put(eClass, label);
		}
		
		vertex.setLabel(EcoreUtil.copy(label));
		graph.getVertices().add(vertex);
		vertices.put(modelObject, vertex);
				
		//Processing of the contained children
		final List<EReference> containments = eClass.getEAllContainments();
		for (final EReference containment : containments) {
			final Object childObject = modelObject.eGet(containment);
			
			if (childObject instanceof EObject) {
				final Vertex childVertex = transformVertex(vertices, symbols, graph, (EObject) childObject);
				assert childVertex != null;
				
				transformEdge(symbols, graph, vertex, childVertex, containment);
				
			} else {
				logger.warn(String.format("Child object %s is not an EObject. Skipping it.", childObject));
			}
		}
		
		//Processing of the other (not contained) children
		final List<EReference> nonContainments = eClass.getEAllReferences().parallelStream()
				.filter(r -> !r.isContainment())
				.collect(Collectors.toList());
		for (final EReference reference : nonContainments) {
			final Object childObject = modelObject.eGet(reference);
			
			if (childObject instanceof EObject) {
				Vertex childVertex = vertices.get((EObject) childObject);
				//Vertex has not being transformed yet (e.g. model is not connected) 
				if (childVertex == null) {
					childVertex = transformVertex(vertices, symbols, graph, (EObject) childObject);					
				}
				assert childVertex != null;
				
				transformEdge(symbols, graph, vertex, childVertex, reference);
				
			} else {
				logger.debug(String.format("Child object %s is not an EObject. Skipping it.", childObject));
			}
		}
		
		return vertex;
	}

	/**
	 * TODO
	 * @param symbols
	 * @param graph
	 * @param from
	 * @param to
	 * @param toOriginalObject
	 * @return
	 */
	private Edge transformEdge(final ConcurrentHashMap<EObject, Symbol> symbols, final Graph graph, final Vertex from, final Vertex to, final EReference toOriginalObject) {
		logger.debug(String.format("Transforing edge from %s to %s", from.getId(), to.getId()));
		
		final Edge edge = GraphgrammarFactory.eINSTANCE.createEdge();
		edge.setFrom(from);
		edge.setTo(to);
		
		Symbol edgeLabel = symbols.get(toOriginalObject);
		//EClass not transformed to a symbol yet
		if (edgeLabel == null) {
			edgeLabel = GraphgrammarFactory.eINSTANCE.createSymbol();
			edgeLabel.setName(toOriginalObject.getName());
			
			symbols.put(toOriginalObject, edgeLabel);
		}
		
		edge.setLabel(EcoreUtil.copy(edgeLabel));
		graph.getEdges().add(edge);
		
		return edge;
	}

	
}
