package com.learn.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import com.learn.bean.Employees;

public class LearningArrayList {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<Employees> employees = new ArrayList<Employees>();
		employees.add(new Employees("Aakash", 1));
		employees.add(new Employees("Ananthkumar", 2));
		employees.add(new Employees("Dineshkumar", 3));
		employees.add(new Employees("Santhosh", 4));
		employees.add(new Employees("Navanethan", 5));
		employees.add(new Employees("Krishnamoorthy", 6));

		Iterator<Employees> iterator = employees.iterator();

		System.out.println("Using Iterator!!");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Using ListIterator!!");

		ListIterator<Employees> listIterator = employees.listIterator(employees.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		Collections.reverse(employees);
		System.out.println(employees);
	}

}
