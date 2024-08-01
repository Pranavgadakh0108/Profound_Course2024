package com.profound.java_day18;

import java.util.Scanner;

interface Student{
	void acceptData();
	void displayResult();
}

public class Exam implements Student{

	Scanner sc = new Scanner(System.in);
	int roll, sub1, sub2, sub3, total;
	String name;
	float avg;
	
	@Override
	public void acceptData() {
		System.out.println("Enter Student Roll Num. and Name: ");
		roll = sc.nextInt();
		name = sc.next();
		System.out.println("Enter Marks of Subject1,2,3: ");
		sub1 = sc.nextInt();
		sub2= sc.nextInt();
		sub3 = sc.nextInt();
		
		total =sub1+sub2+sub3;
		avg=total/3;
		
	}

	@Override
	public void displayResult() 
	{
		System.out.println("--------------------------------------------------");
		System.out.println("STUDENT ROll: "+roll+" STUDENT NAME: "+name);
		System.out.println("MARKS:: SUB1:"+sub1+" SUB2: "+sub2+" SUB3: "+sub3);
		System.out.println("TOTAL MARKS: "+total+" AVERAGE: "+avg);
		System.out.println("--------------------------------------------------");
	}
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.acceptData();
		e.displayResult();
	}

	

}
