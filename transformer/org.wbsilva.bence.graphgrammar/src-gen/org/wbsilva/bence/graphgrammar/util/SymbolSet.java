package org.wbsilva.bence.graphgrammar.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import org.wbsilva.bence.graphgrammar.Symbol;

/**
 * A class that decorates a {@link HashSet} of Symbols that
 * uses the method {@link Symbol#equivalates(Symbol)} to compare elements.
 * @author wbombardellis
 *
 */
public class SymbolSet implements Iterable<Symbol>{
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
	 * Create a new SymbolSet and add all elements of {@code ss}
	 * @param ss		The other symbol set
	 */
	public SymbolSet(final SymbolSet ss) {
		this.set = new HashSet<Symbol>(ss.set);
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
	 * @see HashSet#remove(Object)
	 */
	public void remove(final Symbol s) {
		this.set.removeIf(t -> s == null ? t == null : s.equivalates(t));
	}

	/**
	 * @see HashSet#isEmpty() 
	 */
	public boolean isEmpty() {
		return this.set.isEmpty();
	}
	
	/**
	 * @see HashSet#size() 
	 */
	public int size() {
		return this.set.size();
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
