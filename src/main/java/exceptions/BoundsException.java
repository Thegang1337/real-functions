package exceptions;

public class BoundsException extends Exception {
    public BoundsException() {
        super();
    }
    public BoundsException(final String message) {
        super(message);
    }
    public BoundsException(final Throwable cause) {
        super(cause);
    }
    public BoundsException(final String  message, final Throwable cause) {
        super(message, cause);
    }
}
