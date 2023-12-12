package com.cjc.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.cjc.model.Akurdi;
import com.cjc.model.CJC;
import com.cjc.model.Karvenagar;

public class HibernateConfig {
	
	private static SessionFactory factory;
	

	public static SessionFactory  getSessionFactory() {
		
	          if(factory==null) {
	        		Map<String, Object> settings = new HashMap<String, Object>();
	        		settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
	        		settings.put(Environment.URL,"jdbc:mysql://localhost:3306/reg14");
	        		settings.put(Environment.USER, "root");
	        		settings.put(Environment.PASS, "root");
	        		settings.put(Environment.SHOW_SQL,true);
	        		settings.put(Environment.HBM2DDL_AUTO,"update");
	        		settings.put(Environment.FORMAT_SQL, true);
	        		
	        		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(settings).build();

	        		MetadataSources mds = new MetadataSources(registry);
	        		 mds.addAnnotatedClass(CJC.class);
	        		 mds.addAnnotatedClass(Akurdi.class);
	        		 mds.addAnnotatedClass(Karvenagar.class);
	        		            
	        		Metadata md = mds.getMetadataBuilder().build();

	        		 factory = md.getSessionFactoryBuilder().build();
	        		 return factory;
	          }
	        return factory;
	}
}
