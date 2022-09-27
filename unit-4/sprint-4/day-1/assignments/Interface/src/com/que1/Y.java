package com.que1;

public interface Y {
	abstract void fun1();

	default void fun4() {
		System.out.println("I am fun4 from Y");
	}

	static void fun5() {
		System.out.println("I am fun5 from Y");
	}
}
