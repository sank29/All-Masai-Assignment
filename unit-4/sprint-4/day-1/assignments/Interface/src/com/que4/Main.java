package com.que4;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Test t = new Test();

		System.out.println("Please enter number");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int[] arr = t.display(number);

		// Take this argument from user using the Scanner class
		// Write the logic to print the elements

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {

				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
	}
}
