package org.wbsilva.bence.evaluation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.wbsilva.bence.transformer.util.TransformerUtil;

/**
 * A static input specification that loads models from files
 * @author wbombardellis
 *
 */
public class StaticInputSpecification implements IInputSpecification{

	private final ResourceSet resSet;
	private final ArrayList<String> paths;

	public StaticInputSpecification(final ResourceSet resSet, final List<String> paths) {
		this.resSet = resSet;
		this.paths = new ArrayList<>(paths);
	}

	/**
	 * Return an iterator over the loaded models according to the paths given in the construction of this object.
	 * If any model cannot be load, than the iterator returns empty for it, otherwise it gives the loaded model 
	 * in the resource set given in the construction of this object.
	 */
	@Override
	public Iterator<Optional<EObject>> iterator() {
		return new Iterator<Optional<EObject>>() {
			
			private final Iterator<String> pathsIterator = paths.iterator();

			@Override
			public boolean hasNext() {
				return pathsIterator.hasNext();
			}

			@Override
			public Optional<EObject> next() {
				try {
					return TransformerUtil.loadModel(resSet, pathsIterator.next(), EObject.class);
				} catch (Exception e) {
					return Optional.empty();
				}
			}
		};
	}

}
