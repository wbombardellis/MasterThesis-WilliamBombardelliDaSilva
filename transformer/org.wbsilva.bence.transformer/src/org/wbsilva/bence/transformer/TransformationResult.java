package org.wbsilva.bence.transformer;

import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.TripleGraph;

/**
 * A class for holding the result of a transformation
 * @author wbombardellis
 *
 */
public class TransformationResult {

	final private TripleGraph tripleGraph;
	final private ParsingTree parsingTree;

	public TransformationResult(final TripleGraph tripleGraph, final ParsingTree parsingTree) {		
		this.tripleGraph = tripleGraph;
		this.parsingTree = parsingTree;
	}

	public TripleGraph getTripleGraph() {
		return tripleGraph;
	}

	public ParsingTree getParsingTree() {
		return parsingTree;
	}
}
