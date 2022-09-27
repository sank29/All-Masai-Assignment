package com.que4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please enter positive number from the user");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		Parent parent = new Child(number);

		parent.method1(3);
		parent.method2();
		parent.method3();

		Child child = (Child) parent;
		child.method4();

	}
}
