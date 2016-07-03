package by.epamlab.dlx.model.factories;



import by.epamlab.dlx.model.impl.XMLCustomerImpl;
import by.epamlab.dlx.model.impl.XMLFareFamilyImpl;
import by.epamlab.dlx.model.impl.XMLReservationImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergei Astapenko on 12.06.2016.
 */
public class DAOFactory {
    private static final Map DAOMap = new HashMap();

    static {
        DAOMap.put(XMLCustomerImpl.class, new XMLCustomerImpl());
        DAOMap.put(XMLReservationImpl.class, new XMLReservationImpl());
        DAOMap.put(XMLFareFamilyImpl.class, new XMLFareFamilyImpl());
    }

    public static <T> T getDAO(Class<T> DAOImpl) {
        return DAOImpl.cast(DAOMap.get(DAOImpl));
    }
}
