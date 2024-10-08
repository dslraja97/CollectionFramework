package com.learn.collection.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameAscending {

	public static void main(String[] args) {
		List<String> letters = Arrays.asList("d", "i", "n", "e", "s", "h", "k", "u", "m", "a", "r");

		System.out.println(letters);
		Collections.sort(letters);
		for (String s : letters) {
			System.out.println(s);
		}
	}

}
