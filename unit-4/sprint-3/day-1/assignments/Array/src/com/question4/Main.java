package com.question4;

public class Main {
	public static void calculateFactorial(String[] args) {
		if (args.length == 1) {
			int factorial = 1;

			for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		} else if (args.length == 2) {
			int firstNum = Integer.parseInt(args[0]);
			int secondNum = Integer.parseInt(args[1]);
			int finalNum = java.lang.Math.abs(firstNum - secondNum);

			int factorial = 1;

			for (int i = 1; i <= finalNum; i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		} else {
			System.out.println("Please enter valid numbers");
		}

	}

	public static void main(String[] args) {

		calculateFactorial(args);
	}

}
