package com.ques4;

import java.util.Scanner;

public class Main {

	public static void takeInputFromUserAndCalculateQuitient() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter two numbers a and b");
		System.out.print("Enter a ");
		int a = sc.nextInt();
		System.out.print("Enter b ");
		int b = sc.nextInt();

		try {
			int result = a / b;
			System.out.println("The quotient of " + a + "/" + b + " = " + result);

		} catch (ArithmeticException e) {

			System.out.println("DivideByZeroException caught");
		} finally {
			System.out.println("Inside finally block");
		}
	}

	public static void main(String[] args) {
		takeInputFromUserAndCalculateQuitient();
	}

}
