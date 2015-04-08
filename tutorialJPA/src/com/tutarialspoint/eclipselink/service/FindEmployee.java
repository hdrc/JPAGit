package com.tutarialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutarialspoint.eclipselink.entity.Employee;

public class FindEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("tutorialJPA");
		EntityManager em=emf.createEntityManager();
		
		Employee employee = em.find(Employee.class, 1);
		
		System.out.println("ID "+employee.getEid());
		System.out.println("NAME "+employee.getEname());
		System.out.println("SALARY "+employee.getSalary());
		System.out.println("DESIGNATION "+employee.getDeg());
	}
}