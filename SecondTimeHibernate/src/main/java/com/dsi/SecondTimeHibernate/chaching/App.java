package com.dsi.SecondTimeHibernate.chaching;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
//		Alien alien = new Alien();
//		alien.setAid(101);
//		alien.setAname("Lubna");
//		alien.setAcolor("black");
		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//		SessionFactory sf = con.buildSessionFactory(reg);
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
		Alien alien = null;
		Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.save(alien);
		
//		Alien alien = session.get(Alien.class, 101);
		//using Query
		Query q1 = session.createQuery("from Alien where aid=101");
		q1.setCacheable(true);
		alien = (Alien) q1.uniqueResult();
		System.out.println(alien);
		
		//query one time because session is same
//		Alien alien2 = session.get(Alien.class, 101);
//		System.out.println(alien2);
		
		tx.commit();
		session.close();
		
		//let's create new session
		Session session2 = sf.openSession();
		Transaction tx2 = session2.beginTransaction();
		
//		Alien alien2 = session2.get(Alien.class, 101);
		Query q2 = session2.createQuery("from Alien where aid=101");
		q2.setCacheable(true);
		alien = (Alien) q2.uniqueResult();
		System.out.println(alien);
		
		tx2.commit();
		session2.close();
		
	}

}
