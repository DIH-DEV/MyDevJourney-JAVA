package PracticeFiles;

public class PaymentDetails {
    String statusCode;
    String accountHolderName;
    boolean isSuccessful;
    String cardType;
    int transactionCount;
    public double amount;

    public static void main(String[] args) {
        PaymentDetails User1 = new PaymentDetails();
        User1.accountHolderName = "Kelvin Esho";
        User1.amount = 2000908.09987;
        User1.cardType = "Mastercard";
        User1.isSuccessful = true;
        User1.statusCode = "00";
        String myName = "Kelvin";

        System.out.println("Hello " + User1.accountHolderName + "," +
                "your account has just been credited with " + User1.amount + "," +
                "Cheers!!!");
        System.out.println("Transaction status: " + User1.statusCode);
        check(myName);

    }

    static void check(String myName) {
        System.out.println("Dear " + myName +
        ", Find attached.");








    }
}
