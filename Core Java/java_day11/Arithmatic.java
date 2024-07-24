package com.profound.java_day11;

import java.util.Scanner;

public class Arithmatic {
	
	public Arithmatic(int a, int b) {
		System.out.println("-------------------------------");
		System.out.println("ADDITION = "+(a+b));
		System.out.println("-------------------------------");
		System.out.println("SUBTRACTION = "+(a-b));
		System.out.println("-------------------------------");
		System.out.println("MULTIPLICATION = "+(a*b));
		System.out.println("-------------------------------");
		System.out.println("DIVITION = "+(a/b));
		System.out.println("-------------------------------");
		System.out.println("MOD = "+(a%b));
		System.out.println("-------------------------------");	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENETR NUM1 & NUM2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Arithmatic ar = new Arithmatic(num1, num2);
		

	}

}
