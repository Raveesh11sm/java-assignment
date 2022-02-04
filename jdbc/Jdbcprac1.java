package com.jdbc.practice;
import java.sql.*;
import javax.sql.*;

public class Jdbcprac1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		
		String url="jdbc:mysql://localhost:3306/jdbcsamp";
		String password="root";
		String username="root";
		String query="insert into emp_rvrv values(121,'vee','banglore')";
		
		Connection connection=DriverManager.getConnection(url,password,username);
		
		Statement statement=connection.createStatement();
		
		int resultSet=statement.executeUpdate(query);
		
		System.out.println(resultSet);
		
		statement.close();
		connection.close();
		
		
	}

}
