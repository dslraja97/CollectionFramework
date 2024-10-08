package com.learn.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.learn.bean.Product;

public class LearningComparator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sortType;
		System.out.println("ENter the Type of sorted(Id,Name,Price,Type):");
		sortType = input.next();
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Prestige", 1200, "Mixer"));
		productList.add(new Product(2, "Preethi", 1500, "Mixer"));
		productList.add(new Product(3, "Sujata", 2000, "Mixer"));
		productList.add(new Product(4, "Whirlpool", 12000, "Refrigerant"));
		productList.add(new Product(5, "Samsung", 10000, "Refrigerant"));
		productList.add(new Product(6, "Panasonic", 20000, "Refrigerant"));
		productList.add(new Product(7, "Mi", 18000, "SmartTV"));
		productList.add(new Product(8, "Samsung", 12000, "SmartTV"));
		productList.add(new Product(9, "Sony", 19000, "SmartTV"));
		productList.add(new Product(10, "Daikin", 35000, "AC"));

		// using annonyms implementation
		if (sortType.equalsIgnoreCase("id")) {
			Collections.sort(productList, new Comparator<Product>() {

				@Override
				public int compare(Product p1, Product p2) {
					return p1.getProductId() - p2.getProductId();
				}
			});
		} else if (sortType.equalsIgnoreCase("Name")) {
			Collections.sort(productList, new Comparator<Product>() {
				@Override
				public int compare(Product p1, Product p2) {
					return p1.getProductName().compareTo(p2.getProductName());
				}
			});

		} else if (sortType.equalsIgnoreCase("Price")) {
			Collections.sort(productList, new Comparator<Product>() {

				@Override
				public int compare(Product o1, Product o2) {
					// TODO Auto-generated method stub
					return o1.getPrice() - o2.getPrice();
				}

			});

		} else if (sortType.equalsIgnoreCase("Type")) {
			Collections.sort(productList, new Comparator<Product>() {

				@Override
				public int compare(Product o1, Product o2) {
					// TODO Auto-generated method stub
					return o1.getType().compareTo(o2.getType());
				}
			});

		} else {
			System.out.println("Please enter valid sort Type to find!!");
		}

		for (Product p : productList) {
			System.out.println(p);
		}
	}

}
