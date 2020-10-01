package com.dsi.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Transaction;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien alien = new Alien();
    	alien.setAid(102);
    	alien.setAname("Haque");
    	alien.setAcolor("blue");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(alien);
		em.getTransaction().commit();
    }
}
