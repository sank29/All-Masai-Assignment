package com.que3;

public class Bank {

	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}

	static void getInstance() {
		new Bank();
	}

}
