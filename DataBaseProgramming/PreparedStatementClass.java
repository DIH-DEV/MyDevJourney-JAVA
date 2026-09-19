package DataBaseProgramming;

import java.sql.*;

public class PreparedStatementClass {
    public static void main(String[] args) {
        int id = 1;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/KelvinDb","root","password");
            String sql = "SELECT * FROM users where firstName like ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"% %");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                String firstName = resultSet.getString("firstName");
                String LastName = resultSet.getString("lastName");
                String Company = resultSet.getString("company");
                id++;

                System.out.println(id + "- FirstName: "+firstName);
                System.out.println(id +"- LastName: "+LastName);
                System.out.println(id +"- Company: "+Company);
            }
            connection.close();

        } catch (SQLException e) {
            System.err.println("ERROR: "+ e.getMessage());
        }
    }
}
