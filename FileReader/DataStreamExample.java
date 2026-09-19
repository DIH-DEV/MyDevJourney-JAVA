package FileReader;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dataOut.writeInt(123);
            dataOut.writeDouble(45.67);
            dataOut.writeUTF("Hello DataStream");
            System.out.println("Data written.");
        } catch (IOException e) {
            System.err.println("Write error: " + e.getMessage());
        }

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("data.bin"))) {
            int number = dataIn.readInt();
            double decimal = dataIn.readDouble();
            String message = dataIn.readUTF();
            System.out.println("Read values: " + number + ", " + decimal + ", " + message);
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }
}

