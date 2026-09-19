package Project;

import java.util.Scanner;

public class PasswordRetryLogic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passCode = 7;


        for(int i = 1; i <= 10; i++){
            System.out.println("Enter passcode: ");
            int enterPasscode = input.nextInt();
            if (enterPasscode != passCode){
                System.out.println("Wrong password; "+ i + " attempt:Try again!");
                if (1 < 1){
                    break;
                }

            }
            else{
                if (enterPasscode == passCode){
                System.out.println("Correct Password");
                break;
                }

            }


        }
    }
}
