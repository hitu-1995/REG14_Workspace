package com.cjc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	  public static void main(String[] args) {
		System.out.println("main---start");
		
		Student stu1 = new Student(101, "Saurabh", "Nagar");
		Student stu2 = new Student(102, "Vishal", "Pune");
		Student stu3 = new Student(103, "Amol", "Parbhani");
		Student stu4 = new Student(104, "Ashish", "Parbhani");
		
		Set<Student> set = new TreeSet<Student>();
		set.add(stu3);
		set.add(stu2);
		set.add(stu1);
		set.add(stu4);
		
		
		for(Student stu :set) {
			System.out.println("------------------");
			System.out.println(stu);
		}
		
	}
}
