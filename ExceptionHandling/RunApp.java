package ExceptionHandling;

import java.lang.module.FindException;

public class RunApp {

    public static void main(String[] args) {
        BankDetails myAccount = new BankDetails("123454323",54345.09);
        //myAccount.withdrawal(650000);
        try {
            myAccount.withdrawal(933330);
        }catch (InsufficientBalException e){
            System.out.println(e.getMessage());
            System.out.println(e.getBalance());
            System.out.println(e.getRequestedAmount());
            System.out.println();
        }
        finally {
            System.out.println("Thank You For Banking with us!");
        }
    }
}
