package com.que1;

public interface X {
	abstract void fun1();

	default void fun2() {
		System.out.println("I am fun2 from X");
	}

	static void fun3() {
		System.out.println("I am fun3 from X");
	}

}
