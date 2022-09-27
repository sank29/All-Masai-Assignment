package com.ques3;

class CardPayment implements Payment {
	private int amount;
//initialize amount using parameterized constructor

	public CardPayment(int amount) {
		super();
		this.setAmount(amount);
	}

//override doPayment() method and inside this print "Payment done using Card "+amount;

	@Override
	public void doPayment() {
		System.out.println("Payment done using Cash " + amount);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}