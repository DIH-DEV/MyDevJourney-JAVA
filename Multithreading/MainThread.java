package Multithreading;

public class MainThread {
    public static void main(String[] args) {
        Multithread thread = new Multithread();
       Runnable task = new MyTask();
       Thread thread1 = new Thread(task);
    }
}
