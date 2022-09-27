package com.masai;

public class OddAndEvenNumber {

	String number(int wholeNumber) {

		if (wholeNumber < 0) {
			return "Error";
		}
		if (wholeNumber % 2 != 0) {
			return "" + wholeNumber;
		} else {
			while (true) {
				if (wholeNumber % 10 == 0) {
					return "" + wholeNumber;
				}
				wholeNumber++;
			}
		}
	}

	public static void main(String[] args) {
		OddAndEvenNumber number = new OddAndEvenNumber();
		System.out.println(number.number(44));
		System.out.println(number.number(45));
		System.out.println(number.number(-5));
		System.out.println(number.number(2));
	}

}
