package ExceptionHandling2;

public class ArithmeticExceptionDemo2 {
    public static void main(String[] args) {
//        int initial = 20;
//        int finalVal = 0;
//        try{
//            int value = initial/finalVal;
//            System.out.println("Value: " + value);
//        } catch (ArithmeticException e) {
//            System.out.println("Number cant be divisible by ZERO!");
//        }
//        String number = "0";
//        try{
//            int parsed = Integer.parseInt(number);
//            double result = 20/parsed;
//            System.out.println("Value: "+ result);
//        }catch (ArithmeticException e){
//            System.out.println("Arithmetic Error: "+ e.getMessage());
//        }catch (NumberFormatException e){
//            System.out.println("Number Format Exe: "+e.getMessage());
//        }finally {
//            System.out.println("This Runs regardless!");
//        };
        try {
            validateAge(13);
        } catch (InvalidAgeExe e) {
            System.out.println(e.getMessage());;
        }
        finally {
            System.out.println("RUN!");
        }

    }
    static void validateAge(int age) throws InvalidAgeExe{
        if (age < 18){
            throw new InvalidAgeExe("This User iS LESS THAN 18 years!");
        }
        System.out.println("ELIGIBLE!");
    }
}
