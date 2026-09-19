package PracticeFiles;

public class ConstructorsTest {
    double balance;
    String status;
    String accountName;

    public ConstructorsTest(String accountName, double balance, String status){
        this.balance = balance;
        this.status = status;
        this.accountName =accountName;

    }
    public static void main(String[] args){
        ConstructorsTest constructorsTest1 = new ConstructorsTest(
                "Kelvin",1200,"Active");
        System.out.println("Account Details: "  + constructorsTest1.accountName + "  account is currently " + constructorsTest1.status + " and currently have the balance: " +constructorsTest1.balance);
    }

}
