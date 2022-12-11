package org.example;
import java.sql.*;

public class App {

        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Connect to a database
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/testdb", "test", "Pa$$word");


            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a statement
            ResultSet resultSet = statement.executeQuery
                    ("select * from course;");

            // Iterate through the result and print the information given

            while (resultSet.next())
                System.out.println(resultSet.getString(1) + "\t" +
                        resultSet.getString(2) + "\t" + resultSet.getString(3)
                        + resultSet.getString(4) + "\t" + resultSet.getString(5));

            // Close the connection
            connection.close();
        }
    }

