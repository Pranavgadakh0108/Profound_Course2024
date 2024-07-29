package com.profound.java_day14;

import java.util.Scanner;

/*
 	Write a program to print the sum of number at same position from start and end on array.
	Input:[1,2,3,4,5,6,7,8,9]
	Output:10,10
 */

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Array Elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Sum of Numbers:");
		for(int i=0; i<n/2; i++)
		{
			int sum =arr[i]+arr[n-i-1];
			System.out.print(" "+sum);
		}	
	}
}
