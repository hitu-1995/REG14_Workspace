package com.cjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static List<String>  getItems() {
		
		List<String> items = new ArrayList<String>();
		items.add("TV");
		items.add("Mobile");
		items.add("Fan");
		List<String> unmodifiableList = Collections.unmodifiableList(items);
		
		return unmodifiableList;
	}
}
