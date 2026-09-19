package PracticeFiles;

public class JavaMethods {
    public static void main(String[] args){
        String firstName = "Mr.";
        String lastName = "Oluwasegun";
        int amount;
        int vat ;
        float x;
        float y;
        hello(firstName, lastName);
        float sum = add(45,50);
        float value = multiplication(6.6f,5.0f);

        System.out.println("Overall:" + value);

        System.out.println("Overall Cost:" + sum);

    }
    static void hello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int add(int amount, int vat) {
        int sum = amount + vat;
        return sum;
    }

    static float multiplication(float x,float y){
        float value = x * y;
        return value;
    }

}
