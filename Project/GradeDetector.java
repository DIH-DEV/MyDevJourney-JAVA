package Project;

import java.util.Scanner;

public class GradeDetector {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Overall CGPA: ");

        double cgpa = input.nextDouble();

        if (cgpa >= 4.50){
            System.out.println("Congratulations! you made a FIRST CLASS");
        }
        else if (cgpa >= 3.50){
            System.out.println("Congratulations! you made a SECOND CLASS UPPER");
        }
        else if (cgpa >= 2.50) {
            System.out.println("Congratulations! you made a SECOND CLASS LOWER");
        }
        else if (cgpa >= 1.50) {
            System.out.println("Congratulations! you made a THIRD CLASS");
        }
        else{
            System.out.println("Congratulations! you PASSED!");
        }
    }

}
