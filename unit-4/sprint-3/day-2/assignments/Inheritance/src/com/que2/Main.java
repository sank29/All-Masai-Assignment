package com.que2;

public class Main {

	static void callAllMethods(Animal[] animalArray) {

		for (int i = 0; i <= animalArray.length - 1; i++) {
			animalArray[i].eat();
			animalArray[i].walk();
			animalArray[i].makeNoise();
		}
	}

	public static void main(String[] args) {
		Animal[] animalArray = new Animal[3];

		animalArray[0] = new Dog();
		animalArray[1] = new Cat();
		animalArray[2] = new Tiger();

		callAllMethods(animalArray);

	}

}
