package com.dsi.DemoHiber.caching;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		
		Alien alien = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		Query q1 = session1.createQuery("from Alien where aid=1");
		q1.setCacheable(true);
		alien = (Alien) q1.uniqueResult();
		
//		alien = (Alien) session1.get(Alien.class, 1);
		System.out.println(alien);
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
		Query q2 = session2.createQuery("from Alien where aid=1");
		q2.setCacheable(true);
		alien = (Alien) q2.uniqueResult();
//		alien = (Alien) session2.get(Alien.class, 1);
		System.out.println(alien);
		session2.getTransaction().commit();
		session2.close();

	}

}
