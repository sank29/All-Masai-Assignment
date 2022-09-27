package com.masai1;

import java.util.Scanner;

public class EmployeeMain {
	public static Employee getEmployeeDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id :");

		int id = sc.nextInt();
		System.out.println("Enter the Name :");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter the salary :");
		int salary = sc.nextInt();
		System.out.println("Enter the PF percetage :");
		int pf = sc.nextInt();

		System.out.println("id " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary: " + salary);
		Employee employee = new Employee(id, name, salary, pf);

		employee.calculateNetSalary(pf);
		System.out.println("Net salary: " + employee.getNetSalary());

		return employee;
	}

	public static void main(String[] args) {
		getEmployeeDetails();
	}

}
