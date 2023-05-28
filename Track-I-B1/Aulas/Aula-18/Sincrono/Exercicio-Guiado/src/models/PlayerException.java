package models;

public class PlayerException extends RuntimeException {

    public PlayerException() {
        super();
    }

    public PlayerException(String message) {
        super(message);
    }

    public PlayerException(Throwable cause) {
        super(cause);
    }


}

