package com.kodnest.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection Information
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "root123";
		
		//Establishing connection
		Connection c = DriverManager.getConnection(url, username, password);
		
		//creating the statement
		java.sql.Statement stmt =  c.createStatement();
		
		//executing the SQL statement
		stmt.execute("create table student(id int, name varchar(20))");
		
		System.out.println("connection success");
		
		

	}

}

