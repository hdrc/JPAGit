package com.tutarialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutarialspoint.eclipselink.entity.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("tutorialJPA");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee=em.find(Employee.class, 1);
		
		em.remove(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}