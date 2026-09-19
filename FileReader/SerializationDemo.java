package FileReader;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        User user = new User("Alice", "secret", 25);
        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("User serialized.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Deserialized User: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
    }
}
