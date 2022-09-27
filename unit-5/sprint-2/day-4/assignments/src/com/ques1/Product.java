package com.ques1;

public class Product {
	private int prodctId;
	private String productName;
	private int price;
	private int quantity;

	public Product(int prodctId, String productName, int price, int quantity) {
		this.prodctId = prodctId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProdctId() {
		return prodctId;
	}

	public void setProdctId(int prodctId) {
		this.prodctId = prodctId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [prodctId=" + prodctId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
