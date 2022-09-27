package com.que1;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;

	public Car(int numberOfPassenger, int numberOfKms) {
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

}
