package com.masai;

public class CheckWeather {

	void outsideTemp(double temp) {
		System.out.println("Outside temperature is " + temp);
	}

	void weatherIsSafeOrNot(boolean isSnowing, boolean isRaining, double temp) {
		if (isSnowing || isRaining || temp < 50.00) {
			System.out.println("Let's stay home.");
		} else {
			System.out.println("Let's go out!");
		}
	}

	public static void main(String[] args) {

		// Assume these can have any value:
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		// print "Let’s stay home." if its raining, snowing or
		// below 50 degrees and print "Let’s go out!" otherwise.

		CheckWeather mumbaiCity = new CheckWeather();
		mumbaiCity.outsideTemp(temperature);
		mumbaiCity.weatherIsSafeOrNot(isSnowing, isRaining, temperature);
		mumbaiCity.weatherIsSafeOrNot(false, false, 60.00);

	}
}
