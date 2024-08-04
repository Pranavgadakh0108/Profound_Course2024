package com.profound.java_day19;

import java.util.Scanner;

interface Student{
	void display();
}

interface College{
	void display();
}

public class MultipleInheritance implements Student,College{
	int roll, colID;
	String name, colName;
	Scanner sc = new Scanner(System.in);
	
	MultipleInheritance() {
		System.out.println("Enter roll and student name: ");
		roll=sc.nextInt();
		name = sc.next();
		System.out.println("Enter college ID and Name: ");
		colID = sc.nextInt();
		colName = sc.next();
	}

	@Override
	public void display() {
		System.out.println("Student roll= "+roll+" name= "+name);
		System.out.println("College id= "+colID+" college name: "+colName);	
	}
	
	public static void main(String[] args) {
		MultipleInheritance MI = new MultipleInheritance();
		MI.display();

	}
}
