package DataBaseProgramming;

import java.sql.*;
import java.util.Scanner;

public class WalletTransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/KelvinDb", "root", "password");
            connection.setAutoCommit(false);
            String sql = "INSERT INTO wallet(firstName, accountBalance, creationDate)" +
                    "VALUES(?,?,?),(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"Gold");
            statement.setDouble(2,320000);
            statement.setDate(3,Date.valueOf("2026-09-19"));
            statement.setString(4,"Damilare");
            statement.setDouble(5,45000);
            statement.setDate(6,Date.valueOf("2021-04-09"));

            statement.executeUpdate();
            System.out.println("Successfully Updated!");

            String debitQuery = "UPDATE wallet SET accountBalance = ? " +
                    "WHERE id = ?";
            String creditQuery = "UPDATE wallet SET accountBalance = 6900 " +
                    "WHERE id = 5";
            PreparedStatement debit = connection.prepareStatement(debitQuery);
            debit.setDouble(1,950000);
            debit.setInt(2,3);
            PreparedStatement credit = connection.prepareStatement(creditQuery);

            debit.executeUpdate();
            credit.executeUpdate();


            connection.commit();

            connection.close();

        } catch (SQLException e) {
            System.err.println("ERROR MESSAGE: " + e.getMessage());
        }
    }
}