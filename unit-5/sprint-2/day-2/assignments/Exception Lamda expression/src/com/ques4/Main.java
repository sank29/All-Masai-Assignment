package com.ques4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		PrintList printList = city -> System.out.println(city);

		List<String> stringList = new ArrayList<>();
		stringList.add("Mumbai");
		stringList.add("Pune");
		stringList.add("Nashik");
		stringList.add("Nanded");
		stringList.add("Nagpur");

		printList.display(stringList);

	}
}
