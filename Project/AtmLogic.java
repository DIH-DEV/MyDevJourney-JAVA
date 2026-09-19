package Project;

public class AtmLogic {
    double newBalance;
    String accountHealth;
    private void widrawal(double widrawalAmount, double currentBal, boolean isFrozen){
        newBalance = currentBal - widrawalAmount;
        accountHealth = (newBalance >= 5000)? "BALANCE IS HEALTHY" : "LOW BALANCE WARMING!!!";

        if (isFrozen){
            System.out.println("Transaction Denied: Account is frozen.");
        }
        else{
            if (widrawalAmount >= currentBal){
                System.out.println("Transaction Denied: Insufficient funds.");
            }
            else {
                System.out.println("Transaction Successful! New Balance: $" + newBalance);
            }
        }

    }

    public static void main(String[] args){
        AtmLogic transact = new AtmLogic();
        transact.widrawal(2000,34300,false);
        System.out.println("Account Status Alert: " + transact.accountHealth);
    }
}
