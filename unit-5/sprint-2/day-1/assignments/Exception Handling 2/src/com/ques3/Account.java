package com.ques3;

public class Account {

	private String accountNumber;
	private double balance;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 500.00;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {

		if (amount > this.balance) {
			InsufficientFundsException myInsufficientFundsException = new InsufficientFundsException(
					"Given " + amount + " amount is greater than available balance, please add fund.");
			throw myInsufficientFundsException;
		} else {
			this.balance -= amount;
			System.out.println("Amount " + amount + " is withdraw successfully. Thank you for using our service.");
		}

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
