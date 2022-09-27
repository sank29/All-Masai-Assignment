package com.ques1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// Scanner class to take input from user
	public static Scanner sc = new Scanner(System.in);

	// Generic method
	public static void myGenericMethod(List<? super Integer> mylist) {

		System.out.println("Your enter data");
		// printing the list
		for (Object eachElement : mylist) {
			System.out.println(eachElement);
		}
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("Please enter integer or it's parent type");
		System.out.println("Please how many data you want to enter");

		// taking linkedList to store the data
		List<Integer> myIntegers = new LinkedList<>();

		// how many data user want to enter
		int choise = sc.nextInt();

		// taking input from user
		for (int i = 0; i <= choise - 1; i++) {
			System.out.println("Please enter " + (i + 1) + " element.");
			myIntegers.add(sc.nextInt());
		}

		// passing the list in generic method
		List<Number> nD = Arrays.asList(10.0, 10.22, 22.01, 13.13);

//		myGenericMethod(myIntegers);
		myGenericMethod(nD);
	}

}
