package by.epamlab.dlx.ejb.beans;

import by.epamlab.dlx.model.beans.Reservation;
import by.epamlab.dlx.model.factories.DAOFactory;
import by.epamlab.dlx.model.impl.XMLReservationImpl;
import by.epamlab.dlx.model.interfaces.IReservationDAO;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class ReservationBean implements SessionBean {
    public void setSessionContext(SessionContext sessionContext) {

    }

    public void ejbRemove() {

    }

    public void ejbActivate() {

    }

    public void ejbPassivate() {

    }

    public void ejbCreate() {
    }

    public Reservation getReservation() {
        IReservationDAO  reservationDAO = DAOFactory.getDAO(XMLReservationImpl.class);
        return reservationDAO.getReservation();
    }
}
