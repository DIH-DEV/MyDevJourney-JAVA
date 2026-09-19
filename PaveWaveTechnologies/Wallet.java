package PaveWaveTechnologies;

public abstract class Wallet {
    private String walletID;
    private double balance;

    public Wallet(double balance, String walletID){
        this.balance = balance;
        this.walletID = walletID;
    }
    public String getWalletID() {
        return walletID;
    }
    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double deposit(double amount) {
        double balance = getBalance();
        if (amount > 0.0) {
            balance += amount;
            setBalance(balance);
        } else {
            System.out.println("Deposit Amount must be greater than ZERO(0)");
        }
        return balance;
    }
    public double transfer(double amount, Wallet toWallet) {
        if (amount > 0.0 && getBalance() > amount && toWallet != null){
            double debitBalance = getBalance() - amount;
            setBalance(debitBalance); //Debit Transaction
            double creditBalance = toWallet.getBalance() + amount;
            toWallet.setBalance(creditBalance); //credit transaction
        }else{
            System.out.println("Transfer Amount Must be Greater Than ZERO");
        }
        return getBalance();
    }
    public abstract double withdraw(double amount);

}
