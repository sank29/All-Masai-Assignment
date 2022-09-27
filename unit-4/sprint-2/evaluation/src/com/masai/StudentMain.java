package com.masai;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("Enter Number of Students you want to enter");
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================");
		int numberOfStudent = sc.nextInt();

		for (int i = 0; i <= numberOfStudent - 1; i++) {
			System.out.println("Enter the Roll Number :");
			int rollNumber = sc.nextInt();
			System.out.println("Enter the Name :");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Enter the marks :");
			int marks = sc.nextInt();
			System.out.println("=================================");
			System.out.println("Student Detail " + (i + 1));
			System.out.println("Student Roll Number: " + (double) rollNumber);
			System.out.println("Student Name: " + name);
			System.out.println("Student Mark: " + (double) marks);
			System.out.println("==================================");
		}
	}

}
