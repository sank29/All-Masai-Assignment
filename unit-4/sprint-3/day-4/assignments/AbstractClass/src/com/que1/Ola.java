package com.que1;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		if (numberOfPassenger <= 3) {
			return new HatchBack(numberOfPassenger, numberOfKms);
		} else {
			return new Sedan(numberOfPassenger, numberOfKms);
		}

	}

	public int calculateBill(Car car) {

		int farePerKm;
		if (car instanceof Sedan) {
			Sedan sadan = (Sedan) car;
			farePerKm = sadan.farePerKm;
		} else {
			HatchBack hatchBack = (HatchBack) car;
			farePerKm = hatchBack.farePerKm;
		}

		int totalFare = car.getNumberOfKms() * farePerKm;

		return totalFare;
	}

}
