package com.bea.test.M5_Activity3;


import java.sql.Connection;
import java.util.Scanner;

import com.bea.test.service.StudentService;
import com.bea.test.service.CourseService;
import com.bea.test.util.DBConnectionUtil;


public class MainApp {

	private static StudentService studentservice = new StudentService();
	private static CourseService  courseservice = new CourseService();
	
    public static void main( String[] args ) {

		Connection dbConnection = null;
		Scanner scanner = new Scanner(System.in);

		try {
			dbConnection = DBConnectionUtil.getDbConnection();
		} catch (Exception e) {
			System.out.println("Sorry, the system is under maintenance. Please try again later.");
		}
		
		
		try {
			if (dbConnection != null) {
				
				//System.out.println("With connection");
				
				while (true) {
					System.out.println(Constants.DISPLAYMENU);
					int choice = scanner.nextInt();
					//char choice;
				
	                switch (choice) {
	                	case 1:
	                		scanner.nextLine();
	                		studentservice.addStudent(dbConnection, scanner);
	                        break;
	                	case 2:
	                		scanner.nextLine();
	                		courseservice.addCourse(dbConnection, scanner);
	                		break;
	                    case 3:
	                    	studentservice.showStudents(dbConnection);
	                        break;
	                    case 4:
	                    	courseservice.showCourses(dbConnection);
	                        break;
	                    case 0:
	                    	System.out.println("Thank you for using the system!");
	                        return;
	                        
	                    default:
	                        System.out.println("Invalid option. Please select 1-4.\n");
	                }
		    	}
			}

		
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			try {
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				dbConnection.close();
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
    }
    
    

    	
}
