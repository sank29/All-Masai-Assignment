package com.que4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	List<Product> productList = new ArrayList<>();

	public void addProduct(Product product) {
		System.out.println("Product added successfully");
		System.out.println(productList.add(product));
	}

	public void showAllProduct() {
		for (Product product : productList) {
			System.out.println(product);
		}
	}
}
