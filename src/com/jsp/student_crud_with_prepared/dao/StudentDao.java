package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;


public class StudentDao {
	
	/**
	 * INSERT METHOD FOR STUDENT
	 */
	Connection connection = StudentConnection.getStudentConnection();
	
	
	public Student insertStudent(Student student)
	{
		/**
		 * JDBC CODE 
		 */
		 
		
		try {
			PreparedStatement pst = connection.prepareStatement("insert into student values(?,?,?,?)");
			
			pst.setInt(1, student.getStudentId());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getStudentEmail());
			pst.setLong(4, student.getStudentPhone());
			
			pst.execute();
			
			System.out.println("Data Stored");
			return student;
			
		} catch (SQLException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		return null;
	}
	public void displayStudentDetails()
	{
		String displayStudentQuery="select*from student";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(displayStudentQuery);
			 ResultSet resultSet = PreparedStatement.executeQ
					 uery();
			 resultSet.next();
			 
			 int id=resultSet.getInt("id");
			 String name=resultSet.getString("name");
			 String email=resultSet.getString("email");
			 long phone=resultSet.getLong("phone");
			 
			 System.out.println("id"+id);
			 System.out.println("name"+name);
			 System.out.println("email"+email);
			 System.out.println("phone"+phone);

		}catch(SQLExe)
	}
}
