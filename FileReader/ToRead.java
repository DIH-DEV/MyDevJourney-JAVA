package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ToRead {
    static String path = "/Users/mac/Downloads/UsersJavaTest.txt";

    public static void main(String[] args) {
        int counter = 0;
        try(BufferedReader readout = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = readout.readLine()) != null){
                counter++;
                System.out.println("LINE "+ counter+ ": " + line);
            }
            System.out.println("Total Lines: " + counter);
        }catch ( IOException E){
            System.out.println(E.getMessage());
        }
    }

}
