package it.univaq.mancoosi.injectors.packages.util;

import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;



public class InjectorStatistics {
	
	private static InjectorStatistics INSTANCE = null;
	
	private Integer correctPackageNoScript;
	private Integer correctPackageWithScript;
	private Integer errorPackageNoScript;
	private Integer errorPackageWithScript;	

	public static InjectorStatistics getInstance() {
		if (INSTANCE == null)
			INSTANCE = new InjectorStatistics();
		return INSTANCE;
	}

	protected InjectorStatistics() {
		correctPackageNoScript = 0;
		correctPackageWithScript = 0;
		errorPackageNoScript = 0;
		errorPackageWithScript = 0;	
		
	}

	public void incrementCorrectPackageNoScript() {
		this.correctPackageNoScript = correctPackageNoScript + 1;
	}

	public void appendCorrectPackageNoScript(String filename) throws FileNotFoundException, InjectorException{
		FileOutputStream file = new FileOutputStream(InjectorConfig.getInstance().getCorrectPackageNoScriptFile(),true);
		PrintStream Output = new PrintStream(file);
		Output.println(filename);
		Output.close();
	}
	
	
	public Integer getCorrectPackageNoScript() {
		return correctPackageNoScript;
	}

	public void incrementCorrectPackageWithScript() {
		this.correctPackageWithScript = correctPackageWithScript + 1;
	}
	
	public void appendCorrectPackageWithScript(String filename) throws FileNotFoundException, InjectorException{
		FileOutputStream file = new FileOutputStream(InjectorConfig.getInstance().getCorrectPackageWithScriptFile(),true);
		PrintStream Output = new PrintStream(file);
		Output.println(filename);
		Output.close();
	}

	public Integer getCorrectPackageWithScript() {
		return correctPackageWithScript;
	}

	public void incrementErrorPackageNoScript() {
		errorPackageNoScript = errorPackageNoScript + 1;
	}
	
	public void appendErrorPackageNoScript(String filename) throws FileNotFoundException, InjectorException{
		FileOutputStream file = new FileOutputStream(InjectorConfig.getInstance().getErrorPackageNoScriptFile(),true);
		PrintStream Output = new PrintStream(file);
		Output.println(filename);
		Output.close();
	}

	public Integer getErrorPackageNoScript() {
		return errorPackageNoScript;
	}

	public void incrementErrorPackageWithScript() {
		this.errorPackageWithScript = errorPackageWithScript + 1;
	}
	
	public void appendErrorPackageWithScript(String filename) throws FileNotFoundException, InjectorException{
		FileOutputStream file = new FileOutputStream(InjectorConfig.getInstance().getErrorPackageWithScriptFile(),true);
		PrintStream Output = new PrintStream(file);
		Output.println(filename);
		Output.close();
	}

	public Integer getErrorPackageWithScript() {
		return errorPackageWithScript;
	}
}
