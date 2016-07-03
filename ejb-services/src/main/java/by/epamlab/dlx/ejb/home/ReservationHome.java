package by.epamlab.dlx.ejb.home;

import by.epamlab.dlx.ejb.objects.ReservationEJB;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public interface ReservationHome extends EJBHome {
    ReservationEJB create() throws RemoteException, CreateException;
}
