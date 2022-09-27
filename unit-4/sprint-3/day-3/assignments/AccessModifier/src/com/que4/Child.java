package com.que4;

final class Child extends Parent {

	public Child(int number) {
		super(number);
	}

	public void method4() {
		System.out.println("Inside method4 of child class");
	}

	@Override
	public boolean method1(int number) {
		System.out.println("I am from override method of parent class method1");
		return super.method1(number);
	}

}
