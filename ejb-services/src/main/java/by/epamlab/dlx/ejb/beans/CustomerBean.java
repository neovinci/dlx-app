package by.epamlab.dlx.ejb.beans;



import by.epamlab.dlx.ejb.objects.CustomerEJB;
import by.epamlab.dlx.model.beans.Customer;
import by.epamlab.dlx.model.factories.DAOFactory;
import by.epamlab.dlx.model.impl.XMLCustomerImpl;
import by.epamlab.dlx.model.interfaces.ICustomerDAO;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */
public class CustomerBean implements SessionBean {


    public void ejbCreate() {
    }

    public void setSessionContext(SessionContext sessionContext){

    }

    public void ejbRemove(){

    }

    public void ejbActivate() {

    }

    public void ejbPassivate() {

    }

    public Customer getCustomer() {
        ICustomerDAO customerDAO = DAOFactory.getDAO(XMLCustomerImpl.class);
        return customerDAO.getCustomer();
    }
}
