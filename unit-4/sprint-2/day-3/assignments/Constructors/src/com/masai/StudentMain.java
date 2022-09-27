package com.masai;

public class StudentMain {

	public static void main(String[] args) {
		Student akashStudent = new Student();
		akashStudent.setAge(100);
//		System.out.println(akashStudent.getName());

		Student sanketStudent = new Student(600, "Sanket");
		sanketStudent.setMarks(-10);
		System.out.println(sanketStudent.getMarks());
		System.out.println(sanketStudent.getRoll());

	}

}
