package BowenMfb;

public class BusinessWallet extends VirtualWallet{
    final int charges = 50;

    public BusinessWallet(double balance){
        super(balance);
    }

    @Override
    public double withdrawal(double amount) {
        if (amount < (super.getBalance() + charges)){
            double newBalance = super.getBalance() - (amount + charges);
            super.setBalance(newBalance);
            double balance = super.getBalance();
            System.out.println("You have successfully withdrawn: $" + amount );
            System.out.println("STAMP DUTY FEE: $"+ charges);
            System.out.println("New Balance: $"+ balance);
            System.out.println();
        }
        else {
            System.out.println("WITHDRAWAL FAILED!");
        }
        return super.getBalance();
    }
}
