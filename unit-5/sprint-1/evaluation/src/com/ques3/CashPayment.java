package com.ques3;

class CashPayment implements Payment {
	private int amount;
//initialize amount using parameterized constructor

	public CashPayment(int amount) {
		this.amount = amount;
	}

	// override doPayment() method and inside this print "Payment done using Cash
	// "+amount;

	@Override
	public void doPayment() {
		System.out.println("Payment done using Cash " + amount);
	}

}
