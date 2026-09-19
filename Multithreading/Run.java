package Multithreading;

public class Run {
    public static void main(String[] args) {
        AccountStatement accountStatement = new AccountStatement();
        ActiveUsers activeUsers = new ActiveUsers();
        DataUsage dataUsage = new DataUsage();

        EodReport eodReport = new EodReport();
        EomReport eom = new EomReport();

        Thread thread = new Thread(new MultipleThreading("Task A"));
        Thread thread2 = new Thread(new MultipleThreading("Task B"));

//        accountStatement.reportGeneration();
//        activeUsers.reportGeneration();
//        dataUsage.reportGeneration();

//        accountStatement.start();
//        activeUsers.start();
//        dataUsage.start();


        eodReport.start();
//        eom.start();
        eom.start();
        thread2.start();

        try {
            thread2.join();
            System.out.println("--------");
        } catch (InterruptedException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
        thread.start();

    }
}
