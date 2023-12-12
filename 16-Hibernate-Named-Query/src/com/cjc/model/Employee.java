package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "getSingle", query = "from Employee where eid = :id"),
	@NamedQuery(name = "getAll" , query = "from Employee"),
	@NamedQuery(name = "updateDept" , query = "update Employee set edept = :dept where eid = :id"),
	@NamedQuery(name = "deleteEmployee" , query = "delete from Employee where eid = :id" )
})
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String edept;
	private double salary;

	
	
	public Employee() {
	
	}

	public Employee(int eid, String ename, String edept, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.salary = salary;
	}

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

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", salary=" + salary + "]";
	}

}
