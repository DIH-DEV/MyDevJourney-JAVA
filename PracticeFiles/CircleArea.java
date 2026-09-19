package PracticeFiles;

import java.util.Scanner;

public class CircleArea {

    Scanner entry = new Scanner(System.in);
    public static void main(String[] args){

        CircleArea circleArea = new CircleArea();
        circleArea.areaOfCircle();

    }

    private void areaOfCircle(){
        System.out.print("Enter Name: ");
        String name = entry.nextLine();
        System.out.print("Enter radius: ");
        double radius = entry.nextDouble();
        System.out.print (name + " your area Of Circle is: " + Math.PI * radius * radius);
        //return areaOfCircle();
    }



}
