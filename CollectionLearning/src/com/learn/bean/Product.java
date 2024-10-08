package com.learn.bean;

public class Product {

	private int productId;
	private String productName;
	private int price;
	private String type;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Product(int productId, String productName, int price, String type) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product =[" + productId + ", productName=" + productName + ", price=" + price + ", type=" + type + "]";
	}

}
