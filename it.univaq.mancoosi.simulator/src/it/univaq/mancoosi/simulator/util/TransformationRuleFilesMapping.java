/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Manages the mapping between the elements 
 * of a model and related files ATL
 * @author max
 */
public class TransformationRuleFilesMapping {

	private static TransformationRuleFilesMapping instance = null;
	private SimulatorConfig config = null;
	private HashMap<String, String> map = null;

	/**
	 * Singleton
	 * @return instance
	 * @throws SimulatorException
	 */
	public static TransformationRuleFilesMapping getInstance() throws SimulatorException {
		if (instance == null)
			instance = new TransformationRuleFilesMapping();
		return instance;
	}

	/**
	 * Private constructor
	 * 
	 * @throws SimulatorException
	 */
	private TransformationRuleFilesMapping() throws SimulatorException {

		config = SimulatorConfig.getInstance();
		map = new HashMap<String, String>();
		parseFile();
	}

	/**
	 * File Parser
	 * 
	 * @throws SimulatorException
	 */
	private void parseFile() throws SimulatorException {
		try {
			File file = new File(config.getDirTransformationRepository()
					+ "mapping.xml");

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nodeLst = doc.getElementsByTagName("mapping");

			for (int s = 0; s < nodeLst.getLength(); s++) {

				Node fstNode = nodeLst.item(s);

				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					map.put(fstNode.getAttributes()
							.getNamedItem("elementModel").getNodeValue(),
							fstNode.getAttributes().getNamedItem(
									"transformationFile").getNodeValue());
				}

			}

		} catch (SAXException e) {
			throw new SimulatorException("Error in the parser SAX", e);
		} catch (IOException e) {
			throw new SimulatorException("IO Error in XML parser", e);
		} catch (ParserConfigurationException e) {
			throw new SimulatorException("Error in the XML parser Configuration", e);
		}

	}

	/**
	 * Returns the path of the file associated with
	 * the model element passed as parameter
	 * 
	 * @param elementModel
	 * @return Path file
	 */
	public String getPathFileTransformation(String elementModel) {
		String pathRule = config.getDirTransformationRepository()
				+ map.get(elementModel);
		return pathRule;
	}

	/**
	 * Returns the filename associated with the model
	 * element passed as parameter
	 * @param elementModel
	 * @return Filename
	 */
	public String getFileTransformation(String elementModel) {
		return map.get(elementModel);
	}

	/**
	 * Verify the existence of a file associated with
	 * the element passed as actual parameter
	 * 
	 * @param elementModel
	 * @return boolean
	 */
	public Boolean existsTransformationRule(String elementModel) {
		return map.containsKey(elementModel);
	}
}
