package com.masai1;

public class Main {
	public static Laptop getLaptop(String laptopPurpose) {

		if (laptopPurpose == "gaming") {
			Laptop laptop = new Laptop();
			laptop.setPurpose(laptopPurpose);
			return laptop;
		}
		return null;
	}

	public static void main(String[] args) {
// TODO Auto-generated constructor stub
		Laptop gamingLaptop = getLaptop("gaming");// You need to take input Using Scanner Class
		gamingLaptop.displayDetails();

//		Laptop bussinessLaptop = getLaptop("business");// You need to take input Using Scanner Class
//		bussinessLaptop.displayDetails();
//		Laptop laptop = getLaptop("Entertainment");// You need to take input Using Scanner Class
	}
}
