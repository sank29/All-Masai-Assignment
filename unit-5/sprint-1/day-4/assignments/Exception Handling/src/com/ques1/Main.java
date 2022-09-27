package com.ques1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {

		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");

		try {
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			String message = null;
			int num3 = num1 / num2;
			if (num3 > 10) {
				message = "Welcome to Exception Handling ";
			}
			System.out.println("Message is :" + message.toUpperCase());
			System.out.println("end of main");

		} catch (InputMismatchException e) {

			System.out.println("Please enter valid number");

		} catch (ArithmeticException e) {

			System.out.println("num2 should not be 0");

		} catch (NullPointerException e) {

			System.out.println("String value is null");

		}
//		catch (Exception e) {
//
//			System.out.println("WELCOME TO EXCEPTION HANDLING");
//		}
	}
}
