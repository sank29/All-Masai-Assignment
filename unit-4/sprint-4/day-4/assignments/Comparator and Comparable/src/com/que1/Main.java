package com.que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Product> products = takeInputFromUser();
		System.out.println(products);
		userChoice(products);
	}

	public static void userChoice(ArrayList<Product> products) {
		System.out.println("Please choice how to sort");
		System.out.println("1 for sort by price. Sort by name 2. Sort by productId 3");
		int choice = sc.nextInt();

		sortingProduct(products, choice);
	}

	public static void sortingProduct(ArrayList<Product> products, int choice) {

		if (choice == 1) {

			System.out.println("Your List sort by price");
			System.out.println("======================");
			Collections.sort(products, new ProductPriceComp());
			displayProducts(products);
			System.out.println("======================");

		} else if (choice == 2) {
			System.out.println("Your List sort by name");
			System.out.println("======================");
			Collections.sort(products, new ProductNameComp());
			displayProducts(products);
			System.out.println("======================");
		} else {
			System.out.println("Your List sort by product id");
			System.out.println("======================");
			Collections.sort(products, new ProductPriceComp());
			displayProducts(products);
			System.out.println("======================");
		}

	}

	public static ArrayList<Product> takeInputFromUser() {

		System.out.println("Please enter 4 product in data base");
		ArrayList<Product> products = new ArrayList<>();

		for (int i = 0; i <= 2 - 1; i++) {

			System.out.println("Enter product name");
			String productName = sc.nextLine();

			System.out.println("Enter product id");
			int productId = sc.nextInt();

			System.out.println("Enter product price");
			double price = sc.nextInt();
			sc.nextLine();
			products.add(new Product(productId, productName, price));
		}
		return products;

	}

	public static void displayProducts(ArrayList<Product> products) {
		System.out.println(products);
	}

}
