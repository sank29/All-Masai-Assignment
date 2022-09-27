package com.ques4;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Student> myHashMap = new HashMap<>();

		Student student1 = new Student(12, "Sanket", 200);
		Student student2 = new Student(13, "Akash", 400);
		Student student3 = new Student(14, "Bachu", 100);
		Student student4 = new Student(15, "Rushi", 500);

		myHashMap.put("Maharashtra", student1);
		myHashMap.put("Kerala", student2);
		myHashMap.put("Goa", student3);
		myHashMap.put("MP", student4);

	}

}
