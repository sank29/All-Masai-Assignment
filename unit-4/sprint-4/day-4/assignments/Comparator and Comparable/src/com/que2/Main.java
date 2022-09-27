package com.que2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TreeSet<Employee> employeesInTreeSet = takEmployeesFromUser();
		System.out.println(employeesInTreeSet);
	}

//	public static void sortEmployee(TreeSet<Employee> employees) {
//		TreeSet<Employee> employees2 = new TreeSet<>(new EmployeeSalaryComp());
//	}

	public static TreeSet<Employee> takEmployeesFromUser() {

		System.out.println("How many employee you want to store in database");
		int number = sc.nextInt();
		TreeSet<Employee> employeesInTreeSet = new TreeSet<>(new EmployeeSalaryComp());

		for (int i = 0; i <= number - 1; i++) {
			System.out.println("Enter employee name");
			String name = sc.next();

			System.out.println("Enter employee id");
			int id = sc.nextInt();

			System.out.println("Enter employee salary");
			double salary = sc.nextInt();

//			sc.nextLine();

			Employee employee = new Employee(id, name, salary);

			employeesInTreeSet.add(employee);

		}
		return employeesInTreeSet;
	}

}
