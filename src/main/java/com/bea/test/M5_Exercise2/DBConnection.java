package com.bea.test.M5_Exercise2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	
    // Database credentials
    private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    
    
    public static void main( String[] args ) {
        System.out.println( "M5_Exercise2" );
        
        
		Connection dbConnection = null;
		
		try {
			
			dbConnection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected to PostgreSQL successfully");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				dbConnection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

    }
}
