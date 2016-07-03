package by.epamlab.dlx.ejb.objects;



import by.epamlab.dlx.model.beans.Customer;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by Sergei Astapenko on 23.06.2016.
 */

public interface CustomerEJB extends EJBObject{
    Customer getCustomer() throws RemoteException;
}
