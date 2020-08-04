package com.dsi.DemoHiber.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setLid(102);
		laptop.setLname("dell");
		
		Student student = new Student();
		student.setRoll(2);
		student.setName("sumon");
		student.setMarks(95);
//		student.setLaptop(laptop);
		student.getLaptop().add(laptop);
		laptop.getStudent().add(student);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(student);
		session.save(laptop);
		
		session.getTransaction().commit();

	}

}
