package exceptions;

public class ArgumentOutOfBoundException extends Exception {
    public ArgumentOutOfBoundException() {
        super();
    }
    public ArgumentOutOfBoundException(final String message) {
        super(message);
    }
    public ArgumentOutOfBoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    public ArgumentOutOfBoundException(final Throwable cause) {
        super(cause);
    }
}
