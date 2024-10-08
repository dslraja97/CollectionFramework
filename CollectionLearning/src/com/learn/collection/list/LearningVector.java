package com.learn.collection.list;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class LearningVector {

	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();

		names.add("1");
		names.add("22");
		names.add("333");
		names.add("4444");
		names.add("55555");
		names.add("666666");
		names.add("7777777");

		System.out.println(names);

		Enumeration<String> enumeration = names.elements();

		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		ListIterator<String> listIterator = names.listIterator(names.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
