package com.profound.java_day9;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an Array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" elements in an Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Unsorted Array: ");
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted Array: ");
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}
}
