package com.dsi.SecondTimeHibernate.mappingRelation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		
		//for insert value
//		Laptop2 laptop = new Laptop2();
//		laptop.setLid(103);
//		laptop.setBrand("macbook");
//		laptop.setPrice(400000);
//		
//		
//		Alien alien = new Alien();
//		alien.setAid(12);
//		alien.setAname("Rizu");
//		alien.getLaptop().add(laptop);
//		laptop.setAlien(alien);
		
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop2.class);
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
//    	session.save(laptop);
//    	session.save(alien);
    	
    	Alien alien = session.get(Alien.class, 5);
    	System.out.println(alien);
    	
//    	List<Laptop2> laptop = alien.getLaptop();
//    	for(Laptop2 l: laptop) {
//    		System.out.println(l);
//    	}
    	
    	
    	tx.commit();
	}

}
