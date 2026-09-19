package Project;

//Initialization
//Contional statement
//Body of code
//action(update)

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        int age = 20;
        //Scanner input =  new Scanner(System.in);
        //System.out.println("Enter Status Code: ");
        //double transactionStatusCode = input.nextDouble();
        double transactionStatusCode = 2;

        for (int attendees = 1; attendees <= 12 ; attendees++) {
            if (attendees == 9){
                continue;
            };
            System.out.println("Your Assigned seat number is: " + attendees);
        }
//      while (age > 18 ){
//          System.out.println("Oops!..You are ELIGIBLE because you are over " + age +" years of age");
//          --age;
//      }
//        do {System.out.println("INVALID REQUEST - Status Code: " + transactionStatusCode);
//            transactionStatusCode++;
//
//        }while (transactionStatusCode <= 5 );

    }

}
