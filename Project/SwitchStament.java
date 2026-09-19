package Project;

import java.util.Scanner;

public class SwitchStament {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ROLE: ");
        String role = input.nextLine();

        int accessLevel = switch(role){
            case "Manager" -> 1;
            case "Admin" -> 2;
            case "Cleaner" -> 8;
            default -> 0;

        };
        System.out.println("Security Clearance Level: " + accessLevel );

    }


}
