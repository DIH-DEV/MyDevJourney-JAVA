package Multithreading;
//This the running of multiple tasks concurrently, withot waiting for the completion of a
//code to finish running before the next line of code executes.
//Process are synonymous to applications(mySql, chrome, or any app)- inside an application has multiple threads.
public class Multithread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
