package by.epamlab.dlx.model.interfaces;

/**
 * Created by Sergei Astapenko on 04.06.2016.
 */
public interface IUserDAO {
    boolean isRegisteredUser(String login, String password);
}
