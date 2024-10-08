package com.learn.collection.set;

import java.util.LinkedHashSet;

public class LearningLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("DineshKumar");
		names.add("Suchi");
		names.add("Saraswathi");
		names.add("Raja");
		names.add("Raja");
		System.out.println(names);
	}
}