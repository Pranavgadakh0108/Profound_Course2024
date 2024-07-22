package com.profound.java_day9;

import java.util.Scanner;

public class SearchArrayElement {

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
		
		System.out.println("Enter an Element to be Searched: ");
		int ele = sc.nextInt();
		int count=0;		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("Element "+ele+" is present at index "+i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Element Not Found!!!");
		}
	}

}
