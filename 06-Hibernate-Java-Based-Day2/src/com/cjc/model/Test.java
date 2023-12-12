package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		Employee emp = new Employee();
		emp.setEid(102);
		emp.setEname("Aditya");
		emp.setEdept("Manager");
		emp.setSalary(90000);

		Session session = factory.openSession();

		session.save(emp);

		session.beginTransaction().commit();
		System.out.println("Employee Saved..........");
	}
}
