package com.que1;

public class Main {

	static Object[] changeArray(Object[] array) {
		Student student = (Student) array[0];
		int marks = student.getMarks();
		marks = marks + 10;
		student.setMarks(marks);
		;

		Employee employee = (Employee) array[1];
		int salary = employee.getSalary();
		salary = salary + 10000;
		employee.setSalary(salary);

		String string = (String) array[2];

		int number = (int) array[3];

		number = number + 20;

		array[0] = student;
		array[1] = employee;
		array[2] = "String";
		array[3] = 50;

		System.out.println();

		return array;

	}

	public static void main(String[] args) {
		Student student = new Student(23, "rakesh", 450);

		Employee employee = new Employee(12, "Lokesh", 84000);

		Object[] array = new Object[4];

		array[0] = student;
		array[1] = employee;
		array[2] = "String";
		array[3] = 50;

		Object[] arrays = changeArray(array);
		System.out.println(arrays);

	}

}
