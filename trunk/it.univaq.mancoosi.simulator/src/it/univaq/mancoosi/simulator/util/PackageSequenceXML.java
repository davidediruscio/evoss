/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import it.univaq.mancoosi.simulator.entity.ActionPkg;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * Manages the list of packages from an XML file
 * @author max
 */
class PackageSequenceXML extends PackageSequence {

	private ArrayList<ActionPkg> sequencepkg = null;

	/**
	 * Constructor
	 * @throws SimulatorException
	 */
	PackageSequenceXML() throws SimulatorException {
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

			DocumentBuilderFactory factoryDoc = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuild;

			docBuild = factoryDoc.newDocumentBuilder();

			Document doc;

			doc = docBuild.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nodeLst = doc.getElementsByTagName("package");

			for (int s = 0; s < nodeLst.getLength(); s++) {

				Node fstNode = nodeLst.item(s);

				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

					Element fstElmnt = (Element) fstNode;
					NodeList fstNmElmntLst = fstElmnt
							.getElementsByTagName("action");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();

					ActionPkg packageElement = new ActionPkg(fstNode
							.getAttributes().getNamedItem("name")
							.getNodeValue(), ((Node) fstNm.item(0))
							.getNodeValue());

					sequencepkg.add(packageElement);

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

	@Override
	public String getPackageNameInput(int index) {
		return sequencepkg.get(index).getPackageNameInput();
	}

	@Override
	public String getPackageAction(int index) {
		return sequencepkg.get(index).getAction();
	}

	@Override
	public int getSizePackageSequence() {
		return sequencepkg.size();
	}

}
