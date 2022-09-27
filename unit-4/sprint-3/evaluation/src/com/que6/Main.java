package com.que6;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static double getStudent(int choice) {

		if (choice == 1) {

			System.out.println("Enter the Marks for hindi:");
			int hindi = sc.nextInt();

			System.out.println("Enter the Marks for english:");
			int english = sc.nextInt();

			System.out.println("Enter the Marks for history:");
			int history = sc.nextInt();

			Student student = new ArtStudent(hindi, english, history);
			double percetage = student.findPercentage();
			return percetage;

		} else if (choice == 2) {

			System.out.println("Enter the Marks for physic:");
			int physic = sc.nextInt();

			System.out.println("Enter the Marks for chemistry:");
			int chemistry = sc.nextInt();

			System.out.println("Enter the Marks for math:");
			int math = sc.nextInt();

			System.out.println("Enter the Marks for biology:");
			int biology = sc.nextInt();

			Student student = new ArtStudent(physic, chemistry, biology);
			double percetage = student.findPercentage();
			return percetage;

		} else {

			System.out.println("Enter the Marks for account:");
			int account = sc.nextInt();

			System.out.println("Enter the Marks for economics:");
			int economics = sc.nextInt();

			System.out.println("Enter the Marks for businessStudies:");
			int businessStudies = sc.nextInt();

			Student student = new ArtStudent(account, economics, businessStudies);
			double percetage = student.findPercentage();
			return percetage;
		}

	}

	public static void main(String[] args) {

		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. ArtStudent");
		System.out.println("2. ScienceStudent");
		System.out.println("3. CommerceStudent");

		int choise = sc.nextInt();

		System.out.println("Percentage is: " + getStudent(choise));

	}

}
