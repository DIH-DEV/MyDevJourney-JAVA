package DataBaseProgramming;

import java.sql.*;

public class DatabaseQuery {
    public static void main(String[] args) {
        int counter = 1;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/KelvinDb","root","password");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM BOOKS WHERE pages > '"+300+"'");
            statement.executeUpdate("CREATE TABLE Wallet(ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, firstName varchar(100) NOT NULL,AccountBalance double DEFAULT 0.00,CreationDate DATE NOT NULL )");
            System.out.println(" Table Created successfully!");
//            while (resultSet.next()){
//                String title = resultSet.getString("title");
//                int year = resultSet.getInt("released_year");
//
//                System.out.println(counter +"- Book Title: "+ title);
//                System.out.println(counter +"- Released_Year: "+ year);
//                counter++;}
//            if (resultSet == null) {
//                System.out.println("Table has been created successfully!");
//
//            }


            connection.close();
        } catch (SQLException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
}
