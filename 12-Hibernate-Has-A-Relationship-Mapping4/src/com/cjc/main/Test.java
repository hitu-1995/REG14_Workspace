package com.cjc.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.cjc.model.Employee;
import com.cjc.model.Laptop;
import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {
		
      insertEmployee();
	
	}

	private static void getLaptop() {
		Session session = HibernateConfig.getSessionFactory().openSession();
	    
	    Laptop laptop = session.get(Laptop.class, 1);
	
	    System.out.println(laptop.getLid());
	    System.out.println(laptop.getLname());
	    System.out.println(laptop.getPrice());
	    
	}

	private static void getEmployee() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		System.out.println("---------------------------------------------------");
		Employee employee = session.get(Employee.class, 101);
		
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getDept());
		
		List<Laptop> list = employee.getLaptops();
		
		for(Laptop lap : list) {
			System.out.println("-------------------------------------");
			System.out.println(lap);
		}

	}

	private static void insertEmployee() {
		
        Laptop laptop1 = new  Laptop();
        laptop1.setLid(1);
        laptop1.setLname("HP");
        laptop1.setPrice(44000);
        
        Laptop laptop2 = new  Laptop();
        laptop2.setLid(2);
        laptop2.setLname("Asus");
        laptop2.setPrice(32000);
        
        Laptop laptop3 = new  Laptop();
        laptop3.setLid(3);
        laptop3.setLname("DELL");
        laptop3.setPrice(24000);
        

        
        Employee employee = new Employee();
        employee.setEid(101);
        employee.setEname("Dhoni");
        employee.setDept("Admin");
        
        laptop1.setEmployee(employee);
        laptop2.setEmployee(employee);
        laptop3.setEmployee(employee);
        
        
        List<Laptop> laptopList = new ArrayList<Laptop>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        
        employee.setLaptops(laptopList);
	     
	    Session session =  HibernateConfig.getSessionFactory().openSession();
	     
	    session.save(employee);
	    session.save(laptop1);
	    session.save(laptop2);
	    session.save(laptop3);
	    
	    session.beginTransaction().commit();
	    System.out.println("Saved....");
	}
}
