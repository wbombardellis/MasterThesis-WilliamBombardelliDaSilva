package org.wbsilva.bence.transformer;

import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.TripleGraph;

/**
 * A class for holding the result of a TGG transformation
 * @author wbombardellis
 *
 */
public class BeNCETransformationResult {

	final private TripleGraph tripleGraph;
	final private ParsingTree parsingTree;

	public BeNCETransformationResult(final TripleGraph tripleGraph, final ParsingTree parsingTree) {		
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
