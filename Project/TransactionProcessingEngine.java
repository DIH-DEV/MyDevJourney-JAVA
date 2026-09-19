package Project;
//        You are building the transaction processing engine for a digital wallet. The system receives a withdrawal request payload containing the withdrawalAmount,
//        the user's current walletBalance, and a boolean flag isAccountFrozen.
//        Requirements:
//        1.	If the account is frozen (isAccountFrozen is true), the system must immediately reject the transaction and print: "Transaction Denied: Account is frozen."
//
//        2.	If the account is active, verify if the user has sufficient funds (walletBalance >= withdrawalAmount).
//        1. If they do, deduct the amount and print: "Transaction Successful! New Balance: $[amount]"
//        2. If they do not, print: "Transaction Denied: Insufficient funds."
//        3.	Finally, use a ternary operator to populate a String variable called accountStatusAlert. If the remaining wallet balance drops below $5,000,
//        set the alert to "LOW BALANCE WARNING"; otherwise, set it to "BALANCE HEALTHY". Print this alert at the end.
//
//        Expected Task:
//        Write a Java program or method using the appropriate combination of nested if-else statements and a ternary operator to execute this business logic.


public class TransactionProcessingEngine {
    double widrawalAmount;
    double currentWalletBal;
    boolean isFrozen;
    double newBalance ;
    String transactionStatus;// = (newBalance >= 5000) ? " BALANCE HEALTHY" : "LOW BALANCE WARNING";

    private void widrawalRequest(double widrawalAmount, double currentWalletBal, boolean isFrozen){
        this.widrawalAmount = widrawalAmount;
        this.currentWalletBal = currentWalletBal;
        this.isFrozen = isFrozen;
        newBalance = currentWalletBal - widrawalAmount;
        transactionStatus = (newBalance >= 5000) ? " BALANCE HEALTHY" : "LOW BALANCE WARNING";

        //double newBalance = currentWalletBal - widrawalAmount;
        String transactionStatus = (newBalance >= 5000) ? " BALANCE HEALTHY" : "LOW BALANCE WARNING";

        if (isFrozen){
            System.out.println("Transaction Denied: Account is frozen");
        }
        else{
            if (currentWalletBal >= widrawalAmount){
                System.out.println("Transaction Successful! New Balance: $" + newBalance);
            }
            else{
                System.out.println("Transaction Denied: Insufficient funds.");
            }
        }
    }
    public static void main(String[] args){
        TransactionProcessingEngine widrawEngine = new TransactionProcessingEngine();
        widrawEngine.widrawalRequest(7000,20000,false);
        System.out.println("Account Status Alert: " + widrawEngine.transactionStatus);
    }

}
