package org.wbsilva.bence.transformer.util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.transformer.ECore2GraphTransformer;
import org.wbsilva.bence.transformer.exception.TransformationException;

import com.sun.org.apache.xalan.internal.lib.ExsltDynamic;

/**
 * Utility methods for the transformation
 * Specially for dealing with EMF and ECore models
 * 
 * @author wbombardellis
 *
 */
public class TransformerUtil {
	
	static final Logger logger = LogManager.getLogger(TransformerUtil.class);
	
	/**
	 * Adds packages required for working with graph grammar models to the global registry
	 */
	public static void registerFactories(){
		// Register the XMI resource factory for the graph grammar files
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		m.put(XMIResource.XMI_NS, new XMIResourceFactoryImpl());
		m.put(EcorePackage.eNS_PREFIX, new EcoreResourceFactoryImpl());
	}

	/**
	 * Adds packages required for working with graph grammars to the resourceSet
	 * If no exceptions is thrown, it is guaranteed that the packages will be registered
	 * @param resSet	
	 * 			The resource set in which to register the necessary ePackages
	 * @param graphGrammarPath
	 * 			The path to the graph grammar metamodel
	 * @throws TransformationException 
	 * 			In case that the input resource of graph grammar metamodel is not in the format it was expected
	 * @throws Exception 
	 * 			In case of problem by the reading of the graph grammar file
	 */
	public static void registerPackages(final ResourceSet resSet) throws TransformationException, Exception{
		assert resSet != null;
		
		// Register the graph grammar package in the package registry
		GraphgrammarPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Adds packages required for working with models of a metamodel to the resourceSet
	 * If no exceptions is thrown, it is guaranteed that the packages will be registered
	 * @param resSet	
	 * 			The resource set in which to register the necessary ePackages
	 * @param metamodelFilePath
	 * 			The path to the metamodel of interest
	 * @throws TransformationException 
	 * 			In case that the input resource of the metamodel is not in the format it was expected
	 * @throws Exception 
	 * 			In case of problem by the reading of the graph grammar file
	 */
	public static void registerPackages(final ResourceSet resSet, final String metamodelFilePath) throws TransformationException, Exception{
		assert resSet != null && metamodelFilePath != null;
		
		// Get the metamodel's resource
		Resource mmResource = getResourceFromFile(resSet, metamodelFilePath);
		assert mmResource != null;

		final EPackage metamodelPackage;
		//Access the ePackage of the metamodel to register it	
		if (mmResource.getContents().size() != 1){
			TransformationException ex = new TransformationException("Metamodel resource should contain only one root element. Found "+mmResource.getContents().size());
			logger.error(ex);
			throw ex;
		} else {
			//Access the root ePackage
			EObject root = mmResource.getContents().get(0);
			if (!(root instanceof EPackage)){
				TransformationException ex = new TransformationException("Root element of the metamodel resource should be an ePackage. Found "+root.getClass());
				logger.error(ex);
				throw ex;
			} else {
				//Access the metamodel's profile
				metamodelPackage = (EPackage) root;
				
				logger.debug("Metamodel resource read successfully, using following ePackage: "+metamodelPackage.getName());
			}
		}
		assert metamodelPackage != null;
			
		// Register the metamodel's package in the package registry (necessary for loading its models)
		resSet.getPackageRegistry().put(metamodelPackage.getNsURI(), metamodelPackage);
		logger.debug("Metamodel's ePackage registered successfully, using following URI: "+metamodelPackage.getNsURI());
	}
	
	/**
	 * Adds a package to the resourceSet. This method is specially useful if you want to
	 * instantiate the elements of a loaded model with the actual classes of its generated metamodel, 
	 * that are in the {@code ePackage}, instead of dynamic instances.
	 * If no exceptions is thrown, it is guaranteed that the package will be registered
	 * @param resSet	
	 * 			The resource set in which to register the necessary ePackage
	 * @param ePackage
	 * 			The package to register
	 * @see DynamicEObjectImpl
	 */
	public static void registerPackages(final ResourceSet resSet, final EPackage ePackage) {
		// Register the metamodel's package in the package registry (necessary for loading its models)
		resSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		logger.debug("Metamodel's ePackage registered successfully, using following URI: "+ePackage.getNsURI());
	}

	/**
	 * Reads the resource from the file at {@code filePath} using the resourceSet {@code resSet}
	 * If no exceptions is thrown, it is guaranteed that the resource is successfully read
	 * @param resSet	
	 * 			The resource set used to read the resource
	 * @param filPath
	 * 			The path to the file containing the resource. Can be in the class path or not.
	 * @throws TransformationException 
	 * 			In case that the input file has no resource
	 * @throws Exception 
	 * 			In case of problem by the reading of the input file
	 */
	public static Resource getResourceFromFile(final ResourceSet resSet, final String filePath) throws TransformationException, Exception{
		assert resSet != null && filePath != null;
		
		URL fileUrl = ClassLoader.getSystemClassLoader().getResource(filePath);
		final String path;
		if (fileUrl != null) {
			path = fileUrl.getPath();
		} else {			
			logger.debug(String.format("Could not load file %s with class loader. Trying without it", filePath));
			path = filePath;
		}
		
		try {
			final Resource ggResource = resSet.getResource(URI.createURI(path), true);
			if (ggResource == null) {
				TransformationException ex = new TransformationException("Could not get resource from file "+ path);
				logger.error(ex);
				throw ex;
			}
			
			return ggResource;			
		} catch(Exception ex) {
			logger.error("Could not get resource from file "+ path);
			logger.error(ex);
			throw ex;
		}
	}

	/**
	 * Save the resource {@code resource} to the file at its URI
	 * If no exceptions is thrown, it is guaranteed that the resource is successfully saved
	 * @param resource	
	 * 			The resource to be saved
	 * @throws IOException 
	 * 			In case of problem by the saving the output file
	 */
	public static void saveResourceToFile(final Resource resource) throws IOException {
		try {
        	resource.save(Collections.EMPTY_MAP);
        } catch (IOException ex) {
        	logger.error("Could not save resource to file "+ resource.getURI());
			logger.error(ex);
			throw ex;
        }
	}

	/**
	 * Count and return the total amount of elements in {@code tripleGrammar}
	 * @param tripleGrammar		The valid triple graph grammar to count
	 * @return					The amount of elements in {@code tripleGrammar}
	 */
	public static int countElements(final TripleGrammar tripleGrammar) {
		final int elements = tripleGrammar.getTripleRules().stream()
			.mapToInt(tr -> 
					  tr.getSource().getRhs().getVertices().size() + tr.getSource().getRhs().getEdges().size() + countEmbedding(tr.getSource().getEmbedding())
					+ tr.getTarget().getRhs().getVertices().size() + tr.getTarget().getRhs().getEdges().size() + countEmbedding(tr.getTarget().getEmbedding())
					+ tr.getCorr().getRhs().getVertices().size() + tr.getCorr().getRhs().getEdges().size() + countEmbedding(tr.getCorr().getEmbedding())
					+ tr.getMs().size() + tr.getMt().size())
			.reduce(Integer::sum)
			.orElse(0);
		
		return elements;
	}

	/**
	 * Count and return the total amount of mappings in {@code embedding}
	 * @param eMap		The embedding to count mappings
	 * @return				The amount of mappings. I.e. the amount of vertex labels in {@code embedding}
	 */
	private static int countEmbedding(final EMap<Vertex, EList<SymbolSymbolsPair>> eMap) {
		return eMap.entrySet().stream()
			.mapToInt(e -> e.getValue().stream()
						.mapToInt(ssP -> ssP.getVertexLabels().size())
						.reduce(Integer::sum)
						.orElse(0))
			.reduce(Integer::sum)
			.orElse(0);
	}

	/**
	 * Load the models in file {@code modelPath} using resource set {@code resSet} and assure that the root
	 * elements in the read resource are of type {@code rootClass} and return these element if so.
	 * If any root element in the resource is not of the given type nor subclass of it, ignore it.
	 * If resource is empty, return an empty list.
	 * @param resSet		The resource set used to read the file at {@code modelPath}
	 * @param modelPath		The path to the file containing the resource with the desired model to be load
	 * @param rootClass		The require type or supertype of the root elements of the resource, that will be returned
	 * @return				Each root element of the resource in {@code modelPath}, if it complies to the type {@code rootClass}
	 * @throws Exception	In case of problem by the reading of the input file
	 * @see TransformerUtil#getResourceFromFile(ResourceSet, String)
	 * @see TransformerUtil#loadModel(ResourceSet, String, Class)
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> loadModels(final ResourceSet resSet, final String modelPath, final Class<T> rootClass) 
			throws Exception {
		
		final Resource resource;
		resource = TransformerUtil.getResourceFromFile(resSet, modelPath);
		
		final ArrayList<T> models = new ArrayList<>();
		
		if (resource.getContents().size() < 1){
			logger.error("The model is empty. Aborting. Used URL: "+ modelPath);
			return new ArrayList<T>(0);
		} else {
			for (EObject root : resource.getContents()) {
				//Resource's root elements must be a of the given type
				if (rootClass.isAssignableFrom(root.getClass())) {
					models.add((T) root);
				} else {
					logger.error(String.format("Wrong model. A resource file's root element should be a %s, found a %s. Ignoring it.",
							rootClass.getName(), root.eClass()));
				}
			}
		}
		assert models != null;
		return models;
	}
	
	/**
	 * Load the first model in file {@code modelPath} using resource set {@code resSet} that is of type {@code rootClass}
	 * and return it. If no root element in the resource is of the given type nor subclass of it, return empty.
	 * Further root elements are ignored. If resource is empty, return empty.
	 * @param resSet		The resource set used to read the file at {@code modelPath}
	 * @param modelPath		The path to the file containing the resource with the desired model to be load
	 * @param rootClass		The require type or supertype of the first root element of the resource, that will be returned
	 * @return				The first root element of the resource in {@code modelPath} that complies to the type {@code rootClass}
	 * 						or empty if none complies
	 * @throws Exception	In case of problem by the reading of the input file
	 * @see TransformerUtil#getResourceFromFile(ResourceSet, String)
	 * @see TransformerUtil#loadModels(ResourceSet, String, Class)
	 */
	public static <T> Optional<T> loadModel(final ResourceSet resSet, final String modelPath, final Class<T> rootClass) 
			throws Exception {
		final List<T> models = loadModels(resSet, modelPath, rootClass);
		
		if (models.size() > 1) {
			logger.warn("The model file has more than one root element. Only the first one will be used. Ignoring the others.");
		}
		
		return models.isEmpty() ? Optional.empty() : Optional.of(models.get(0));
	}
}
