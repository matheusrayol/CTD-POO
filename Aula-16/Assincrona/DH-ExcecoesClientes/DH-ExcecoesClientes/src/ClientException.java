public class ClientException extends Exception {

    public ClientException() {
        super();
    }

    public ClientException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
