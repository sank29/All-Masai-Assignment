package com.que1;

import java.util.Comparator;

public class ProductPriceComp implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {

		if (product1.getProductPrice() > product2.getProductPrice()) {
			return +1;
		} else if (product1.getProductPrice() < product2.getProductPrice()) {
			return -1;
		} else {
			return 0;
		}

	}

}
