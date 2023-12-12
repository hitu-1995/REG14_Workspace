package com.cjc.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cjc.config.HibernateConfig;
import com.cjc.model.Employee;

public class Test {

	 public static void main(String[] args) {
		

		 Session session = HibernateConfig.getSessionFactory().openSession();
		 
		 session.beginTransaction();
		 Query query = session.createNamedQuery("deleteEmployee");
		
		 query.setParameter("id", 104);
		 
		 query.executeUpdate();
		 session.getTransaction().commit();
		 System.out.println("Deleted.............");
		 
	 }

	private static void updateEmployee() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		   session.beginTransaction();
		   Query query = session.createNamedQuery("updateDept");
		   
		   query.setParameter("dept", "OPERATIONS");
		   query.setParameter("id", 104);
		   
		   query.executeUpdate();
		   
		   session.getTransaction().commit();
	}

	private static void getALl() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		  Query query = session.createNamedQuery("getAll");
		  List<Employee> list = query.getResultList();
		  
		  for(Employee employee : list) {
			    System.out.println("----------------------------------\n"+employee);
		  }
	}

	private static void selectSingle() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		   Query query = session.createNamedQuery("getSingle");
		   query.setParameter("id", 102);
		    Object object = query.getSingleResult();
		    Employee employee = (Employee)object;
		    System.out.println("----------------------------------\n"+employee);
	}

	private static void insertEmployee() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		 
		 Employee emp1 = new Employee(101, "ABCD", "Admin", 80000);
		 Employee emp2 = new Employee(102, "XYZW", "HR", 90000);
		 Employee emp3 = new Employee(103, "LMNO", "QA", 30000);
		 Employee emp4 = new Employee(104, "PQRS", "SALLES", 50000);
		 
		 session.save(emp1);
		 session.save(emp2);
		 session.save(emp3);
		 session.save(emp4);
		 
		 session.beginTransaction().commit();
		 System.out.println("Employee Saved...........");
	}
}
