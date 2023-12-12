package com.cjc.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.cjc.config.HibernateConfig;
import com.cjc.model.Employee;

public class Test {

	public static void main(String[] args) {

		Session session = HibernateConfig.getSessionFactory().openSession();

		 Query query = session.createNamedQuery("getAll");

		 NativeQuery nativeQuery = (NativeQuery)query;
		
		 List<Object[]> list = nativeQuery.getResultList();

		for (Object[] objArray : list) {
			System.out.println("-----------------------------");
			for (int i = 0; i < objArray.length; i++) {

				System.out.println(objArray[i]);
			}
		}

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
