package FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriteFiles {
    static String file = "/Users/mac/Downloads/UsersJavaTest.txt";
    public static void main(String[] args) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file,true))){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Text here: Type 'EXIT' to quit: ");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")){
                write.write(input);
                write.newLine();

            } System.out.println("DATA written to file...");

        }catch (IOException e){
            System.out.println("ERROR MESSAGE: " + e.getMessage());
        }
    }
}
