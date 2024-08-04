package com.profound.java_day19;

import java.util.Scanner;

interface Interface1 {
	void accept();
}

interface Interface2 {
	void display();
}

public class Mul_Interface implements Interface1,Interface2{

	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	
				@Override
				public void display() 
				{
					System.out.println("-------------------------------");
					System.out.println("ID is: "+id+"Name is: "+name);
					System.out.println("-------------------------------");
					
				}
			
				@Override
				public void accept() 
				{
					System.out.println("Enter ID and Name: ");
					id = sc.nextInt();
					name = sc.next();		
				}
	public static void main(String[] args) {
		Mul_Interface mi = new Mul_Interface();
		mi.accept();
		mi.display();

	}
}
