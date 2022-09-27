package com.ques5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userRegistration = new UserRegistration();
		System.out.print("Enter Your name: ");
		String name = sc.nextLine();
		System.out.print("Enter Your Country: ");
		String country = sc.nextLine();

		try {

			userRegistration.registerUser(name, country);

		} catch (InvalidCountryException e) {

			System.out.println(e.getMessage());
			System.out.println("Thank You!");
		}

	}

}
