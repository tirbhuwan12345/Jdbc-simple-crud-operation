package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;
import com.jsp.student_crud_with_prepared.service.StudentService;

public class StudentController {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("main method started!!!!");
		
		Student student = null;
		
		StudentService studentService = new StudentService();
		
		studentService.insertStudentService(student);
		System.out.println("main method ended!!!!");
		System.out.println("1.Insert\n2.Update");
		System.out.println("enter your option");
		int ch = scanner.nextInt();
		switch (ch) {
		 /*
		  * CASE 1 FOR INSERTIOON DATA.
		  */
		case 1: {
			System.out.println("Enter student Id");
			int id = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter your email");
			String email = scanner.next();
			System.out.println("Enter your phone");
			long phone = scanner.nextLong();
			
			student = new Student(id, name, email, phone);
			studentService.insertStudentService(student);
		}
		   break;
		   
		   /*
		    * CASE 1 FOR UPDATE DATA.
			*/
		   
		case 2: {
			System.out.println("1.Name\n2.Email\n3.Phone");
			System.out.println("Please chose your option to update your data");
			
			int ch1 = scanner.nextInt();
			
			switch (ch1) {
			case 1: {
				System.out.println("Enter Student Id");
				int id=scanner.nextInt();
				System.out.println("Enter Student Name");
				String name=scanner.next();
				
				int id1= studentService.updateStudentNameService(id, name);
				
				if(id1==1)
				{
					System.out.println("Data====Updated");
				}
				else {
					System.out.println("id not found please check once");
				}
				
			}
				break;
			case 2: {
				
				System.out.println("Enter Student Id");
				int id=scanner.nextInt();
				System.out.println("Enter Student Email");
				String email=scanner.next();
				
				int id1= studentService.updateStudentEmailService(id, email);
				
				if(id1==1)
				{
					System.out.println("Data====Updated");
				}
				else {
					System.out.println("id not found please check once");
				}
			}
				break;
			case 3: {
				System.out.println("Enter Student Id");
				int id=scanner.nextInt();
				System.out.println("Enter Student Phone");
				String email=scanner.next();
				
				int id1= studentService.updateStudentPhoneService(id, email);
				
				if(id1==1)
				{
					System.out.println("Data====Updated");
				}
				else {
					System.out.println("id not found please check once");
				}
			}
				break;
			default:
				System.out.println("please choose right option");
			}
		}
		   break;
		  
		}
		
//		student student = new student(21, "Suraj Kumar", "suraj02@gmail.com", 7739);
//		
//		studentdao studentDao = new studentdao();
//		
//		studentDao.insertStudent(student);
//		
	}
}