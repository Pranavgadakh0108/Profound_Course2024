package com.profound.java_day8;

public class Array1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Print array using for loop");
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}

		System.out.println("\n\nPrint array using for Each loop");
		System.out.println("Array Elements are: ");
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}

}
