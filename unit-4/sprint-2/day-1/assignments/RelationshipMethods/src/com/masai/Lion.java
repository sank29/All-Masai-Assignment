package com.masai;

public class Lion {
	String name;
	Boolean isHungry;
	int age;
	static int totalDeaths;

	static void printKillings() {
		System.out.println("Total killings by lions in jungle = " + totalDeaths);
	}

	void thinking() {
		if (isHungry = true && age <= 12 && age >= 2) {
			totalDeaths++;
			System.out.println(name + " has eaten one animal");

		} else if (isHungry = true && age > 12) {
			totalDeaths = totalDeaths + 2;
			System.out.println(name + " has eaten two animals");

		} else if (isHungry = true && age < 2) {
			System.out.println(name + " is calling Mom");

		} else if (isHungry = false) {
			System.out.println(name + " is sleeping");
		}
	}

	public static void main(String[] args) {
		Lion lion1 = new Lion();
		lion1.name = "lion1";
		lion1.isHungry = true;
		lion1.age = 22;
		lion1.thinking();

		Lion lion2 = new Lion();
		lion2.name = "lion2";
		lion2.isHungry = true;
		lion2.age = 10;
		lion2.thinking();

		Lion lion3 = new Lion();
		lion3.name = "lion3";
		lion3.isHungry = false;
		lion3.age = 15;
		lion3.thinking();

		printKillings();

	}

}
