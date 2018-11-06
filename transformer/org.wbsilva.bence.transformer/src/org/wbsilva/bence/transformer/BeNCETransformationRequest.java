package org.wbsilva.bence.transformer;

import java.util.Map;

import org.wbsilva.bence.graphgrammar.Graph;

/**
 * A class for holding the request for a BeNCE TGG transformation
 * @author wbombardellis
 *
 */
public class BeNCETransformationRequest {
	
	private static final long DEFAULT_TIMEOUT = 0;
	
	private final Graph graph;
	private final Map<String, Integer> depths;
	private final long timeout;

	public BeNCETransformationRequest(final Graph graph, final Map<String, Integer> depths) {
		this.graph = graph;
		this.depths = depths;
		this.timeout = DEFAULT_TIMEOUT;
	}
	
	public BeNCETransformationRequest(final Graph graph, final Map<String, Integer> depths, final long timeout) {
		this.graph = graph;
		this.depths = depths;
		this.timeout = timeout;
	}
	
	public Graph getGraph() {
		return this.graph;
	}

	public Map<String, Integer> getDepths() {
		return this.depths;
	}
	
	public long getTimeout() {
		return this.timeout;
	}

}
