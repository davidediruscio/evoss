package it.univaq.mancoosi.validator.util;

import com.ociweb.xml.Version;
import com.ociweb.xml.WAX;

public class XMLFileWriter {

	private WAX wax;

	public XMLFileWriter(String filePath) {
		wax = new WAX(filePath, Version.V1_0);
		wax.start("selectionStates").defaultNamespace("http://www.w3.org/2001/XMLSchema-instance");
	}
	
	public void closeFile() {
		wax.close();
	}

	public void createInstallSelection(String name, String version, String architecture) {
		wax.start("selectionState").attr("type", "install");
		wax.start("param").attr("name", "package").attr("value", name).end();
		wax.start("param").attr("name", "version").attr("value", version).end();
		wax.start("param").attr("name", "architecture").attr("value", architecture).end();
		wax.end();
	}

	public void createRemoveSelection(String name, String version, String architecture) {
		wax.start("selectionState").attr("type", "remove");
		wax.start("param").attr("name", "package").attr("value", name).end();
		wax.start("param").attr("name", "version").attr("value", version).end();
		wax.start("param").attr("name", "architecture").attr("value", architecture).end();
		wax.end();
	}

	public void createRemoveSelection(String name, String version) {
		wax.start("selectionState").attr("type", "remove");
		wax.start("param").attr("name", "package").attr("value", name).end();
		wax.start("param").attr("name", "version").attr("value", version).end();
		wax.end();
	}

	public void createPurgeSelection(String name, String version, String architecture) {
		wax.start("selectionState").attr("type", "purge");
		wax.start("param").attr("name", "package").attr("value", name).end();
		wax.start("param").attr("name", "version").attr("value", version).end();
		wax.start("param").attr("name", "architecture").attr("value", architecture).end();
		wax.end();
	}
	
	public void createPurgeSelection(String name, String version) {
		wax.start("selectionState").attr("type", "purge");
		wax.start("param").attr("name", "package").attr("value", name).end();
		wax.start("param").attr("name", "version").attr("value", version).end();
		wax.end();
	}

}
