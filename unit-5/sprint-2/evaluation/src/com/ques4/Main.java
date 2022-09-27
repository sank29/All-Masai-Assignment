package com.ques4;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> myStream = Stream.of("Sanket", "Akasha", "Bachu", "Rushii", "xyza");

		Stream<String> filterName = myStream.filter(myString -> {
			if (myString.length() % 2 == 0) {
				return true;
			} else {
				return false;
			}
		});

		Stream<String> myStream2 = filterName.map(str -> str.toUpperCase()).sorted((s1, s2) -> s1.compareTo(s2));

		myStream2.forEach(str3 -> System.out.println(str3));

	}

}
