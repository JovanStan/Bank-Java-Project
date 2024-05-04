package bank.exceptions;

public class MaxWidException extends Exception{

    public MaxWidException() {
    }

    public MaxWidException(String message) {
        super(message);
    }

    public MaxWidException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxWidException(Throwable cause) {
        super(cause);
    }

    public MaxWidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
