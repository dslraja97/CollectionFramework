package com.learn.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.learn.bean.Employees;

public class LearningHashMap {

	public static <E> void main(String[] args) {
		Employees e1 = new Employees(1, "Dineshkumar");
		Employees e2 = new Employees(2, "Anathkumar");
		Employees e3 = new Employees(3, "Krishnamoorthy");
		Map<Integer, Employees> map = new HashMap<Integer, Employees>();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsValue("Dineshkumar"));
		Set<Integer> keys = map.keySet();
		// 1. Approach to get all the values from the map is keySet() after get all the key use get()inside the for each to get
		// all the key values from the map.
		System.out.println(keys);
		for (Integer i : keys) {
			System.out.println(map.get(i));
		}
		Collection<Employees> allValues = map.values();
		System.out.println("AllValues:" + allValues);
		// 2. Approach to get all the key & Values from the map(Using EntrySet).
		Set<Entry<Integer, Employees>> allEntries = map.entrySet();
		Iterator<Entry<Integer, Employees>> iterator = allEntries.iterator();
		System.out.println("Using Iterator in Map with While Loop!!");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Using Iterator in Map with forEach Loop!!");
		for (Entry<Integer, Employees> entry : allEntries) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

}
