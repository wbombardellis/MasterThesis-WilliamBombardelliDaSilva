package org.wbsilva.bence.transformer.util;

import java.net.URL;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
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
	public static void registerPackages(final ResourceSet resSet, final String graphGrammarPath) throws TransformationException, Exception{
		assert resSet != null && graphGrammarPath != null;
		
		// Register the graph grammar package in the package registry
		GraphgrammarPackage.eINSTANCE.eClass();

		/*
		// Get the graph grammar's resource
		Resource ggResource = getResourceFromFile(resSet, graphGrammarPath);
		assert ggResource != null;

		final EPackage graphGrammarPackage;
		//Access the ePackage of the graph grammar metamodel to register it	
		if (ggResource.getContents().size() != 1){
			TransformationException ex = new TransformationException("Graph grammar metamodel resource should contain only one root element. Found "+ggResource.getContents().size());
			logger.error(ex);
			throw ex;
		} else {
			//Access the root ePackage
			EObject root = ggResource.getContents().get(0);
			if (!(root instanceof EPackage)){
				TransformationException ex = new TransformationException("Root element of Graph grammar resource should be an ePackage. Found "+root.getClass());
				logger.error(ex);
				throw ex;
			} else {
				//Access the graph grammar profile
				graphGrammarPackage = (EPackage) root;
				
				logger.debug("Graph grammar resource read successfully, using following ePackage: "+graphGrammarPackage.getName());
			}
		}
		assert graphGrammarPackage != null;
			
		// Register the graph grammar package in the package registry (necessary for loading the graph models)
		resSet.getPackageRegistry().put(graphGrammarPackage.getNsURI(), graphGrammarPackage);
		//logger.debug("Graph grammar's ePackage registered successfully, using following URI: "+graphGrammarPackage.getNsURI());
		*/			
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
			logger.debug("Could not load file %s with class loader. Trying without it");
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
}
