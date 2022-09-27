package com.question5;

import java.util.Scanner;

public class Demo {

	public static double calculateAvarageMarks(Student[] students) {
		int totalMarks = 0;

		for (int i = 0; i <= students.length - 1; i++) {
			totalMarks = totalMarks + students[i].getMarks();
		}
		totalMarks = totalMarks / students.length;
		return totalMarks;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many student you want to create.");
		int numberOfStudent = sc.nextInt();
		Student[] students = new Student[numberOfStudent];

		for (int i = 0; i <= numberOfStudent - 1; i++) {

			System.out.println("Please enter student " + (i + 1) + " roll number");
			int roll = sc.nextInt();

			System.out.println("Please enter student " + (i + 1) + " name number");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Please enter student " + (i + 1) + " address number");
//			sc.nextLine();
			String address = sc.nextLine();

			System.out.println("Please enter student " + (i + 1) + " marks number");
			int marks = sc.nextInt();

//			students[i].setName(name);
//			students[i].setRoll(roll);
//			students[i].setAddress(address);
//			students[i].setMarks(marks);

			students[i] = new Student(roll, name, address, marks);

		}

		for (int i = 0; i <= students.length - 1; i++) {
			System.out.println("===========================");
			System.out.println(i + " student name is " + students[i].getName());
			System.out.println(" student roll is " + students[i].getRoll());
			System.out.println(" student marks is " + students[i].getMarks());
			System.out.println(" student address is " + students[i].getAddress());
			System.out.println("===========================");

		}

		System.out.println("Avarage marks of student is " + calculateAvarageMarks(students));

	}
}
