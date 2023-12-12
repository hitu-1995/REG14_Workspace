package com.cjc;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getRollno()-s2.getRollno();
	}

}
