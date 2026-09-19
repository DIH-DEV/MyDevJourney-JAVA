package DataBaseProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {
    public static void main(String[] args) {
        String username = "root";
        String password = "password";
        String url = "jdbc:mysql://localhost:3306/KelvinDb";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            if (connection != null){
                System.out.println("Connection is Successfull!");
                connection.close();
            }
        }catch(SQLException E){
            System.out.println("Error Message: " + E.getMessage());
        }
        //DANGEROUS CODE
//        String input = "Admin' OR '1' = 1";
//        String sql = "SELECT * FROM users WHERE USERNAME = '"+ input +"'";
//        Statement stmt = connection.crea
    }

}
