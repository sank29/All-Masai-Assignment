package com.que2;

public class EmployeeAge {

	public void calculateAverage(int[] age) {
		double averageAge = 0.00;

		for (int i = 0; i <= age.length - 1; i++) {
			averageAge += age[i];
		}
		averageAge = averageAge / age.length;

		System.out.println("The average age is: " + averageAge);

	}

}
