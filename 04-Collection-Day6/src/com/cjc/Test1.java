package com.cjc;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
	
		System.out.println("main--start");

	      Set<Integer> set = new TreeSet<Integer>();
	      set.add(300);
	      set.add(200);
	      set.add(100);
	      set.add(400);
	      
	      System.out.println(set);
	      
	}
	
}
