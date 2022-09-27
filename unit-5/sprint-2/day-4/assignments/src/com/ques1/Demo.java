package com.ques1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();

		productsList.add(new Product(12, "Milk", 50, 5));
		productsList.add(new Product(13, "Water", 100, 13));
		productsList.add(new Product(14, "Sugar", 60, 2));
		productsList.add(new Product(15, "Bread", 20, 5));
		productsList.add(new Product(16, "Maggi", 55, 15));

		// Long way
//		Stream<Product> newStream = productsList.stream();
//
//		Stream<Product> newList = newStream.filter(product -> product.getQuantity() > 10);
//
//		Stream<Product> sortedList = newList.sorted((product1, product2) -> {
//			if (product1.getPrice() > product2.getPrice()) {
//				return +1;
//			} else if (product1.getPrice() > product2.getPrice()) {
//				return -1;
//			} else {
//				return 0;
//			}
//		});

		// shortcut way

		Stream<Product> sortedList = productsList.stream().filter(product -> product.getQuantity() > 10)
				.sorted((product1, product2) -> {
					if (product1.getPrice() > product2.getPrice()) {
						return -1;
					} else if (product1.getPrice() < product2.getPrice()) {
						return +1;
					} else {
						return 0;
					}
				});

		System.out.println("Original list");
		System.out.println("==============");
		for (Product eachProduct : productsList) {
			System.out.println(eachProduct);
		}
		System.out.println("==============");
		System.out.println("Filtered list");
		sortedList.forEach(product -> {
			System.out.println(product);
		});
		System.out.println("==============");
	}

}
