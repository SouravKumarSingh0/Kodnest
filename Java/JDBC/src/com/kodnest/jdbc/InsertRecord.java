package com.kodnest.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class InsertRecord {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection Information
			String url = "jdbc:mysql://localhost:3306/kodnest";
			String username = "root";
			String password = "root123";
			
			
			//executing the sql statement
			String sql1 = "insert into bank values(1, 'John', 100)";
			
			//Establishing connection
			Connection c = DriverManager.getConnection(url, username, password);
			c.setAutoCommit(false);
			
			//creating the statement
			Statement stmt =  c.createStatement();
			stmt.executeUpdate(sql1);
			
			
			System.out.println("data inserted");

	}


}
