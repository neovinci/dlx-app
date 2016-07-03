package by.epamlab.dlx.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class Customer implements Serializable{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<Payment> payments;

    public Customer() {
        this(null, null, null, null, null, null);
    }

    public Customer(String id, String firstName, String lastName, String email, String phone, List<Payment> payments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.payments = payments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
