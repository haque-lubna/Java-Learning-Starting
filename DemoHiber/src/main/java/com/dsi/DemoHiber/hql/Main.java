package com.dsi.DemoHiber.hql;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hql.cfg.xml").addAnnotatedClass(Student.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		//to insert data
//		Random rand = new Random();
//		for(int i=1;i<=10;i++) {
//			Student student = new Student();
//			student.setRoll(i);
//			student.setName("Name" + i);
//			student.setMarks(rand.nextInt(100));
//			session.save(student);
//		}
		
		//to fetch data
//		Query q = session.createQuery("from Student where roll=5");
//		List<Student> students = q.list();  //when select more than one query
//		for(Student s : students) {
//			System.out.println(s);
//		}
		
		//when find one row
//		Student s = (Student) q.uniqueResult();
//		System.out.println(s);
		
		//when fetch with collumn names
//		int b = 40;
//		Query q = session.createQuery("select roll,name,marks from Student s where s.marks > :b");
//		q.setParameter("b", b);
//		List<Object[]> students = (List<Object[]>) q.list();
//		
//		for(Object[] student : students)
//			System.out.println(student[0] + " :" + student[1] + " :" + student[2]);
//		for(Object o : student) {
//			System.out.println(o);
//		}
		
		
		
		//using sql query
		//native query
		SQLQuery q = session.createSQLQuery("select name,marks from Student where marks > 40");
		
		q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List students = q.list();
		for(Object o : students) {
			Map map = (Map) o;
			System.out.println(map.get("name") + " : " + map.get("marks"));
		}
		session.getTransaction().commit();
		session.close();
		
		

	}

}
