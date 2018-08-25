package org.wbsilva.bence.transformer.util;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.transformer.exception.TransformationException;

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
}
