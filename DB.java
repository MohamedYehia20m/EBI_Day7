package com.EBI.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {
	
	public void registerEmployee(Employee employee) 
	{
		int id = employee.getID();
		String fistname = employee.getFirstName();
		int salary = employee.getSalary();
		String lastname = employee.getLastName();
		
		String url = "jdbc:mysql://localhost:3306/emp1";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
		
	    String query = new String("INSERT INTO `employee` (`id`, `first_name`, `salary`, `second_name`) VALUES (?, ?, ?, ?)");
		
		PreparedStatement statement = con.prepareStatement(query);
		
		statement.setInt(1, id);
		statement.setString(2, fistname);
		statement.setInt(3, salary);
		statement.setString(4, lastname);
		
		// Execute the query
		int rowsAffected = statement.executeUpdate();
		System.out.println("Rows affected: " + rowsAffected);
		
	    statement.close();
	    con.close();
		
		} catch (SQLException e) {
		    System.out.println("An SQL exception occurred.");
		    e.printStackTrace();
		}
	}
}
