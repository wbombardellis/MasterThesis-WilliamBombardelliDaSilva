package org.wbsilva.bence.transformer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

import sun.font.CreatedFontTracker;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class NPNormalizer {
	
	/**
	 * A class that decorates a {@link HashMap} from Symbols to {@code T} but that
	 * uses the method {@link Symbol#equivalates(Symbol)} to get and put entries.
	 * 
	 * @author wbombardellis
	 *
	 * @param <T>	The counter-domain of this map
	 * @see HashMap 
	 */
	private class SymbolMap<T> {
		private static final long serialVersionUID = -2809876795959619437L;
		
		final private HashMap<Symbol, T> map;
		
		/**
		 * @see HashMap#HashMap(int)
		 */
		public SymbolMap() {
			this.map = new HashMap<Symbol, T>();
		}
		
		/**
		 * @see HashMap#HashMap(int)
		 */
		public SymbolMap(final int initialCapacity) {
			this.map = new HashMap<Symbol, T>(initialCapacity);
		}
		
		/**
		 * Same contract as {@link HashMap#get(Object)}
		 * @see HashMap#get(Object)
		 */
		public T get(final Symbol key) {
			final Entry<Symbol, T> entry = this.map.entrySet().stream()
				.filter(e -> e.getKey().equivalates(key))
				.findAny()
				.orElse(null);
			
			if (entry != null)
				return entry.getValue();
			else
				return null;
		}
		
		/**
		 * Same contract as {@link HashMap#put(Object, Object)}
		 * @see HashMap#put(Object, Object)
		 */
		public T put(final Symbol key, T value) {
			final Entry<Symbol, T> entry = this.map.entrySet().stream()
					.filter(e -> e.getKey().equivalates(key))
					.findAny()
					.orElse(null);
			
			if (entry != null)
				return this.map.replace(entry.getKey(), value);
			else
				return this.map.put(key, value);
		}

		/**
		 * @see HashMap#entrySet()
		 */
		public Set<Entry<Symbol, T>> entrySet() {
			return this.map.entrySet();
		}
	}
	
	private class SymbolSet implements Iterable<Symbol>{
		final private Set<Symbol> set;
		
		/**
		 * @see HashSet#HashSet()
		 */
		public SymbolSet(){
			this.set = new HashSet<>();
		}
		
		/**
		 * @see HashSet#HashSet(java.util.Collection)
		 */
		public SymbolSet(final Collection<Symbol> c) {
			this.set = new HashSet<>(c);
		}

		/**
		 * Same contract as {@link HashSet#contains(Object)}
		 * @see HashSet#contains(Object)
		 */
		public boolean contains(final Symbol symbol){
			return this.set.stream()
					.anyMatch(s -> symbol == null ? s == null : symbol.equivalates(s));
		}

		/**
		 * Same contract as {@link HashSet#containsAll(Collection)}
		 * @see HashSet#containsAll(Collection)
		 */
		public boolean containsAll(final SymbolSet other) {
			return other.set.stream()
				.allMatch(s -> this.contains(s));
		}

		/**
		 * Same contract as {@link HashSet#add(Object)}
		 * @see HashSet#add(Object)
		 */
		public boolean add(final Symbol symbol) {
			if (!this.contains(symbol)){
				return this.set.add(symbol);
			} else {
				return false;
			}
		}
		
		/**
		 * Same contract as {@link HashSet#addAll(Collection)}
		 * @see HashSet#addAll(Collection)
		 */
		public boolean addAll(final SymbolSet other) {
			boolean modified = false;
			for (Symbol s : other.set) {
				if (this.add(s))
					modified = true;
			}
			return modified;
		}

		/**
		 * @see HashSet#isEmpty() 
		 */
		public boolean isEmpty() {
			return this.set.isEmpty();
		}

		/**
		 * Return the set difference between this set and {@code other}. That is, this.set \ other.set
		 * @param other			The set to subtract from this
		 * @return				A new SymbolSet containing only the elements that are in this and not in {@code other}
		 * 						IF {@code other} is null, return a copz of this.
		 */
		public SymbolSet subtract(final SymbolSet other) {
			if (other == null)
				return new SymbolSet(this.set);
			else {
				return new SymbolSet(this.set.stream()
										.filter(s -> !other.contains(s))
										.collect(Collectors.toSet()));
			}
		}
		
		/**
		 * Return the intersection of this set and {@code c}
		 * @param c			The collection to intersect with this set
		 * @return			A new SymbolSet with only the symbols that occur in both collections.
		 * 					If {@code c} is null, then return a new empty SymbolSet
		 */
		public SymbolSet intersect(final Collection<Symbol> c) {
			if (c == null)
				return new SymbolSet();
			else
				return new SymbolSet(this.set.stream()
									.filter(s -> c.stream()
											.anyMatch(t -> t == null ? s == null : t.equivalates(s)))
									.collect(Collectors.toSet()));
		}

		@Override
		public Iterator<Symbol> iterator() {
			return this.set.iterator();
		}
	}
	

	/**
	 * TODO
	 * @param grammar
	 */
	public void normalize(final Grammar grammar){	
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);

		Map<Rule, SymbolMap<SymbolSet>> nonNPRulesContext = getNonNPRules(grammar);
		while (!nonNPRulesContext.isEmpty()) {
			assert nonNPRulesContext.size() <= grammar.getRules().size();
			
			//For each non neighborhood preserving rule A->R
			for (Entry<Rule, SymbolMap< SymbolSet>> rEntry : nonNPRulesContext.entrySet()) {
				final SymbolMap<SymbolSet> missingContext = rEntry.getValue();
				final Rule nonNPRule = rEntry.getKey();
				
				//For each vertex in the grammar with label A
				for (Rule rule : grammar.getRules()) {
					for (Vertex v: rule.getRhs().getVertices()) {
						if (v.getLabel().equivalates(nonNPRule.getLhs())) {
							
							//Fix the rule where this vertex occurs for this missing context
							fixRule(grammar, nonNPRule, rule, v, missingContext);
						}
					}
				}
			}
			
			//Get new non neighborhood preserving rules
			nonNPRulesContext = getNonNPRules(grammar);
		}
	}
	

	/**
	 * TODO
	 * @param grammar
	 * @return
	 */
	Map<Rule, SymbolMap<SymbolSet>> getNonNPRules(final Grammar grammar){
		final SymbolMap<SymbolMap<SymbolSet>> maxContext = new SymbolMap<>(grammar.getNonterminals().size());
		final HashMap<Vertex, SymbolMap<SymbolSet>> embeddingContext = new HashMap<>();

		for (Symbol l: grammar.getNonterminals()) {
			maxContext.put(l, new SymbolMap<SymbolSet>());
		}
		
		//Determine the maximal context of each nonterminal symbol
		for (Rule r : grammar.getRules()) {
			for (Vertex v : r.getRhs().getVertices()) {
				
				//The embedding context of each vertex of the RHS of each rule
				final EList<SymbolSymbolsPair> embedding = r.getEmbedding().get(v);
				final SymbolMap<SymbolSet> vContext = new SymbolMap<>();
				for (SymbolSymbolsPair ssP : embedding) {
					final SymbolSet vLabels = new SymbolSet(ssP.getVertexLabels());
					
					final SymbolSet context = vContext.get(ssP.getEdgeLabel());
					if (context == null) {
						vContext.put(ssP.getEdgeLabel(), vLabels);
					} else {
						context.addAll(vLabels);
					}
				}
				embeddingContext.put(v, vContext);
				
				if (grammar.getNonterminals().stream().anyMatch(l -> l.equivalates(v.getLabel()))) {
					final SymbolMap<SymbolSet> ntContext = maxContext.get(v.getLabel());
					
					//The real context of each nonterminal vertex of the RHS of each rule
					for(Edge e: r.getRhs().inEdges(v)) {
						final SymbolSet context = ntContext.get(e.getLabel());
						if (context == null) {
							ntContext.put(e.getLabel(), 
									new SymbolSet(Arrays.asList(e.getFrom().getLabel())));
						}
						else 
							context.add(e.getFrom().getLabel());
					}
					for(Edge e: r.getRhs().outEdges(v)) {
						final SymbolSet context = ntContext.get(e.getLabel());
						if (context == null) {
							ntContext.put(e.getLabel(), 
									new SymbolSet(Arrays.asList(e.getTo().getLabel())));
						}
						else 
							context.add(e.getTo().getLabel());
					}
					
					for (Entry<Symbol,SymbolSet> vContextEntry : vContext.entrySet()) {
						final SymbolSet context = ntContext.get(vContextEntry.getKey());
						if (context == null) {
							ntContext.put(vContextEntry.getKey(), vContextEntry.getValue());
						}
						else 
							context.addAll(vContextEntry.getValue());
					}
				}
			}
		}
		
		//Build rule's embedding context
		final HashMap<Rule, SymbolMap<SymbolSet>> nonNPRulesContext = new HashMap<>(grammar.getRules().size());
		for (Rule r : grammar.getRules()) {
			final SymbolMap<SymbolSet> ruleContext = new SymbolMap<>();
			
			for (Vertex v : r.getRhs().getVertices()) {
				final SymbolMap<SymbolSet> vContext = embeddingContext.get(v);
				for (Entry<Symbol,SymbolSet> vContextEntry : vContext.entrySet()) {
					final SymbolSet context = ruleContext.get(vContextEntry.getKey());
					if (context == null) {
						ruleContext.put(vContextEntry.getKey(), vContextEntry.getValue());
					}
					else 
						context.addAll(vContextEntry.getValue());
				}	
			}
			//If the rule's embedding context does not contain all LHS's maximal context
			for (Entry<Symbol,SymbolSet> maxContextEntry : maxContext.get(r.getLhs()).entrySet()) {
				
				final SymbolMap<SymbolSet> missingRuleContext = nonNPRulesContext.get(r);
				
				final SymbolSet context = ruleContext.get(maxContextEntry.getKey());
				if (context == null && maxContextEntry.getValue() != null) {
					//non neighborhood preserving
					if (missingRuleContext == null) {
						final SymbolMap<SymbolSet> sMap = new SymbolMap<>();
						sMap.put(maxContextEntry.getKey(), maxContextEntry.getValue());
						nonNPRulesContext.put(r, sMap);
					}
					else 
						missingRuleContext.put(maxContextEntry.getKey(), maxContextEntry.getValue());
					
				} else {
					if (maxContextEntry.getValue() != null) {

						//Calculate the missing context
						final SymbolSet missingContextLabels = maxContextEntry.getValue().subtract(context);
						if (!missingContextLabels.isEmpty()) {
							//non neighborhood preserving
						
							if (missingRuleContext == null) {
								final SymbolMap<SymbolSet> sMap = new SymbolMap<>();
								sMap.put(maxContextEntry.getKey(), missingContextLabels);
								nonNPRulesContext.put(r, sMap);
							}
							else 
								missingRuleContext.put(maxContextEntry.getKey(), missingContextLabels);
						}
					}
				}
			}
		}
		return nonNPRulesContext;
	}
	
	/**
	 * TODO
	 * @param grammar
	 * @param rule
	 * @param v
	 * @param e
	 */
	void fixRule(final Grammar grammar, final Rule nonNPRule, final Rule rule, final Vertex vertex, final SymbolMap<SymbolSet> context) {
		assert rule.getRhs().getVertices().contains(vertex);
		assert nonNPRule.getLhs().equivalates(vertex.getLabel());
		
		//For each edge of this vertex
		final List<Edge> vEdges = rule.getRhs().edges(vertex);
		for (Edge e : vEdges) {
			final Symbol ignoredLabel = e.getFrom() == vertex ? 
					e.getTo().getLabel() : e.getFrom().getLabel();
					
			//If it connects to one of the missing contexts	
			final SymbolSet missingLabels = context.get(e.getLabel());
			if (missingLabels != null && missingLabels.contains(e.getFrom().getLabel())) {
				final List<Rule> newFixedRules = createNewRules(nonNPRule, rule, vertex, ignoredLabel, e);
				assert newFixedRules.size() == 2;
				
				grammar.getRules().addAll(newFixedRules);
			}
		}
		
		//For each embedding of this vertex
		for (SymbolSymbolsPair embeds : rule.getEmbedding().get(vertex)) {
			
			//If it connects to one of the missing contexts	
			final SymbolSet missingLabels = context.get(embeds.getEdgeLabel());
			if (missingLabels != null) {
				final SymbolSet missIntersection = missingLabels.intersect(embeds.getVertexLabels());
				
				for (Symbol ignoredLabel : missIntersection) {
					final List<Rule> newFixedRules = createNewRules(nonNPRule, rule, vertex, ignoredLabel, embeds.getEdgeLabel());
					assert newFixedRules.size() == 2;
					
					grammar.getRules().addAll(newFixedRules);
				}
			}
		}
		
		assert GraphgrammarUtil.isValidGrammar(grammar);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an symbol to it, withou an edge.
	 * @see NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)
	 */
	List<Rule> createNewRules(final Rule nonNPRule, final Rule rule, final Vertex vertex, final Symbol ignoredLabel, final Symbol edgeLabel) {
		return createNewRules(nonNPRule, rule, vertex, ignoredLabel, null, edgeLabel);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an edge to it, without sending an extra symbol.
	 * @see NPNormalizer#createNewRules(Rule, Rule, Vertex, Symbol, Edge, Symbol)
	 */
	List<Rule> createNewRules(final Rule nonNPRule, final Rule rule, final Vertex vertex, final Symbol ignoredLabel, final Edge edge) {
		return createNewRules(nonNPRule, rule, vertex, ignoredLabel, edge, null);
	}
	
	/**
	 * TODO
	 * @param nonNPRule
	 * @param rule
	 * @param vertex
	 * @param ignoredLabel
	 * @param edge
	 * @return
	 */
	private List<Rule> createNewRules(final Rule nonNPRule, final Rule rule, final Vertex vertex, final Symbol ignoredLabel, final Edge edge, Symbol edgeLabel) {
		assert rule.getRhs().getVertices().contains(vertex);
		assert edge == null || rule.getRhs().getEdges().contains(edge);
		assert nonNPRule.getLhs().equivalates(vertex.getLabel());
		
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
		
		//Remove the embedding for this edge and vertex labels
		if (modifiedRule.getEmbedding().get(v) != null) {
			for (SymbolSymbolsPair embeds : modifiedRule.getEmbedding().get(v)) {
				if (embeds.getEdgeLabel().equivalates(edgeLabel)) {
					embeds.getVertexLabels().removeIf(l -> l.equivalates(ignoredLabel));
				}
			}
		}
		
		//Change v's label
		v.getLabel().getSubscript().add(ignoredLabel.getName());
		
		assert GraphgrammarUtil.isValidRule(modifiedRule);
		
		//Add new neighborhood preserving rule for the new label
		final Rule newRule = EcoreUtil.copy(nonNPRule);
		newRule.setId(nonNPRule.getId().concat("_"+ignoredLabel));
		newRule.getLhs().getSubscript().add(ignoredLabel.getName());
		GraphgrammarUtil.ensureUniqueIds(newRule.getRhs());
		
		assert GraphgrammarUtil.isValidRule(newRule);
		
		return Arrays.asList(modifiedRule, newRule);
	}
}
