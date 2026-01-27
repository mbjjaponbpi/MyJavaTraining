package com.bea.test.dao;

public class SQLConstants {

	//Students
	
	public static final String SELECT_ALL_STUDENTS_SQL = "SELECT id, name, age, email FROM students";
	
	public static final String SELECT_STUDENT_BY_ID = "SELECT id, name, age, email FROM students where id = ?";
	
	public static final String INSERT_STUDENT_SQL = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
	
	
	
	//Courses
	
	public static final String SELECT_ALL_COURSES_SQL = "SELECT id, student_id, course_name, grade FROM courses";
	
	public static final String SELECT_COURSE_BY_ID = "SELECT id FROM courses where id = ?";
	
	public static final String INSERT_COURSE_SQL = "INSERT INTO courses (student_id, course_name, grade) VALUES (?, ?, ?)";
	
	
}
