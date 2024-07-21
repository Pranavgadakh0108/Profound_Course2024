package com.profound.java_day8;
import java.util.Scanner;
public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array: ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" array elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("arr["+i+"]= "+arr[i]);
		}
	}
}
