package ExceptionHandling;

public class EligibilityCheck {

    public static void ageCheck(int age){
        if (age < 18){
            throw new InvalidAge("You are ineligible due to age \n Provided: " + age);
        }
        System.out.println("You have been successfully selected!");
    }

    public static void main(String[] args) {
        try {
            ageCheck(8);
        } catch (InvalidAge e) {
            System.err.println(e.getMessage());;
        }
    }
}
