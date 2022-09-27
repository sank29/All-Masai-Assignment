package com.masai;

public class Student {
	int roll;
	String name;
	int marks;

	void displayStudentDetails() {
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.roll = 20;
		student1.name = "Sanket";
		student1.marks = 35;
		student1.displayStudentDetails();
		student1 = null;

		Student student2 = new Student();
		student2.roll = 30;
		student2.name = "Akash";
		student2.marks = 40;
		student2.displayStudentDetails();
		student2 = null;

	}

}
