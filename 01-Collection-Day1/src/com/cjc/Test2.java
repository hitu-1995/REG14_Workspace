package com.cjc;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains("A"));

		System.out.println(list);
		//list.clear();
		//list.set(0, 700);
		//list.add(2,new Integer(777));
         list.remove("B");
         
		System.out.println(list);

	}
}
