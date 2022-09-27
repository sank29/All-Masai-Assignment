package com.ques3;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
	public static void printLinkedHashMap(LinkedHashMap<String, String> linkedHashMap) {
		for (String my : linkedHashMap.keySet()) {
			System.out.println("Student name is " + linkedHashMap.get(my) + " and state is " + my);
		}
	}

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("Maharashtra", "Sanket");
		linkedHashMap.put("Goa", "Akash");
		linkedHashMap.put("kerala", "Bachu");

		printLinkedHashMap(linkedHashMap);
	}
}
