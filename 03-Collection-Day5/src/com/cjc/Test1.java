package com.cjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

		List<String> mhList = new ArrayList<String>();
		mhList.add("Mumbai");
		mhList.add("Pune");
		mhList.add("Amrvati");
		mhList.add("Nagpur");
		
		//Collections.sort(mhList);

		List<String> gjList = new ArrayList<String>();
		gjList.add("Surat");
		gjList.add("Rajkot");
		gjList.add("Ahmdabad");
		gjList.add("Vadodra");

		//Collections.sort(gjList);
		
		Map<String, List<String>> indiaMap = new HashMap<String, List<String>>();
		indiaMap.put("Maharashtra", mhList);
		indiaMap.put("Gujrat", gjList);

		Set<String> keys = indiaMap.keySet();
		keys.add("ABCd");
		

		System.out.println("-----------------------Enhanced For loop-----------------------------");
		
		  for(String key : keys) {
			  
			  System.out.println("-------------------------"+key+"----------------------");
			   List<String> cityList = indiaMap.get(key);
	
			      for(String city : cityList) {
			    	  System.out.println(city);
			      }
			     
		  }
		
		System.out.println("-----------------------Iterator-----------------------------");
		
		Iterator<String> itr1 = keys.iterator();
		while (itr1.hasNext()) {

			String key = itr1.next();
			System.out.println("-----------------" + key + "----------------------");
			List<String> cityList = indiaMap.get(key);

			Iterator<String> itr2 = cityList.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}

		}

	}
}
