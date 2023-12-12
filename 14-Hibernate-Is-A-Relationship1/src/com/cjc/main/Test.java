package com.cjc.main;

import org.hibernate.Session;

import com.cjc.model.Akurdi;
import com.cjc.model.Karvenagar;
import com.cjc.util.HibernateConfig;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("main---start");

		  Karvenagar karvenagar = new Karvenagar();
		  karvenagar.setId(102);
		  karvenagar.setCourse("Python");
		  karvenagar.setFees(26000);
		  karvenagar.setKarvenagar_batchId("B110");
		  karvenagar.setKarvenagar_batchType("Weekend");
		  
		  Session session = HibernateConfig.getSessionFactory().openSession();
	
		   session.save(karvenagar);
		   session.beginTransaction().commit();
		   System.out.println("Karvenagar Saved....");
		
	
	}

	private static void saveAkurdi() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Akurdi akurdi = new Akurdi();
		akurdi.setId(101);
		akurdi.setCourse("Java");
		akurdi.setFees(22000);
		akurdi.setAkurdi_batchId("REG14");
		akurdi.setAkurdi_batchType("Regular");
		
		session.save(akurdi);
		
		session.beginTransaction().commit();
		
		System.out.println("Akurdi Saved");
	}
}
