package com.learn.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("dinesh");
		linkedList.add("raja");
		linkedList.add("sara");
		linkedList.add("suchi");
		linkedList.add("praveen");
		linkedList.add("MokshithKrishna");
		linkedList.descendingIterator();
		System.out.println(linkedList);

		ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}
}
