package com.ques3;

public class Main {

	public static int StringToNumber(String str) {

		int result = Integer.parseInt(str);
		return result;
	}

	public static void main(String[] args) {

		X interfaceX = Main::StringToNumber;

		System.out.println(interfaceX.convetStringToNumber("12"));
	}

}
