package BowenMfb;

public abstract class VirtualWallet {
    private double balance;

    public VirtualWallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount >= 1000) {
            balance += amount;
            System.out.println("You have successfully Deposited: $" + amount + "\n New Balance: $" + balance);
        } else {
            System.out.println("DEPOSIT MUST BE GREATER THAN 1000");
        }
        return balance;
    }

    public double transfer(double amount, VirtualWallet toWallet) {
        if (amount > 0 && toWallet != null) {

            double creditBalance = toWallet.getBalance() + amount;
            toWallet.setBalance(creditBalance);//Credit Transaction
            double debitBalance = getBalance() - amount;
            setBalance(debitBalance);// Debit Transaction
            double newBalance = getBalance();
            System.out.println("You have successfully Transferred: $" + amount + "\n Recipient wallet: "+ toWallet + "\n New Balance: $" + newBalance);
        } else {
            System.out.println("Transaction  NOT Successfull ");
        }
        return getBalance();
    }

    public double checkBalance(double balance) {
        this.balance = balance;
        return balance;
    }
    public abstract double withdrawal(double amount);
}
