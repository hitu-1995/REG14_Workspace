package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
	private double price;

	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop(int lid, String lname, double price, Employee employee) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.price = price;
		this.employee=employee;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", price=" + price + "]";
	}

}
