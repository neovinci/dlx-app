package by.epamlab.dlx.model.exceptions;

/**
 * Created by Sergei Astapenko on 04.06.2016.
 */
public class DAOException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public DAOException() {
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}
