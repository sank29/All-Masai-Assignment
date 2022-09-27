package com.que4;

public class Parent {

	public boolean method1(int number) {
		System.out.println("Inside method1 of parent class");

		if (number >= 1 && number <= 10) {
			return true;
		}
		return false;

	}

	final void method2() {
		System.out.println("Inside method2 of parent class");
	}

	void method3() {
		System.out.println("Inside method3 of parent class");
	}

	final int number;

	public Parent(int number) {

		if (method1(number)) {
			this.number = number;
			System.out.println("You enter number is " + number + " this number set successfully");
		} else {
			System.out.println("Your number is invalid we set your number as default");
			this.number = 0;
		}
	}

}
