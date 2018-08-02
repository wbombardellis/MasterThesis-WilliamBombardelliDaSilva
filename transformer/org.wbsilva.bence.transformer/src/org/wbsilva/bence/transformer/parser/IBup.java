package org.wbsilva.bence.transformer.parser;

import java.util.Set;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

interface IBup {

	/**
	 * Return if it has a next subset to be retrieved according to the current state
	 * 
	 * @return				True if there is at least one subset to be retrieved, false otherwise.
	 * @see IBup#lastPhase()
	 */
	public boolean hasNext();

	/**
	 * Return true iff {@code zoneVertex} or any equivalent zone vertex is contained by this Bup.
	 * @param zoneVertex	The zone vertex to be tested. Cannot be null.
	 * @return				True if this contains any zone vertex equivalent to {@code zoneVertex}, false otherwise. 
	 * @see ZoneVertex#equivalates(ZoneVertex)
	 */
	public boolean contains(final ZoneVertex zoneVertex);
	
	/**
	 * Add a new zone vertex {@code zoneVertex} to this Bup.
	 * 
	 * @param zoneVertex		The new zone vertex to be added. Cannot be null.
	 * @return 					True iff {@code zoneVertex} has been added
	 */
	public boolean add(final ZoneVertex zoneVertex);
	
	/**
	 * Retrieve the next subset of this Bup, if it has a next.
	 * 
	 * @return		The next subset of zone vertices of Bup or null
	 */
	public Set<ZoneVertex> next();
}
