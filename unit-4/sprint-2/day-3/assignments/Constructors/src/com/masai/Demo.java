package com.masai;

public class Demo {
	public Demo() {
		this("Default");
		System.out.println("This is zero-argument constructor funtion");
	}

	public Demo(String s) {
		this(0);
		System.out.println("This is String argument constructor funtion");
	}

	public Demo(int i) {
		this(0f);
		System.out.println("This is int argument constructor function");
	}

	public Demo(float f) {
		System.out.println("This is float argument constructor funtion");
	}
}
