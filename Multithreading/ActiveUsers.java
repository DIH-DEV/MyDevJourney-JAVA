package Multithreading;

public class ActiveUsers extends Thread implements Report{
    @Override
    public void run() {
        reportGeneration();
    }
    @Override
    public void reportGeneration() {
        System.out.println("Generating Active Users Report...");

    }
}
