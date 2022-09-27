package com.ques3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();

		students.add(new Student(12, "Sanket", 600, "Pune"));
		students.add(new Student(13, "Rushi", 200, "Nagpur"));
		students.add(new Student(15, "Akash", 700, "Buldhana"));
		students.add(new Student(16, "Bachu", 800, "Nanded"));
		students.add(new Student(16, "xyz", 600, "Latur"));

		Stream<Student> stream = students.stream();

		Stream<Employee> myEStream = stream.map(studentss -> {
			Employee employee = null;

			if (studentss.getMarks() > 500) {
				employee = new Employee(studentss.getRoll(), studentss.getName(), studentss.getMarks() * 10000,
						studentss.getAddress());

				return employee;

			}
			return employee;
		});

		myEStream.forEach(employeess -> {
			if (employeess != null)
				employees.add(employeess);
		});

		employees.forEach(employeess -> System.out.println(employeess));
	}

}
