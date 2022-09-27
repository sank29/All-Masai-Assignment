package com.masai1;

public class MainCarClass {

	public static void main(String[] args) {
		Engine turboEngine = new Engine(1000, 110, "tata", true);
		Car newTataCar = new Car("Harrier", "Tata", "black", turboEngine);
		newTataCar.carDetails();
	}

}
