package com.cjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		
		   List<String> items = Demo.getItems();
             System.out.println(items);		  
		          items.add("AC");  // exception
		          items.add("Cooler");
		          System.out.println(items);
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(300);
		list.add(100);
		list.add(400);
		list.add(500);
		list.add(200);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Integer min = Collections.max(list);
		System.out.println(min);
		Collections.reverse(list);
		System.out.println(list);
		List<Object> list2 = Collections.emptyList();
		System.out.println(list2);

	}
}
