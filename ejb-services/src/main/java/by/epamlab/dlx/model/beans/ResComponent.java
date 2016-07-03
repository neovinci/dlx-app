package by.epamlab.dlx.model.beans;

import java.io.Serializable;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class ResComponent implements Serializable{
    private String componentTypeCode;
    private String createDateTime;
    private String internalStatus;
    private String sequence;

    public ResComponent(String componentTypeCode, String createDateTime, String internalStatus, String sequence) {
        this.componentTypeCode = componentTypeCode;
        this.createDateTime = createDateTime;
        this.internalStatus = internalStatus;
        this.sequence = sequence;
    }

    public String getComponentTypeCode() {
        return componentTypeCode;
    }

    public void setComponentTypeCode(String componentTypeCode) {
        this.componentTypeCode = componentTypeCode;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getInternalStatus() {
        return internalStatus;
    }

    public void setInternalStatus(String internalStatus) {
        this.internalStatus = internalStatus;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
