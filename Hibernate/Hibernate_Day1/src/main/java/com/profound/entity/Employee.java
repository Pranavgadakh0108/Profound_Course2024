package com.profound.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table")
public class Employee {
	
	@Id //declare primary key
	private int eid;
	private String name;
	private float salary;
	
	//constructor
	public Employee(int eid, String name, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	//getters-setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
