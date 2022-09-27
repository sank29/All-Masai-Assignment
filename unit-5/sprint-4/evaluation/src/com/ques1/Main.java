package com.ques1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void insertStudetnName() {
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter address");
		String address = sc.next();
		
		System.out.println("Enter mobile");
		String mobile = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/evalutionStudentCourse";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","ADMIN");
			
			PreparedStatement preparedStatement = conn.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, roll);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, mobile);
			
			int num = preparedStatement.executeUpdate();
			
			if(num > 0) {
				System.out.println("Student details updated");
			}else {
				System.out.println("Not updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertCourse() {
		
		System.out.println("Enter course id");
		int courseId = sc.nextInt();
		
		System.out.println("Enter course name");
		String courseName = sc.next();
		
		System.out.println("Enter course fee");
		int fee = sc.nextInt();
		
		System.out.println("Enter course duration");
		String courseDuration = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/evalutionStudentCourse";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","ADMIN");
			
			PreparedStatement preparedStatement = conn.prepareStatement("insert into course values(?,?,?,?)");
			preparedStatement.setInt(1, courseId);
			preparedStatement.setString(2, courseName);
			preparedStatement.setInt(3, fee);
			preparedStatement.setString(4, courseDuration);
			
			int num = preparedStatement.executeUpdate();
			
			if(num > 0) {
				System.out.println("course details updated");
			}else {
				System.out.println("Not updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void searchStudetn() {
		
		System.out.println("Enter Roll number of student");
		int roll = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/evalutionStudentCourse";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","ADMIN");
			
			PreparedStatement preparedStatement = conn.prepareStatement("insert into course values(?,?,?,?)");
			
			int num = preparedStatement.executeUpdate();
			
			if(num > 0) {
				System.out.println("course details updated");
			}else {
				System.out.println("Not updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Select choice");
		System.out.println("1. Inseting the student details");
		System.out.println("2. Inserting the course details");
		System.out.println("3. Search the student deatils based on the roll number");
		
		int choice = sc.nextInt();
		if(choice == 1) {
			
			insertStudetnName();
		}else if(choice == 2) {
			
			insertCourse();
		}else if(choice == 3) {
			
			searchStudetn();
		}else {
			System.out.println("Please enter valid number");
		}
		

	}

}
