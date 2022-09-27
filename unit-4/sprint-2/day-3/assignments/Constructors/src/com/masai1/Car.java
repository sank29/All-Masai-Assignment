package com.masai1;

public class Car {
	String model;
	String companyName;
	String color;
	Engine engine;

	public Car() {

	}

	public Car(String model, String companyName, String color, Engine engine) {
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println("Car Model: " + this.model);
		System.out.println("Car companyName: " + this.companyName);
		System.out.println("Car color: " + this.color);
		System.out.println("Car RMP: " + this.engine.rmp);
		System.out.println("Car power " + this.engine.power);
		System.out.println("Car Engine Manufacture " + this.engine.manufacture);
		System.out.println("Car Has Turbo " + this.engine.hasTurbo);
	}

}
