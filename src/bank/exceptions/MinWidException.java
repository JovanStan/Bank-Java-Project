package bank.exceptions;

public class MinWidException extends Exception{

    public MinWidException() {
    }

    public MinWidException(String message) {
        super(message);
    }

    public MinWidException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinWidException(Throwable cause) {
        super(cause);
    }

    public MinWidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
