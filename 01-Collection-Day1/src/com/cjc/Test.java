package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("main---start");
		LinkedList list = new LinkedList();

		list.add(100);
		list.add(200);
		list.addLast(800);
		list.add(300);

		list.addFirst(900);
		list.add(400);
		list.add(500);

		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			int i = (int) itr.next();
			System.out.println(i);

		}

		System.out.println("main--ends");
	}
}
