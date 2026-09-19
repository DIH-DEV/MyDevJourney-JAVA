package PracticeFile;

public class TestArray {
    public static void main(String[] args) {
        String[] departments = new String[3];//length:3(0,1,2)\
        String[] names = {"Ayo", "Bayo","kunle"};

        departments[0] = "HR";
        departments[1] = "Product";
        departments[2] = "Compliance";
        //departments[3] = "Check";
        System.out.println("No of Departments: " + departments.length );
        System.out.println(departments[1]);
        System.out.println(" ");
        System.out.println("No of participants: " + names.length );
        System.out.println(names[2]);
        names[0]= "Debs";
        System.out.println("REPLACEMENT:  "+names[0]);

//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//
//        }
        displayNames(names);

    }
    static void displayNames(String[] names){
        for (String name : names){
            System.out.println("Name: "+ name);
        }

    }

}
