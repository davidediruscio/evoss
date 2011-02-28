package it.univaq.mancoosi.validator.util;

import it.univaq.mancoosi.mancoosimm.MancoosiPackage;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;

import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class EmfCompareLaunch {

	private EmfCompareLaunch() {
	}

	
	public static void compare(File modelFile1, File modelFile2, String outputDiff) {

		// Creates the resourceSets where we'll load the models
		final ResourceSet resourceSet1 = new ResourceSetImpl();
		final ResourceSet resourceSet2 = new ResourceSetImpl();

		resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("mancoosimm", new EcoreResourceFactoryImpl());

		resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("mancoosimm", new EcoreResourceFactoryImpl());

		resourceSet1.getPackageRegistry().put(MancoosiPackage.eNS_URI, MancoosiPackage.eINSTANCE);
		resourceSet2.getPackageRegistry().put(MancoosiPackage.eNS_URI, MancoosiPackage.eINSTANCE);

		try {
			System.out.println(" --> Loading resources...");
			// Loads the two models passed as arguments
			final EObject model1 = ModelUtils.load(modelFile1, resourceSet1);
			final EObject model2 = ModelUtils.load(modelFile2, resourceSet2);

			// Creates the match then the diff model for those two models
			System.out.println(" --> Creating the match model...");
			final MatchModel match = MatchService.doMatch(model1, model2, Collections.<String, Object> emptyMap());
			System.out.println(" --> Creating the diff model...");
			final DiffModel diff = DiffService.doDiff(match, false);
			System.out.println(" --> Saving emfdiff...");
			final ComparisonResourceSnapshot snapshot = DiffFactory.eINSTANCE.createComparisonResourceSnapshot();
			snapshot.setDate(Calendar.getInstance().getTime());
			// snapshot.setMatch(match);
			snapshot.setDiff(diff);
			ModelUtils.save(snapshot, outputDiff);
		} catch (final IOException e) {
			e.printStackTrace(System.out);
		} catch (final InterruptedException e) {
			e.printStackTrace(System.out);
		}
	}
}
