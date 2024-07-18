package com.profound.java_day4;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		
		if(num>=0)
		{
			if(num>0)
			{
				System.out.println(num+" is positive");
			}
			else
			{
				System.out.println(num+" is Zero");
			}
		}
		else
		{
			System.out.println(num+" is Negative");
		}
	}
}
