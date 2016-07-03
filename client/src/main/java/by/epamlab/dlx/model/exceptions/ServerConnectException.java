package by.epamlab.dlx.model.exceptions;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class ServerConnectException extends Throwable {
    public ServerConnectException() {
    }

    public ServerConnectException(String message) {
        super(message);
    }

    public ServerConnectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerConnectException(Throwable cause) {
        super(cause);
    }
}
