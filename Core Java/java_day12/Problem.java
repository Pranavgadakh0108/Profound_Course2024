package com.profound.java_day12;

import java.util.Scanner;

//WAP to accept num from user and calculate sum of digit and calculate are of circle..
public class Problem {
	
	//constructor to calculate sum of digit.
	Problem(int num) {
		int sum=0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		
		System.out.println("THE SUM OF DIGITS= "+sum);
	}

	//constructor to calculate area of circle
	Problem(int radius, float pi) {
		System.out.println("AREA OF CIRCLE= "+(pi*radius*radius));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		int n = sc.nextInt();
		float pi = 3.14f;
		Problem p1 = new Problem(n); //call sumOfDigit
		Problem p2 = new Problem(n,pi); //call AreaOfCircle

	}

}
