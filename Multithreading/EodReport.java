package Multithreading;

public class EodReport extends Thread implements ReportTemplate{
    @Override
    public void run() {
        reportGen();
    }

    @Override
    public void reportGen() {
        System.out.println("Generation EOD Report...Just testing thread and seeing how it works");

    }
}
