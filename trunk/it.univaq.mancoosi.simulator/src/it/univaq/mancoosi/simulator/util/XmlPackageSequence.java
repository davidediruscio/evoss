/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import it.univaq.mancoosi.simulator.entity.ActionPkg;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * Manages the list of packages from an XML file
 */
class XmlPackageSequence extends PackageSequence {

	private ArrayList<ActionPkg> sequencepkg = null;

	/**
	 * Constructor
	 * @throws SimulatorException
	 */
	XmlPackageSequence() throws SimulatorException {
		sequencepkg = new ArrayList<ActionPkg>();
		parseFile();
	}

	/**
	 * Parser
	 * @throws SimulatorException
	 */
	private void parseFile() throws SimulatorException {

		try {
			File file = new File(config.getFilePackageSequence());

			DocumentBuilderFactory factoryDoc = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder docBuild = factoryDoc.newDocumentBuilder();
			
		    // create a SchemaFactory capable of understanding WXS schemas
		    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		    // load a WXS schema, represented by a Schema instance
		    Source schemaFile = new StreamSource(new File("config/sequenceInput.xsd"));
		    
		    Schema schema = factory.newSchema(schemaFile);

		    // create a Validator instance, which can be used to validate an instance document
		    Validator validator = schema.newValidator();
		    
			Document doc = docBuild.parse(file);

		    // validate the DOM tree
		    validator.validate(new DOMSource(doc));
			
			doc.getDocumentElement().normalize();

			NodeList nodeLst = doc.getElementsByTagName("selectionState");

			for (int s = 0; s < nodeLst.getLength(); s++) {

				Node fstNode = nodeLst.item(s);

				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

					Element fstElmnt = (Element) fstNode;
					
					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("param");
					
					ActionPkg actionPkg = new ActionPkg();

					String action = fstNode.getAttributes().getNamedItem("type").getNodeValue();
					actionPkg.setAction(action);
					
					for (int i=0; i< fstNmElmntLst.getLength(); i++) {
						
						Element fstNmElmnt = (Element) fstNmElmntLst.item(i);
						
						if (fstNmElmnt.getAttribute("name").equals("package")) {
							String packageName = fstNmElmnt.getAttribute("value");
							actionPkg.setPackageName(packageName);
						}
						
						if (fstNmElmnt.getAttribute("name").equals("version")) {
							String packageVersion = fstNmElmnt.getAttribute("value");
							actionPkg.setPackageVersion(packageVersion);
						}
						
						if (fstNmElmnt.getAttribute("name").equals("architecture")) {
							String packageArchitecture = fstNmElmnt.getAttribute("value");
							actionPkg.setPackageArchitecture(packageArchitecture);
						}	
					}
					sequencepkg.add(actionPkg);
				}
			}

		} catch (SAXException e) {
			throw new SimulatorException("Error in the SAX parser", e);
		} catch (IOException e) {
			throw new SimulatorException("IO Error in the XML parser", e);
		} catch (ParserConfigurationException e) {
			throw new SimulatorException("Error in the XML parser Configuration", e);
		}

	}

	@Override
	public String getPackageName(int index) {
		return sequencepkg.get(index).getPackageName();
	}

	@Override
	public String getPackageAction(int index) {
		return sequencepkg.get(index).getAction();
	}

	@Override
	public int getSizePackageSequence() {
		return sequencepkg.size();
	}

	@Override
	public String getPackageVersion(int index) {
		return sequencepkg.get(index).getPackageVersion();
	}

	@Override
	public String getPackageArchitecture(int index) {
		return sequencepkg.get(index).getPackageArchitecture();
	}

}
