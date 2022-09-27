package com.que2;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public void readInput() {
		System.out.println("Enter total no.of employees");
		int numberOfEmployee = scanner.nextInt();

		if (numberOfEmployee < 3) {
			System.out.println("Please enter a valid employee count:");
		} else {
			int[] arrayOfAges = new int[numberOfEmployee];
			for (int i = 0; i <= arrayOfAges.length - 1; i++) {
				System.out.println("Enter the age for " + (i + 1) + " employees:");
				arrayOfAges[i] = scanner.nextInt();
			}

			EmployeeAge employeeAge = new EmployeeAge();
			employeeAge.calculateAverage(arrayOfAges);
		}

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.readInput();
	}

}
