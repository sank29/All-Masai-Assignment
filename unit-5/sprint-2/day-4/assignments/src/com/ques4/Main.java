package com.ques4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();

		studentSet.add(new Student("sanket", 12, 500));
		studentSet.add(new Student("Akash", 13, 600));
		studentSet.add(new Student("Bachu", 14, 1000));
		studentSet.add(new Student("Rsuhi", 12, 400));
		studentSet.add(new Student("xyz", 12, 600));

		Stream<Student> newStream = studentSet.stream();
		Stream<Student> sortedStudent = newStream.filter(student -> student.getMarks() > 500);

		sortedStudent.forEach(eachStudent -> System.out.println(eachStudent));

	}

}
