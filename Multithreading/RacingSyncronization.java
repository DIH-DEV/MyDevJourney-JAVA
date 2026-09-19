package Multithreading;

public class RacingSyncronization {
    private double balance;
    public RacingSyncronization(double initialBal){
        this.balance = initialBal;
    }
    public synchronized void withdraw(double amount){
        if (balance >= amount ){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw $" + amount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName() +
                    " completed the withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount +
                    " but insufficient funds. Remaining balance: " + balance);
        }

    }
    public double getBalance() {
        return balance;
    }
}
