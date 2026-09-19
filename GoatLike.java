import PracticeFiles.PaymentDetails;

public class GoatLike{
    String name;
    String religion;
    String stateOfOrigin;
    boolean isDark;
    char gender;

    public static class TestProject {
        public static void main(String[] args) {
            GoatLike stubborn = new GoatLike();
            stubborn.gender = 'M';
            stubborn.name = "David";
            stubborn.stateOfOrigin = "Osun";
            System.out.println (stubborn.name);
            char myGrade;
            double openingBalance;
            float closingBalance;
            byte attendance;
            int age;
            closingBalance = 32.3453f;
            attendance = 32;
            age = 1000;
            PaymentDetails User2 = new PaymentDetails();
            User2.amount = 12000.00;
            System.out.println("The Closing balance is: " + User2.amount);
            System.out.printf("The opening balance is: %.2f%n", closingBalance);
            System.out.println("The opening bal was predicted to be " + closingBalance + ", and it was actually: " + closingBalance);
        }
    }
}

