package com.masai;

import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter String");

		String str = sc.nextLine();
		System.out.println("Enter the character position you want to access: ");
		int position = sc.nextInt();

		char outputChar = str.charAt(position);

		System.out.println("Character at position 2 is : " + "\n" + outputChar);

	}

}
