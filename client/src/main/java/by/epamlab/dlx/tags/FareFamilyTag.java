package by.epamlab.dlx.tags;

import by.epamlab.dlx.ejb.home.FareFamilyHome;
import by.epamlab.dlx.ejb.objects.FareFamilyEJB;
import by.epamlab.dlx.model.beans.FareFamily;
import by.epamlab.dlx.utilities.ServerContext;

import javax.naming.Context;
import javax.rmi.PortableRemoteObject;
import javax.servlet.jsp.JspException;
import java.io.IOException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class FareFamilyTag extends AbstractTag {
    @Override
    public void doTag() throws JspException, IOException {
        FareFamily fareFamily = null;
        Context ic = null;
        try {
            ic = ServerContext.getContext(ServerContext.JBossProperties);
            Object ctxUserService = ic.lookup("FareFamilySv");
            FareFamilyHome serviceHome = (FareFamilyHome) PortableRemoteObject.narrow(ctxUserService,
                    FareFamilyHome.class);
            FareFamilyEJB serviceEJB = serviceHome.create();
            fareFamily = serviceEJB.getFareFamily();
            getJspContext().setAttribute(getVar(), fareFamily);
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
