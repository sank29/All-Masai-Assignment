package com.ques4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static HashSet<Employee> employees = new HashSet<>();

	public static void main(String[] args) {
		boolean quite = false;
		while (!quite) {
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String choise = sc.next();
			switch (choise) {
			case "y":
				addEmployee();
			default:
				throw new IllegalArgumentException("Unexpected value: " + choise);
			}
		}
	}

	public static void addEmployee() {

		Employee employee = new Employee(employeeId, employeeName, employeeSalary,
				new Department(departmentId, departmentName));
		if (employees.add(new Employee(12, "Sanket", 123.33, new Department(2, "Java department")))) {

		}
	}

}
