////Scenario:
//        You are building the transaction processing engine for a digital wallet. The system receives a withdrawal request payload containing the withdrawalAmount,
//        the user's current walletBalance, and a boolean flag isAccountFrozen.
//        Requirements:
//        1.	If the account is frozen (isAccountFrozen is true), the system must immediately reject the transaction and print: "Transaction Denied: Account is frozen."
//
//        2.	If the account is active, verify if the user has sufficient funds (walletBalance >= withdrawalAmount).
//        1. If they do, deduct the amount and print: "Transaction Successful! New Balance: $[amount]"
//        2. If they do not, print: "Transaction Denied: Insufficient funds."
//        3.	Finally, use a ternary operator to populate a String variable called accountStatusAlert. If the remaining wallet balance drops below $5,000, set the alert to "LOW BALANCE WARNING"; otherwise, set it to "BALANCE HEALTHY". Print this alert at the end.
//
//        Expected Task:
//        Write a Java program or method using the appropriate combination of nested if-else statements and a ternary operator to execute this business logic.
////Scenario:
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
//        Expected Task
//        :
//        Write a Java program or method using the appropriate combination of nested if-else statements and a ternary operator to execute this business logic.

package Project;

public class WithdrawalRequest {
    double newBalance;
    String tansactionStatus;

    private void withdrawFund(double withdrawalAmount,double currentWalletBalance, boolean isAccountFrozen){
        newBalance = currentWalletBalance - withdrawalAmount;
        tansactionStatus = (newBalance >= 5000) ? "BALANCE IS HEALTHY" : "LOW BALANCE WARNING!!!";
        if (isAccountFrozen){
            System.out.println("Transaction Denied: Account is frozen");
        }else{
            if (currentWalletBalance >= withdrawalAmount){
                System.out.println("Transaction Successful! New Balance: " + (newBalance));
            }
            else
            {System.out.println("Transaction Denied: Insufficient funds ");

            }

        }
    }

    public static void main(String[] args){
        WithdrawalRequest myAccount = new WithdrawalRequest();
        myAccount.withdrawFund(2000,7800,false);
        System.out.println("Account Status ALERT: " + myAccount.tansactionStatus);
    }

}
