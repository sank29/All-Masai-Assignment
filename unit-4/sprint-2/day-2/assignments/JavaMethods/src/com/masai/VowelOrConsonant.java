package com.masai;

public class VowelOrConsonant {

	String stringCheck(String str) {
		String strInLowerCase = str.toLowerCase();

		if (strInLowerCase.length() > 1) {
			return "Invalid character";
		}

		if (strInLowerCase == "a" || strInLowerCase == "e" || strInLowerCase == "i" || strInLowerCase == "o"
				|| strInLowerCase == "u") {
			return "vowel";
		} else {
			return "consonant";
		}

	}

	public static void main(String[] args) {
		VowelOrConsonant char1 = new VowelOrConsonant();
		System.out.println(char1.stringCheck("a"));
		System.out.println(char1.stringCheck("z"));
		System.out.println(char1.stringCheck("az"));
	}

}
