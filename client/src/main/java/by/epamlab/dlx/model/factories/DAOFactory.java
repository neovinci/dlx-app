package by.epamlab.dlx.model.factories;

import by.epamlab.dlx.model.impl.SQLUserImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergei Astapenko on 12.06.2016.
 */
public class DAOFactory {
    private static final Map DAOMap = new HashMap();

    static {
        DAOMap.put(SQLUserImpl.class, new SQLUserImpl());
        //DAOMap.put(XMLReservationImpl.class, new XMLReservationImpl());
    }

    public static <T> T getDAO(Class<T> DAOImpl) {
        return DAOImpl.cast(DAOMap.get(DAOImpl));
    }
}
