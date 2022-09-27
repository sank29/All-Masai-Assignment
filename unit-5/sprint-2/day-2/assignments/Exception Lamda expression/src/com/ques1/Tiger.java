package com.ques1;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
	}

	@Override
	public void eat() throws AnimalException {

		System.out.println("Tiger is eating !!");

	}

	public static void main(String[] args) {
		try {

			Animal tiger = new Tiger();
			tiger.eat();

		} catch (AnimalException animalException) {

			System.out.println(animalException.getMessage());

		}
	}
}
