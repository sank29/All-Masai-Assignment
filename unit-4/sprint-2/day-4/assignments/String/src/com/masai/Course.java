package com.masai;

import java.util.Scanner;

public class Course {
	private int courseId;
	private String courseName;
	private int courseFee;

	public Course(int courseId, String courseName, int courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public void displayCourseDetails() {
		System.out.println("Course id is " + this.courseId);
		System.out.println("Course name is " + this.courseName);
		System.out.println("Course fee is " + this.courseFee);
	}

	public static void authenticate(String username, String password) {
		if (username.equals("admin") && password.equals("1234")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter course Id");
			int courseId = sc.nextInt();

			sc.nextLine();
			System.out.println("Enter course name");
			String courseName = sc.nextLine();

			System.out.println("Enter course Fee");
			int courseFee = sc.nextInt();

			Course course = new Course(courseId, courseName, courseFee);
			course.displayCourseDetails();

		} else {
			System.out.println("Invalid Username or Password");
		}
	}

	public static void main(String[] args) {
		System.out.println("Sanket");
		authenticate("admin", "1234");
		authenticate("admin", "1234555");

	}
}
