package com.que3;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Sanket", 23, "12345678901", "Mumbai", 123123.00, "Java Developer",
				"Java Department");

		Manager manager = new Manager("Akash", 40, "0987654321", "Delhi", 1234543.00, "Marketing", "Head Department");

		System.out.println("=========================");
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getPhoneNumber());
		System.out.println(employee.getAddress());
		System.out.println(employee.getSalary());
		System.out.println(employee.getSpecialisation());
		System.out.println(employee.getDepartment());
		System.out.println("=========================");
		System.out.println(manager.getName());
		System.out.println(manager.getAge());
		System.out.println(manager.getPhoneNumber());
		System.out.println(manager.getAddress());
		System.out.println(manager.getSalary());
		System.out.println(manager.getSpecialisation());
		System.out.println(manager.getDepartment());
		System.out.println("=========================");
	}

}
