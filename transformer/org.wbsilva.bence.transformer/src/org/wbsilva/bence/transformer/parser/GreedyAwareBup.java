package org.wbsilva.bence.transformer.parser;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.transformer.ECore2GraphTransformer;

/**
 * This extension of {@linkplain GreedyBup} is aware of the grammar and graph being used by the parser and can optimize
 * its decisions to provide subsets that will result in faster execution of the parser.
 * 
 * @author wbombardellis
 *
 */
public class GreedyAwareBup extends GreedyBup {

	/**
	 * The grammar for which the generated subsets will be used
	 */
	final protected Grammar grammar;
	
	/**
	 * The graph to which the vertices in the zone vertices belong. Used for heuristics only.
	 */
	final protected Graph graph;

	/**
	 * The taboo list of subsset's size, which are not allowed to be created
	 */
	private final Set<Integer> tabooSubsetsSize;
	
	/**
	 * Initialize the bup with {@code initialSet}. If it is null, treat it as an empty set.
	 * @param initialSet			The initial set of zone vertices to be used as bup set
	 * @param maximalSubsetSize		The desired maximal size for the bup's subsets that will be retrieved through {@link Bup#next()}
	 * @param root					The root zone vertex for this bup, so that it knows when it has successfuly finished the parsing
	 * @param grammar				The grammar for which the generated subsets will be used
	 * @param graph					The graph to which the vertices in the zone vertices belong
	 */
	public GreedyAwareBup(final Set<ZoneVertex> initialSet, final int maximalSubsetSize, final ZoneVertex root, final Grammar grammar, final Graph graph, ECore2GraphTransformer eT) {
		super(initialSet, maximalSubsetSize, root, graph, eT);

		assert grammar != null;
		assert graph != null;
		this.grammar = grammar;
		this.graph = graph;
		
		assert maximalSubsetSize >= 0;
		
		//If the grammar has no rule with RHS's size equal to n, then n goes in the taboo for subset sizes (0 and 1 are never taboo)
		final IntStream possibleSizes = IntStream.rangeClosed(2, maximalSubsetSize);
		final Set<Integer> grammarRuleSizes = grammar.getRules().stream()
				.map(r -> r.getRhs().getVertices().size())
				.distinct()
				.collect(Collectors.toSet());
		this.tabooSubsetsSize = possibleSizes
				.filter(s -> !grammarRuleSizes.contains(s))
				.mapToObj(s -> new Integer(s))
				.collect(Collectors.toSet());
		assert this.tabooSubsetsSize.size() <= grammarRuleSizes.size();
	}
	
	/**
	 * Return whether a subset with size {@code p} can be enqueued or not
	 * @param p			The size of the subset to be created and added to the queues
	 * @return			True iff {@code grammar} has at least a rule with RHS's size equal to {@code p} 
	 */
	protected boolean canEnqueue(final int p) {
		return !this.tabooSubsetsSize.contains(p);
	}

}
