package exceptions;

public class MathDividingException extends Exception {
    public MathDividingException() {
        super();
    }
    public MathDividingException(final String message) {
        super(message);
    }
    public MathDividingException(final Throwable cause) {
        super(cause);
    }
    public MathDividingException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
