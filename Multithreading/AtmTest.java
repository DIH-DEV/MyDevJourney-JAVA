package Multithreading;

public class AtmTest {
    public static void main(String[] args) {
        RacingSyncronization atm = new RacingSyncronization(2000);
        Runnable withdrawalTask = () -> {
            for (int i = 0; i < 3; i++) {
                atm.withdraw(300);
            }
            System.out.println("---------");
        };
        Thread user1 = new Thread(withdrawalTask,"Ayomide");
        Thread user2 = new Thread(withdrawalTask,"Tayo");
        Thread user3 = new Thread(withdrawalTask,"user 3");

        user1.start();
        user2.start();
        user3.start();
    }
}
