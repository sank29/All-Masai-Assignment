package com.question1;

import java.util.Scanner;

class Main {
	public static String reversString(String input) {
		// write the logic
		String reverseString = "";

		char[] charInArray = new char[input.length()];

		for (int i = 0; i <= charInArray.length - 1; i++) {
			charInArray[i] = input.charAt(i);
		}

		for (int i = charInArray.length - 1; i >= 0; i--) {
			reverseString += charInArray[i];
		}
		return reverseString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :" + orignalString);
		System.out.println("Reversed String is :" + result);
	}
}