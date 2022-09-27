package com.que5;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		String str = "hello Hello HEllo hi hi: hi! Welcome, welcome";
		String[] stringArray = str.split(" ");

		System.out.println("Number of words is " + stringArray.length);

		TreeSet<String> stringTreeSet = new TreeSet<>();
		for (String s : stringArray) {
			stringTreeSet.add(s.toLowerCase());
		}

		int i = 1;
		for (String strs : stringTreeSet) {
			System.out.print(i + " " + strs + " ");
			i++;
		}
	}

}
