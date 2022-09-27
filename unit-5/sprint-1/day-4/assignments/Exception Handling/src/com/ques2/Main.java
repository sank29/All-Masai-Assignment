package com.ques2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	private static final Exception FutureDateException = new Exception("Date should not be in Future");

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter date in this format: dd-mm-yy");
			String[] dateFromUser = sc.nextLine().split("-");
			LocalDate localDate = null;

			try {

				localDate = LocalDate.of(Integer.parseInt(dateFromUser[2]), Integer.parseInt(dateFromUser[1]),
						Integer.parseInt(dateFromUser[0]));

			} catch (Exception e) {

				System.out.println("Please enter the date in correct format");
			}

			LocalDate currentTime = LocalDate.now();
			if (localDate.isAfter(currentTime)) {
				throw FutureDateException;
			}

			Period age = Period.between(localDate, currentTime);
			System.out.println("Your age is " + age.getYears());
			System.out.println("Thanks for using age calculator!!!");

		} catch (NullPointerException e) {
			System.out.println(e);
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}
