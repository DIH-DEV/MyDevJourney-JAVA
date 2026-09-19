package PaveWaveTechnologies;

public class RunApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Shayo","Newman");
        SavingsWallet savingsWallet = new SavingsWallet(100000,"34231");
        BusinessWallet businessWallet = new BusinessWallet(450000,"54542");
        CurrentWallet currentWallet = new CurrentWallet(300000,"67567");

        customer.setSavingsWallet(savingsWallet);
        customer.setCurrentWallet(currentWallet);
        customer.setBusinessWallet(businessWallet);

        System.out.println("Current Wallet Balance: "+ currentWallet.getBalance());
        System.out.println(customer.getCurrentWallet().getBalance());
        System.out.println("Business Wallet Balance: " + businessWallet.getBalance());
        System.out.println("   ");
        currentWallet.transfer(3000,businessWallet);
        System.out.println("Business Wallet New Balance: " + businessWallet.getBalance());
        System.out.println("Current Wallet New Balance: "+ currentWallet.getBalance());
        System.out.println("   ");
        currentWallet.deposit(50900);
        System.out.println("Business Wallet New Balance: " + businessWallet.getBalance());
        System.out.println("Current Wallet New Balance: "+ currentWallet.getBalance());
        System.out.println("   ");
        businessWallet.withdraw(100000);
        System.out.println("Business Wallet New Balance: " + businessWallet.getBalance());
        System.out.println("Current Wallet New Balance: "+ currentWallet.getBalance());

    }
}
