package com.que3;

public class Student {
	private int rollNo;
	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int engMarks;

	public Student(int rollNo, String name, int mathMarks, int scienceMarks, int engMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathMarks=" + mathMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public String getName() {
		return name;
	}

}
