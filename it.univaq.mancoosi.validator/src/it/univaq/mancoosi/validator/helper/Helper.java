package it.univaq.mancoosi.validator.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import it.univaq.mancoosi.validator.util.XMLFileWriter;

public class Helper {

	
	public static void main(String[] args) throws Exception {
		
		//Find remove upgrade plans
		String correctPackageWithScriptFile = "../it.univaq.mancoosi.injectors.packages/correctPackageWithScriptFile2.txt";
		//correctPackageNoScriptFile = "/home/mancoosi/Desktop/eclipseGanymede/eclipse/workspace/it.univaq.mancoosi.injectors.packages/correctPackageNoScriptFile.txt";
		
		FileReader file = new FileReader(correctPackageWithScriptFile);
		BufferedReader input = new BufferedReader(file);
		String line;
		ArrayList<UpgradePlan> upgradePlans = new ArrayList<UpgradePlan>();
		UpgradePlan ap;
		int maxLenght = 0;
		
		String aux;
		String[] aux2;
		
		while((line = input.readLine()) != null) {
			
			aux2 = line.substring(4).replaceAll(".packagemm", "").split("_");
			aux = aux2[0];
			System.out.println("Calculating the upgrade plan for removing " + aux);
			ap = new UpgradePlan("remove " + aux);
			
			if (ap.isCompletelyCovered()) {
					upgradePlans.add(ap);
					writeXML(ap, "removePlans");
			}
			else
				System.out.println("Upgrade plan for " + aux + " discarded since not completely covered");
				
		}
		
		System.out.println("Remove plans calculated. They are " + upgradePlans.size() + " in total.");
	//	System.out.println("Creating corresponding xml files....");
	//	writeXML(upgradePlans,"removePlans");
		
		
	}
	
	public  static void writeXML(UpgradePlan up, String filePath) throws Exception {

		String line;

		XMLFileWriter xml;
		
		int numUp = 0;
		
	
		File upgradePlanFile = new File(filePath + File.separator + "upgradePlan_" + up.getOperation() + "_" + up.getPackageName() + ".xml");
		xml = new XMLFileWriter(upgradePlanFile.getPath());

		ArrayList<Operation> sequence = up.getSequence();
		Iterator<Operation> sequenceIterator = sequence.iterator();
		
		while (sequenceIterator.hasNext()){
	
			Operation op = sequenceIterator.next();
			if (op.getType().equals("install")) {
				xml.createInstallSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}

			if (op.getType().equals("purge")) {
				xml.createPurgeSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}

			if (op.getType().equals("remove")) {
				xml.createRemoveSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}
		}
		xml.closeFile();		
	}
	
	public  static void writeXML(ArrayList<UpgradePlan> upgradePlans, String filePath) throws Exception {

		String line;

		XMLFileWriter xml;
		
		int numUp = 0;
		
		Iterator<UpgradePlan> upgradePlansIterator = upgradePlans.iterator();
		while (upgradePlansIterator.hasNext()) {
			
			UpgradePlan  up = upgradePlansIterator.next();		
			File upgradePlanFile = new File(filePath + File.separator + "upgradePlan_" + up.getOperation() + "_" + up.getPackageName() + ".xml");
			xml = new XMLFileWriter(upgradePlanFile.getPath());

			ArrayList<Operation> sequence = up.getSequence();
			Iterator<Operation> sequenceIterator = sequence.iterator();
			
			while (sequenceIterator.hasNext()){
		
				Operation op = sequenceIterator.next();
				System.out.println(op.getName());
				System.out.println(op.getType());				
				if (op.getType().equals("install")) {
					xml.createInstallSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
	
				if (op.getType().equals("purge")) {
					xml.createPurgeSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
	
				if (op.getType().equals("remove")) {
					xml.createRemoveSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
			}
			xml.closeFile();	
		}		
	}

}
