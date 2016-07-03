package by.epamlab.dlx.model.exceptions;

/**
 * Created by Sergei Astapenko on 02.07.2016.
 */
public class XMLDataException extends RuntimeException {

    public XMLDataException() {
    }

    public XMLDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLDataException(String message) {
        super(message);
    }

    public XMLDataException(Throwable cause) {
        super(cause);
    }
}
