package com.cjc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.model.Student;
import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {

	

		Session session1 = HibernateConfig.getSessionFactory().openSession();
		System.out.println("-----------------session1------------------------");
		Student stu1 = session1.get(Student.class, 101);
		System.out.println(stu1);
		System.out.println("-----------------------------------------");

		Student stu2 = session1.get(Student.class, 101);
		System.out.println(stu2);
		System.out.println("-----------------------------------------");

		Student stu3 = session1.get(Student.class, 101);
		System.out.println(stu3);
		

		Session session2 = HibernateConfig.getSessionFactory().openSession();
		System.out.println("------------------session2-----------------------");
		Student stu4 = session2.get(Student.class, 101);
		System.out.println(stu4);

	}

	private static void insertStudent() {
		SessionFactory factory = HibernateConfig.getSessionFactory();
		Session session = factory.openSession();

		Student stu = new Student(103, "Dhoni", "Chennai");
		session.save(stu);
		session.beginTransaction().commit();
		System.out.println("Saved");
	}
}
