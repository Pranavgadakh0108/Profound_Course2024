package com.profound.java_day13;

import java.util.Scanner;

class Employee{
	int id;
	String name;
}

public class Salary extends Employee{
	Scanner sc = new Scanner(System.in);
	double salary;
	
	Salary(){
		System.out.println("ENTER EMPLOYEE ID, NAME , SALARY: ");
		id = sc.nextInt();
		name = sc.next();
		salary = sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("EMPLOYEE ID= "+id+" NAME= "+name+" SALARY= "+salary);
	}

	public static void main(String[] args) {
		
		Salary s = new Salary();
		s.display();
	}
}
