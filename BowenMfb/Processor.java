package BowenMfb;


public class Processor {
    public static void main(String[] args) {
        FlexWallet flexWallet = new FlexWallet(1000);
        BusinessWallet businessWallet = new BusinessWallet(2000);

        System.out.println("Flex Wallet Balance: $" + flexWallet.getBalance());//Account Statement
        System.out.println("Business Wallet Balance: $"+ businessWallet.getBalance());//Account Statement
        System.out.println(" ");

        //Deposit Transaction
        System.out.println("DEPOSIT TRANSACTION");
        flexWallet.deposit(4000);
        System.out.println(" ");
        //Account Statement
        System.out.println("Flex Wallet Balance: $" + flexWallet.getBalance());
        System.out.println("Business Wallet Balance: $"+ businessWallet.getBalance());
        System.out.println(" ");
        //Transfer Transaction
        flexWallet.transfer(2000,businessWallet);
        System.out.println(" ");
        System.out.println("Business Wallet Balance: $"+ businessWallet.getBalance());
        //Withdrawal
        System.out.println(" ");
        businessWallet.withdrawal(1500);

    }
}
