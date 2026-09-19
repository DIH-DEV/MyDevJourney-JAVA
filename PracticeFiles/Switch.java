package PracticeFiles;

import java.util.Scanner;

public class Switch {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What Day is today? :");
        String weekDay = input.nextLine();

       String workMode = switch(weekDay){

           case "Monday","Friday" -> "Work From Home!";
           case "Tuesday", "Wednesday","Thursday" -> "On-site";
           default -> "It's Weekend...Kindly Rest!";
        };
        System.out.println("Work Status Details: " + workMode);
    }



}
