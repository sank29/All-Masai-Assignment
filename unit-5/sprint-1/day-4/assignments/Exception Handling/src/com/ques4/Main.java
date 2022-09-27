package com.ques4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, List<String>> myMap = new LinkedHashMap<>();

		myMap.put("Maharashtra", Arrays.asList("Mumbai", "Pune", "Nashik", "Nanded"));
		myMap.put("Kerala", Arrays.asList("Kochi", "Kannur", "Thrissur", "Kollam"));
		myMap.put("Gujarat", Arrays.asList("Ahmedabad", "Rajkot", "Surat", "Jamnagar"));

		for (Map.Entry<String, List<String>> states : myMap.entrySet()) {
			System.out.println(states);
		}

	}

}
