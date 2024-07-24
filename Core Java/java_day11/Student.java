package com.profound.java_day11;

import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);
	public Student() {
		System.out.println("-------------------------------");
		System.out.println("Enter Student Roll Name & Age");
		int roll=sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		
		System.out.println("-----------------------------------------");
		System.out.println("STUDENT ROLL= "+roll+" NAME= "+name+" AGE= "+age);
		System.out.println("-----------------------------------------");	
	}

	public static void main(String[] args) {
		Student s = new Student();
	}

}
