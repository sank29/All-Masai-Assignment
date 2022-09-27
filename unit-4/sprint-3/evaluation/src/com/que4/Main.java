package com.que4;

import java.util.Scanner;

public class Main {
	static public void findPositon(String str, int position) {
		if (str.length() < position) {
			System.out.println("Invalid position, Please enter a valid position => " + position);
		} else {
			char chart = str.charAt(position);
			System.out.println("Character at the position " + position + " => " + chart);
		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter String");
		String str = sc.nextLine();
		System.out.println("Please enter position");

		int positions = sc.nextInt();

		findPositon(str, positions);
	}

}
