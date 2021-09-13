package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	public static  void main(String[] args){
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		
		EntityManager em=emf.createEntityManager();
		//displaying
		//employees e=em.find(employees.class,104);
		
		//inserting
		employees e=new employees();
		e.setId(107);
		e.setAge(29);
		e.setFirst("guru");
		e.setLast("kumar");
		em.getTransaction().begin();
		
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e);
	}

}
