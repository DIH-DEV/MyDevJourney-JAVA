package BowenMfb;

public class FlexWallet extends VirtualWallet {
    final int charges = 30;
    public FlexWallet(double balance) {
        super(balance);
    }

    @Override
    public double withdrawal(double amount) {
        if (amount < super.getBalance() && amount > 0){
            double newBalance = super.getBalance() - (amount + charges);
            setBalance(newBalance);
            System.out.println("WITHDRAWAL SUCCESSFUL \n Withdrawal amount: $"+ amount + "\n Account Balance: $" + super.getBalance());
        }else {
            System.out.println("Transaction NOT successful!");

        }
        return super.getBalance();
    }
}
