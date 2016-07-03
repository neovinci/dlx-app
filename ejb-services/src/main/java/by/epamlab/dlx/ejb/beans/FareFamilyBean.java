package by.epamlab.dlx.ejb.beans;



import by.epamlab.dlx.model.beans.FareFamily;
import by.epamlab.dlx.model.factories.DAOFactory;
import by.epamlab.dlx.model.impl.XMLFareFamilyImpl;
import by.epamlab.dlx.model.interfaces.IFareFamilyDAO;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */
public class FareFamilyBean implements SessionBean{
    public void setSessionContext(SessionContext sessionContext) throws EJBException {

    }

    public void ejbRemove() throws EJBException {

    }

    public void ejbActivate() throws EJBException {

    }

    public void ejbPassivate() throws EJBException {

    }

    public void ejbCreate() {
    }

    public FareFamily getFareFamily() {
        IFareFamilyDAO fareFamilyDAO = DAOFactory.getDAO(XMLFareFamilyImpl.class);
        return fareFamilyDAO.getFareFamily();
    }
}
