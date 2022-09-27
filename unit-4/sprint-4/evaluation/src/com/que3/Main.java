package com.que3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student(12, "Sanket", 30, 43, 32));
		students.add(new Student(12, "Akash", 30, 53, 72));
		students.add(new Student(12, "Bachu", 50, 63, 82));
		students.add(new Student(12, "Rushi", 30, 43, 32));

//		int totalMarks = totalMark(students);
		Collections.sort(students, new MarksComp());
		display(students);

	}

//	public static int totalMark(ArrayList<Student> students) {
//		int totalMarks = 0;
//		for (Student student : students) {
//			totalMarks = student.getEngMarks() + student.getMathMarks() + student.getScienceMarks();
//
//		}
//	}

	public static void display(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
