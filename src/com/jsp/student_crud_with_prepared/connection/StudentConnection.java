package com.jsp.student_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentConnection {
	public static Connection getStudentConnection()
	{
		//LOAD OR REGISTER
//		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//debricated cj
			
			//CREATE CONNECTION
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_preparedstatement","root","root"); 
		
//		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?)");
//		
//		pst.setInt(1, 1);
//		pst.setString(2, "");
			return connection;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return Connection;
		return null;
		
	}

}
