public class NegativeException extends Exception {

    private int message;

    public NegativeException(int msg) {
        msg = message;
    }

    public String getMessage() {
        return "You have a negative value.";
    }
}