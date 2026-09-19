package Multithreading;

public class DataUsage extends Thread implements Report{
    @Override
    public void run() {
        reportGeneration();
    }

    @Override
    public void reportGeneration() {
        System.out.println("Generating Data usage Report...");

    }
}
