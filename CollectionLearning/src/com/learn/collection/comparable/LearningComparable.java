package com.learn.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

import com.learn.bean.Employees;

public class LearningComparable {

	public static void main(String[] args) {

		ArrayList<Employees> employees = new ArrayList<Employees>();
		employees.add(new Employees(5, "Dineshkumar"));
		employees.add(new Employees(6, "Zaheer"));
		employees.add(new Employees(2, "Aakash"));
		employees.add(new Employees(1, "Anathkumar"));
		employees.add(new Employees(4, "Krishnamoorthy"));
		employees.add(new Employees(3, "Sanjeev"));
		Collections.sort(employees);
		for (Employees e : employees) {
			System.out.println(e);
		}
	}

}
