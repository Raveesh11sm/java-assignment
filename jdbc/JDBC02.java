package com.te.jdbc;

// Import JDBC API
import java.sql.*;
import javax.sql.*;

public class JDBC02 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// 2. Load and Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");

			// 3. Establish connection with the database
			String dbName = "hibcrud";
			String url = "jdbc:mysql://localhost:3306/" + dbName;
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, username, password);
			if (!connection.isClosed())
				System.out.println("Connection established!");
			else
				System.out.println("Connection was not established!");

			// 4. Create PreparedStatement
			// 5. Write a query
			String query = "insert into emp_table values(?, ?, ?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setInt(1, 3);
			prepareStatement.setString(2, "C");
			prepareStatement.setInt(3, 22);
			
			// 6. Process the result
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. Close the connection
			// connection = null;
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
