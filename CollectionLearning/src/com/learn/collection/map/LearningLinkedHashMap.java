package com.learn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(4, "Dineshkumar");
		map.put(3, "Suchithra");
		map.put(2, "Saraswathi");
		map.put(1, "Raja");
		System.out.println(map);
	}

}
