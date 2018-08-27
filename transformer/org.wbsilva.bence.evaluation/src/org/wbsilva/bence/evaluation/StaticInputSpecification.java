package org.wbsilva.bence.evaluation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.wbsilva.bence.transformer.util.TransformerUtil;

/**
 * TODO
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
