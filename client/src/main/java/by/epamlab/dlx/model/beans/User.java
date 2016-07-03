package by.epamlab.dlx.model.beans;

/**
 * Created by Sergei Astapenko on 02.06.2016.
 */
public class User {
    private String login;

    public User(String login) {
        this.login = login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
