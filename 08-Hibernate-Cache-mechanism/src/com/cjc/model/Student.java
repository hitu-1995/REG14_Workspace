package com.cjc.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	private int rollno;
	private String name;
	private String address;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
