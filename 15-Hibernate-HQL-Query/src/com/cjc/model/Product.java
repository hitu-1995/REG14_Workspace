package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	 @Id
	 private int pid;
	 private String pname;
	 private String pcategory;
	 private double pprice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcategory=" + pcategory + ", pprice=" + pprice + "]";
	}
	 
	 
	 
}
