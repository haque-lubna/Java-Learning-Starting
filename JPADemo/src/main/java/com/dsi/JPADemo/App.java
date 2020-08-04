package com.dsi.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        //to insert data
        
        Alien alien = new Alien();
        alien.setAid(5);
        alien.setAname("Sumon");
        alien.setAtech("Nodejs");
        
        em.getTransaction().begin();
        em.persist(alien);
        em.getTransaction().commit();
        
        //to fetch data
//        Alien alien = em.find(Alien.class, 3);
        System.out.println(alien);
    }
}
