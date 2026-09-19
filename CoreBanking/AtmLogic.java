package CoreBanking;

import java.util.Scanner;

public class AtmLogic {
    private double balance = 50000;

    protected void withdrawal() {
        System.out.println("Enter withdrawal Amount: ");
        Scanner withdraw = new Scanner(System.in);
        double withdrawalAmount;
        withdrawalAmount = withdraw.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Oops! Insufficient Balance");
            System.out.println("Try a lesser amount!");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Debit alert:$ " + withdrawalAmount);
            System.out.println("Current Balance:$ " + balance);
        }
    }

    protected void transferAmount() {
        System.out.println("Enter Transfer Amount: ");
        Scanner transfer = new Scanner(System.in);
        double transferAmount;
        transferAmount = transfer.nextDouble();
        if (transferAmount > balance) {
            System.out.println("Transaction Failed due to Insufficient Balance");
        } else {
            balance -= transferAmount;
            System.out.println("Debit alert:$ " + transferAmount);
            System.out.println("Current Balance:$ " + balance);
        }
    }

    protected void depositAmount() {
        System.out.println("Enter Deposit Amount: ");
        Scanner deposit = new Scanner(System.in);
        double depositAmount = deposit.nextDouble();

        if (depositAmount <= 1000) {
            System.out.println("Value Must be above a 1000");
        } else {
            balance += depositAmount;
            System.out.println("Credit Alert! \n Your Account has been credited with \n Credited Amount:$ " + depositAmount);
            System.out.println("Current Balance:$ " + balance);
        }
    }
    protected double getbalance(){
        System.out.println("Current Balance: $"+ balance);
        return balance;

    }

    public static void main(String[] args) {
        AtmLogic atmLogic = new AtmLogic();

        do {
            System.out.println("==========ATM==========");
            System.out.println("1- Withdrawal");
            System.out.println("2- Deposit");
            System.out.println("3- Transfer");
            System.out.println("4- Check Balance");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            int number = input.nextInt();

            switch (number) {
                case 1:
                    atmLogic.withdrawal();
                    break;
                case 2:
                    atmLogic.depositAmount();
                    break;
                case 3:
                    atmLogic.transferAmount();
                    break;
                case 4:
                    atmLogic.getbalance();
                    break;
                default:
                    System.out.println("Invalid Number Entry \n Try Again!!!");
                    break;
            }
            System.out.println("Thank You for Banking with Us!");
        } while (true);

    }
}