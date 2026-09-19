package Project;

import java.util.Scanner;

public class AtmApplication {
    double balance = 50000.00;

    private void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount to deposit: ");
        double depositAmount = input.nextDouble();
        if (depositAmount > 0){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Account number to Deposit: ");
            String accountNumber = input1.nextLine();
            System.out.println("You have just deposited: " + "$" + depositAmount +" to "+accountNumber);
            balance += depositAmount;
            System.out.println("Balance: " +"$" + balance);
        }
        else{
            System.out.println("Deposit Amount must be greater than Zero");
            System.out.println("Session Time Out!");
        }
    };
    private void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw: ");
        double withdrawalAmount = input.nextDouble();
        if (withdrawalAmount > balance){
            System.out.println("Insufficient Balance, Try a lesser Amount");
        }
        else{
            System.out.println("You have been Debited: $" + withdrawalAmount);
            balance -= withdrawalAmount;
            System.out.println("Current Account Balance: $" + balance);
        }
    }
    private void transfer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account number to Transfer to: ");
        String accountNumber = input.nextLine();
        System.out.println("Enter Transfer Amount: ");
        double transferAmount = input.nextDouble();
        balance -= transferAmount;
        System.out.println("You have successfully Transferred: $"+ transferAmount);
        System.out.println("Account Balance: $" + balance);
    }
    private void checkBalance(){
        System.out.println("Your Current balance: $" + balance);
    }
    private void exit(){
        System.out.println("Thank you for Banking with Us!");
    }

    public void atmMachine(){
        do {
            System.out.println("========ATM MENU=======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("         ");

            Scanner input = new Scanner(System.in);
            System.out.println("SELECT OPTION: ");
            int option = input.nextInt();

            switch(option){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Enter a Valid Option");
                    break;
            }
        }
        while(true);
    }

    public static void main(String[] args) {
        AtmApplication ussd = new AtmApplication();
        ussd.atmMachine();
//        ussd.checkBalance();
//        ussd.widraw();
//        ussd.deposit();
//        ussd.transfer();
//        ussd.checkBalance();

    }
}
