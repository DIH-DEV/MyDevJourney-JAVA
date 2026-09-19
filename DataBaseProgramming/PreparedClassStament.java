package DataBaseProgramming;

import java.sql.*;
import java.util.Scanner;

public class PreparedClassStament {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/KelvinDb";
        String user = "root";
        String pw = "password";
        int id = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter year: ");
        String release_year = input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url,user,pw);
            String query = "SELECT * FROM books WHERE released_year > ? OR author_lname like ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,release_year);
            statement.setString(2,name);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                String bookTitle = resultSet.getString("title");
                String authorsFirstName = resultSet.getString("author_fname");
                String lastName = resultSet.getString("author_lname");
                String year = resultSet.getString("released_year");
                id++;

                System.out.println(id+"-bookTitle: "+ bookTitle);
                System.out.println(id+"-authorsFirstName: "+ authorsFirstName);
                System.out.println(id+"-lastName: "+ lastName);
                System.out.println(id+"-year: "+ year);
                System.out.println("---------------");
            }
        }catch (SQLException e){
            System.out.println("ERROR MSG: " + e.getMessage());
        }
    }
}
