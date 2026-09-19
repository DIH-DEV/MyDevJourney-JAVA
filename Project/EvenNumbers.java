package Project;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        int number = 1;
        int age = 32;
        //int guess = 23;
        Scanner input = new Scanner(System.in);

        while(number < 15){
            System.out.println("Guess Age: ");
            int guess = input.nextInt();

            if (age != guess){
                System.out.println("INCORRECT");
                System.out.println("Retry Attempt: " + number);
                number++;
                if (number > 10){
                    break;
                }
            }
            else{
                if (age == guess) {
                    System.out.println("YOU GOT IT!");
                    break;
                }

            }

        }


    }
}
