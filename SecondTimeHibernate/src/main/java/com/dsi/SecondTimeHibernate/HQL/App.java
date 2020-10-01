package com.dsi.SecondTimeHibernate.HQL;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {

	public static void main(String[] args) {
		Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//for adding values
//		Random rand = new Random();
//		for(int i=1;i<=20;i++){
//			Student student = new Student();
//			student.setRegno(i);
//			student.setName("name" + i);
//			student.setMarks(rand.nextInt(100));
//			session.save(student);
//		}
		
		//fetch values
		Query q = session.createQuery("from Student where marks >= 80");
		List<Student> list = q.list();
		for(Student st : list) {
			System.out.println(st);
		}
		
		
		tx.commit();
		session.close();

	}

}
