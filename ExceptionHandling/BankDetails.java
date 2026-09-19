package ExceptionHandling;

public class BankDetails {
    private final String accountNumber;
    private double balance;

    public BankDetails(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawal(double amount){

        if (amount > balance){
            throw new InsufficientBalException ("LOW BALANCE!",balance,amount);
        }
        balance -= amount;
        System.out.println("Withdraw Amount: " + amount);
        System.out.println("Transaction Successful \n Available Balance: "+ balance);
    }

    public double getBalance() {
        return balance;
    }
}
