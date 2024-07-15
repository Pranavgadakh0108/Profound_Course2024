package com.profound.java_day3;
/*
 * WAP to accept marks from user like as math, chem, bio to calculate total
 * & avg ang check grade .
 */
import java.util.Scanner;
public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Math chem Bio: ");
		int m = sc.nextInt();
		int c = sc.nextInt();
		int b = sc.nextInt();
		
		int total = m+c+b;
		float avg = total/3;
		
		System.out.println("Marks total is "+total+" and Average is "+avg);
		
		if(avg>=90 && avg <=100)
		{
			System.out.println("Student Get A grade...");
		}
		else if(avg>=75 && avg <90)
		{
			System.out.println("Student Get B grade...");
		}
		else if(avg>=60 && avg <75)
		{
			System.out.println("Student Get C grade...");
		}
		else if(avg>=40 && avg <60)
		{
			System.out.println("Student Get D grade...");
		}
		else if( avg <40)
		{
			System.out.println("Student is Failed..!!");
		}
		else
		{
			System.out.println("Average is Invlid!!!!");
		}

	}

}
