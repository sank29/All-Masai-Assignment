package com.ques5;

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {

		if (userCountry.toLowerCase().equals("india")) {
			System.out.println("User registration done");
			System.out.println("Thank You!");
		} else {
			InvalidCountryException exception = new InvalidCountryException("User Outside India cannot be registered");
			throw exception;

		}
	}
}
