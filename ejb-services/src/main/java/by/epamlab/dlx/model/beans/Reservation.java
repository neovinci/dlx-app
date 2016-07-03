package by.epamlab.dlx.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class Reservation implements Serializable {
    private String code;
    private String description;
    private List<ResComponent> components;

    public Reservation(String code, String description, List<ResComponent> components) {
        this.code = code;
        this.description = description;
        this.components = components;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ResComponent> getComponents() {
        return components;
    }

    public void setComponens(List<ResComponent> components) {
        this.components = components;
    }

}
