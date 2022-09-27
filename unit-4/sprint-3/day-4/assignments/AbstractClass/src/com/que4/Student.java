package com.que4;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;

	static Scanner scanner = new Scanner(System.in);

	public Student() {

	}

	public void displayDetails() {
		Student student = new Student();

		System.out.println("Please enter student details");

		System.out.println("Student name");
		String name = scanner.nextLine();
		student.setName(name);

		System.out.println("Student roll number");
		int roll = scanner.nextInt();
		student.setRoll(roll);

		System.out.println("Student marks");
		int marks = scanner.nextInt();
		student.setMarks(marks);

		char c = calculateGrade(marks);
		student.setGrade(c);
		System.out.println(student);
	}

	public char calculateGrade(int marks) {

		if (marks < 500 && marks >= 400) {
			this.grade = 'B';

		} else if (marks < 400) {
			this.grade = 'C';

		} else {
			this.grade = 'A';

		}
		return this.grade;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
