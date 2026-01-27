package com.bea.test.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bea.test.dao.StudentDao;
import com.bea.test.model.Student;
import com.bea.test.M5_Activity3.Constants;
import com.bea.test.util.InputValidationUtil;

public class StudentService {

	private static StudentDao dao = new StudentDao();
	private static InputValidationUtil inputUtil = new InputValidationUtil();
    
	
    public void addStudent(Connection dbConnection, Scanner scanner) {
		String studentName = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_STUDENTNAME, false, false);
		String studentAge = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_STUDENTAGE, true, false);
		String studentEmail = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_STUDENTEMAIL, false, false);

		Student student = new Student();
		student.setName(studentName);
		student.setAge(Integer.parseInt(studentAge));
		student.setEmail(studentEmail);

		try {
			dao.addStudentDao(dbConnection, student);
			System.out.println(String.format("You have successfully added student %s", student.getName()));
		} catch (SQLException e) {
			System.out.println("ERROR! Unable to add student. " + e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR! Unable to add student. " + e.getMessage());
		}
    }

    public void showStudents(Connection dbConnection) {
    	
    	try {
    		
			List<Student> studentList = dao.showStudentsDao(dbConnection);

			StringBuilder sb = new StringBuilder();

			//header
			sb.append("\n");
			sb.append("|").append(String.format("%-10s", "ID"));
			sb.append("|").append(String.format("%-50s",   "Name"));
			sb.append("|").append(String.format("%-10s",   "Age"));
			sb.append("|").append(String.format("%-100s",  "Email"));
			sb.append("|\n");
			int len = sb.length();
			sb.insert(0, String.valueOf("-").repeat(len-2));
			sb.append(String.valueOf("-").repeat(len-2)).append("\n");

			//detail
			for (Student student : studentList) {
				sb.append("|").append(String.format("%-10s",  student.getId()));
				sb.append("|").append(String.format("%-50s",  student.getName()));
				sb.append("|").append(String.format("%-10s",  student.getAge()));
				sb.append("|").append(String.format("%-100s", student.getEmail()));
				sb.append("|\n");
			}
			sb.append(String.valueOf("-").repeat(len-2)).append("\n");
			System.out.println(sb.toString());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }


}
