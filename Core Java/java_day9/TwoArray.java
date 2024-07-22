package com.profound.java_day9;

import java.util.Scanner;

//WAP to accept two array element & add two array, display it.
public class TwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an array: ");
		int n = sc.nextInt();
		
		int ar1[] = new int[n];
		int ar2[] = new int[n];
		int sum[] = new int[n];
		
		System.out.println("Enter "+n+" elements of ar1: ");
		for(int i=0; i<n; i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter "+n+" elements of ar2: ");
		for(int i=0; i<n; i++)
		{
			ar2[i]=sc.nextInt();
		}
		
		System.out.println("Sum of ar1 and ar2 is: ");

		for(int i=0; i<n; i++)
		{
			System.out.print(" "+(sum[i]=ar1[i]+ar2[i]));
		}

	}

}
