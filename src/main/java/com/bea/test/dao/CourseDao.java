package com.bea.test.dao;

import com.bea.test.model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CourseDao {

    public int addCourseDao(Connection dbConn, Course course) throws SQLException {
    	int rowsAffected = 0;
    	PreparedStatement ps = null;

    	String sql = SQLConstants.INSERT_COURSE_SQL;
    	
    	try {
    		ps = dbConn.prepareStatement(sql);
    		ps.setInt(1, course.getStudentid());
    		ps.setString(2, course.getCoursename());
    		ps.setDouble(3, course.getGrade());
    		rowsAffected = ps.executeUpdate();
    		
    	} finally {
    		try {
    			ps.close();
    		} catch (Exception e) {
    			e.getStackTrace();
    		}
    	}

    	return rowsAffected;
    }

    
    public List<Course> showCoursesDao(Connection dbConn) throws SQLException {
    	List<Course> courseList = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	
    	String sql = SQLConstants.SELECT_ALL_COURSES_SQL ;
    	
    	try {
    		courseList = new ArrayList<Course>();
    		
    		ps = dbConn.prepareStatement(sql);
    		rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			Course course = new Course();
    			course.setId(rs.getInt("id"));
    			course.setStudentid(rs.getInt("student_id"));
    			course.setCoursename(rs.getString("course_name"));
    			course.setGrade(rs.getDouble("grade"));
    			courseList.add(course);
    		}
    	} finally {
    		try {
    			rs.close();
    		} catch (Exception e) {
    			
    		}
    		try {
    			ps.close();
    		} catch (Exception e) {
    			
    		}
    	}
    	
    	return courseList;
    }
	
	
}
