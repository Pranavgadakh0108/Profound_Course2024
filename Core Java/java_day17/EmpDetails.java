package com.profound.java_day17;

import java.util.Scanner;

abstract class Employee{
	
	abstract void display();
	
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	double sal;
	
	Employee() {
		System.out.println("Enter Employee ID, Name & Salary: ");
		id = sc.nextInt();
		name = sc.next();
		sal = sc.nextDouble();
	}
}

public class EmpDetails extends Employee{

	@Override
	void display() 
	{
		System.out.println("EMPLOYEE ID: "+id);
		System.out.println("EMPLOYEE NAME: "+name);
		System.out.println("EMPLOYEE SALARY: "+sal);
	}
	
	public static void main(String[] args) {
		EmpDetails ed = new EmpDetails();
		ed.display();
	}
}
