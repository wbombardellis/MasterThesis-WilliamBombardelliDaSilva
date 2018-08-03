package org.wbsilva.bence.transformer.parser;

import java.util.Optional;
import java.util.Set;

import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * This is the interface for the bottom-up parsing set.
 * It basically stores a set of zone vertices generated during parsing
 * and retrieves subsets of it.
 * 
 * @author wbombardellis
 *
 */
interface IBup {

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
	 * Retrieve the next subset of this Bup, if it has a next. . Empty otherwise
	 * 
	 * @return		The next subset of zone vertices of Bup or empty
	 */
	public Optional<Set<ZoneVertex>> next();
}
