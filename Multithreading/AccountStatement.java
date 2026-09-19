package Multithreading;

public class AccountStatement extends Thread implements Report {
    @Override
    public void run() {
        reportGeneration();
    }
    @Override
    public void reportGeneration() {
        System.out.println("Generating Account Statement Report...");

    }
}
