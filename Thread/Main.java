package Thread;

public class Main {
    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();

        Runnable task = new myTask();
        Thread thread = new Thread(task);
        thread.start();
    }
}
