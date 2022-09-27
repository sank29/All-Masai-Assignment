package com.ques3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataMainClassPractics {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("current date in default format: " + date);
		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String udf = date.format(formatObj);
		System.out.println("current date in userdefined format: " + udf);

	}

}
