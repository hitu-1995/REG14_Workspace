package com.cjc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cjc.model.Product;
import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory = HibernateConfig.getSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Product product = session.get(Product.class, 3);

		session.delete(product);
		tx.commit();
		System.out.println("Deleted.........");

	}

	private static void updateProduct() {
		SessionFactory factory = HibernateConfig.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Product product = session.get(Product.class, 1);

		product.setPrice(20000);

		session.update(product);

		tx.commit();
		System.out.println("Updated...");
	}

	private static void getProduct() {
		SessionFactory factory = HibernateConfig.getSessionFactory();
		Session session = factory.openSession();

		Product product = session.get(Product.class, 3);

		System.out.println(product);
	}

	private static void insertProduct() {
		SessionFactory factory = HibernateConfig.getSessionFactory();
		Session session = factory.openSession();

		Product prod = new Product();

		prod.setPname("Fan");
		prod.setPbrand("Bajaj");
		prod.setPrice(3100);

		session.save(prod);
		session.beginTransaction().commit();
		System.out.println("Saved.........");
	}
}
