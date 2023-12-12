package com.cjc.main;

import org.hibernate.Session;

import com.cjc.model.Employee;
import com.cjc.model.Laptop;
import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {
		
         getLaptop();
	
	}

	private static void getLaptop() {
		Session session = HibernateConfig.getSessionFactory().openSession();
	    
	    Laptop laptop = session.get(Laptop.class, 1);
	
	    System.out.println(laptop.getLid());
	    System.out.println(laptop.getLname());
	    System.out.println(laptop.getPrice());
	    System.out.println(laptop.getEmployee().getEid());
	    System.out.println(laptop.getEmployee().getEname());
	    System.out.println(laptop.getEmployee().getDept());
	    
	}

	private static void getEmployee() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Employee employee = session.get(Employee.class, 2);
		
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getDept());
		System.out.println(employee.getLaptop().getLid());
		System.out.println(employee.getLaptop().getLname());
		System.out.println(employee.getLaptop().getPrice());
	}

	private static void insertEmployee() {
		
        Laptop laptop = new  Laptop();
        laptop.setLid(2);
        laptop.setLname("HP");
        laptop.setPrice(24000);
        
        Employee employee = new Employee();
        employee.setEid(102);
        employee.setEname("Dhoni");
        employee.setDept("Admin");
        
        employee.setLaptop(laptop);
        laptop.setEmployee(employee);

	     
	    Session session =  HibernateConfig.getSessionFactory().openSession();
	     
	    session.save(employee);
	   
	  
	    
	    session.beginTransaction().commit();
	    System.out.println("Saved....");
	}
}
