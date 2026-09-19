package PracticeFiles;

public class DataPoints {
    double x = 0.5;

    public static void main(String[] args){
        DataPoints dataPoints = new DataPoints();
        System.out.println("Area of Circle: " + dataPoints.areaOfCircle( 4));
        System.out.println("Area of Triangle: " + dataPoints.areaOfTriangle(4,5));
        System.out.println("Area of Rectangle: " + dataPoints.areaOfRectangle(5,4));
        System.out.println("Area of Square: " + dataPoints.areaOfSquare(4));
    }

    private double areaOfCircle(double radius){
        double areaOfCircle;
        areaOfCircle = Math.PI * radius * radius;
        return areaOfCircle;

    }
    private double areaOfTriangle( double base ,double height) {
        double areaOfTriangle;
        areaOfTriangle = 0.5 * base * height;
        return areaOfTriangle;

    }
    private double areaOfRectangle(double length, double width) {
        double areaOfRectangle;
        areaOfRectangle = length * width;
        return areaOfRectangle;

    }
    private double areaOfSquare(double side) {
        double areaOfSquare;
        areaOfSquare = side * side;
        return areaOfSquare;
    }


}