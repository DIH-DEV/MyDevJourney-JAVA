package PracticeFile;

import java.util.UUID;

public class Processor {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("3245435432");
        account.setStatus(Status.ACTIVE);
        account.setAccountType(AccountType.CURRENT);
        account.setAccountId(UUID.randomUUID().toString());
        //account.setAccountId(UUID.randomUUID().toString());
        System.out.println("Account: " + account.toString());
    }
}
