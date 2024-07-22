package com.profound.java_day9;

import java.util.Scanner;

public class Employee {

	int eid;
	String ename;
	String city;
	
	Scanner sc =  new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter Employee Id Name City: ");
		eid = sc.nextInt();
		ename = sc.next();
		city = sc.next();
	}
	
	void display()
	{
		System.out.println("------------------------------------------------");
		System.out.println("Emplyee ID= "+eid+" Name= "+ename+" city= "+city);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER OF EMPLOYEES: ");
		int n = sc.nextInt();
		Employee e[] = new Employee[n];
		
		for(int i=0; i<n; i++)
		{
			e[i]=new Employee();
			e[i].accept();
		}
		for(int i=0; i<n; i++)
		{
			e[i].display();
		}
	}

}
