package DataBaseProgramming;

import java.sql.*;

public class DbProgrammingTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "password";
        String url = "jdbc:mysql://localhost:3306/KelvinDb";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO databaseprogramming(firstName, creationDate)" +
                    "VALUES(?,?),(?,?),(?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,"Wendy");
            statement.setDate(2, Date.valueOf("2024-04-17"));
            statement.setString(3,"Shade");
            statement.setDate(4, Date.valueOf("2024-04-17"));
            statement.setString(5,"Femi");
            statement.setDate(6, Date.valueOf("2024-04-17"));

            statement.executeUpdate();

            System.out.println("Data Successfully Inserted!");
            connection.close();
        }catch(SQLException E){
            System.err.println("Error Message: " + E.getMessage());
        }
    }
}
