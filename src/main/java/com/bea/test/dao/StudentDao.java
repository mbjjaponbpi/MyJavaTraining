package com.bea.test.dao;

import com.bea.test.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDao {
	
    public int addStudentDao(Connection dbConn, Student student) throws SQLException {
    	int rowsAffected = 0;
    	PreparedStatement ps = null;

    	String sql = SQLConstants.INSERT_STUDENT_SQL;
    	
    	try {
    		
    		ps = dbConn.prepareStatement(sql);
    		ps.setString(1, student.getName());
    		ps.setInt(2, student.getAge());
    		ps.setString(3, student.getEmail());
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

    
    public Student findStudentById(Connection dbConn, Integer studentId) throws SQLException {
    	Student student = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	
    	String sql = SQLConstants.SELECT_STUDENT_BY_ID;

    	try {
    		
    		ps = dbConn.prepareStatement(sql);
    		ps.setInt(1, studentId);
    		rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			student = new Student();
    			student.setId(rs.getInt("id"));
    			student.setName(rs.getString("name"));
    			student.setAge(rs.getInt("age"));
    			student.setEmail(rs.getString("email"));
    			break;
    		}
    	} finally {
    		try {
    			rs.close();
    		} catch (Exception e) {
    			e.getStackTrace();
    		}
    		try {
    			ps.close();
    		} catch (Exception e) {
    			e.getStackTrace();
    		}
    	}
    	return student;
    }
    
    public List<Student> showStudentsDao(Connection dbConn) throws SQLException {
    	List<Student> studentList = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	
    	String sql = SQLConstants.SELECT_ALL_STUDENTS_SQL;
    	
    	try {
    		studentList = new ArrayList<Student>();
    		
    		ps = dbConn.prepareStatement(sql);
    		rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			Student student = new Student();
    			student.setId(rs.getInt("id"));
    			student.setName(rs.getString("name"));
    			student.setAge(rs.getInt("age"));
    			student.setEmail(rs.getString("email"));
    			studentList.add(student);
    		}
    	} finally {
    		try {
    			rs.close();
    		} catch (Exception e) {
    			e.getStackTrace();
    		}
    		try {
    			ps.close();
    		} catch (Exception e) {
    			e.getStackTrace();
    		}
    	}
    	
    	return studentList;
    	
    }

	
}
