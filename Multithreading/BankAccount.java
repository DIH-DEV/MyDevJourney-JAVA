package Multithreading;

import java.util.Scanner;

public class BankAccount {

    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void withdrawal(double withdrawalAmount){
        if (balance >= withdrawalAmount) {
            System.out.println(Thread.currentThread().getName() + " is tryna withdraw : $" + withdrawalAmount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println(e.getStackTrace());
            }
            balance-=withdrawalAmount;
            System.out.println(Thread.currentThread().getName()+ " has successfully withdrawn: $" +withdrawalAmount + " \n Current Balance: $" + balance);

        }else {
            System.out.println("Dear " + Thread.currentThread().getName() + "," + " \n Transaction failed due to Insufficiant balance \n Available Balance: $"+balance );
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount(14000);
       Runnable withdrawal = () -> {
           for (int i = 0; i < 4; i++) {
               account.withdrawal(850);
           }
           System.out.println("--------------");
       };
    

        System.out.println("Enter your Name: ");
        String director1 = input.nextLine();
        Thread user1 = new Thread(withdrawal,director1);
        user1.start();

        System.out.println("Enter your Name: ");
        String director2 = input.nextLine();
        Thread user2 = new Thread(withdrawal,director2);
        user2.start();

        System.out.println("Enter your Name: ");
        String director3 = input.nextLine();
        Thread user3 = new Thread(withdrawal,director3);
        user3.start();
    }

}
