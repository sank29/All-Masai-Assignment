package com.ques5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Product product1 = new Product(12, "Milk", 5, 60);
		Product product2 = new Product(13, "Suger", 5, 100);
		Product product3 = new Product(14, "Maggi", 5, 40);
		Product product4 = new Product(15, "Bread", 5, 10);
		Product product5 = new Product(16, "Water", 5, 600);

		List<Product> listProducts = new ArrayList<>();
		listProducts.add(product1);
		listProducts.add(product2);
		listProducts.add(product3);
		listProducts.add(product4);
		listProducts.add(product5);

		Collections.sort(listProducts, (prod1, prod2) -> prod1.getPrice() > prod2.getPrice() ? -1 : +1);

		for (Product product : listProducts) {
			System.out.println(product);
		}

	}

}
