package com.tutarialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutarialspoint.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("tutorialJPA");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee=new Employee();
		employee.setEid(1201);
		employee.setEname("Victor");
		employee.setSalary(40000);
		employee.setDeg("Programador");
		
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}