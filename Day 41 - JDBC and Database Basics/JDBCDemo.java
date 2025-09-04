/**
 * Day 41 - JDBCDemo.java
 * Demonstrates JDBC basics
 */
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        // Note: This is a demonstration. You'll need a database and driver to run this.
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";
        
        try {
            // Load driver (not needed for modern JDBC)
            // Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                System.out.println("Successfully connected to the database!");
                
                // Create statement
                Statement statement = connection.createStatement();
                
                // Execute query
                String sql = "SELECT * FROM users";
                ResultSet resultSet = statement.executeQuery(sql);
                
                // Process results
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("Name: " + name + ", Age: " + age);
                }
                
                // Close resources
                resultSet.close();
                statement.close();
                connection.close();
            }
            
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
} 