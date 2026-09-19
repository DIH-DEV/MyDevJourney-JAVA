package Multithreading;

public class MultipleThreading implements Runnable{
    String name;
    @Override
    public void run() {
        for (int i = 1; i < 6 ; i++) {
            System.out.println(name + ": " + i);
        }
        System.out.println(name + " -  Just Completed execution");
    }

    public MultipleThreading(String name) {
        this.name = name;
    }
}
