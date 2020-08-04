package com.dsi.DemoHiber.eagerlazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
	
//		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		
		Alien alien = (Alien) session.get(Alien.class, 2);

		System.out.println(alien.getAname());
		
//		Collection<Laptop> laptops = alien.getLaptops();
//		for(Laptop l : laptops) {
//			System.out.println(l);
//		}
		
		session.getTransaction().commit();

	}

}
