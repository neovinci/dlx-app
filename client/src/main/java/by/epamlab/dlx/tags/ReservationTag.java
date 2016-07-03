package by.epamlab.dlx.tags;

import by.epamlab.dlx.ejb.home.ReservationHome;
import by.epamlab.dlx.ejb.objects.ReservationEJB;
import by.epamlab.dlx.model.beans.Reservation;
import by.epamlab.dlx.utilities.ServerContext;

import javax.naming.Context;
import javax.rmi.PortableRemoteObject;
import javax.servlet.jsp.JspException;
import java.io.IOException;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class ReservationTag extends AbstractTag {
    @Override
    public void doTag() throws JspException, IOException {
        Reservation reservation = null;
        Context ic = null;
        try {
            ic = ServerContext.getContext(ServerContext.JBossProperties);
            Object ctxUserService = ic.lookup("ReservationCompSv");
            ReservationHome serviceHome = (ReservationHome) PortableRemoteObject.narrow(ctxUserService,
                    ReservationHome.class);
            ReservationEJB serviceEJB = serviceHome.create();
            reservation = serviceEJB.getReservation();
            getJspContext().setAttribute(getVar(), reservation);
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
