package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "/Users/mac/Downloads/transactions_2026-09-09_2026-09-09.csv";
        int counter = 0;
        try (BufferedReader readingFiles = new BufferedReader(new FileReader(fileName))){
            String lineBuffer;
            while((lineBuffer = readingFiles.readLine()) != null){
                counter++;
                System.out.println("ROW: "+ counter+": " +lineBuffer);
            }
            System.out.println("Total Records: " + counter);;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
