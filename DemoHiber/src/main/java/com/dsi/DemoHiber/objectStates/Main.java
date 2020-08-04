package com.dsi.DemoHiber.objectStates;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		
		//insert data
//		Random rand = new Random();
//		for(int i=1;i<=10;i++) {
//			Laptop laptop = new Laptop();
//			laptop.setLid(i);
//			laptop.setBrand("asus" + i);
//			laptop.setPrice(rand.nextInt(50000));
//			session.save(laptop);
//		}
		
		
		//different states
//		Laptop laptop = new Laptop();  //transient state
//		laptop.setBrand("acer");
//		laptop.setLid(104);
//		laptop.setPrice(40000);
//		session.save(laptop);
//		laptop.setPrice(45000); //persistent
//		
//		
//		
//		session.getTransaction().commit();
//		session.evict(laptop);
//		laptop.setPrice(30000);
		
		//get vs load
		Laptop laptop = session.get(Laptop.class, 5); //always hit database, give object, null pointer exception occurs
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Laptop laptop = session.load(Laptop.class, 5); // not always, give proxy object, object not found exception occurs
		System.out.println(laptop);
		
		session.close();

	}

}
