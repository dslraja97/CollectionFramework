package com.learn.bean;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return -(p2.getPrice() - p1.getPrice());
	}

}
