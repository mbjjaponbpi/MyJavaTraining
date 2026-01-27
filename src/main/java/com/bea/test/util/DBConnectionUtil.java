package com.bea.test.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnectionUtil {

    // Database credentials
    private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    private static Connection dbConnection;

    
	public static Connection getDbConnection() throws Exception{
		dbConnection = null;
		
		dbConnection = DriverManager.getConnection(URL, USER, PASSWORD);
		//System.out.println("Connected to PostgreSQL successfully");
		return dbConnection;
	}

}
