package org.wbsilva.bence.transformer.parser;

import java.util.HashSet;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class ConnectedBup extends Bup {

	/**
	 * The graph referred by the zone vertices 
	 */
	private Graph graph;
	
	/**
	 * Same contract as {@link Bup#Bup(Set, int)}, except for the last argument
	 * 
	 * @param graph		The graph referred by the zone vertices in this bup
	 */
	public ConnectedBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final Graph graph) {
		super(initialSet, maximalSubsetSize);
		
		assert graph != null;
		this.graph = graph;
	}
	
	/**
	 * Evaluate if zone vertex {@code zv} has any connection to any zone vertex in {@code subset}.
	 * If positive, then {@code zv} may be added to {@code subset}, because it would still be a weakly connected
	 * subset of zone vertices (supposing {@code subset} is weakly connected, i.e. there is a path from any zone vertex
	 * to any zone vertex, ignoring edge directions or labels)
	 * 
	 * @param zv		The zone vertex to be evaluated. Never null.
	 * @param subset	The weakly connected subset to be evaluated. Never null. May be empty
	 * @return			True iff, {@code zv} may be added to {@code subset}
	 */
	@Override
	protected boolean passRestriction(final ZoneVertex zv, final Set<ZoneVertex> subset) {
		if (subset.isEmpty())
			return true;
		else
			return subset.stream()
				.anyMatch(z -> z.getVertices().stream()
								.anyMatch(v -> zv.getVertices().stream()
										.anyMatch(w -> this.graph.areNeighbors(v, w))));
	}

}
