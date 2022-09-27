package com.ques2;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void printTreeMap(Map<Student, String> myMap) {
		for (Student eachElement : myMap.keySet()) {
			String value = myMap.get(eachElement).toString();
			System.out.println(eachElement + " and states is " + value);
		}
	}

	public static void main(String[] args) {
		Map<Student, String> myMap = new TreeMap<>(new StudentComp());

		Student student1 = new Student(12, "sanket", 100);
		Student student2 = new Student(14, "akash", 200);
		Student student3 = new Student(16, "Bachu", 50);

		myMap.put(student1, "Maharashtra");
		myMap.put(student2, "Keral");
		myMap.put(student3, "Goa");

		printTreeMap(myMap);
	}

}
