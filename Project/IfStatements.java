package Project;

import java.util.Scanner;

public class IfStatements {
    public static void main (String [] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter your UserName: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String userName = input.nextLine();
        String passWord = inputData.nextLine();


       // String userName = "kelvinEsho@gmail.com";
        //inputData.nextLine();
        //String passWord = "Taypeace";

        if (userName.equals("kelvinEsho@gmail.com")) {

            if (passWord.equals("Taypeace")){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("User does not EXIST");
            System.out.println("Proceed to sign up");
        }

    }
}
