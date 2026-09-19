package NibssIcad;

import java.util.Scanner;

public class AgeEligibility {
    Scanner input = new Scanner(System.in);
    int age;
    public void ageCheck(){
        //this.age = age;
        System.out.println("Enter Age to confirm Eligibility: ");
        age = input.nextInt();
        if (age < 18){
            System.out.println("INELIGIBLE! \n Age: " + age);
            System.out.println("Try Again when you clock 18years!");
        }else {
            System.out.println("ELIGIBLE \n Age: " + age);
            System.out.println("Congratulations");
        }
    }
    public static void main(String[] args) {
        AgeEligibility checker = new AgeEligibility();
        checker.ageCheck();

    }

}
