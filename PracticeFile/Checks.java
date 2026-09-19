package PracticeFile;

import java.util.HashMap;
import java.util.Map;

public class Checks {
    public static void main(String[] args) {
        Account user1 = new Account();
        user1.setAccountId("034");
        user1.setStatus(Status.ACTIVE);
        user1.setAccountType(AccountType.CORPORATE);
        user1.setAccountNumber("9089787764");

        Account user2 = new Account();
        user2.setAccountId("037");
        user2.setStatus(Status.INACTIVE);
        user2.setAccountType(AccountType.CURRENT);
        user2.setAccountNumber("456787764");

        Map <String, Account> test = new HashMap<>();

        test.put(user1.getAccountId(), user1);
        test.put(user2.getAccountId(), user2);

        System.out.println(test.entrySet());
    }
}
