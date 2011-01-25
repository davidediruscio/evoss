package it.univaq.mancoosi.injectors.packages.util;

import gts.modernization.interpreter.Gra2MoLDebugger;
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;

import java.io.File;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.PrintStream;
import java.util.List;

public class Gra2MoLDinamicInterpreter {

	private String pathSourceView;
	private String pathMetamodel;
	private String targetMetamodel;
	private String result;
	private String grammar;
	private String mainRule;
	private boolean caseSensitive = true;
	private List<String> sourceFilePaths;

	public Gra2MoLDinamicInterpreter(String pathSourceView,
			String pathMetamodel, String targetMetamodel, String result,
			String grammar, String mainRule, List<String> sourceFilePaths) {
		
		this.pathSourceView = pathSourceView;
		this.pathMetamodel = pathMetamodel;
		this.targetMetamodel = targetMetamodel;
		this.result = result;
		this.grammar = grammar;
		this.mainRule = mainRule;
		this.sourceFilePaths = sourceFilePaths;
	}

	@SuppressWarnings("static-access")
	public void execute() {
		
		Gra2MoLDebugger.setQuiet(true);

	//	PrintStream printStreamOriginal=System.out;
 
		/*System.setOut(new PrintStream(new OutputStream() {
			@Override
			public void write(int arg0) throws IOException {
			}
		}));*/

		Gra2MoLInterpreterLauncher launcher = new Gra2MoLInterpreterLauncher(
				this.pathSourceView, this.pathMetamodel, this.targetMetamodel,
				this.result, this.grammar, this.mainRule, this.sourceFilePaths);
		launcher.setCaseSensitive(this.caseSensitive);
		launcher.launch();
		
		// System.setOut(printStreamOriginal);
		 
		(new File(launcher.CST_SAVE_PATH)).deleteOnExit();
		(new File(launcher.ABSTRACT_SYNTAX_SAVE_PATH)).deleteOnExit();
	}
 
	public void setPathSourceView(String pathSourceView) {
		this.pathSourceView = pathSourceView;
	}

	public void setPathMetamodel(String pathMetamodel) {
		this.pathMetamodel = pathMetamodel;
	}

	public void setTargetMetamodel(String targetMetamodel) {
		this.targetMetamodel = targetMetamodel;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setGrammar(String grammar) {
		this.grammar = grammar;
	}

	public void setMainRule(String mainRule) {
		this.mainRule = mainRule;
	}

	public void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
}