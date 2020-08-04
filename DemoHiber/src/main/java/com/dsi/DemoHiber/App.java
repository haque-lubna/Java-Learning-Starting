package com.dsi.DemoHiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
    	an.setFirstName("Sadia");
    	an.setLastName("Shama");
    	an.setMiddleName("Jannat");
    	
        Alien telusko = new Alien();
        telusko.setAid(2);
        telusko.setColor("red");
        telusko.setAname(an);
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //to insert
        session.save(telusko);
        
        //to fetch the object
        telusko = (Alien) session.get(Alien.class, 1);
        
        tx.commit();
        session.close();
        System.out.println(telusko.toString());
    }
}