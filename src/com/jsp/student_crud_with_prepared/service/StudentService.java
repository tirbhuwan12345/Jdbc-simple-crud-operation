package com.jsp.student_crud_with_prepared.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	/**
	 * INSERT METHOD FOR STUDENT
	 */
	Connection connection = null;
	
	public Student insertStudentService(Student student)
	{
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-preparedstatement","root","Sham7079@"); 
		
		System.out.println("insertdao method started!!!!");
		String insertQuery = "insert into student values(?, ?, ?, ?)";
		
		

		try {
//			Class.forName("com.mysql.jdbc.Driver");//debricated cj
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_preparedstatement","root","root"); 
			
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setDouble(4, student.getStudentPhone());
			System.out.println("Huaa Ki Nahi Run");
			System.out.println(preparedStatement);
			
			preparedStatement.execute();
			System.out.println("Achha Se Karo Ho Jayega");
			
			System.out.println("Date___Dekha na ho gaya___Stored");
			return student;
			
			
		} catch (SQLException | NullPointerException e) {
			// TODO: handle exception
		}

		return null;
		} /*INSERT METHOD ENDS*/
	
	     
	//======================================================================================
	// for updating name
	public int updateStudentNameService(int studentId, String studentName) {
		String updateStudentNameQuery = "update student set name =? where id=?";
		
		
		try {
			PreparedStatement pst= connection.prepareStatement(updateStudentNameQuery);
			
			pst.setInt(2, studentId);
			pst.setString(1, studentName);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return 0;
	}
	//=========================================================================
	
	//for updating email
	public int updateStudentEmailService(int studentId, String studentEmail) {
		String updateStudentEmailQuery = "update student set email =? where id=?";
		
		
		try {
			PreparedStatement pst= connection.prepareStatement(updateStudentEmailQuery);
			
			pst.setInt(2, studentId);
			pst.setString(1, studentEmail);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return 0;
	}
	
	//=========================================================================
	
		//for updating phone
		public int updateStudentPhoneService(int studentId, String studentPhone) {
			String updateStudentPhoneQuery = "update student set phone =? where id=?";
			
			
			try {
				PreparedStatement pst= connection.prepareStatement(updateStudentPhoneQuery);
				
				pst.setInt(2, studentId);
				pst.setString(1, studentPhone);
				
				return pst.executeUpdate();
			} catch (SQLException e) {
				// TODO: handle exception
			}
			return 0;
		}
}




