package failuresdetector;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import mancoosi.MancoosiPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.helper.OCLHelper;

public class QueryExecutor {
	
	//This method loads the ecore resource having file path ecoreModelPath
	private static Resource loadResource(String ecoreModelPath) throws RuntimeException, WrappedException {
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = null;
		URI modelUri = null;
		try {
			resourceSet = new ResourceSetImpl();
			modelUri = URI.createFileURI(new File(ecoreModelPath).getAbsolutePath());
			
			EcoreResourceFactoryImpl ecoreFactory = new EcoreResourceFactoryImpl();		
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", ecoreFactory);
			
			// Register the package to ensure it is available during loading.
			resourceSet.getPackageRegistry().put
				(MancoosiPackage.eNS_URI, 
				 MancoosiPackage.eINSTANCE);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Ecore model path. Please correct it.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception during Ecore model loading. Check all the plugins are present.");
		}
		
		// Demand load resource for this file.
		return resourceSet.getResource(modelUri, true);
	}
	
	//This method executes the OCL query in input on the ecore resource in non-verbose mode
	public static Object executeQuery(String ecoreModelPath, String query) {
		return executeQuery(ecoreModelPath, query, false);
	}

	//This method executes the OCL query in input on the ecore resource in verbose or non-verbose mode
	public static Object executeQuery(String ecoreModelPath, String query, boolean verbose) {
		PrintStream printStreamOriginal = System.out;
		OCL myOcl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		Object result = null;
		myOcl.setEvaluationTracingEnabled(false);
		myOcl.setParseTracingEnabled(true);
		OCLHelper<EClassifier,EOperation,EStructuralFeature,Constraint> oclHelper = myOcl.createOCLHelper();
		OCLExpression oclInv = null;
		Resource ecoreResource = null;
		try {
			ecoreResource = loadResource(ecoreModelPath);
			System.out.println(ecoreResource.getURI() + " loaded.");
			oclHelper.setInstanceContext(ecoreResource);
			System.out.println("OCL Query execution started...");
			try {
				System.out.println("- " + query);
				if(!verbose)
					disableStdOut();
				oclInv = (OCLExpression) oclHelper.createQuery(query);
				Query eval = myOcl.createQuery(oclInv);
				result = eval.evaluate(ecoreResource.getContents());
				System.out.println("OCL Query execution terminated.");
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				enableOut(printStreamOriginal);
				System.out.println("A ParserException was thrown while parsing the OCL query. Please check the sintax and semantic correctness of the OCL query.");
			}  catch (Exception e) {
				// TODO Auto-generated catch block
				enableOut(printStreamOriginal);
				System.out.println("Exception thrown during the OCL query execution. Please check the sintax and semantic correctness of the OCL query.");
			}
			if(!verbose)
				enableOut(printStreamOriginal);
			if(result != null)
				System.out.println("OCL Query result: " + result.toString());
		} catch (WrappedException e) {
		// TODO Auto-generated catch block
			System.out.println("Ecore resource was not loaded because a WrappedException has been thrown. Please check the metamodel is registered.");
		} catch (RuntimeException e) {
		// TODO Auto-generated catch block
			System.out.println("Ecore resource was not loaded because a RuntimeException has been thrown.");
		}
		return result;
	}
	
	//This method executes the OCL queries in input on the ecore resource in non-verbose mode
	public static Object[] executeQueries(String ecoreModelPath, String[] queries) {
		return executeQueries(ecoreModelPath, queries, false);
	}
	
	//This method executes the OCL queries in input on the ecore resource in verbose or non-verbose mode
	public static Object[] executeQueries(String ecoreModelPath, String[] queries, boolean verbose) {
		PrintStream printStreamOriginal = System.out;
		OCL myOcl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		Object[] result = new Object[queries.length];
		myOcl.setEvaluationTracingEnabled(false);
		myOcl.setParseTracingEnabled(true);
		OCLHelper<EClassifier,EOperation,EStructuralFeature,Constraint> oclHelper = myOcl.createOCLHelper();
		OCLExpression oclInv = null;
		Resource ecoreResource = null;
		try {
			ecoreResource = loadResource(ecoreModelPath);
			System.out.println(ecoreResource.getURI() + " loaded.");
			oclHelper.setInstanceContext(ecoreResource);
			System.out.println("OCL Queries execution started...");
			for(int i = 0; i < queries.length; i++) {
				System.out.println("" + (i + 1) + ") " + queries[i]);
				if(!verbose)
					disableStdOut();
				try {
					oclInv = (OCLExpression) oclHelper.createQuery(queries[i]);
					Query eval = myOcl.createQuery(oclInv);
					result[i] = eval.evaluate(ecoreResource.getContents());
				} catch (ParserException e) {
					// TODO Auto-generated catch block
					enableOut(printStreamOriginal);
					System.out.println("A ParserException was thrown while parsing the OCL query. Please check the sintax and semantic correctness of the OCL query.");
				}  catch (Exception e) {
					// TODO Auto-generated catch block
					enableOut(printStreamOriginal);
					System.out.println("Exception thrown during the OCL query execution. Please check the sintax and semantic correctness of the OCL query.");
				}	
				if(!verbose)
					enableOut(printStreamOriginal);
				if(result[i] != null) {
					System.out.println("OCL Query result: " + result[i].toString());
				}
			}
		} catch (WrappedException e) {
		// TODO Auto-generated catch block
			enableOut(printStreamOriginal);
			System.out.println("Ecore resource was not loaded because a WrappedException has been thrown. Please check the metamodel is registered.");
		} catch (RuntimeException e) {
		// TODO Auto-generated catch block
			enableOut(printStreamOriginal);
			System.out.println("Ecore resource was not loaded because a RuntimeException has been thrown.");
		}
		System.out.println("OCL Queries execution terminated.");
		return result;
	}
	
	//This method is used in non-verbose mode for disabling the standard output
	public static void disableStdOut() {
		System.setOut(new PrintStream(new OutputStream(){
			public void write(int b) {
			}
		}));
	}
	
	//This method is used in verbose mode for enabling the standard output
	public static void enableOut(PrintStream printStream) {
		System.setOut(printStream);
	}
}