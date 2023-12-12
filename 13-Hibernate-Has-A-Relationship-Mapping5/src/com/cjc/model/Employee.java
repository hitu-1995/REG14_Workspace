package com.cjc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	private int eid; 
	private String ename; 
	private String dept; 

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Laptop> laptops; 

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Employee(int eid, String ename, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;

	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept;
	}

}
