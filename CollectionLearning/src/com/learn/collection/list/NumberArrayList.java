package com.learn.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberArrayList {

	public static void main(String[] args) {
		List numbers = Arrays.asList(10, 12, 4, 5, 6, 7, 8, 9);
		System.out.println("Before Removing:" + numbers);
		Collections.sort(numbers);
		System.out.println("Sorted:" + numbers);
		Collections.reverse(numbers);
		System.out.println("Reversed:" + numbers);
	}

}
