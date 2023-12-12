package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("main---start");

		List<String> mhList = new ArrayList<String>();
		mhList.add("Mumbai");
		mhList.add("Nashik");
		mhList.add("Nagar");
		mhList.add("Pune");

		List<String> gjList = new ArrayList<String>();
		gjList.add("Surat");
		gjList.add("Ahmdabad");
		gjList.add("Rajkot");
		gjList.add("Vadodra");

		List<List<String>> india = new ArrayList<>();
		india.add(mhList);
		india.add(gjList);

		Iterator<List<String>> itr1 = india.iterator();
		while (itr1.hasNext()) {
			List<String> stateList = itr1.next();
			System.out.println("-----------------------------");
			Iterator<String> itr2 = stateList.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}

		}
		
		System.out.println("------------------Enhanced for loop--------------------");
		
		 for(List<String> stateList : india) {
			 
			    for(String city : stateList) {
			    	System.out.println(city);
			    }
		 }
		 

	}
}
