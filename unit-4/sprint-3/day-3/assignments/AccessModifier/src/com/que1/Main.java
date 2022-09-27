package com.que1;

public class Main {

	public static Person generatePerson(Person person) {

		person.setName("Sanket");
		person.setGender("Male");
		person.getAddress().setCity("Mumbai");
		person.getAddress().setPinCode("443301");
		person.getAddress().setState("Mh");

		if (person instanceof Student) {
			Student student = (Student) person;
			student.setStudentId(12);
			student.setCourseEnrolled("Java");
			student.setCourseFee(30000);

		} else if (person instanceof Instructor) {
			Instructor instructor = (Instructor) person;
			instructor.setInstructorId(212);
			instructor.setSalary(12233222);
		}
		return person;

	}

	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());
		Person newInstructor = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newInstructor);

	}

}
