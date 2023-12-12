package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.util.HibernateConfig;

public class Test1 {

	public static void main(String[] args) {
		
		 SessionFactory factory = HibernateConfig.getSessionFactory();
         Session session = factory.openSession();
         
         Employee employee = session.get(Employee.class, 111);
         System.out.println(employee);

	     System.out.println(employee.getEid()+"  "+employee.getEname()+"  "
	     +"  "+employee.getEdept()+"  "+employee.getSalary());
	}
}
