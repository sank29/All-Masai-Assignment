package com.ques2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// Predicate Checking the student marks is less than 500 or not
		Predicate<Student> myPredicate = student -> student.getMarks() < 500 ? true : false;

		System.out.println(myPredicate.test(new Student(200, "Sanket")));

		/////////////////////////////////////////////////////

		// Consumer will print the student details

		Consumer<Student> myConsumer = student -> System.out
				.println("Student name is " + student.getName() + " student marks is " + student.getMarks());
		myConsumer.accept(new Student(100, "Sanekt"));

		//////////////////////////////////////////

		// Supplier if you want to get Student then we can use supplier

		Supplier<Student> mySupplier = () -> new Student(200, "Sanket");

		System.out.println(mySupplier.get());

		///////////////////////////////////////////////////////////

		// function

		Function<String, Integer> myFunction = numInString -> Integer.parseInt(numInString);

		System.out.println(myFunction.apply("100"));

	}

}
