package com.que1;

import java.util.Comparator;

public class ProductNameComp implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {

		return product1.getProductName().compareTo(product2.getProductName());
	}

}
