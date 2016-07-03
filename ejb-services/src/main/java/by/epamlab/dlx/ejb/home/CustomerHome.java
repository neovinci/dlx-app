package by.epamlab.dlx.ejb.home;



import by.epamlab.dlx.ejb.objects.CustomerEJB;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */
public interface CustomerHome extends EJBHome {
    CustomerEJB create() throws RemoteException, CreateException;
}
