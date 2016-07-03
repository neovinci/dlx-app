package by.epamlab.dlx.ejb.objects;



import by.epamlab.dlx.model.beans.FareFamily;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */
public interface FareFamilyEJB extends EJBObject{
    FareFamily getFareFamily() throws RemoteException;
}
