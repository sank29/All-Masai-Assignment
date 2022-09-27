package com.ques2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static PriorityQueue<Product> priorityQueue = new PriorityQueue<>(new ProductComp());

	public static void takeProductFromUser() {
		System.out.println("How many product you want to add");
		int productNumber = sc.nextInt();

		for (int i = 0; i <= productNumber - 1; i++) {
			System.out.println("Please enter product id");
			int productId = sc.nextInt();
			sc.nextLine();

			System.out.println("Please enter product Name");
			String productName = sc.nextLine();

			System.out.println("Please enter product price");
			int productPrice = sc.nextInt();

			priorityQueue.add(new Product(productId, productName, productPrice));

		}
		displayTheProductList(priorityQueue);
	}

	public static void displayTheProductList(PriorityQueue<Product> priorityQueue) {
		Iterator<Product> productIterator = priorityQueue.iterator();
		while (productIterator.hasNext()) {
			Product product = productIterator.next();
			System.out.println("Product id is :" + product.getProductId());
			System.out.println("Product name is :" + product.getProductName());
			System.out.println("Product price is :" + product.getProductPrice());
			System.out.println("================================");
		}
	}

	public static void main(String[] args) {
		takeProductFromUser();

	}

}
