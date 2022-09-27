package com.que4;

public class Product {
	private String name;
	private double price;
	private String company;
	private int count;

	public Product(String name, double price, String company, int count) {
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {

		Product product1 = this;
		Product product2 = (Product) obj;
		return product1.name.equals(product2.name) && product1.company.equals(product2.company);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCompany() {
		return company;
	}

	public int getCount() {
		return count;
	}

}
