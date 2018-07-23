package org.wbsilva.bence.transformer;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
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
	 * Transform the eCore/EMF model {@code inputModel} of an arbitrary metamodel to a graph 
	 * of the Graphgrammar metamodel. Transform also recursively its children.
	 * 
	 * @param inputModel		Model to be transformed. Cannot be null.
	 * @return					A graph resultant from the transformation from {@code inputModel} 
	 * @see Graph
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
	 * Transform one eCore object {@code modelObject} into a vertex and its children recursively,
	 * creating also edges if necessary and add them to the {@code graph}, reusing symbols and 
	 * other already transformed vertices from {@code vertices} and {@code symbols}.
	 * 
	 * @param vertices		A map from the objects transformed so far to its correspondent vertices
	 * @param symbols		A map from the objects' classes transformed so far to its correspondents labels
	 * @param graph			The graph constructed so far, in which to add this vertex and its children as well as the edges 
	 * @param modelObject	The eCore object to be transformed
	 * @return				The vertex resultant from the transformation. Never null.
	 */
	private Vertex transformVertex(final ConcurrentHashMap<EObject, Vertex> vertices, final ConcurrentHashMap<EObject, Symbol> symbols, final Graph graph, final EObject modelObject) {
		//EObject not transformed to a symbol yet
		Vertex vertex = vertices.get(modelObject);
		if (vertex == null) {		
			vertex = GraphgrammarFactory.eINSTANCE.createVertex();
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
					
				} else if (childObject instanceof EList<?>){
					@SuppressWarnings("unchecked")
					EList<EObject> children = (EList<EObject>)childObject;
					for (EObject child : children) {
						final Vertex childVertex = transformVertex(vertices, symbols, graph, child);
						assert childVertex != null;
						
						transformEdge(symbols, graph, vertex, childVertex, containment);
					}
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
		} else {
			logger.debug(String.format("Element %s has already been transformed to the vertex with id: %s. Using it.", modelObject, vertex.getId()));
		}
		
		return vertex;
	}

	/**
	 * Create a directed edge from {@code from} to {@code to} and add it to {@code graph} reusing symbols from
	 * {@code symbols}
	 * 
	 * @param symbols			A map from the objects' classes transformed so far to its correspondents labels
	 * @param graph				The graph constructed so far, in which to add this edge
	 * @param from				The origin vertex
	 * @param to				The target vertex
	 * @param reference			The attribute of the source object of {@code from} holding the source object {@code to}
	 * @return					The new edge. Never null.
	 */
	private Edge transformEdge(final ConcurrentHashMap<EObject, Symbol> symbols, final Graph graph, final Vertex from, final Vertex to, final EReference reference) {
		logger.debug(String.format("Transforing edge from %s to %s", from.getId(), to.getId()));
		
		final Edge edge = GraphgrammarFactory.eINSTANCE.createEdge();
		edge.setFrom(from);
		edge.setTo(to);
		
		Symbol edgeLabel = symbols.get(reference);
		//EClass not transformed to a symbol yet
		if (edgeLabel == null) {
			edgeLabel = GraphgrammarFactory.eINSTANCE.createSymbol();
			edgeLabel.setName(reference.getName());
			
			symbols.put(reference, edgeLabel);
		}
		
		edge.setLabel(EcoreUtil.copy(edgeLabel));
		graph.getEdges().add(edge);
		
		return edge;
	}

	
}