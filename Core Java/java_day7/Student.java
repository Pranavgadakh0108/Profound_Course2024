package com.profound.java_day7;

import java.util.Scanner;

public class Student {
	
	int rno;
	String name;
	char div;
	float per;
	
	Scanner sc = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("-->> ENTER STUDENT DETAILS <<--");
		System.out.println("ENTER STUDENT ROLL: ");
		rno=sc.nextInt();
		System.out.println("ENTER STUDENT NAME: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("ENTER STUDENT DIv: ");
		div=sc.next().charAt(0);
		System.out.println("ENTER STUDENT PER: ");
		per=sc.nextFloat();
	}

	void printData()
	{
		System.out.println("-------------------------");
		System.out.println("-->> STUDENT DETAILS <<--");
		System.out.println("-------------------------");
		System.out.println("ROLL= "+rno+" NAME= "+name+" DIV= "+div+" PER= "+per);
	}
	public static void main(String[] args) {
		
			Student s = new Student();
			s.getData();
			s.printData();
			
	}

}
