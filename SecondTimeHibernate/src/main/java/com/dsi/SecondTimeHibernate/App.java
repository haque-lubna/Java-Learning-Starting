package com.dsi.SecondTimeHibernate;

import com.dsi.SecondTimeHibernate.embeddable.Alien;
import com.dsi.SecondTimeHibernate.embeddable.AlienName;
import com.dsi.SecondTimeHibernate.mappingRelation.Laptop;
import com.dsi.SecondTimeHibernate.mappingRelation.Laptop2;
import com.dsi.SecondTimeHibernate.mappingRelation.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//insert obj into database
//        Alien alien = new Alien();
//        alien.setAid(4);
//        alien.setAname("nohai"); 
//        alien.setAcolor("blue");
//        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//        
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        
//        Transaction tx = session.beginTransaction();
//        session.save(alien);
//        tx.commit();
    	
    	
    	//fetch data from database
//    	Alien alien = new Alien();
//        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//        
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        
//        Transaction tx = session.beginTransaction();
//        alien = session.get(Alien.class, 1);
//        tx.commit();
//        System.out.println(alien);
    	
    	//embaddable class
//    	AlienName aname = new AlienName();
//    	aname.setFname("Lubna");
//    	aname.setMname("Haque");
//    	aname.setLname("nohai");
//    	
//    	
//        Alien alien = new Alien();
//        alien.setAid(1);
//        alien.setAname(aname); 
//        alien.setAcolor("black");
//        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//        
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        
//        Transaction tx = session.beginTransaction();
//        session.save(alien);
//        tx.commit();
    	
    	//relationa mapping
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(105);
//    	laptop.setLname("dell");
//    	
//    	Student student = new Student();
//    	student.setRegno(5);
//    	student.setName("mon");
//    	student.setMarks(65);
//    	student.getLaptop().add(laptop);
//    	
//    	laptop.getStudent().add(student);
//    	
//    	
//    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//    	SessionFactory sf = con.buildSessionFactory(reg);
//    	Session session = sf.openSession();
//    	
//    	Transaction tx = session.beginTransaction();
//    	session.save(laptop);
//    	session.save(student);
//    	
//    	tx.commit();
    	
    	
    	
    	
    	
    }
}
