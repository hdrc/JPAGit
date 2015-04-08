package com.tutarialspoint.eclipselink.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private double salary;
	private String deg;
	
	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	public Employee() {
		super();
	}   
	public int getEid() {
		return this.eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}   
	public String getEname() {
		return this.ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}   
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}   
	public String getDeg() {
		return this.deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary="
				+ salary + ", deg=" + deg + "]";
	}
}