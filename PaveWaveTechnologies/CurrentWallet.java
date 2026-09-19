package PaveWaveTechnologies;

public class CurrentWallet extends Wallet{
    final int charges = 100;

    public CurrentWallet(double balance, String walletID) {
        super(balance, walletID);
    }

    @Override
    public double withdraw(double amount) {
        double balance = super.getBalance();
        if (balance > amount){
            if (amount >0.0){
                balance -= (amount + charges);
                super.setBalance(balance);
            }else {
                System.out.println("Withdraw amount must be Greater than ZERO(0)");
            }
        }else{
            System.out.println("BALANCE IS LOWER THAN WITHRAWAL AMOUNT!");
        }
        return balance;
    }
}
