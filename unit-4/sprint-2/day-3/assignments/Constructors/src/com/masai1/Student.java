package com.masai1;

public class Student {
	private int roll;
	private String name;
	private String address;
	private String collageName;

	public Student() {
	}

	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public Student(int roll, String name, String address, String collegeName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collegeName;
	}

	public static Student getStudent(boolean isFromNIT) {
		if (isFromNIT) {
			Student newStudent = new Student(0, "default roll", "default address");
			newStudent.setCollageName("NIT");
			return newStudent;
		} else {
			Student newStudent = new Student(0, "default name", "default address", "default college name");
			return newStudent;
		}
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

}
