package by.epamlab.dlx.tags;

import by.epamlab.dlx.ejb.home.CustomerHome;
import by.epamlab.dlx.ejb.objects.CustomerEJB;
import by.epamlab.dlx.model.beans.Customer;
import by.epamlab.dlx.utilities.ServerContext;

import javax.naming.Context;
import javax.rmi.PortableRemoteObject;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import java.io.IOException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class CustomerTag extends AbstractTag {
    @Override
    public void doTag() throws JspException, IOException {
        Customer customer = null;
        Context ic = null;
        try {
            ic = ServerContext.getContext(ServerContext.JBossProperties);
            Object ctxUserService = ic.lookup("CustomerSv");
            CustomerHome serviceHome = (CustomerHome) PortableRemoteObject.narrow(ctxUserService,
                    CustomerHome.class);
            CustomerEJB serviceEJB = serviceHome.create();
            customer = serviceEJB.getCustomer();
            getJspContext().setAttribute(getVar(), customer);
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
