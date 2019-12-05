package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	private static Connection connection; //JDBC Connection
	
	public static Connection getConnection() {
		try {
			
			Class.forName("org.postgresql.Driver");
			
			connection = DriverManager.getConnection(
					/*
					 * We're using environment variables.
					 */
					//System.getenv("jdbc:postgressql://bankdb.c0rajpnmdexe.us-east-2.rds.amazonaws.com:5432/bankdb"),
				//	System.getenv("bankuser"),
				//	System.getenv("Balumpaa6")
					System.getenv("dburl"),
					System.getenv("dbusername"),
					System.getenv("dbpassword")
					);
		} catch ( SQLException e) {
			//SQLException is a checked exception, which means it must be
			//handled.
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		   e.printStackTrace();
		}
		return connection;
	}
}
