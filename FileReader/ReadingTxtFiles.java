package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFiles {
    public static void main(String[] args) {
        String path = "//Users/mac/Downloads/UsersJavaTest.txt";
        int rowCount = 0;
        try(BufferedReader readCsv = new BufferedReader(new FileReader(path))){
            String buffedLine;
            while ((buffedLine = readCsv.readLine()) != null){
                rowCount++;
                System.out.println("LINE "+ rowCount + ": " + buffedLine);
            }
            System.out.println("Total Records: "+ rowCount);
        }catch (IOException e){
            System.err.println("ERROR MESSAGE: " + e.getMessage());
        }
    }
}