package DataBaseProgramming;

import java.sql.*;

public class StatementClass {
    static String url = "jdbc:mysql://localhost:3306/myDatabase";
    static String username = "root";
    static String password = "password";

    public static void main(String[] args) {
        String sql = "SELECT * FROM employees WHERE ID ='"+6+"' ";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                double salary = resultSet.getDouble("salary");
                Date hireDate = resultSet.getDate("hiredate");

                System.out.println("FirstName: " + firstName);
                System.out.println("lastName: " + lastName);
                System.out.println("Salary: " + salary);
                System.out.println("hireDate: " + hireDate);
            }
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error message: "+ e.getMessage());
        }
    }


}
