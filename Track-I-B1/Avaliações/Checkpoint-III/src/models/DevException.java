package models;

public class DevException extends Exception {

    public DevException() {
        super();
    }

    public DevException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
