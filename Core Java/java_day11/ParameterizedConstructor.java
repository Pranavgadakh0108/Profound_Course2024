package com.profound.java_day11;

import java.util.Scanner;

public class ParameterizedConstructor {
	
	public ParameterizedConstructor(int r, String n, String c) {
		System.out.println("----------------------------------");
		System.out.println("STUDENT ROLL="+r+" NAME="+n+" CITY="+c);
		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STUDENT ROLL NAME CITY:");
		int roll= sc.nextInt();
		String name = sc.next();
		String city = sc.next();
		
		ParameterizedConstructor pc = new ParameterizedConstructor(roll, name, city);
		
		
		

	}

}
