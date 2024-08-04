package com.profound.java_day20;

import java.util.Scanner;

public class StaticVariable2 {
	
	int roll;
	String name;
	static String college;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		
		System.out.println("Enter student roll, name & college: ");
		roll = sc.nextInt();
		name = sc.next();
		college = sc.next();
	}

	void display()
	{
		System.out.println("Student Roll: "+roll);
		System.out.println("Student Name: "+name);
		System.out.println("College Name: "+college);
	}
	public static void main(String[] args) {
		StaticVariable2 s1 = new StaticVariable2();
		StaticVariable2 s2 = new StaticVariable2();
		StaticVariable2 s3 = new StaticVariable2();
		s1.accept();
		s2.accept();
		s3.accept();
		s1.display();
		s2.display();
		s3.display();
	}

}
