package org.wbsilva.bence.graphgrammar.util;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;

import org.wbsilva.bence.graphgrammar.Symbol;

/**
 * A class that decorates a {@link HashMap} from Symbols to {@code T} but that
 * uses the method {@link Symbol#equivalates(Symbol)} to get and put entries.
 * 
 * @author wbombardellis
 *
 * @param <T>	The counter-domain of this map
 * @see HashMap 
 */
public class SymbolMap<T> {
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

	/**
	 * @see HashMap#size()
	 */
	public int size() {
		return this.map.size();
	}

	/**
	 * @see HashMap#merge(Object, Object, BiFunction)
	 */
	public T merge(final Symbol key, final T value, final BiFunction<? super T,? super T,? extends T> remappingFunction) {
		final Entry<Symbol, T> entry = this.map.entrySet().stream()
				.filter(e -> e.getKey().equivalates(key))
				.findAny()
				.orElse(null);
		
		if (entry != null) {
			T newValue = remappingFunction.apply(entry.getValue(), value);
			if (newValue != null)
				this.map.replace(entry.getKey(), newValue);
			else 
				this.map.remove(entry.getKey());
			return newValue;
		}
		else {
			this.map.put(key, value);
			return value;
		}
	}
}
