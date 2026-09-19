package PaveWaveTechnologies;

public class BusinessWallet extends Wallet {
    final int charges = 30;
    public BusinessWallet(double balance, String walletID) {
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
                System.out.println("Withdraw amount must be Greater than ZEO(0)");
            }
        }else{
            System.out.println("BALANCE IS LOWER THAN WITHRAWAL AMOUNT!");
        }
        return balance;
    }
}
