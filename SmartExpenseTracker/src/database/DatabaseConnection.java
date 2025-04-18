package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/SmartExpenseTracker";
    private static final String USER = "root";
    private static final String PASSWORD = "Aditya514@";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Explicitly load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found! " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database connection failed! " + e.getMessage());
        }
        return conn;
    }
}
