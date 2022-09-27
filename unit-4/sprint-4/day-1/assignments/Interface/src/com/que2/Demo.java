package com.que2;

import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);

	public Hotel provideFood(int amount) {

		if (amount > 200 && amount < 1000) {
			return new RoadSideHotel();
		} else if (amount > 1000) {
			return new TajHotel();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Demo demo = new Demo();

		System.out.println("Please enter amount");
		int amount = sc.nextInt();

		Hotel hotel = demo.provideFood(amount);

		if (hotel != null) {

			hotel.chickenBiryani();
			hotel.masalaDasa();
			if (hotel instanceof TajHotel) {
				TajHotel hotel2 = (TajHotel) hotel;
				hotel2.welcomeDrink();
			} else if (hotel instanceof RoadSideHotel) {
				RoadSideHotel roadSideHotel = (RoadSideHotel) hotel;
				roadSideHotel.welcomeDrink();
			}

		} else {
			System.out.println("Please enter valid amount");
		}
	}

}
