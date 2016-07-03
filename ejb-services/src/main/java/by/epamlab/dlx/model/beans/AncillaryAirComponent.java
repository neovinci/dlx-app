package by.epamlab.dlx.model.beans;

import java.io.Serializable;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class AncillaryAirComponent implements Serializable {
    private String airComponentCode;

    public AncillaryAirComponent(String code) {
        this.airComponentCode = code;
    }

    public String getAirComponentCode() {
        return airComponentCode;
    }

    public void setAirComponentCode(String code) {
        this.airComponentCode = code;
    }
}
