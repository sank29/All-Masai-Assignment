package com.ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();

		studentsList.add(new Student("sanket", 200));
		studentsList.add(new Student("Akash", 500));
		studentsList.add(new Student("Bachu", 100));
		studentsList.add(new Student("Rushi", 700));
		studentsList.add(new Student("xyz", 100));

		// Long method
//		Stream<Student> newStream = studentsList.stream();
//
//		Optional<Student> maxMarkStudent = newStream
//				.max((student1, student2) -> student1.getMarks() > student2.getMarks() ? 1 : -1);
//
//		System.out.print(maxMarkStudent);

		// Shortcut method
		Optional<Student> maxMarkStudent = studentsList.stream()
				.max((student1, student2) -> student1.getMarks() > student2.getMarks() ? 1 : -1);

		System.out.print(maxMarkStudent);
	}

}
