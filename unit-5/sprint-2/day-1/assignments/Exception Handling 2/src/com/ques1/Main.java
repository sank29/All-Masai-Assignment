package com.ques1;

import java.util.Scanner;

public class Main {

	public static int takeInputFromUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String numInString = sc.next();

		int numInInteger = Integer.parseInt(numInString);

		int squareInteger = (int) Math.pow(numInInteger, 2);

		return squareInteger;
	}

	public static void main(String[] args) {
		try {

			int squareOfNumber = takeInputFromUser();
			System.out.println("The square value is " + squareOfNumber);

		} catch (NumberFormatException e) {

			System.out.println("Entered input is not a valid format for an integer");

		} catch (Exception e) {

			System.out.println("Don't worry java handled Exception!");
		}

		System.out.println("The work has been done successfully");
	}

}
