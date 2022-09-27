package com.masai;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public Student() {
		this(0, "Default");
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 && age > 60)
			this.age = age;
		else
			System.out.println("Please enter valid age");
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks < 0 && marks > 500) {
			this.marks = marks;
		} else {
			System.out.println("Please enter valid marks");
		}
	}

}
