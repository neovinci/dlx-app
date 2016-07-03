package by.epamlab.dlx.model.impl;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class XMLAbstractClass {
    protected Document getDocument(String fileName) throws IOException, SAXException, ParserConfigurationException {
        File customerXML = new File(fileName);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(customerXML);
        return document;
    }
}
