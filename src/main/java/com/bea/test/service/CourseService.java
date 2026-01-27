package com.bea.test.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bea.test.M5_Activity3.Constants;
import com.bea.test.dao.CourseDao;
import com.bea.test.dao.StudentDao;
import com.bea.test.model.Course;
import com.bea.test.model.Student;
import com.bea.test.util.InputValidationUtil;

public class CourseService {

	private static CourseDao dao = new CourseDao();
	private static InputValidationUtil inputUtil = new InputValidationUtil();
	private static StudentDao studentdao = new StudentDao();

	
    public void addCourse(Connection dbConnection, Scanner scanner) {
		String courseStudentId = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_COURSESTUDENTID, true, false);
		String courseName = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_COURSENAME, false, false);
		String courseGrade = inputUtil.validateInput(scanner, Constants.PROMPT_ENTER_COURSEGRADE, false, true);

		
		try {
			//check if student Id exists
			Student student = studentdao.findStudentById(dbConnection, Integer.parseInt(courseStudentId)); 
			if (student != null) {
				Course course = new Course();
				course.setStudentid(Integer.parseInt(courseStudentId));
				course.setCoursename(courseName);
				course.setGrade(Double.parseDouble(courseGrade));
				dao.addCourseDao(dbConnection, course);
				System.out.println(String.format("You have successfully added course %s", course.getCoursename()));
			} else {
				System.out.println("ERROR! Unable to add course. Student Id does not exists.");
			}

		} catch (SQLException e) {
			System.out.println("ERROR! Unable to add course. " + e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR! Unable to add course. " + e.getMessage());
		}

    }

    public void showCourses(Connection dbConnection) {
    	
    	try {
    		
			List<Course> courseList = dao.showCoursesDao(dbConnection);

			StringBuilder sb = new StringBuilder();

			//header
			sb.append("\n|").append(String.format("%-10s", "ID"));
			sb.append("|").append(String.format("%-10s", "StudentID"));
			sb.append("|").append(String.format("%-50s", "Course Name"));
			sb.append("|").append(String.format("%-10s", "Grade"));
			sb.append("|\n");
			int len = sb.length();
			sb.insert(0, String.valueOf("-").repeat(len-2));
			sb.append(String.valueOf("-").repeat(len-2)).append("\n");
			
			//detail
			for (Course course : courseList) {
				sb.append("|").append(String.format("%-10s",   course.getId()));
				sb.append("|").append(String.format("%-10s",   course.getStudentid()));
				sb.append("|").append(String.format("%-50s",   course.getCoursename()));
				sb.append("|").append(String.format("%-10.2f", course.getGrade()));
				sb.append("|\n");
			}
			sb.append(String.valueOf("-").repeat(len-2)).append("\n");
			System.out.println(sb.toString());
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }

    	
	
}
