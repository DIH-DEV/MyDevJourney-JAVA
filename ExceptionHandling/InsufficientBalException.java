package ExceptionHandling;

public class InsufficientBalException extends RuntimeException {

    private final double balance;
    private final double requestedAmount;

    public InsufficientBalException(String message, double balance, double requestedAmount) {
        super(message);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }
    public double getRequestedAmount(){
        return requestedAmount;
    }
}
