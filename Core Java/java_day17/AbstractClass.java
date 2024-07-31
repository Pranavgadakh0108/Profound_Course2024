package com.profound.java_day17;

import java.util.Scanner;

abstract class Student{
	Scanner sc = new Scanner(System.in);
	int roll;
	String name;
	abstract void accept();
	void display()
	{
		System.out.println("Student Roll: "+roll);
		System.out.println("Student Name: "+name);
	}
}

public class AbstractClass extends Student{
	
	@Override
	void accept() 
	{
		System.out.println("Enter Roll and Name: ");
		roll = sc.nextInt();
		name = sc.next();	
	}

	public static void main(String[] args) {
		AbstractClass ac = new AbstractClass();
		ac.accept();
		ac.display();
	}
}
