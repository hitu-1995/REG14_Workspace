package com.cjc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	  public static void main(String[] args) {
		System.out.println("main--start");
		
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("ABC","Java");
		map.put("XYZ","Python");
		map.put("LMN","Html");
		map.put("PQR","CSS");
		map.put("JKL","Angular");
		map.put("PQR","ReactJS");
		
		
		
		Set<String> keys = map.keySet();
		 
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			 String string = map.get(key);
			 System.out.println("key : "+key+"  Value : "+string);
			
		}
		
		
	}
}
