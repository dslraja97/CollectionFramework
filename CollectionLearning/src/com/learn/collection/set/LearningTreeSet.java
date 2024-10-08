package com.learn.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Dineshkumar");
		treeSet.add("Zaheer Hussain");
		treeSet.add("Ramesh");
		treeSet.add("Ganesh");
		System.out.println(treeSet);
		Iterator<String> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
