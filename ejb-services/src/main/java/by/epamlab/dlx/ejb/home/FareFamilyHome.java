package by.epamlab.dlx.ejb.home;

import by.epamlab.dlx.ejb.objects.FareFamilyEJB;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */
public interface FareFamilyHome extends EJBHome {
    FareFamilyEJB create() throws RemoteException, CreateException;
}
