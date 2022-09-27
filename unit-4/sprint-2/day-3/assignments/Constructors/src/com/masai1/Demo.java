package com.masai1;

public class Demo {

	public static void main(String[] args) {
		Student studentFirstStudent = new Student();
		System.out.println(studentFirstStudent.getStudent(true).getCollageName());
		System.out.println(studentFirstStudent.getStudent(false).getCollageName());

	}

}
