package by.epamlab.dlx.model.impl;

import by.epamlab.dlx.model.beans.ResComponent;
import by.epamlab.dlx.model.beans.Reservation;
import by.epamlab.dlx.model.exceptions.XMLDataException;
import by.epamlab.dlx.model.interfaces.IReservationDAO;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class XMLReservationImpl extends XMLAbstractClass implements IReservationDAO {
    public Reservation getReservation() {
        Reservation reservation = null;

        try {
            Document document = getDocument("D:\\Sergei Astapenko\\EPAM\\Java tasks\\dlx-app\\ejb-services\\src\\main\\resources\\dlx.xml");

            NodeList reservationList = document.getElementsByTagName("Reservation");
            Node node = reservationList.item(0);
            Element element = (Element) node;

            String code = element.getAttribute("Code");
            String description = element.getAttribute("Description");

            NodeList resComponentNodes = element.getElementsByTagName("ResComponent");
            List<ResComponent> resComponents = new ArrayList<ResComponent>();

            for (int j = 0; j < resComponentNodes.getLength(); j++) {
                Node jNode = resComponentNodes.item(j);
                Element jElement = (Element) jNode;
                String typeCode = jElement.getAttribute("ComponentTypeCode");
                String dateTime = jElement.getAttribute("CreateDateTime");
                String status = jElement.getAttribute("InternalStatus");
                String sequence = jElement.getAttribute("Sequence");
                ResComponent resComponent = new ResComponent(typeCode, dateTime, status, sequence);
                resComponents.add(resComponent);
            }

            reservation = new Reservation(code, description, resComponents);
            return reservation;
        } catch (Exception e) {
            throw new XMLDataException("Reservation XML parse exception", e);
        }
    }
}
