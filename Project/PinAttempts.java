package Project;

import java.util.Scanner;

public class PinAttempts {
    public static void main (String[] args){
        String atmPin = "1990";
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Enter Your Password: ");
            String passWord = input.nextLine();
            System.out.println("3 attempts Only!");
            System.out.println("You have " + (3-i) + " attempts left");

            if (!passWord.equals(atmPin)){
                System.out.println("INCORRECT PASSWORD!");
                if (i == 3){
                    break;
                }
            }
            else {
                if (passWord.equals(atmPin)){
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                }
            }

        }
    }
}
