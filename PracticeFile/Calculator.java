package PracticeFile;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("--------WELCOME-------");
        System.out.println("1 - ADDITION");
        System.out.println("2 - SUBTRACTION");
        System.out.println("3 - DIVISION");
        System.out.println("4 - MULTIPLICATION");
        System.out.println("5 - SQUAREROOT");
        System.out.println("Enter OPTION: ");
        Scanner number = new Scanner(System.in);
        int option = number.nextInt();
        if (option == 1) {
            calculator.addition();
        } else if (option == 2) {
            calculator.subtraction();

        }

    }
    public void addition(){
        System.out.println("Enter initial Value");
        Scanner value = new Scanner(System.in);
        double initialValue = value.nextDouble();
        System.out.println("Enter final Value");
        Scanner value2 = new Scanner(System.in);
        double finalValue = value2.nextDouble();
        double Sum = initialValue + finalValue;
        System.out.println("SUM: " + Sum);
    }
    public void subtraction(){
        System.out.println("Enter initial Value");
        Scanner value = new Scanner(System.in);
        double initialValue = value.nextDouble();
        System.out.println("Enter final Value");
        Scanner value2 = new Scanner(System.in);
        double finalValue = value2.nextDouble();
        double val = initialValue - finalValue;
        System.out.println("VALUE: " + val);
    }



}
