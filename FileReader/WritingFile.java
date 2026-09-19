package FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {
    public static void main(String[] args) {
        String filePath = "/Users/mac/Downloads/UsersJavaTest.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))){
            Scanner editor = new Scanner(System.in);
            String input;
            System.out.println("Enter Texts Below \n Type 'EXIT' to Close and save files:");
            while (!(input = editor.nextLine()).equalsIgnoreCase("exit")){
                writer.write(input);
                writer.newLine();
            }System.out.println("Data succefully Written to file: " + filePath );;

        }catch (IOException e){
            System.out.println("Oops! Something is wrong: " + e.getMessage());
        }
    }
}
