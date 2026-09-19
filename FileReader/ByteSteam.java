package FileReader;

import java.io.*;
public class ByteSteam {
    public static void main(String[] args) {
        String filePath = "/Users/mac/Downloads/Evidence 6 - --OC .pdf";
        String filePath_copy = "/Users/mac/Downloads/Evidence 6_ COPY2.pdf";

        try(FileInputStream input = new FileInputStream(filePath);
        FileOutputStream output = new FileOutputStream(filePath_copy)){
            byte[] buffer = new byte[2048];
            int bufferRead;

            while((bufferRead = input.read(buffer)) != -1){
                output.write(buffer,0,bufferRead);
            }
            System.out.println("WRITE IS SUCCESSFULL");
        }catch (IOException e){
            System.err.println("Error message: " + e.getMessage());
            System.err.println( "Stack Trace: " + e.getStackTrace());
        }

//        try(FileInputStream inputStream = new FileInputStream(filePath);
//        FileOutputStream outputStream = new FileOutputStream(filePath_copy)){
//            byte[] buffer = new byte[1024];
//            int byteRead;
//
//            while ((byteRead = inputStream.read(buffer)) != -1){
//                outputStream.write(buffer,0,byteRead);
//            }
//            System.out.println("File copied successfully.");
//
//        }catch(IOException e){
//            System.out.println("ERROR MESSAGE: " + e.getMessage());
//
//        }
    }
}

