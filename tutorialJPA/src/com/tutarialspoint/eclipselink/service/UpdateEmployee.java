package com.tutarialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutarialspoint.eclipselink.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("tutorialJPA");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, 1);
		
		System.out.println(employee);
		employee.setSalary(46000);
		em.getTransaction().commit();
		
		System.out.println(employee);
		
		em.close();
		emf.close();
	}
}
