package by.epamlab.dlx.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class FareFamily implements Serializable{
    private String fareFamilyCode;
    private List<AncillaryAirComponent> airComponents;

    public FareFamily(String code) {
        this.fareFamilyCode = code;
    }

    public FareFamily(String code, List<AncillaryAirComponent> airComponents) {
        this.fareFamilyCode = code;
        this.airComponents = airComponents;
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String code) {
        this.fareFamilyCode = code;
    }

    public List<AncillaryAirComponent> getAirComponents() {
        return airComponents;
    }

    public void setAirComponents(List<AncillaryAirComponent> airComponents) {
        this.airComponents = airComponents;
    }
}
