package PracticeFiles;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        String eligibilityStatus = (age >= 18)? "Cheers! YOU ARE ELIGIBLE TO VOTE": "Oops! ..NOT ELIGIBLE TO VOTE";
        System.out.println(eligibilityStatus);
//        double cartTotal = 120.0;
//        double shippingFee = (cartTotal >= 1000.0) ? 50 : 100;
//
//       System.out.println("Your Shipping fee is: $" + shippingFee);
//
//       if (cartTotal <= 10 ){
//           System.out.println("Total Cost: " + (cartTotal+ shippingFee));
//       }
//       else{
//           System.out.println("Total Cost: " + (cartTotal+ shippingFee));
//           System.out.println("Please shop more for discounts like dz ");
//       }
//
//        //String customerType = "New to Bank";
//        //boolean flag = (customerType.equals("New to Bank")) ?

    }
}
