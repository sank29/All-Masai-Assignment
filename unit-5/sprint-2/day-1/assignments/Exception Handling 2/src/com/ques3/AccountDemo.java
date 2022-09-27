package com.ques3;

public class AccountDemo {

	public static void main(String[] args) {

		try {
			Account myAccount = new Account("12345");

			myAccount.deposite(1000.00);
			myAccount.withdraw(10000.00);

		} catch (InsufficientFundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
