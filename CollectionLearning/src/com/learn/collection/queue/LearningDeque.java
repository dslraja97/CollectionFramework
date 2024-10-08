package com.learn.collection.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class LearningDeque {
	public static void main(String[] args) {
		Queue<String> names = new ArrayDeque<String>();
		names.add("Suchithra");
		names.add("Dineshkumar");
		names.add("Raja");
		names.add("Saraswathi");
		System.out.println(names);
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Peek:" + names.peek());
		System.out.println(names);
		System.out.println("Poll:" + names.poll());
		System.out.println(names);
		System.out.println("remove:" + names.remove());
		System.out.println(names);

	}

}
