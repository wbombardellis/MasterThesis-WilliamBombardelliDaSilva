package org.wbsilva.bence.transformer;

import java.util.Map;

import org.wbsilva.bence.graphgrammar.Graph;

/**
 * A class for holding the result of an ECore2Graph transformation
 * @author wbombardellis
 *
 */
public class E2GTransformationResult {

	private final Graph graph;
	private final Map<String, Integer> depths;

	public E2GTransformationResult(final Graph graph, final Map<String, Integer> depths) {
		this.graph = graph;
		this.depths = depths;
	}

	public Graph getGraph() {
		return graph;
	}

	public Map<String, Integer> getDepths() {
		return depths;
	}

}
