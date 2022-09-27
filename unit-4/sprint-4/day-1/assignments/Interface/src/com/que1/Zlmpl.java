package com.que1;

public class Zlmpl implements Z {

	@Override
	public void fun1() {
		System.out.println("I am fun1 overirde  from Zlaml");
	}

	@Override
	public void fun6() {
		System.out.println("I am fun6 overirde  from Zlaml");
	}

	@Override
	public void fun2() {

		Z.super.fun2();
	}

}
