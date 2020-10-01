package com.dsi.SecondTimeHibernate.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		AlienClass alien = em.find(AlienClass.class, 101);
		System.out.println(alien);

	}

}
