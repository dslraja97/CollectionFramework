package com.learn.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearningPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.add(3);
		priorityQueue.add(4);
		priorityQueue.add(5);
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.element());
		System.out.println(priorityQueue.size());
		Iterator<Integer> iterator = priorityQueue.iterator();
		System.out.println("Using While!");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Using For Each!");
		for (Integer i : priorityQueue) {
			System.out.println(i);
		}
	}

}
