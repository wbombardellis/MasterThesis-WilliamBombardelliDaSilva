package org.wbsilva.bence.transformer;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.graphgrammar.util.NPUtil;
import org.wbsilva.bence.graphgrammar.util.SymbolMap;
import org.wbsilva.bence.graphgrammar.util.SymbolSet;

/**
 * This class implements a neighborhood preserving (NP) normalizer, that is able to transform
 * any valid boundary grammar into an equivalent valid boundary neighborhood preserving grammar.
 * @author wbombardellis
 *
 */
public class NPNormalizer {

	/**
	 * Transform {@code grammar} into its neighborhood preserving normal form.
	 * This method possibly modifies the original grammar adding and removing rules and symbols to the alphabet.
	 * 
	 * @param grammar		A valid boundary grammar
	 * @see GraphgrammarUtil#getNonNPRules(Grammar)
	 */
	public void normalize(final Grammar grammar){	
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);
		assert GraphgrammarUtil.isSimpleLabeledGrammar(grammar);

		Map<Rule, SymbolMap<SymbolSet>> nonNPRulesContext = NPUtil.getNonNPRules(grammar);
		while (!nonNPRulesContext.isEmpty()) {
			assert nonNPRulesContext.size() <= grammar.getRules().size();
			
			final Set<Rule> newRules = new HashSet<Rule>(2);
			//For each non neighborhood preserving rule A->R
			for (Entry<Rule, SymbolMap<SymbolSet>> rEntry : nonNPRulesContext.entrySet()) {
				final SymbolMap<SymbolSet> missingContext = rEntry.getValue();
				final Rule nonNPRule = rEntry.getKey();
				
				//For each vertex in the grammar with label A
				for (Rule rule : grammar.getRules()) {
					for (Vertex v: rule.getRhs().getVertices()) {
						if (v.getLabel().equivalates(nonNPRule.getLhs())) {
							
							//Fix the rule where this vertex occurs for this missing context
							newRules.addAll(fixHostRule(rule, v, missingContext));
						}
					}
				}
				//For each missing context
				for (Entry<Symbol, SymbolSet> cEntry : missingContext.entrySet()) {
					for (Symbol ignoringLabel : cEntry.getValue()) {
						//Fix the actual non neighborhood preserving rule
						newRules.add(createNewGuestRule(nonNPRule, cEntry.getKey(), ignoringLabel));
					}
				}
			}
			
			//Remove non neighborhood preserving rules
			grammar.getRules().removeAll(nonNPRulesContext.keySet());
			grammar.getRules().addAll(newRules);
			for (Rule r : newRules) {
				if (!grammar.getNonterminals().stream().anyMatch(n -> n.equivalates(r.getLhs()))){
					grammar.getNonterminals().add(EcoreUtil.copy(r.getLhs()));
					grammar.getAlphabet().add(EcoreUtil.copy(r.getLhs()));
				}
			}
			assert GraphgrammarUtil.isValidGrammar(grammar);
			
			//Get new non neighborhood preserving rules
			nonNPRulesContext = NPUtil.getNonNPRules(grammar);
		}
		
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);
		assert NPUtil.isNeighborhoodPreserving(grammar);
	}
	
	/**
	 * Given a host {@code rule} containing a {@code vertex} that contains at least one of the missing context
	 * in {@code context}, creates the necessary new rules without such missing contexts.
	 *  
	 * @param rule		The host rule containing the vertex to be modified
	 * @param vertex	The vertex which to change its context, to fix the rule 
	 * @param context	The missing context of the {@code vertex}'s label
	 * @return			One new rule for each missing context removal from {@code vertex}
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	private Set<Rule> fixHostRule(final Rule rule, final Vertex vertex, final SymbolMap<SymbolSet> context) {
		assert rule.getRhs().getVertices().contains(vertex);
		
		//Remember of what is still to be processed 
		final SymbolMap<SymbolSet> toProccessContext = new SymbolMap<>(context.size());
		for (Entry<Symbol, SymbolSet> c : context.entrySet()) {
			toProccessContext.put(c.getKey(), new SymbolSet(c.getValue()));
		}
		
		//For each edge of this vertex
		final List<Edge> vEdges = rule.getRhs().edges(vertex);
		final Set<Rule> newFixedRules = new HashSet<Rule>(4);
		for (Edge e : vEdges) {
			final Symbol ignoredLabel = e.getFrom() == vertex ? 
					e.getTo().getLabel() : e.getFrom().getLabel();
					
			//If it connects to one of the missing contexts	
			final SymbolSet missingLabels = context.get(e.getLabel());
			if (missingLabels != null && missingLabels.contains(ignoredLabel)) {
				//New fix
				newFixedRules.add(createNewHostRule(rule, vertex, ignoredLabel, e));
				//Context processed
				toProccessContext.get(e.getLabel()).remove(ignoredLabel);
			}
		}
		
		//For each embedding of this vertex
		final EList<SymbolSymbolsPair> embedding = rule.getEmbedding().get(vertex);
		if (embedding != null) {
			for (SymbolSymbolsPair embeds : embedding) {
				
				//If it connects to one of the missing contexts	
				final SymbolSet missingLabels = toProccessContext.get(embeds.getEdgeLabel());
				if (missingLabels != null) {
					final SymbolSet missIntersection = missingLabels.intersect(embeds.getVertexLabels());
					
					for (Symbol ignoredLabel : missIntersection) {
						newFixedRules.add(createNewHostRule(rule, vertex, ignoredLabel, embeds.getEdgeLabel()));
					}
				}
			}
		}
		
		return newFixedRules;
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an symbol to it, without an edge.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	Rule createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Symbol edgeLabel) {
		return createNewHostRule(rule, vertex, vertexLabel, null, edgeLabel);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an edge to it, without sending an extra symbol.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	Rule createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Edge edge) {
		return createNewHostRule(rule, vertex, vertexLabel, edge, null);
	}
	
	/**
	 * Effectively create a new rule for the host rule {@code rule} containing {@code vertex} with context
	 * {@code edgeLabel}-{@code vertexLabel} (i.e. an edge or embedding with label {@code edgeLabel} to a vertex 
	 * with label {@code vertexLabel}).
	 * If {@code edge} is not null, then create new rule without it. Otherwise only remove the embedding.
	 * 	 
	 * @param rule			The host rule containing the vertex to be modified
	 * @param vertex		The vertex which to change its context (embedding and optionally edge)
	 * @param vertexLabel	The part of the missing context corresponding to the vertex
	 * @param edge			The edge with label {@code edgeLabel} to/from a vertex  with label {@code vertexLabel}
	 * 						adjacent to {@code vertex}, to be removed in the new rule
	 * @param edgeLabel		The part of the missing context corresponding to the edge
	 * @return				A new rule corresponding to the modification of {@code rule} without the missing context
	 * 						on {@code vertex} with {@code edgeLabel} and {@code vertexLabel}
	 */
	private Rule createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Edge edge, Symbol edgeLabel) {
		assert rule.getRhs().getVertices().contains(vertex);
		assert edge == null || rule.getRhs().getEdges().contains(edge);
		assert edge == null || edge.getFrom().getLabel().equivalates(vertexLabel) || edge.getTo().getLabel().equivalates(vertexLabel);
		
		final Rule modifiedRule = EcoreUtil.copy(rule);
		final Vertex v = modifiedRule.getRhs().getVertices().stream()
				.filter(w -> w.getId().equals(vertex.getId()))
				.findAny()
				.orElse(null);
		assert v != null;
		GraphgrammarUtil.ensureUniqueIds(modifiedRule.getRhs());
		
		if (edge != null) {
			//Remove the edge
			modifiedRule.getRhs().getEdges().removeIf(e -> e.compareTo(edge) == 0);
			
			edgeLabel = edge.getLabel();
		}
		assert edgeLabel != null;
		
		//Remove the embedding for this edge and vertex labels
		if (modifiedRule.getEmbedding().get(v) != null) {
			for (SymbolSymbolsPair embeds : modifiedRule.getEmbedding().get(v)) {
				if (embeds.getEdgeLabel().equivalates(edgeLabel)) {
					embeds.getVertexLabels().removeIf(l -> l.equivalates(vertexLabel));
				}
			}
		}
		
		//Change v's label
		v.getLabel().getSuperscript().add(edgeLabel.getName());
		v.getLabel().getSubscript().add(vertexLabel.getName());

		modifiedRule.setId(rule.getId().concat("___"+EcoreUtil.generateUUID()));
		
		assert GraphgrammarUtil.isValidRule(modifiedRule);
		
		return modifiedRule;
	}
	
	/**
	 * Effectively create a new rule for the guest non neighborhood preserving rule {@code nonNPRule} 
	 * and missing context consisting of {@code edgeLabel}-{@code vertexLabel}. That is, this rule
	 * lacks the an embedding with edge label {@code edgeLabel} to a vertex with label {@code vertexLabel}).
	 * 
	 * @param nonNPRule		The guest rule to be modified with new LHS, so that it does not miss the context anymore
	 * @param edgeLabel		The part of the missing context corresponding to the edge
	 * @param vertexLabel	The part of the missing context corresponding to the vertex
	 * @return				A new rule corresponding to the modification of {@code nonNPRule} 
	 * 						with modified LHS and without the missing context {@code edgeLabel} and {@code vertexLabel}
	 */
	Rule createNewGuestRule(final Rule nonNPRule, final Symbol edgeLabel, final Symbol vertexLabel){		
		//Add new neighborhood preserving rule for the new label
		final Rule newRule = EcoreUtil.copy(nonNPRule);
		newRule.getLhs().getSuperscript().add(edgeLabel.getName());
		newRule.getLhs().getSubscript().add(vertexLabel.getName());
		
		newRule.setId(nonNPRule.getId().concat("___("+newRule.getLhs()+")"));
		
		GraphgrammarUtil.ensureUniqueIds(newRule.getRhs());
		
		final HashSet<Vertex> embedRemoval = new HashSet<>();
		//Remove embeddings to make it surely neighborhood preserving
		for (Entry<Vertex, EList<SymbolSymbolsPair>> embedding : newRule.getEmbedding().entrySet()) {
			final HashSet<SymbolSymbolsPair> ssPRemoval = new HashSet<>();
			
			for (SymbolSymbolsPair ssP : embedding.getValue()) {
				if (ssP.getEdgeLabel().equivalates(edgeLabel)) {
					ssP.getVertexLabels().removeIf(vL -> vL.equivalates(vertexLabel));
					
					if (ssP.getVertexLabels().isEmpty())
						ssPRemoval.add(ssP);
				}
			}
			ssPRemoval.forEach(ssP -> embedding.getValue().remove(ssP));
			if (embedding.getValue().isEmpty())
				embedRemoval.add(embedding.getKey());
		}
		embedRemoval.forEach(w -> newRule.getEmbedding().removeKey(w));
		
		assert GraphgrammarUtil.isValidRule(newRule);
		
		return newRule;
	}
}
