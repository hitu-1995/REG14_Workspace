package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eid;  
	private String ename; 
	private String dept;  
 
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Employee(int eid, String ename, String dept, Laptop laptop) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.laptop = laptop;
	}

	public Employee() {
	
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", laptop=" + laptop + "]";
	}
	
	
	

}
