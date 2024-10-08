package com.learn.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.learn.bean.Employees;

public class LearningHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employees> hashSet = new HashSet<Employees>();
		hashSet.add(new Employees("MokshithKrishna", 1));
		hashSet.add(new Employees("Dineshkumar", 2));
		hashSet.add(new Employees("Suchi", 3));
		hashSet.add(new Employees("Praveen", 4));
		hashSet.add(new Employees("Raja", 5));
		hashSet.add(new Employees("Saraswathi", 6));
		hashSet.add(new Employees("Saraswathi", 6));
		System.out.println(hashSet);
		Iterator<Employees> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
