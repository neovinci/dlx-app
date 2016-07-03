package by.epamlab.dlx.model.beans;

import java.io.Serializable;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class Payment implements Serializable{
    private String amountPaid;
    private String formOfPaymentTypeCode;
    private String currencyCode;

    public Payment(String amountPaid, String formOfPaymentTypeCode, String currencyCode) {
        this.amountPaid = amountPaid;
        this.formOfPaymentTypeCode = formOfPaymentTypeCode;
        this.currencyCode = currencyCode;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getFormOfPaymentTypeCode() {
        return formOfPaymentTypeCode;
    }

    public void setFormOfPaymentTypeCode(String formOfPaymentTypeCode) {
        this.formOfPaymentTypeCode = formOfPaymentTypeCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
