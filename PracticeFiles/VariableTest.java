package PracticeFiles;

public class VariableTest {
    public static void main(String[] args){
        int age = 1987000;
        byte b = 100;
        long accountBalance = 2100000000L;
        float closingBalance = 0.345662342345522f;
        double openingBalance = 0.34567789998765;
        char grade = 'A';
        boolean isChecked = true;
        String lastName = "Kelvin";
//        Methods.methodCheck(lastName);
//        Methods.methodCheck("kelvin");
//        System.out.println(age);
//        System.out.println ("Account balance is: " + closingBalance + " and its interesting");
//        System.out.println(openingBalance);
//        System.out.println(grade);
//        System.out.println(isChecked);
//        System.out.println(b);
//        System.out.println(accountBalance);
        String[] split = lastName.split(",");
        String result = lastName.replace("i","ee");

        String[] nameSplit = lastName.split("-");
        System.out.println(result);
//        String.join(lastName, accountBalance,age);
    }
}
