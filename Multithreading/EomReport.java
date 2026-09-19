package Multithreading;

public class EomReport extends Thread implements ReportTemplate{
    @Override
    public void run() {
        reportGen();
    }

    @Override
    public void reportGen() {
        System.out.println("Generation EOM Report...");
    }
}
