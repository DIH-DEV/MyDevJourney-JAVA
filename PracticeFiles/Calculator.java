package PracticeFiles;

public class Calculator{

    public static void main(String[] args){
        Calculator areaOfCircle = new Calculator();
        System.out.println("Circle Area:" + areaOfCircle.areaOfCircle(5));
    }

    private double areaOfCircle(double radius){
        double pi = Math.PI;
        double areaOfCircle;
        areaOfCircle = pi * radius * radius;
        return  areaOfCircle;
    }

    ///private double quadraticEquationCalculator(double coefficientOfx, double)
}
