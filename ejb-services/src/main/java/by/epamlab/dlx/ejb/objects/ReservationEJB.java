package by.epamlab.dlx.ejb.objects;

import by.epamlab.dlx.model.beans.Reservation;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public interface ReservationEJB extends EJBObject {
    Reservation getReservation() throws RemoteException;
}
