package by.epamlab.dlx.model.impl;

import by.epamlab.dlx.model.beans.AncillaryAirComponent;
import by.epamlab.dlx.model.beans.Customer;
import by.epamlab.dlx.model.beans.FareFamily;
import by.epamlab.dlx.model.beans.Payment;
import by.epamlab.dlx.model.exceptions.XMLDataException;
import by.epamlab.dlx.model.interfaces.IFareFamilyDAO;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class XMLFareFamilyImpl extends XMLAbstractClass implements IFareFamilyDAO {
    public FareFamily getFareFamily() {
        FareFamily fareFamily = null;
        try {
            Document document = getDocument("D:\\Sergei Astapenko\\EPAM\\Java tasks\\dlx-app\\ejb-services\\src\\main\\resources\\dlx.xml");

            NodeList fareFamilyNodes = document.getElementsByTagName("FareFamily");
            Element fareFamilyElement = (Element) fareFamilyNodes.item(0);
            String code = fareFamilyElement.getAttribute("FareFamilyCode");

            NodeList componentsNodes = fareFamilyElement.getElementsByTagName("AncillaryAirComponent");
            List<AncillaryAirComponent> components = new ArrayList<AncillaryAirComponent>();

            for (int i = 0; i < componentsNodes.getLength(); i++) {
                Node iNode = componentsNodes.item(i);
                Element iElement = (Element) iNode;

                String componentCode = iElement.getAttribute("AncillaryAirComponentCode");

                AncillaryAirComponent component = new AncillaryAirComponent(componentCode);
                components.add(component);
            }

            fareFamily = new FareFamily(code, components);
            return fareFamily;
        } catch (Exception e) {
            throw new XMLDataException("FareFamily XML parse exception", e);
        }
    }
}
