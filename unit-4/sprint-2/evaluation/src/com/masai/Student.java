package com.masai;

public class Student {
	private int rollNumber;
	private int studentName;
	private int marks;

	public Student() {

	}

	public Student(int rollNumber, int studentName, int marks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getStudentName() {
		return studentName;
	}

	public void setStudentName(int studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
