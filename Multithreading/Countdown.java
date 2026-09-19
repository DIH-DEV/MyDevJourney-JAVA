package Multithreading;

public class Countdown implements Runnable{
    @Override
    public void run() {
        for (int i = 5; i >= 1 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println();
                Thread.currentThread().interrupt();
            }

        }
    }
}
