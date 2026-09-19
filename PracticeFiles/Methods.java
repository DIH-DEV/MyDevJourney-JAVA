package PracticeFiles;

public class Methods {
    public static void main (String[] args){
     String lastName = "Esho";
    // methodCheck(lastName);
     //methodCheck(lastName);
     //methodCheck(lastName);
     int value1 = 10;
     int value2 = 3;
     int sum = add(value1,value2);
     System.out.println (add(value1,value2));
    }

   public static void methodCheck(String lastName){
        System.out.println("Hello "+ lastName );
        System.out.println("Approved.");
       System.out.println("Cheers!");
    }

    static int add(int x,int y){
        int sum = x + y;
        return sum;
    }
}
