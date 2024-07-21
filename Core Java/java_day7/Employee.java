package com.profound.java_day7;
import java.util.Scanner;
public class Employee {
	
	int eid;
	String fname,lname;
	float salary;
	
	Scanner sc = new Scanner(System.in);
	void setdata()
	{
		System.out.println("enter employee id , firstname, lastname, salary: ");
		eid=sc.nextInt();
		fname=sc.next();
		lname=sc.next();
		salary=sc.nextFloat();
	}
	void getdata()
	{
		System.out.println("Employee ID= "+eid+" Name="+fname+" "+lname+" Salary= "+salary);
	}
	public static void main(String[] args) {		
		Employee e = new Employee();
		e.setdata();
		e.getdata();
	}
}
