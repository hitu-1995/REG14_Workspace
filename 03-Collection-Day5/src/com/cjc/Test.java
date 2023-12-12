package com.cjc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	 public static void main(String[] args) {
		 
		 
		 Set<String> set = new HashSet<String>();
		 

		   Map<Integer,String> map = new HashMap<Integer, String>();
		   map.put(1, "ABCD");
		   map.put(2,"WXYZ");
		   map.put(3, "MNOP");
		   map.put(1, "EFGH");
		   map.put(4, "MNOP");

		   
		   Set<Integer> keys = map.keySet();
		   Iterator<Integer> itr = keys.iterator();
		
		   while(itr.hasNext()) {
			   Integer key = itr.next();
			   String val = map.get(key);
			   System.out.println("key = "+key+" Value = "+val);
		   }
		
	}
}
