package FileReader;

import java.io.Serializable;


public class User implements Serializable {

    private String name;
    private transient String password; // transient ignored during serialization
    private int age;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', password='" + password + "', age=" + age + '}';
    }
}


