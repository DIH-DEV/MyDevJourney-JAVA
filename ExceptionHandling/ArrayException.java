package ExceptionHandling;

import ExceptionHandling2.ArithmeticExceptionDemo2;

public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int x = 10;
        int y = 3;

        try {System.out.println(numbers[6]);
        } catch (Exception e) {
            System.err.println("Error msg: " + e.getMessage());
        }
        System.out.println("yinks");
//
//        int value = x/y;

        try{ int value = x/y;
            System.out.println(value);
        }
        catch (ArithmeticException a){
            System.err.println("Error message: " + a.getMessage());
            a.printStackTrace();
        }
        finally {
            System.out.println("CLOSE ALL TABS!");
        }
        System.out.println("Jay");

    }
}
