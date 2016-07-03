package by.epamlab.dlx.model.impl;

import by.epamlab.dlx.model.beans.Customer;
import by.epamlab.dlx.model.beans.Payment;
import by.epamlab.dlx.model.exceptions.XMLDataException;
import by.epamlab.dlx.model.interfaces.ICustomerDAO;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergei Astapenko on 02.07.2016.
 */
public class XMLCustomerImpl extends XMLAbstractClass implements ICustomerDAO  {
    public Customer getCustomer() {
        Customer customer = null;
        try {
            Document document = getDocument("D:\\Sergei Astapenko\\EPAM\\Java tasks\\dlx-app\\ejb-services\\src\\main\\resources\\dlx.xml");

            NodeList customerList = document.getElementsByTagName("Customer");
            Element customerElement = (Element) customerList.item(0);
            String id = customerElement.getAttribute("CustomerDocID");
            String firstName = customerElement.getAttribute("FirstName");
            String  lastName = customerElement.getAttribute("LastName");

            NodeList emailList = customerElement.getElementsByTagName("Email");
            Element emailElement = (Element) emailList.item(0);
            String email = emailElement.getAttribute("EmailAddress");

            NodeList phoneList = customerElement.getElementsByTagName("Phone");
            Element phoneElement = (Element) phoneList.item(0);
            String phone = phoneElement.getAttribute("PhoneNumber");

            NodeList paymentsList = customerElement.getElementsByTagName("Payment");
            List<Payment> paymentList = new ArrayList<Payment>();

            for (int i = 0; i < paymentsList.getLength(); i++) {
                Node iNode = paymentsList.item(i);
                Element iElement = (Element) iNode;

                String amountPaid = iElement.getAttribute("AmountPaid");
                String formOfPayment = iElement.getAttribute("FormOfPaymentTypeCode");
                String currencyCode = iElement.getAttribute("CurrencyCode");

                Payment payment = new Payment(amountPaid, formOfPayment, currencyCode);
                paymentList.add(payment);
            }

            customer = new Customer(id, firstName, lastName, email, phone, paymentList);
            return customer;
        } catch (Exception e) {
          throw new XMLDataException("Customer XML parse exception", e);
        }
    }
}
